package com.bhe.business.system.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISysCarouselBusiness;
import com.bhe.dao.mybatis.mapper.SysCarouselEntityMapper;
import com.bhe.dao.mybatis.model.SysCarouselEntity;
import com.bhe.dao.mybatis.model.SysCarouselEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class SysCarouselBusinessImpl extends BaseBusiness implements ISysCarouselBusiness {

	@Autowired
	private SysCarouselEntityMapper sysCarouselEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<SysCarouselEntity> dateEntity = null;

	private BusinessData<SysCarouselEntity> selectSysCarousel(SysCarouselEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SysCarouselEntity> list = sysCarouselEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SysCarouselEntity>(true, pageIndex, pageSize, null, sysCarouselEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<SysCarouselEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertSysCarousel(SysCarouselEntity entity) {
		try {
			primaryKey = sysCarouselEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteSysCarouselByKey(long primaryKey) {
		try {
			rows = sysCarouselEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateSysCarouselByKey(SysCarouselEntity entity) {
		try {
			rows = sysCarouselEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<SysCarouselEntity> selectSysCarouselByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		SysCarouselEntityCriteria criteria = new SysCarouselEntityCriteria();
		
		
		return selectSysCarousel(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysCarouselEntity> selectSysCarouselByType(int type, Integer pageIndex, Integer pageSize) {
		SysCarouselEntityCriteria criteria = new SysCarouselEntityCriteria();
		
		criteria.createCriteria().andTypeEqualTo(type);
		
		return selectSysCarousel(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysCarouselEntity> selectSysCarouselById(long id, Integer pageIndex, Integer pageSize) {
		SysCarouselEntityCriteria criteria = new SysCarouselEntityCriteria();
		
		criteria.createCriteria().andIdEqualTo(id);
		
		return selectSysCarousel(criteria, pageIndex, pageSize);
	}

}
