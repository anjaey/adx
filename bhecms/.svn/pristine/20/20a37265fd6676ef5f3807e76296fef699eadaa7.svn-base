package com.bhe.business.order.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.order.IOrderPrintBusiness;
import com.bhe.dao.mybatis.mapper.OrderPrintEntityMapper;
import com.bhe.dao.mybatis.model.OrderPrintEntity;
import com.bhe.dao.mybatis.model.OrderPrintEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;

@Service
public class OrderPrintBusinessImpl implements IOrderPrintBusiness {

	@Autowired
	private OrderPrintEntityMapper orderPrintEntityMapper;
	
	@Override
	public BusinessData<Boolean> insertOrderByBeach(OrderPrintEntity orderPrint) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  orderPrintEntityMapper.insert(orderPrint);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteOrderByKey(Long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  orderPrintEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateOrderByKey(OrderPrintEntity orderPrint) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  orderPrintEntityMapper.updateByPrimaryKeySelective(orderPrint);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<OrderPrintEntity> selectOrderByEntity(String userId,
			Integer pageIndex, Integer pageSize, String orderFile,
			String orderType) {
		OrderPrintEntityCriteria opec= new OrderPrintEntityCriteria();
		BusinessData<OrderPrintEntity> bd = null;
		
		try{
			opec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			opec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));
			
			if(!CommonUtil.isEmpty(orderType,orderFile)){
				opec.setOrderByClause("order by ${"+orderFile+"} ${"+orderType+"}");
			}
			
			if(!CommonUtil.isEmpty(userId)){
				opec.createCriteria().andCreateuserEqualTo(userId);
			}
			
			//分页查询
			List<OrderPrintEntity> auticlelist = orderPrintEntityMapper.selectByExample(opec);
			
			//得到数量
			Integer count = orderPrintEntityMapper.countByExample(new OrderPrintEntityCriteria());
			bd = new BusinessData<OrderPrintEntity>(true,pageIndex,pageSize,null,count,auticlelist);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<OrderPrintEntity>(false,pageIndex,pageSize,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null,null);
		}
		catch(Exception e){
			bd = new BusinessData<OrderPrintEntity>(false,pageIndex,pageSize,ErrorCodeUtil.UNKNOWN_EXCEPTION,null,null);
		}
		return bd;
	}

}
