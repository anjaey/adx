package com.bhe.business.system;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.SysCarouselEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 调查
 * @author schoff [2015年7月23日]
 */
@Service
public interface ISysCarouselBusiness {

	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertSysCarousel(SysCarouselEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteSysCarouselByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateSysCarouselByKey(SysCarouselEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param map			需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysCarouselEntity> selectSysCarouselByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[type]
	 * @param type			根据[type]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysCarouselEntity> selectSysCarouselByType(int type, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[id]
	 * @param id			根据[id]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SysCarouselEntity> selectSysCarouselById(long id, Integer pageIndex, Integer pageSize);
	
}
