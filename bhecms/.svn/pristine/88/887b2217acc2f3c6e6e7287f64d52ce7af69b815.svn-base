package com.bhe.business.order.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.order.IOrderBusiness;
import com.bhe.dao.mybatis.mapper.OrderEntityMapper;
import com.bhe.dao.mybatis.model.OrderEntity;
import com.bhe.dao.mybatis.model.OrderEntityCriteria;
import com.bhe.dao.mybatis.model.OrderEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;
import com.bhe.util.common.StringUtil;

@Service
public class OrderBusinessImpl extends BaseBusiness implements IOrderBusiness {

	@Autowired
	private OrderEntityMapper orderEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<OrderEntity> dateEntity = null;

	private BusinessData<OrderEntity> selectOrder(OrderEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<OrderEntity> list = orderEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<OrderEntity>(true, pageIndex, pageSize, null, orderEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<OrderEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertOrder(OrderEntity entity) {
		try {
			primaryKey = orderEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteOrderByKey(long primaryKey) {
		try {
			rows = orderEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateOrderByKey(OrderEntity entity) {
		try {
			rows = orderEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<OrderEntity> selectOrderByEntityMap(Map<String,Object> entityMap, Integer pageIndex, Integer pageSize) {
		OrderEntityCriteria orderEntityCriteria = new OrderEntityCriteria();
		orderEntityCriteria.setOrderByClause("createtime desc");
		Criteria criteria = orderEntityCriteria.createCriteria();
		if (entityMap.containsKey("orderType")) {
			criteria.andOrdertypeEqualTo((Integer)entityMap.get("orderType"));
		}
		
		if (entityMap.containsKey("userid")) {
			criteria.andUseridEqualTo(entityMap.get("userid").toString());
		}
		
		if (entityMap.containsKey("orderCode")) {
			
			criteria.andOrdernoLike("%"+StringUtil.str2Trim(entityMap.get("orderCode").toString())+"%");
		}
		if (entityMap.containsKey("auditStatus")) {
			Object obj = entityMap.get("auditStatus");
			if (!CommonUtil.isEmpty(obj)) {
				String state = obj.toString();
				Integer stateint = Integer.valueOf(state);
				criteria.andAuditstatusEqualTo(stateint);
			}
		}
		if (entityMap.containsKey("startTime")&&entityMap.containsKey("endTime")) {
			criteria.andCreatetimeBetween((Date)entityMap.get("startTime"), (Date)entityMap.get("endTime"));
		}
		if (entityMap.containsKey("beginDate")&&entityMap.containsKey("endDate")) {
			criteria.andCreatetimeBetween((Date)entityMap.get("beginDate"), (Date)entityMap.get("endDate"));
		}
		if(entityMap.containsKey("beginDate")&& !entityMap.containsKey("endDate")){
			criteria.andCreatetimeGreaterThanOrEqualTo((Date)entityMap.get("beginDate"));
		}
		if(!entityMap.containsKey("beginDate")&& entityMap.containsKey("endDate")){
			criteria.andCreatetimeLessThanOrEqualTo((Date)entityMap.get("endDate"));
		}
		
		
		return selectOrder(orderEntityCriteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<OrderEntity> selectOrderByOrderNo(String orderNo, Integer pageIndex, Integer pageSize) {
		OrderEntityCriteria criteria = new OrderEntityCriteria();
		
		
		if (orderNo != null) {
			criteria.createCriteria().andOrdernoLike(orderNo);
		}
		
		return selectOrder(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<Boolean> deleteOrderByOrderNo(String orderNo) {
		OrderEntityCriteria orderEntityCriteria = new OrderEntityCriteria();
		 if(StringUtil.isNull(orderNo)){
			 date = new BusinessData<Boolean>(false, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null, null);
		 }else{
			 try {
				 Criteria create = orderEntityCriteria.createCriteria();
				 create.andOrdernoEqualTo(orderNo);
				 rows = orderEntityMapper.deleteByExample(orderEntityCriteria);
				 date = new BusinessData<Boolean>(true, null, rows, null);
			 } catch (Exception e) {
				 log.error(ErrorCodeUtil.SQL_EXECUTE_EXCEPTION,e);
				 date = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
			 }
		 }
		return date;
	}

}
