package com.bhe.business.order;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.OrderDetailEntity;
import com.bhe.util.common.BusinessData;

/**
 * 创 建 人：  Administrator
 * 日     期： 2015年7月30日下午5:04:07
 * 描     述：  订单详情业务接口
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Service
public interface IOrderDetailBusiness {
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertOrderDetail(OrderDetailEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteOrderDetailByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateOrderDetailByKey(OrderDetailEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<OrderDetailEntity> selectOrderDetailByEntity(OrderDetailEntity entity, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[orderCode]
	 * @param orderCode		根据[orderCode]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<OrderDetailEntity> selectOrderDetailByOrderCode(String orderCode);
	
	public BusinessData<OrderDetailEntity> selectOrderDetailByAll(String param, Integer pageIndex, Integer pageSize, String orderParam, String orderRank);
	
	public BusinessData<Boolean> deleteOrderDetailByOrderNo(String orderNo);
	
}
