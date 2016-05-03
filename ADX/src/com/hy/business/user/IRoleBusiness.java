package com.hy.business.user;

import java.util.List;
import java.util.Map;

/**
 * 角色接口
 * @author hy
 *
 */
public interface IRoleBusiness {
	
	/**
	 * 
	 * 修改角色信息
	 * @author hy
	 * @date 2016年5月3日下午3:29:00
	 * @param map
	 * 
	 * map的key表示字段名称，必须传入主键。
	 * 
	 * @return
	 * @update
	 * @date
	 */
	public Map<String, Object> updateRoleInfo(Map<String, Object> map);
	
	/**
	 * 添加角色信息
	 * @author hy
	 * @date 2016年5月3日下午3:28:08
	 * @param map
	 * @return
	 * @update
	 * @date
	 */
	public Map<String, Object> insertRoleInfo(Map<String, Object> map);

	/**
	 * 
	 * 查询所有角色并且分页
	 * @author hy
	 * @date 2016年5月3日下午3:10:01
	 * @param map
	 * @return
	 * @update
	 * @date
	 */
	public List<Map<String, Object>> selectAllRoleAndPage(Map<String, Object> map);
	
	/**
	 * 查询角色的所有用户基本信息
	 * @author hy
	 * @date 2016年5月3日下午3:14:50
	 * @param roleid
	 * @return
	 * @update
	 * @date
	 */
	public List<Map<String, Object>> selectAllUserByRoleid(Integer roleid);
}
