package com.bhe.business.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.user.IUserMessageBusiness;
import com.bhe.dao.mybatis.mapper.UserMessageEntityMapper;
import com.bhe.dao.mybatis.model.UserMessageEntity;
import com.bhe.dao.mybatis.model.UserMessageEntityCriteria;
import com.bhe.dao.mybatis.model.UserMessageEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;

@Service
public class UserMessageImpl extends BaseBusiness implements IUserMessageBusiness {

	@Autowired
	private UserMessageEntityMapper userMessageEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<UserMessageEntity> dateEntity = null;

	private BusinessData<UserMessageEntity> selectUserMessage(UserMessageEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<UserMessageEntity> list = userMessageEntityMapper.selectByExampleWithBLOBs(criteria);
			dateEntity = new BusinessData<UserMessageEntity>(true, pageIndex, pageSize, null, userMessageEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<UserMessageEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertUserMessage(UserMessageEntity entity) {
		try {
			primaryKey = userMessageEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteUserMessageByKey(long primaryKey) {
		try {
			rows = userMessageEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateUserMessageByKey(UserMessageEntity entity) {
		try {
			rows = userMessageEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<UserMessageEntity> selectUserMessageByEntity(UserMessageEntity entity, Integer pageIndex, Integer pageSize,
			String orderParam,	String orderRank) {
		UserMessageEntityCriteria criteria = new UserMessageEntityCriteria();
		
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		
		return selectUserMessage(criteria, pageIndex, pageSize);
	}
	
	@Override
	public BusinessData<UserMessageEntity> selectUserMessageById(long id) {
		UserMessageEntityCriteria criteria = new UserMessageEntityCriteria();
		
		criteria.createCriteria().andIdEqualTo(id);
		
		return selectUserMessage(criteria, null, null);
	}
	
	@Override
	public BusinessData<UserMessageEntity> selectUserMessageByStatus( int status, Integer pageIndex, Integer pageSize,
			String orderParam,	String orderRank) {
		UserMessageEntityCriteria criteria = new UserMessageEntityCriteria();
		criteria.createCriteria().andStatusEqualTo(status);
		
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		
		return selectUserMessage(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<UserMessageEntity> selectUserMessageByFromUserId( String fromUserId, Integer pageIndex, Integer pageSize,
			String orderParam, String orderRank,String title,Integer isSee) {
		UserMessageEntityCriteria criteria = new UserMessageEntityCriteria();
		Criteria cr = criteria.createCriteria();
		if (!CommonUtil.isEmpty(fromUserId)) {
			cr.andFromuseridEqualTo(fromUserId);
		}
		if(!CommonUtil.isEmpty(title)){
			cr.andTitleLike("%"+title+"%");
		}
		if(!CommonUtil.isEmpty(isSee) && isSee != -1){
			cr.andIsseeEqualTo(isSee);
		}
		
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		return selectUserMessage(criteria, pageIndex, pageSize);
	}
	
	@Override
	public BusinessData<UserMessageEntity> selectUserMessageByToUserId( String toUserId, Integer pageIndex, Integer pageSize,
			String orderParam, String orderRank,String title,Integer isSee) {
		UserMessageEntityCriteria criteria = new UserMessageEntityCriteria();
		Criteria cr = criteria.createCriteria();
		if (!CommonUtil.isEmpty(toUserId)) {
			cr.andTouseridEqualTo(toUserId);
		}
		if(!CommonUtil.isEmpty(title)){
			cr.andTitleLike("%"+title+"%");
		}
		if(!CommonUtil.isEmpty(isSee) && isSee != -1){
			cr.andIsseeEqualTo(isSee);
		}
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		return selectUserMessage(criteria, pageIndex, pageSize);
	}

}
