package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductProviderBusiness;
import com.bhe.dao.mybatis.mapper.ProductProviderEntityMapper;
import com.bhe.dao.mybatis.model.ProductProviderEntity;
import com.bhe.dao.mybatis.model.ProductProviderEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductProviderBusinessImpl extends BaseBusiness implements IProductProviderBusiness {

	@Autowired
	private ProductProviderEntityMapper productProviderEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<ProductProviderEntity> dateEntity = null;

	private BusinessData<ProductProviderEntity> selectProductProvider(ProductProviderEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductProviderEntity> list = productProviderEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductProviderEntity>(true, pageIndex, pageSize, null, productProviderEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductProviderEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductProvider(ProductProviderEntity entity) {
		try {
			primaryKey = productProviderEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductProviderByKey(long primaryKey) {
		try {
			rows = productProviderEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductProviderByKey(ProductProviderEntity entity) {
		try {
			rows = productProviderEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductProviderEntity> selectProductProviderByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductProviderEntityCriteria criteria = new ProductProviderEntityCriteria();
		
		
		return selectProductProvider(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductProviderEntity> selectProductProviderByNameCn(String nameCn, Integer pageIndex, Integer pageSize) {
		ProductProviderEntityCriteria criteria = new ProductProviderEntityCriteria();
		
		if (nameCn != null) {
			criteria.createCriteria().andNamecnLike(nameCn);
		}
		
		return selectProductProvider(criteria, pageIndex, pageSize);
	}

}
