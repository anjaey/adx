package com.bhe.business.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhe.business.user.IRoleBusiness;
import com.bhe.dao.mybatis.mapper.RoleEntityMapper;
import com.bhe.dao.mybatis.model.RoleEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;

/**
* 创 建 人：  Administrator
* 日     期： 2015年7月30日上午11:49:45
* 描     述： 角色业务接口实现
* --------------------------------------
* 修 改 人： 
* 日     期： 
* 描     述：  扼要说明修改原因，修改详细请注明到方法级
* --------------------------------------
 */
@Service
public class RoleBusinessImpl implements IRoleBusiness {
	
	@Autowired
	RoleEntityMapper roleEntityMapper;

	@Override
	public BusinessData<Boolean> insertRoleInfo(RoleEntity role) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = roleEntityMapper.insert(role);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteRoleInfo(Long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = roleEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<RoleEntity> selectRolePage(Integer pageIndex,
			Integer pageSize, String orderFile, String orderType,
			String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BusinessData<Boolean> updateRoleInfo(RoleEntity role) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = roleEntityMapper.updateByPrimaryKeySelective(role);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

}
