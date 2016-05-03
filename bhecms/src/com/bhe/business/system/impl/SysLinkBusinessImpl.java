package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISysLinkBusiness;
import com.bhe.dao.mybatis.mapper.SysLinkEntityMapper;
import com.bhe.dao.mybatis.model.SysLinkEntity;
import com.bhe.dao.mybatis.model.SysLinkEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;


@Service
public class SysLinkBusinessImpl extends BaseBusiness implements ISysLinkBusiness {
	
	@Autowired
	private SysLinkEntityMapper sysLinkEntityMapper;


	private BusinessData<Boolean> date = null;
	private BusinessData<SysLinkEntity> dateEntity = null;

	private BusinessData<SysLinkEntity> selectSysLink(SysLinkEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SysLinkEntity> list = sysLinkEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SysLinkEntity>(true, pageIndex, pageSize, null, sysLinkEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<SysLinkEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertSysLink(SysLinkEntity entity) {
		try {
			primaryKey = sysLinkEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteSysLinkByKey(long primaryKey) {
		try {
			rows = sysLinkEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateSysLinkByKey(SysLinkEntity entity) {
		try {
			rows = sysLinkEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<SysLinkEntity> selectSysLinkByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		SysLinkEntityCriteria criteria = new SysLinkEntityCriteria();
		if(null!=map){
			if(map.containsKey("sortOrder")){
				criteria.setOrderByClause(map.get("sortOrder").toString());
			}
		}
		
		return selectSysLink(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysLinkEntity> selectSysLinkByName(String name, Integer pageIndex, Integer pageSize) {
		SysLinkEntityCriteria criteria = new SysLinkEntityCriteria();
		
		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectSysLink(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysLinkEntity> selectByid(Long id) {
		SysLinkEntity syslin = sysLinkEntityMapper.selectByPrimaryKey(id);
		BusinessData<SysLinkEntity> bdlink = new BusinessData<>(true, null, syslin);
		return bdlink;
	}

}
