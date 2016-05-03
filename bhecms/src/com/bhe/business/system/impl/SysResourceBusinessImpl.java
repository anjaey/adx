package com.bhe.business.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.mapper.SysResourceEntityMapper;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.dao.mybatis.model.SysResourceEntityCriteria;
import com.bhe.dao.mybatis.model.SysResourceEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;
import com.bhe.util.common.StringUtil;

@Service
public class SysResourceBusinessImpl extends BaseController implements ISysResourceBusiness {

	@Autowired
	private SysResourceEntityMapper sysResourceEntityMapper;

	private BusinessData<SysResourceEntity> dateEntity = null;

	private BusinessData<SysResourceEntity> selectSysResource(SysResourceEntityCriteria criteria, Integer pageIndex, Integer pageSize) {
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<SysResourceEntity> list = sysResourceEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<SysResourceEntity>(true, pageIndex, pageSize, null, sysResourceEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常", e);
			dateEntity = new BusinessData<SysResourceEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}

	@Override
	public BusinessData<Boolean> insertSysRes(SysResourceEntity sysRes) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = sysResourceEntityMapper.insertSelective(sysRes);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteSysRes(int id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = sysResourceEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateSysRes(SysResourceEntity sysRes) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = sysResourceEntityMapper.updateByPrimaryKeySelective(sysRes);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<SysResourceEntity> selectSysResid(int id) {
		BusinessData<SysResourceEntity> bd = null;
		try {
			SysResourceEntityCriteria sre = new SysResourceEntityCriteria();
			sre.createCriteria().andIdEqualTo(id);
			SysResourceEntity sysres = sysResourceEntityMapper.selectByExampleForOne(sre);
			bd = new BusinessData<SysResourceEntity>(true, null, sysres);
		} catch (Exception e) {
			bd = new BusinessData<SysResourceEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<List<SysResourceEntity>> selectSysResByparid(int parentid,Integer status,String orderParam,String orderRank){
		BusinessData<List<SysResourceEntity>> bd = null;
		try {
			SysResourceEntityCriteria sre = new SysResourceEntityCriteria();
			Criteria createCriteria = sre.createCriteria();
			createCriteria.andParentidEqualTo(parentid);
			if (status != null) {
				createCriteria.andStatusEqualTo(status);
			}
			sre.setOrderByClause(new Order(orderRank, orderParam).toString());
			List<SysResourceEntity> sysres = sysResourceEntityMapper.selectByExample(sre);
			bd = new BusinessData<List<SysResourceEntity>>(true, null, sysres);
		} catch (Exception e) {
			bd = new BusinessData<List<SysResourceEntity>>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<SysResourceEntity> selectSysResByNameEn(String nameen, Integer pageIndex, Integer pageSize) {
		SysResourceEntityCriteria criteria = new SysResourceEntityCriteria();

		if (nameen != null) {
			criteria.createCriteria().andNameenEqualTo(nameen);
		}

		return selectSysResource(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysResourceEntity> selectSysResByAll(Integer pageIndex, Integer pageSize) {
		SysResourceEntityCriteria criteria = new SysResourceEntityCriteria();

		return selectSysResource(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<SysResourceEntity> selectSysResByCode(String code) {
		SysResourceEntityCriteria criteria = new SysResourceEntityCriteria();
		if (!StringUtil.isNull(code)) {
			criteria.createCriteria().andCodeEqualTo(code);
			return selectSysResource(criteria, null, null);
		}else{
		return	 new BusinessData<SysResourceEntity>(false, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null);
		}
	}

}
