package com.bhe.business.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.user.IUserAddressBusiness;
import com.bhe.dao.mybatis.mapper.UserAddressEntityMapper;
import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserAddressEntityCriteria;
import com.bhe.dao.mybatis.model.UserAddressEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class UserAddressBusinessImpl extends BaseBusiness implements IUserAddressBusiness {

	@Autowired
	private UserAddressEntityMapper userAddressEntityMapper;

	private BusinessData<UserAddressEntity> dataEntity = null;
	private BusinessData<Boolean> data = null;

	private BusinessData<UserAddressEntity> selectUserAddress(UserAddressEntityCriteria criteria, Integer pageIndex, Integer pageSize) {
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<UserAddressEntity> list = userAddressEntityMapper.selectByExample(criteria);
			dataEntity = new BusinessData<UserAddressEntity>(true, pageIndex, pageSize, null, userAddressEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常", e);
			dataEntity = new BusinessData<UserAddressEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dataEntity;
	}

	@Override
	public BusinessData<Boolean> insertUserAddressByBeach(UserAddressEntity uae) {
		try {
			primaryKey = userAddressEntityMapper.insertSelective(uae);
			data = new BusinessData<Boolean>(true, null, null, primaryKey);
		} catch (Exception e) {
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<Boolean> deleteUserAddressByKey(Long id, String userKey) {
		UserAddressEntityCriteria criteria = new UserAddressEntityCriteria();
		Criteria createCriteria = criteria.createCriteria();
		;
		try {
			createCriteria.andUserkeyEqualTo(userKey);
			createCriteria.andIdEqualTo(id);
			rows = userAddressEntityMapper.deleteByExample(criteria);
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<Boolean> updateUserAddressByKey(UserAddressEntity entity) {
		try {
			rows = userAddressEntityMapper.updateByPrimaryKeySelective(entity);
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<UserAddressEntity> selectAllUserAddress(String userKey) {
		UserAddressEntityCriteria criteria = new UserAddressEntityCriteria();

		return selectUserAddress(criteria, null, null);
	}

	@Override
	public BusinessData<UserAddressEntity> selectUserAddressById(long id) {
		UserAddressEntityCriteria criteria = new UserAddressEntityCriteria();
		criteria.createCriteria().andIdEqualTo(id);
		return selectUserAddress(criteria, null, null);
	}

	@Override
	public BusinessData<Boolean> updateIsDefaultByKey(long id,String userKey) {
		try {
			if(updateIsDefaultToClear(userKey).getRows() != 0){
				UserAddressEntity entity = new UserAddressEntity();
				entity.setUserkey(userKey);
				entity.setId(id);
				entity.setIsdefault(1);
				rows = userAddressEntityMapper.updateByPrimaryKeySelective(entity);
			}
			
			if(rows == 0){
				throw new RuntimeException();
			}
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<Boolean> updateIsDefaultToClear(String userKey) {
		try {
			UserAddressEntityCriteria criteria = new UserAddressEntityCriteria();
			Criteria createCriteria = criteria.createCriteria();
			createCriteria.andUserkeyEqualTo(userKey);
			
			UserAddressEntity entity = new UserAddressEntity();
			entity.setIsdefault(0);
			rows = userAddressEntityMapper.updateByExampleSelective(entity, criteria);
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

}
