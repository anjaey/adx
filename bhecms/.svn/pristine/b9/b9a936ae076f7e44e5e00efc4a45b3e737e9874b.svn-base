package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductSkuNameBusiness;
import com.bhe.dao.mybatis.mapper.ProductSkuNameEntityMapper;
import com.bhe.dao.mybatis.model.ProductSkuNameEntity;
import com.bhe.dao.mybatis.model.ProductSkuNameEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductSkuNameBusinessImpl extends BaseBusiness implements IProductSkuNameBusiness {

	@Autowired
	private ProductSkuNameEntityMapper productSkuNameEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<ProductSkuNameEntity> dateEntity = null;

	private BusinessData<ProductSkuNameEntity> selectProductSkuName(ProductSkuNameEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductSkuNameEntity> list = productSkuNameEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductSkuNameEntity>(true, pageIndex, pageSize, null, productSkuNameEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductSkuNameEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductSkuName(ProductSkuNameEntity entity) {
		try {
			primaryKey = productSkuNameEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductSkuNameByKey(long primaryKey) {
		try {
			rows = productSkuNameEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductSkuNameByKey(ProductSkuNameEntity entity) {
		try {
			rows = productSkuNameEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductSkuNameEntity> selectProductSkuNameByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductSkuNameEntityCriteria criteria = new ProductSkuNameEntityCriteria();
		
		
		return selectProductSkuName(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductSkuNameEntity> selectProductSkuNameByName(String name, Integer pageIndex, Integer pageSize) {
		ProductSkuNameEntityCriteria criteria = new ProductSkuNameEntityCriteria();

		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectProductSkuName(criteria, pageIndex, pageSize);
	}

}
