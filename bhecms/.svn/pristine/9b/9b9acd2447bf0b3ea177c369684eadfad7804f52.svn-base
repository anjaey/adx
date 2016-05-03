package com.bhe.business.order;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.OrderEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description			订单主表
 * @author schoff [2015]
 */
@Service
public interface IOrderBusiness {
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertOrder(OrderEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteOrderByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateOrderByKey(OrderEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<OrderEntity> selectOrderByEntityMap(Map<String,Object> entityMap, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[orderNo]
	 * @param orderNo		根据[orderNo]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<OrderEntity> selectOrderByOrderNo(String orderNo, Integer pageIndex, Integer pageSize);
	
	
	public BusinessData<Boolean> deleteOrderByOrderNo(String orderNo);
	

}
