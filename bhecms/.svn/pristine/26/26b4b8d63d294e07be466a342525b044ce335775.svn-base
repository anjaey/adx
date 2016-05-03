package com.bhe.business.system;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.SysAttachmentEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 附件管理接口
 * @author schoff [2015年7月23日]
 */
@Service
public interface ISysAttachmentBusiness {

	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertSysAttachment(SysAttachmentEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteSysAttachmentByKey(String primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateSysAttachmentByKey(SysAttachmentEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysAttachmentEntity> selectSysAttachmentByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[name]
	 * @param name			根据[name]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysAttachmentEntity> selectSysAttachmentByName(String name, Integer pageIndex, Integer pageSize);
	
}

