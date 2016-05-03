package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductCategoryBusiness;
import com.bhe.dao.mybatis.mapper.ProductCategoryEntityMapper;
import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.dao.mybatis.model.ProductCategoryEntityCriteria;
import com.bhe.dao.mybatis.model.ProductCategoryEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;

@Service
public class ProductCategoryBusinessImpl extends BaseBusiness implements IProductCategoryBusiness {

	@Autowired
	private ProductCategoryEntityMapper productCategoryEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductCategoryEntity> dateEntity = null;

	private BusinessData<ProductCategoryEntity> selectProductCategory(ProductCategoryEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductCategoryEntity> list = productCategoryEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductCategoryEntity>(true, pageIndex, pageSize, null, productCategoryEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductCategoryEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductCategory(ProductCategoryEntity entity) {
		try {
			primaryKey = productCategoryEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductCategoryByKey(long primaryKey) {
		try {
			rows = productCategoryEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductCategoryByKey(ProductCategoryEntity entity) {
		try {
			rows = productCategoryEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProductCategoryByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		
		
		return selectProductCategory(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProductCategoryByNameCn(String nameCn, Integer pageIndex, Integer pageSize,long parentid) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		if (nameCn != null) {
			criteria.createCriteria().andNamecnLike(nameCn);
		}
		
		if (!CommonUtil.isEmpty(parentid)) {
			criteria.createCriteria().andParentidEqualTo(parentid);
		}
		
		return selectProductCategory(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<Integer> selectProCateCount(long id) {
		ProductCategoryEntityCriteria pcec = new ProductCategoryEntityCriteria();
		pcec.createCriteria().andParentidEqualTo(id);
		
		int count = productCategoryEntityMapper.countByExample(pcec);
		BusinessData<Integer> budata = new BusinessData<Integer>(true,null,count);
		return budata;
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProductCategoryById( long id) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		criteria.createCriteria().andIdEqualTo(id);
		
		return selectProductCategory(criteria, null, null);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProCateByParentId(long id) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		criteria.createCriteria().andParentidEqualTo(id);
		
		return selectProductCategory(criteria, null, null);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProCateByAll(Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		return selectProductCategory(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProCateByResId(long id,boolean isParent) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		Criteria createCriteria = criteria.createCriteria();
		createCriteria.andResourceidEqualTo(id);
		if(isParent){
			createCriteria.andParentidEqualTo(0L);
		}
		
		return selectProductCategory(criteria, null, null);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProCateById(long id) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		
		criteria.createCriteria().andIdEqualTo(id);
		
		return selectProductCategory(criteria, null, null);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProductCategoryByNameCn(String nameCn, Integer pageIndex, Integer pageSize) {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		if (nameCn != null) {
			criteria.createCriteria().andNamecnEqualTo(nameCn);
		}
		return selectProductCategory(criteria, null, null);
	}

	@Override
	public BusinessData<ProductCategoryEntity> selectProCateByAll() {
		ProductCategoryEntityCriteria criteria = new ProductCategoryEntityCriteria();
		
		return selectProductCategory(criteria, null, null);
	}

}
