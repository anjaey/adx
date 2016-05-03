package com.bhe.business.user;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.LogLoginEntity;
import com.bhe.util.common.BusinessData;
/**
 * @author: Administrator
 * @date: 2015年8月24日下午10:06:17
 * @description:用户日志相关接口
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Service
public interface ILoginLogBusiness {
	/**
	 * @author: Administrator
	 * @date: 2015年8月24日下午10:05:28
	 * @description:添加用户日志
	 * @param Log
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> insertLogLogin(LogLoginEntity Log);
	
	/**
	 * @author: Administrator
	 * @date: 2015年8月24日下午10:08:37
	 * @description:删除日志
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> deleteLogLogin(Long id);
	
	
	/**
	 * @author: Administrator
	 * @date: 2015年8月24日下午10:36:23
	 * @description:根据id查询日志
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<LogLoginEntity> selectLogById(long id);
	
	/**
	 * @author: Administrator
	 * @date: 2015年8月24日下午10:49:56
	 * @description:根据userid查询日志
	 * @param userid
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<LogLoginEntity> selectLogByUserId(String userid);
	
	/**
	 * @author: Administrator
	 * @date: 2015年8月24日下午11:48:47
	 * @description:查询所有用户日志
	 * @param pageSize
	 * @param pageIndex
	 * @param orderFile
	 * @param orderType
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<LogLoginEntity> selectLogs(Integer pageSize,Integer pageIndex,String orderFile,String orderType,String param) ;
}
