package com.bhe.business.user;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;

/**
* 创 建 人：  Administrator
* 日     期： 2015年7月30日下午2:21:53
* 描     述：用户相关业务接口 
* --------------------------------------
* 修 改 人： 
* 日     期： 
* 描     述：  扼要说明修改原因，修改详细请注明到方法级
* --------------------------------------
 */
@Service
public interface IUserBusiness {

	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:22:03
	* 描     述：用户添加  实体添加
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> insertUser(UserEntity user);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:24:05
	* 描     述： 添加用户地址信息
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> insertUserAddress(UserAddressEntity uae);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:25:25
	* 描     述： 添加用户详情
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> insertUserDetail(UserDetailEntity ude);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:26:22
	* 描     述：  根据用户编号删除用户详情信息
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> deleteUserDetail(String userUuid);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:27:02
	* 描     述： 根据用户编号删除用户地址信息
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> deleteUserAddress(String userUuid);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:36:03
	* 描     述： 修改用户地址信息
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> updateUserAddress(UserAddressEntity uae);
	
	/**
	* 创 建 人：  Administrator
	* 日     期：  2015年7月30日下午2:36:33
	* 描     述： 修改用户详情信息
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> updateUserDetail(UserDetailEntity ude);
	
	
	
	/**
	* 创 建 人： zhangyu
	* 日     期：  2015年7月30日下午2:22:26
	* 描     述：用户信息分页查询，支持根据字段排序  和根据用户名模糊检索
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<UserEntity> selectUsers(Integer pageSize,Integer pageIndex
			,String orderFile,String orderType,String username) ;
	
	/**
	 * 根据用户名查询用户对象
	 * zhangyu [2015年7月24日 上午10:54:13]
	 * 
	 * @param username 用户名
	 * @return 查询不到时返回NULL  否则返回当前用户对象
	 * @
	 */
	public BusinessData<UserEntity> selectUserByname(String username);
	
	/**
	 * 批量删除用户 
	 * zhangyu [2015年7月24日 下午2:09:14]
	 * 
	 * @param ids
	 * @return
	 * @
	 */
	public BusinessData<Boolean> deleteUser(Long id);
	
	/**
	 * 用户修改(如果不需要修改的字段不需要赋值，主要一定要给主键赋值)
	 * 实体修改
	 * zhangyu [2015年7月24日 下午2:10:25]
	 * 
	 * @param user
	 * @return
	 * @
	 */
	public BusinessData<Boolean> updateUser(UserEntity user);
	
	/**
	 * 根据用户编号查询用户详情
	 * zhangyu [2015年7月27日 上午9:39:55]
	 * 
	 * @param uuid
	 * @return
	 * @
	 */
	public BusinessData<UserDetailEntity> selectUserDetailByuuid(String uuid);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日下午3:55:49
	 * 描     述：根据用户id 查询用户信息
	 * @param uuid					用户uuid
	 */
	public BusinessData<UserEntity> selectUserByuuid(String uuid);
	/**
	 * @author: Administrator
	 * @date: 2015年8月25日上午1:26:45
	 * @description:根据用户id 查询用户信息
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<UserEntity> selectUserById(long id);
	
	/**
	 * 根据用户编号查询用户地址
	 * zhangyu [2015年7月27日 上午9:43:20]
	 * 
	 * @param uuid
	 * @return
	 * @
	 */
	public BusinessData<UserAddressEntity> selectUserAddressByuuid(String uuid);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日下午5:43:40
	 * 描     述：自定义查询
	 * @param entity					查询数据
	 * 		ps:			Isadmin
	 * @return
	 */
	public BusinessData<UserEntity> selectUserByAdmin(int isAdmin, Integer pageIndex, Integer pageSize, 
			String orderRank, String orderParam);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日下午5:43:40
	 * 描     述：自定义查询
	 * @param selective					查询数据[userName,emaile,mobile]
	 * @return
	 */
	public BusinessData<UserEntity> selectUserBySelective(UserEntity entity,String selective, Integer pageIndex, Integer pageSize, 
			String orderRank, String orderParam);
	
	
}