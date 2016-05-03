package com.bhe.business.system;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.SysLinkEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 友情链接
 * @author schoff [2015年7月22日]
 */
@Service
public interface ISysLinkBusiness {
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertSysLink(SysLinkEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteSysLinkByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateSysLinkByKey(SysLinkEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysLinkEntity> selectSysLinkByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[name]
	 * @param name			根据[name]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysLinkEntity> selectSysLinkByName(String name, Integer pageIndex, Integer pageSize);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月14日下午9:24:33
	 * @description:  查看详情
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<SysLinkEntity> selectByid(Long id);
	
}
