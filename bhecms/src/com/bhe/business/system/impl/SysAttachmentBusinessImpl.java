package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISysAttachmentBusiness;
import com.bhe.dao.mybatis.mapper.SysAttachmentEntityMapper;
import com.bhe.dao.mybatis.model.SysAttachmentEntity;
import com.bhe.dao.mybatis.model.SysAttachmentEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class SysAttachmentBusinessImpl extends BaseBusiness implements ISysAttachmentBusiness {

	@Autowired
	private SysAttachmentEntityMapper sysAttachmentEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<SysAttachmentEntity> dateEntity = null;

	private BusinessData<SysAttachmentEntity> selectSysAttachment(SysAttachmentEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SysAttachmentEntity> list = sysAttachmentEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SysAttachmentEntity>(true, pageIndex, pageSize, null, sysAttachmentEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<SysAttachmentEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertSysAttachment(SysAttachmentEntity entity) {
		try {
			primaryKey = sysAttachmentEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, primaryKey);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteSysAttachmentByKey(String primaryKey) {
		try {
			rows = sysAttachmentEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateSysAttachmentByKey(SysAttachmentEntity entity) {
		try {
			rows = sysAttachmentEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<SysAttachmentEntity> selectSysAttachmentByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		SysAttachmentEntityCriteria criteria = new SysAttachmentEntityCriteria();
		
		
		return selectSysAttachment(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysAttachmentEntity> selectSysAttachmentByName(String name, Integer pageIndex, Integer pageSize) {
		SysAttachmentEntityCriteria criteria = new SysAttachmentEntityCriteria();
		
		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectSysAttachment(criteria, pageIndex, pageSize);
	}

}

