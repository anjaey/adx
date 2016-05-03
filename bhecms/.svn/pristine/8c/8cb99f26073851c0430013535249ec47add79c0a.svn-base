package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductClassBusiness;
import com.bhe.dao.mybatis.mapper.ProductClassEntityMapper;
import com.bhe.dao.mybatis.model.ProductClassEntity;
import com.bhe.dao.mybatis.model.ProductClassEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductClassBusinessImpl extends BaseBusiness implements IProductClassBusiness {

	@Autowired
	private ProductClassEntityMapper productClassEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductClassEntity> dateEntity = null;

	private BusinessData<ProductClassEntity> selectProductClass(ProductClassEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductClassEntity> list = productClassEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductClassEntity>(true, pageIndex, pageSize, null, productClassEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductClassEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductClass(ProductClassEntity entity) {
		try {
			primaryKey = productClassEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductClassByKey(long primaryKey) {
		try {
			rows = productClassEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductClassByKey(ProductClassEntity entity) {
		try {
			rows = productClassEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductClassEntity> selectProductClassByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductClassEntityCriteria criteria = new ProductClassEntityCriteria();
		
		
		return selectProductClass(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductClassEntity> selectProductClassByName(String name, Integer pageIndex, Integer pageSize) {
		ProductClassEntityCriteria criteria = new ProductClassEntityCriteria();
		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectProductClass(criteria, pageIndex, pageSize);
	}

}
