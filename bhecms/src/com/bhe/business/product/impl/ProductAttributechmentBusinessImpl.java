package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductAttributeBusiness;
import com.bhe.dao.mybatis.mapper.ProductAttributeEntityMapper;
import com.bhe.dao.mybatis.model.ProductAttributeEntity;
import com.bhe.dao.mybatis.model.ProductAttributeEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductAttributechmentBusinessImpl extends BaseBusiness implements IProductAttributeBusiness {

	@Autowired
	private ProductAttributeEntityMapper productAttributeEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductAttributeEntity> dateEntity = null;

	private BusinessData<ProductAttributeEntity> selectProductAttribute(ProductAttributeEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductAttributeEntity> list = productAttributeEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductAttributeEntity>(true, pageIndex, pageSize, null, productAttributeEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductAttributeEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductAttribute(ProductAttributeEntity entity) {
		try {
			primaryKey = productAttributeEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductAttributeByKey(long primaryKey) {
		try {
			rows = productAttributeEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductAttributeByKey(ProductAttributeEntity entity) {
		try {
			rows = productAttributeEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductAttributeEntity> selectProductAttributeByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductAttributeEntityCriteria criteria = new ProductAttributeEntityCriteria();
		
		
		return selectProductAttribute(criteria, pageIndex, pageSize);
	}
	
	@Override
	public BusinessData<ProductAttributeEntity> selectProductAttributeByName( String name, Integer pageIndex, Integer pageSize) {
		ProductAttributeEntityCriteria criteria = new ProductAttributeEntityCriteria();
		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectProductAttribute(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductAttributeEntity> selectProductByid(Long id) {
		BusinessData<ProductAttributeEntity> buentity = null;
		try {
			ProductAttributeEntity pa = productAttributeEntityMapper.selectByPrimaryKey(id);
			buentity = new BusinessData<ProductAttributeEntity>(true,null,pa);
		} catch(Exception e) {
			dateEntity = new BusinessData<ProductAttributeEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return buentity;
	}
}
