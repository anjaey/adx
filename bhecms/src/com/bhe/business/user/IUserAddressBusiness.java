package com.bhe.business.user;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.util.common.BusinessData;

@Service
public interface IUserAddressBusiness {

	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:27:41
	 * @description:添加数据
	 * @param uae
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> insertUserAddressByBeach(UserAddressEntity uae);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:27:56
	 * @description: 删除数据
	 * @param id		删除的id，用户的uuid
	 * @param userKey
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> deleteUserAddressByKey(Long id,String userKey);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:28:28
	 * @description: 修改数据
	 * @param entity 修改的对象
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateUserAddressByKey(UserAddressEntity entity);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:28:48
	 * @description: 查询所有地址
	 * @param userKey 查询的用户
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<UserAddressEntity> selectAllUserAddress(String userKey);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:29:04
	 * @description: 查询用户地址根据id
	 * @param id 获取地址的id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<UserAddressEntity> selectUserAddressById(long id);
	
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:41:44
	 * @description: 根据id修改是否为默认地址
	 * @param id 需要修改的id
	 * @param userKey	地址所诉用户
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateIsDefaultByKey(long id, String userKey);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午10:40:34
	 * @description:	清空所有默认地址
	 * @param userKey	需要清空的用户uuid
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateIsDefaultToClear(String userKey);
	
	
	
	
	
}
