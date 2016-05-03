package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductAttributeValueBusiness;
import com.bhe.dao.mybatis.mapper.ProductAttributeValueEntityMapper;
import com.bhe.dao.mybatis.model.ProductAttributeValueEntity;
import com.bhe.dao.mybatis.model.ProductAttributeValueEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductAttributeValueBusinessImpl extends BaseBusiness implements IProductAttributeValueBusiness {

	@Autowired
	private ProductAttributeValueEntityMapper productAttributeValueEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<ProductAttributeValueEntity> dateEntity = null;

	private BusinessData<ProductAttributeValueEntity> selectProductAttributeValue(ProductAttributeValueEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductAttributeValueEntity> list = productAttributeValueEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductAttributeValueEntity>(true, pageIndex, pageSize, null, productAttributeValueEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductAttributeValueEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductAttributeValue(ProductAttributeValueEntity entity) {
		try {
			primaryKey = productAttributeValueEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductAttributeValueByKey(long primaryKey) {
		try {
			rows = productAttributeValueEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductAttributeValueByKey(ProductAttributeValueEntity entity) {
		try {
			rows = productAttributeValueEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductAttributeValueEntity> selectProductAttributeValueByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductAttributeValueEntityCriteria criteria = new ProductAttributeValueEntityCriteria();
		
		
		return selectProductAttributeValue(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductAttributeValueEntity> selectProductAttributeValueByProductId(Long productId, Integer pageIndex, Integer pageSize) {
		ProductAttributeValueEntityCriteria criteria = new ProductAttributeValueEntityCriteria();
		if (productId != null) {
			criteria.createCriteria().andProductidEqualTo(productId);
		}
		
		return selectProductAttributeValue(criteria, pageIndex, pageSize);
	}

}
