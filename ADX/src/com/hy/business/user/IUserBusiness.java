package com.hy.business.user;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


/**
 * 用户相关业务逻辑
 * @author hy
 *
 */
public interface IUserBusiness {

	/**
	 * 登录
	 * @author hy
	 * @date 2016年5月3日下午2:20:00
	 * @return
	 * @update
	 * @date
	 */
	public Map<String, Object> login(Map<String, Object> map, HttpServletRequest reqeust);
	
	/**
	 * 注册，  在此业务中表示ADX平台管理员 添加DSP用户。 
	 * 注册的map中格式为：
	 * 
	 *  key 为 userBasic   value 为个人基本信息
	 *  key 为 userDetil   value 为个人详细信息
	 *  
	 * @author hy
	 * @date 2016年5月3日下午2:25:41
	 * @param map
	 * @return
	 * @update
	 * @date
	 */
	public Map<String, Object> register(Map<String, Object> map);
	
	/**
	 * 查询用户信息，包括详细信息
	 * 
	 * @author hy
	 * @date 2016年5月3日下午2:29:31
	 * @param map 可以是任意条件 其中key为 userBasic表字段名称
	 * @return map
	 * map中格式为：
	 * 
	 *  key 为 userBasic   value 为个人基本信息，如果不存在，为空
	 *  key 为 userDetil   value 为个人详细信息，如果不存在，为空
	 *  
	 *  
	 * @update
	 * @date
	 */
	public Map<String, Object> selectUserInfoOne(Map<String, Object> map);
	
	/**
	 *  
	 * 修改用户信息
	 * @author hy
	 * @date 2016年5月3日下午2:39:39
	 * @param map
	 * map中格式为：
	 * 
	 *  key 为 userBasic   value 为个人基本信息，如果不存在，为空
	 *  key 为 userDetil   value 为个人详细信息，如果不存在，为空
	 *  
	 *  
	 * @return
	 * @update
	 * @date
	 */
	public Map<String, Object> updateUserInfo(Map<String, Object> map);
	
	/**
	 * 根据用户id 查询所有用户角色
	 * @author hy
	 * @date 2016年5月3日下午2:57:41
	 * @param userid
	 * @return
	 * @update
	 * @date
	 */
	public List<Map<String, Object>> selectRoleByUserid(Integer userid);
	
}
 
