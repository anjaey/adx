package com.bhe.business.order;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.OrderCartEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description	购物车业务接口
 * @author schoff [2015]
 */
@Service
public interface IOrderCartBusiness {
	
	/**
	 * @Description			插入数据[单条,批量]
	 * @param list			需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertOrderByBeach(OrderCartEntity ose);
	
	/**
	 * @Description			根据主键删除数据[支持多删除]
	 * @param list			需要删除的主键集合
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteOrderByKey(Long id);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:35:57
	 * @description: 根据产品id和用户id删除数据
	 * @param productid	产品id
	 * @param userid 用户id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> deleteOrderBySelective(String productid, String userid);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateOrderByKey(OrderCartEntity ose);
	
	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015年7月30日下午4:38:20
	 * 描     述：  查询用户购物车的产品
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<OrderCartEntity> selectOrderByEntity(
			Integer pageIndex, Integer pageSize,String orderType,String orderFile,String userid);
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月21日下午10:02:02
	 * @description:查找某一产品
	 * @param uuid
	 * @param userUuid
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<OrderCartEntity> selectOrderByUuid(String uuid,String userUuid);
	
	public BusinessData<OrderCartEntity> selectAll(String userUuid);

}
