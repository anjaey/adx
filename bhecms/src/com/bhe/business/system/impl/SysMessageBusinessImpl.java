package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISysMessageBusiness;
import com.bhe.dao.mybatis.mapper.SysMessageEntityMapper;
import com.bhe.dao.mybatis.model.SysMessageEntity;
import com.bhe.dao.mybatis.model.SysMessageEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class SysMessageBusinessImpl extends BaseBusiness implements ISysMessageBusiness{
	
	@Autowired
	private SysMessageEntityMapper sysMessageEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<SysMessageEntity> dateEntity = null;

	private BusinessData<SysMessageEntity> selectSysMessage(SysMessageEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SysMessageEntity> list = sysMessageEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SysMessageEntity>(true, pageIndex, pageSize, null, sysMessageEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<SysMessageEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertSysMessage(SysMessageEntity entity) {
		try {
			primaryKey = sysMessageEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteSysMessageByKey(long primaryKey) {
		try {
			rows = sysMessageEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateSysMessageByKey(SysMessageEntity entity) {
		try {
			rows = sysMessageEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<SysMessageEntity> selectSysMessageByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		SysMessageEntityCriteria criteria = new SysMessageEntityCriteria();
		
		
		return selectSysMessage(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysMessageEntity> selectSysMessageByType(Integer type, Integer pageIndex, Integer pageSize) {
		SysMessageEntityCriteria criteria = new SysMessageEntityCriteria();
		
		if (type != null) {
			criteria.createCriteria().andTypeEqualTo(type);
		}
		
		return selectSysMessage(criteria, pageIndex, pageSize);
	}
	
}
