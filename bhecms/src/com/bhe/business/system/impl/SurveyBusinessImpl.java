package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISurveyBusiness;
import com.bhe.dao.mybatis.mapper.SurveyEntityMapper;
import com.bhe.dao.mybatis.model.SurveyEntity;
import com.bhe.dao.mybatis.model.SurveyEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class SurveyBusinessImpl extends BaseBusiness implements ISurveyBusiness {

	@Autowired
	private SurveyEntityMapper surveyEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<SurveyEntity> dateEntity = null;

	private BusinessData<SurveyEntity> selectSurvey(SurveyEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SurveyEntity> list = surveyEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SurveyEntity>(true, pageIndex, pageSize, null, surveyEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<SurveyEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertSurvey(SurveyEntity entity) {
		try {
			primaryKey = surveyEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteSurveyByKey(long primaryKey) {
		try {
			rows = surveyEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateSurveyByKey(SurveyEntity entity) {
		try {
			rows = surveyEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<SurveyEntity> selectSurveyByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		SurveyEntityCriteria criteria = new SurveyEntityCriteria();
		
		
		return selectSurvey(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SurveyEntity> selectSurveyByTitle(String title, Integer pageIndex, Integer pageSize) {
		SurveyEntityCriteria criteria = new SurveyEntityCriteria();
		
		if (title != null) {
			criteria.createCriteria().andTitleLike(title);
		}
		
		return selectSurvey(criteria, pageIndex, pageSize);
	}

}
