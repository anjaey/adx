package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductMaterialBusiness;
import com.bhe.dao.mybatis.mapper.ProductMaterialEntityMapper;
import com.bhe.dao.mybatis.model.ProductMaterialEntity;
import com.bhe.dao.mybatis.model.ProductMaterialEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductMaterialBusinessImpl extends BaseBusiness implements IProductMaterialBusiness {

	@Autowired
	private ProductMaterialEntityMapper productMaterialEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<ProductMaterialEntity> dateEntity = null;

	private BusinessData<ProductMaterialEntity> selectProductMaterial(ProductMaterialEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductMaterialEntity> list = productMaterialEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductMaterialEntity>(true, pageIndex, pageSize, null, productMaterialEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductMaterialEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductMaterial(ProductMaterialEntity entity) {
		try {
			primaryKey = productMaterialEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductMaterialByKey(long primaryKey) {
		try {
			rows = productMaterialEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductMaterialByKey(ProductMaterialEntity entity) {
		try {
			rows = productMaterialEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductMaterialEntity> selectProductMaterialByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductMaterialEntityCriteria criteria = new ProductMaterialEntityCriteria();
		
		
		return selectProductMaterial(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductMaterialEntity> selectProductMaterialByNameCn(String nameCn, Integer pageIndex, Integer pageSize) {
		ProductMaterialEntityCriteria criteria = new ProductMaterialEntityCriteria();
		
		if (nameCn != null) {
			criteria.createCriteria().andNamecnLike(nameCn);
		}
		
		return selectProductMaterial(criteria, pageIndex, pageSize);
	}

}
