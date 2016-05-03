package com.bhe.business.user;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.UserMessageEntity;
import com.bhe.util.common.BusinessData;

/**
* 创 建 人：  schoff
* 日     期： 2015年7月30日上午11:40:47
* 描     述： 用户消息，站内信相关业务接口 
* --------------------------------------
* 修 改 人： 
* 日     期： 
* 描     述：  扼要说明修改原因，修改详细请注明到方法级
* --------------------------------------
 */
@Service
public interface IUserMessageBusiness {
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertUserMessage(UserMessageEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteUserMessageByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateUserMessageByKey(UserMessageEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<UserMessageEntity> selectUserMessageByEntity(UserMessageEntity entity, Integer pageIndex, Integer pageSize,
			String orderParam,	String orderRank);
	
	/**
	 * @Description			查询数据[fromUserId]
	 * @param fromUserId	需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<UserMessageEntity> selectUserMessageByFromUserId(String fromUserId, Integer pageIndex, Integer pageSize,
			String orderParam,	String orderRank,String title,Integer issee);
	
	/**
	 * @Description			查询数据[toUserId]
	 * @param toUserId		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<UserMessageEntity> selectUserMessageByToUserId(String toUserId, Integer pageIndex, Integer pageSize,
			String orderParam,	String orderRank,String title,Integer issee);
	
	/**
	 * @Description			查询数据[自定义]
	 * @param id			需要查询的数据条件[id]
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<UserMessageEntity> selectUserMessageById(long id );

	/**
	 * @Description			查询数据[status]
	 * @param status		根据[status]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<UserMessageEntity> selectUserMessageByStatus(int status, Integer pageIndex, Integer pageSize,
			String orderParam,	String orderRank);
	
}