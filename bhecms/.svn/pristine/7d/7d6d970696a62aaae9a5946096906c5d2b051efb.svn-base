package com.bhe.business.order.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bhe.business.order.IOrderTypeBusiness;
import com.bhe.dao.mybatis.mapper.OrderTypeEntityMapper;
import com.bhe.dao.mybatis.model.OrderTypeEntity;
import com.bhe.dao.mybatis.model.OrderTypeEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;

/**
 * 创 建 人：  zhangyu
 * 日     期： 2015年7月30日下午4:19:38
 * 描     述： 订单类型接口实现
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Service
public class OrderTypeBusinessImpl implements IOrderTypeBusiness {
	
	OrderTypeEntityMapper orderTypeEntityMapper;

	@Override
	public BusinessData<Boolean> insertOrderByBeach(OrderTypeEntity order) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  orderTypeEntityMapper.insert(order);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteOrderByKey(long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  orderTypeEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateOrderByKey(OrderTypeEntity entity) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  orderTypeEntityMapper.updateByPrimaryKeySelective(entity);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<OrderTypeEntity> selectOrderByEntity(Integer pageIndex,
			Integer pageSize,String orderFile,String orderType,String orderTypeTitle) {
		OrderTypeEntityCriteria otc= new OrderTypeEntityCriteria();
		BusinessData<OrderTypeEntity> bd = null;
		
		try{
			otc.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			otc.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));
			
			if(!CommonUtil.isEmpty(orderType,orderFile)){
				otc.setOrderByClause("order by ${"+orderFile+"} ${"+orderType+"}");
			}
			
			//分页查询
			List<OrderTypeEntity> userlist = orderTypeEntityMapper.selectByExample(otc);
			
			//得到数量
			Integer count = orderTypeEntityMapper.countByExample(new OrderTypeEntityCriteria());
			bd = new BusinessData<OrderTypeEntity>(true,pageIndex,pageSize,null,count,userlist);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<OrderTypeEntity>(false,pageIndex,pageSize,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null,null);
		}
		catch(Exception e){
			bd = new BusinessData<OrderTypeEntity>(false,pageIndex,pageSize,ErrorCodeUtil.UNKNOWN_EXCEPTION,null,null);
		}
		return bd;
	}
}
