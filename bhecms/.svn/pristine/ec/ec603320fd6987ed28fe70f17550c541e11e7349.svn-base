package com.bhe.business.user.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.user.IUserCustomerBusiness;
import com.bhe.dao.mybatis.mapper.UserCustomerEntityMapper;
import com.bhe.dao.mybatis.model.UserCustomerEntity;
import com.bhe.dao.mybatis.model.UserCustomerEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class UserCustomerImpl extends BaseBusiness implements IUserCustomerBusiness {

	@Autowired
	private UserCustomerEntityMapper userCustomerEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<UserCustomerEntity> dateEntity = null;

	private BusinessData<UserCustomerEntity> selectUserCustomer(UserCustomerEntityCriteria criteria, Integer pageIndex, Integer pageSize) {
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<UserCustomerEntity> list = userCustomerEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<UserCustomerEntity>(true, pageIndex, pageSize, null, userCustomerEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常", e);
			dateEntity = new BusinessData<UserCustomerEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}

	@Override
	public BusinessData<Boolean> insertUserCustomer(UserCustomerEntity entity) {
		try {
			primaryKey = userCustomerEntityMapper.insert(entity);
			date = new BusinessData<Boolean>(true, null, null, primaryKey);
		} catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> deleteUserCustomerByKey(long primaryKey) {
		try {
			UserCustomerEntityCriteria paec = new UserCustomerEntityCriteria();
			paec.createCriteria().andIdEqualTo(primaryKey);
			userCustomerEntityMapper.deleteByExample(paec);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateUserCustomerByKey(UserCustomerEntity entity) {
		try {
			rows = userCustomerEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<UserCustomerEntity> selectUserCustomerByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		UserCustomerEntityCriteria criteria = new UserCustomerEntityCriteria();

		return selectUserCustomer(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<UserCustomerEntity> selectUserCustomerById(long id) {
		UserCustomerEntityCriteria criteria = new UserCustomerEntityCriteria();

		criteria.createCriteria().andIdEqualTo(id);

		return selectUserCustomer(criteria, null, null);
	}

	@Override
	public BusinessData<UserCustomerEntity> selectUserCustomerByAll(Integer pageIndex, Integer pageSize) {
		
		return selectUserCustomer(new UserCustomerEntityCriteria(), pageIndex, pageSize);
	}

}
