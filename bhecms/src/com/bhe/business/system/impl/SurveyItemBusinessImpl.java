package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISurveyItemBusiness;
import com.bhe.dao.mybatis.mapper.SurveyItemEntityMapper;
import com.bhe.dao.mybatis.model.SurveyItemEntity;
import com.bhe.dao.mybatis.model.SurveyItemEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class SurveyItemBusinessImpl extends BaseBusiness implements ISurveyItemBusiness {


	@Autowired
	private SurveyItemEntityMapper surveyItemEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<SurveyItemEntity> dateEntity = null;

	private BusinessData<SurveyItemEntity> selectSurveyItem(SurveyItemEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SurveyItemEntity> list = surveyItemEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SurveyItemEntity>(true, pageIndex, pageSize, null, surveyItemEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<SurveyItemEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertSurveyItem(SurveyItemEntity entity) {
		try {
			primaryKey = surveyItemEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, primaryKey, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteSurveyItemByKey(long primaryKey) {
		try {
			rows = surveyItemEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateSurveyItemByKey(SurveyItemEntity entity) {
		try {
			rows = surveyItemEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<SurveyItemEntity> selectSurveyItemByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		SurveyItemEntityCriteria criteria = new SurveyItemEntityCriteria();
		
		
		return selectSurveyItem(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SurveyItemEntity> selectSurveyItemBySurveyid(Long surveyid, Integer pageIndex, Integer pageSize) {
		SurveyItemEntityCriteria criteria = new SurveyItemEntityCriteria();
		
		if (surveyid != null) {
			criteria.createCriteria().andSurveyidEqualTo(surveyid);
		}
		
		return selectSurveyItem(criteria, pageIndex, pageSize);
	}

}
