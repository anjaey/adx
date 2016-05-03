package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductCommentBusiness;
import com.bhe.dao.mybatis.mapper.ProductCommentEntityMapper;
import com.bhe.dao.mybatis.model.ProductCommentEntity;
import com.bhe.dao.mybatis.model.ProductCommentEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductCommentBusinessImpl extends BaseBusiness implements IProductCommentBusiness {

	@Autowired
	private ProductCommentEntityMapper productCommentEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductCommentEntity> dateEntity = null;

	private BusinessData<ProductCommentEntity> selectProductComment(ProductCommentEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductCommentEntity> list = productCommentEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductCommentEntity>(true, pageIndex, pageSize, null, productCommentEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductCommentEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductComment(ProductCommentEntity entity) {
		try {
			primaryKey = productCommentEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductCommentByKey(long primaryKey) {
		try {
			rows = productCommentEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductCommentByKey(ProductCommentEntity entity) {
		try {
			rows = productCommentEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductCommentEntity> selectProductCommentByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductCommentEntityCriteria criteria = new ProductCommentEntityCriteria();
		
		
		return selectProductComment(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductCommentEntity> selectProductCommentByProductId(String productid, Integer pageIndex, Integer pageSize) {
		ProductCommentEntityCriteria criteria = new ProductCommentEntityCriteria();
		if (productid != null) {
			criteria.createCriteria().andProductidEqualTo(productid);
		}
		
		return selectProductComment(criteria, pageIndex, pageSize);
	}

}
