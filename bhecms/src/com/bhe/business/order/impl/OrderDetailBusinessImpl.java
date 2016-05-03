package com.bhe.business.order.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.order.IOrderDetailBusiness;
import com.bhe.dao.mybatis.mapper.OrderDetailEntityMapper;
import com.bhe.dao.mybatis.model.OrderDetailEntity;
import com.bhe.dao.mybatis.model.OrderDetailEntityCriteria;
import com.bhe.dao.mybatis.model.OrderDetailEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;
import com.bhe.util.common.StringUtil;

@Service
public class OrderDetailBusinessImpl extends BaseBusiness implements IOrderDetailBusiness {

	@Autowired
	private OrderDetailEntityMapper orderDetailEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<OrderDetailEntity> dateEntity = null;

	private BusinessData<OrderDetailEntity> selectOrderDetail(OrderDetailEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<OrderDetailEntity> list = orderDetailEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<OrderDetailEntity>(true, pageIndex, pageSize, null, orderDetailEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<OrderDetailEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertOrderDetail(OrderDetailEntity entity) {
		try {
			primaryKey = orderDetailEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteOrderDetailByKey(long primaryKey) {
		try {
			rows = orderDetailEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateOrderDetailByKey(OrderDetailEntity entity) {
		try {
			rows = orderDetailEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<OrderDetailEntity> selectOrderDetailByEntity(OrderDetailEntity entity, Integer pageIndex, Integer pageSize) {
		OrderDetailEntityCriteria criteria = new OrderDetailEntityCriteria();
		
		
		return selectOrderDetail(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<OrderDetailEntity> selectOrderDetailByOrderCode(String orderCode) {
		OrderDetailEntityCriteria criteria = new OrderDetailEntityCriteria();
		if (orderCode != null) {
			criteria.createCriteria().andOrdercodeLike(orderCode);
		}
		
		return selectOrderDetail(criteria, null, null);
	}

	@Override
	public BusinessData<OrderDetailEntity> selectOrderDetailByAll(String param, Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		OrderDetailEntityCriteria criteria = new OrderDetailEntityCriteria();
		
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		return selectOrderDetail(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<Boolean> deleteOrderDetailByOrderNo(String orderNo) {
		OrderDetailEntityCriteria orderDetailEntityCriteria = new OrderDetailEntityCriteria();
		 if(StringUtil.isNull(orderNo)){
			 date = new BusinessData<Boolean>(false, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null, null);
		 }else{
			 try {
				 Criteria create = orderDetailEntityCriteria.createCriteria();
				 create.andOrdercodeEqualTo(orderNo);
				 rows = orderDetailEntityMapper.deleteByExample(orderDetailEntityCriteria);
				 date = new BusinessData<Boolean>(true, null, rows, null);
			 } catch (Exception e) {
				 log.error(ErrorCodeUtil.SQL_EXECUTE_EXCEPTION,e);
				 date = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
			 }
		 }
		return date;
	}
	

}
