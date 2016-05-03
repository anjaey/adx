package com.bhe.business.user;

import org.springframework.stereotype.Service;
import com.bhe.dao.mybatis.model.RoleEntity;
import com.bhe.util.common.BusinessData;

/**
* 创 建 人：  Administrator
* 日     期： 2015年7月30日上午11:40:47
* 描     述： 用户角色相关业务接口 
* --------------------------------------
* 修 改 人： 
* 日     期： 
* 描     述：  扼要说明修改原因，修改详细请注明到方法级
* --------------------------------------
 */
@Service
public interface IRoleBusiness {
	
	/**
	* 创 建 人：zhangyu 
	* 日     期：  2015年7月29日下午2:50:15
	* 描     述： 用户角色添加
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	*/
	public BusinessData<Boolean> insertRoleInfo(RoleEntity role);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日上午11:41:31
	* 描     述：  批量删除角色
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> deleteRoleInfo(Long id);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日上午11:46:37
	* 描     述：  分页查询角色  支持排序  根据角色名进行模糊查询
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<RoleEntity> selectRolePage(Integer pageIndex,Integer pageSize,
			String orderFile,String orderType,String roleName);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日上午11:48:26
	* 描     述：  角色修改
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> updateRoleInfo(RoleEntity role);
	
}