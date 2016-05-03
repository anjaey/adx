package com.bhe.business.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.user.ILoginLogBusiness;
import com.bhe.dao.mybatis.mapper.LogLoginEntityMapper;
import com.bhe.dao.mybatis.model.LogLoginEntity;
import com.bhe.dao.mybatis.model.LogLoginEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;
/**
 * @author: jsy
 * @date: 2015年8月24日下午10:25:33
 * @description:实现用户日志相关业务接口 
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Service
public class LogLoginBusinessImp extends BaseBusiness implements ILoginLogBusiness{
	
	@Autowired
	public LogLoginEntityMapper logLoginEntityMapper;
	
	public BusinessData<LogLoginEntity> logLoginEntity = null;
	
	@Override
	public BusinessData<Boolean> insertLogLogin(LogLoginEntity Log) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = logLoginEntityMapper.insert(Log);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteLogLogin(Long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = logLoginEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}
	
	private BusinessData<LogLoginEntity> selectLog(LogLoginEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<LogLoginEntity> list = logLoginEntityMapper.selectByExample(criteria);
			logLoginEntity = new BusinessData<LogLoginEntity>(true, pageIndex, pageSize, null, logLoginEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			logLoginEntity = new BusinessData<LogLoginEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return logLoginEntity;
	}

	@Override
	public BusinessData<LogLoginEntity> selectLogById(long id) {
		LogLoginEntityCriteria criteria = new LogLoginEntityCriteria();
		criteria.createCriteria().andIdEqualTo(id);
		return selectLog(criteria, null, null);
	}

	@Override
	public BusinessData<LogLoginEntity> selectLogByUserId(String userid) {
		BusinessData<LogLoginEntity> bd = null;
		try{
			LogLoginEntityCriteria lec = new LogLoginEntityCriteria();
			lec.createCriteria().andUseridEqualTo(userid);

			LogLoginEntity ude = logLoginEntityMapper.selectByExampleForOne(lec);
			bd = new BusinessData<LogLoginEntity>(false,null,ude);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<LogLoginEntity>(false,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null);
		}
		catch(Exception e){
			bd = new BusinessData<LogLoginEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<LogLoginEntity> selectLogs(Integer pageSize, Integer pageIndex, String orderFile,String orderType,String param) {
		LogLoginEntityCriteria aec= new LogLoginEntityCriteria();
		BusinessData<LogLoginEntity> bd = null;
		try{
			aec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			aec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));

			if(!CommonUtil.isEmpty(orderFile,orderType)){
				aec.setOrderByClause(" ${"+orderFile+"} ${"+orderType+"}");
			}
			//搜索条件不为空
			if(!CommonUtil.isEmpty(param)){
				aec.createCriteria().andUsernameLike(param);
				aec.or(aec.createCriteria().andTitleLike(param));
			}
			List<LogLoginEntity> userlist = logLoginEntityMapper.selectByExample(aec);

			//得到数量
			int count = logLoginEntityMapper.countByExample(aec );

			bd = new BusinessData<LogLoginEntity>(true,pageIndex,pageSize,null,count,userlist);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<LogLoginEntity>(false,pageIndex,pageSize,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null,null);
		}
		catch(Exception e){
			bd = new BusinessData<LogLoginEntity>(false,pageIndex,pageSize,ErrorCodeUtil.UNKNOWN_EXCEPTION,null,null);
		}
		return bd;
	}
	
}
