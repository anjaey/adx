package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductSkuValueBusiness;
import com.bhe.dao.mybatis.mapper.ProductSkuValueEntityMapper;
import com.bhe.dao.mybatis.model.ProductSkuValueEntity;
import com.bhe.dao.mybatis.model.ProductSkuValueEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductSkuValueBusinessImpl extends BaseBusiness implements IProductSkuValueBusiness {

	@Autowired
	private ProductSkuValueEntityMapper productSkuValueEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductSkuValueEntity> dateEntity = null;

	private BusinessData<ProductSkuValueEntity> selectProductSkuValue(ProductSkuValueEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductSkuValueEntity> list = productSkuValueEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductSkuValueEntity>(true, pageIndex, pageSize, null, productSkuValueEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductSkuValueEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductSkuValue(ProductSkuValueEntity entity) {
		try {
			primaryKey = productSkuValueEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductSkuValueByKey(long primaryKey) {
		try {
			rows = productSkuValueEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductSkuValueByKey(ProductSkuValueEntity entity) {
		try {
			rows = productSkuValueEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductSkuValueEntity> selectProductSkuValueByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductSkuValueEntityCriteria criteria = new ProductSkuValueEntityCriteria();
		
		
		return selectProductSkuValue(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductSkuValueEntity> selectProductSkuValueByProductId(Long ProductId, Integer pageIndex, Integer pageSize) {
		ProductSkuValueEntityCriteria criteria = new ProductSkuValueEntityCriteria();
		if (ProductId != null) {
			criteria.createCriteria().andProductidEqualTo(ProductId);
		}
		
		return selectProductSkuValue(criteria, pageIndex, pageSize);
	}

}
