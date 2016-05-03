package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.IProSearchBusiness;
import com.bhe.dao.mybatis.mapper.ProductSearchEntityMapper;
import com.bhe.dao.mybatis.model.ProductSearchEntity;
import com.bhe.dao.mybatis.model.ProductSearchEntityCriteria;
import com.bhe.dao.mybatis.model.ProductSearchEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProSearchBusinessImpl extends BaseBusiness implements IProSearchBusiness{

	@Autowired
	private ProductSearchEntityMapper productSearchEntityMapper;
	
	private BusinessData<Boolean> data  = null;
	
	private BusinessData<ProductSearchEntity> dataEntity = null;
	public BusinessData<Boolean> insertProSearch(ProductSearchEntity entity) {
		try {
			primaryKey = productSearchEntityMapper.insertSelective(entity);
			data = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	public BusinessData<Boolean> delProSearch(Long id) {
		try {
			rows = productSearchEntityMapper.deleteByPrimaryKey(id);
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
		
	}

	public BusinessData<Boolean> updateProSearchByKey(ProductSearchEntity entity) {
		try {
			rows = productSearchEntityMapper.updateByPrimaryKeySelective(entity);
			data = new BusinessData<Boolean>(true,null,rows,null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false,ErrorCodeUtil.UNKNOWN_EXCEPTION,null,null);
		}
		return data;
	}

	public BusinessData<ProductSearchEntity> selectProSearchByKey(String title, String minPri, String maxPri,
			Integer pageIndex, Integer pageSize) {
		ProductSearchEntityCriteria criteria = new ProductSearchEntityCriteria();
		Criteria cri = criteria.createCriteria();
		
		if (!CommonUtil.isEmpty(title)) {
			cri.andTitleLike("%"+title+"%");
		}
		
		if (!CommonUtil.isEmpty(maxPri)) {
			cri.andBeginpicGreaterThanOrEqualTo(maxPri);
		}
		
		if (!CommonUtil.isEmpty(minPri)) {
			cri.andEndpicLessThanOrEqualTo(minPri);
		}
		
		
		return selectProSearch(criteria, pageIndex, pageSize);
	
	}
	
	@Override
	public BusinessData<ProductSearchEntity> selectProSearchByTitle(
			String title,String minPri,String maxPri, Integer pageIndex, Integer pageSize) {
		ProductSearchEntityCriteria criteria = new ProductSearchEntityCriteria();
		Criteria cri = criteria.createCriteria();
		
		if (!CommonUtil.isEmpty(title)) {
			cri.andTitleEqualTo(title);
		}
		
		return selectProSearch(criteria, pageIndex, pageSize);
	}
	
	public BusinessData<ProductSearchEntity> selectProSearchByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductSearchEntityCriteria criteria = new ProductSearchEntityCriteria();

		return selectProSearch(criteria, pageIndex, pageSize);
	}
	
	private BusinessData<ProductSearchEntity> selectProSearch(ProductSearchEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			
			//数据无法查询   字段关键字的问题
			List<ProductSearchEntity> list = productSearchEntityMapper.selectByExample(criteria);
			dataEntity = new BusinessData<ProductSearchEntity>(true, pageIndex, pageSize, null, productSearchEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dataEntity = new BusinessData<ProductSearchEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dataEntity;
	}

	public BusinessData<ProductSearchEntity> selectProSearchById(Long id) {
		ProductSearchEntityCriteria criteria = new ProductSearchEntityCriteria();
		if(!CommonUtil.isEmpty(id)){
			criteria.createCriteria().andIdEqualTo(id);
		}
		return selectProSearch(criteria,null,null);
	}

	@Override
	public BusinessData<ProductSearchEntity> selectProSearchKeyWordesTop(Integer i) {
		ProductSearchEntityCriteria criteria = new ProductSearchEntityCriteria();
		criteria.setOrderByClause("count desc");
		return selectProSearch(criteria,0 , i);
	}

	
}
