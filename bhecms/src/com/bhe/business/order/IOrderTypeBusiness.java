package com.bhe.business.order;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.OrderTypeEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description  订单类型业务接口
 * @author schoff [2015]
 */
@Service
public interface IOrderTypeBusiness {
	
	/**
	 * @Description			插入数据[单条,批量]
	 * @param list			需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertOrderByBeach(OrderTypeEntity order);
	
	/**
	 * @Description			根据主键删除数据[支持多删除]
	 * @param list			需要删除的主键集合
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteOrderByKey(long id);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateOrderByKey(OrderTypeEntity entity);
	
	/**
	 * @Description			查询数据
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<OrderTypeEntity> selectOrderByEntity(Integer pageIndex,
			Integer pageSize,String orderFile,String orderType,String orderTypeTitle);

}
