package com.bhe.business.order;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.OrderPrintEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description			订单主表
 * @author schoff [2015]
 */
@Service
public interface IOrderPrintBusiness {
	
	/**
	 * @Description			插入数据[单条,批量]
	 * @param list			需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertOrderByBeach(OrderPrintEntity orderPrint);
	
	/**
	 * @Description			根据主键删除数据[支持多删除]
	 * @param list			需要删除的主键集合
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteOrderByKey(Long id);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateOrderByKey(OrderPrintEntity orderPrint);
	
	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015年7月31日上午9:49:58
	 * 描     述：  根据用户名查询订单打印信息
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<OrderPrintEntity> selectOrderByEntity(String userId, Integer pageIndex, Integer pageSize,
			String orderFile,String orderType);
}
