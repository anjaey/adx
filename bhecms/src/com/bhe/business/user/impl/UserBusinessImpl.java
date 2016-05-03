package com.bhe.business.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.dao.mybatis.mapper.UserAddressEntityMapper;
import com.bhe.dao.mybatis.mapper.UserDetailEntityMapper;
import com.bhe.dao.mybatis.mapper.UserEntityMapper;
import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserAddressEntityCriteria;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserDetailEntityCriteria;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.dao.mybatis.model.UserEntityCriteria;
import com.bhe.dao.mybatis.model.UserEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;
import com.bhe.util.common.StringUtil;

/**
 * 实现用户相关业务接口 
 * @author zhangyu [2015年7月24日 上午10:08:05]
 */
@Service
public class UserBusinessImpl extends BaseBusiness implements IUserBusiness {
	@Autowired
	private UserEntityMapper userEntityMapper;
	@Autowired
	private UserDetailEntityMapper userDetailEntityMapper;
	@Autowired
	private UserAddressEntityMapper userAddressEntityMapper;

	private BusinessData<UserEntity> dateEntity = null;

	private BusinessData<UserEntity> selectUser(UserEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<UserEntity> list = userEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<UserEntity>(true, pageIndex, pageSize, null, userEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<UserEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}


	@Override
	public BusinessData<UserEntity> selectUserByname(String username){
		BusinessData<UserEntity> bd = null;
		try{
			UserEntityCriteria uec = new UserEntityCriteria();
  
			//组装查询表达式
			Criteria criter = uec.createCriteria();
			criter.andUsernameEqualTo(username);
			UserEntity userentity = userEntityMapper.selectByExampleForOne(uec);

			bd = new BusinessData<UserEntity>(false,null,userentity);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<UserEntity>(false,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null);
		}
		catch(Exception e){
			bd = new BusinessData<UserEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> insertUser(UserEntity user) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = userEntityMapper.insert(user);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteUser(Long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = userEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateUser(UserEntity user) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			UserEntityCriteria uec = new UserEntityCriteria();
			uec.createCriteria().andUuidEqualTo(user.getUuid());
			rows = userEntityMapper.updateByExampleSelective(user, uec);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<Boolean>(false,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,rows,null);
		}
		catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<UserEntity> selectUsers(Integer pageSize, Integer pageIndex,
			String orderFile, String orderType,String userName) {
		UserEntityCriteria aec= new UserEntityCriteria();
		BusinessData<UserEntity> bd = null;
		try{
			aec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			aec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));

			if(!CommonUtil.isEmpty(orderFile,orderType)){
				aec.setOrderByClause("order by ${"+orderFile+"} ${"+orderType+"}");
			}

			if(!CommonUtil.isEmpty(userName)){
				aec.createCriteria().andUsernameEqualTo(userName);
			}

			List<UserEntity> userlist = userEntityMapper.selectByExample(aec);

			//得到数量
			int count = userEntityMapper.countByExample(new UserEntityCriteria());

			bd = new BusinessData<UserEntity>(true,pageIndex,pageSize,null,count,userlist);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<UserEntity>(false,pageIndex,pageSize,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null,null);
		}
		catch(Exception e){
			bd = new BusinessData<UserEntity>(false,pageIndex,pageSize,ErrorCodeUtil.UNKNOWN_EXCEPTION,null,null);
		}
		return bd;
	}

	@Override
	public BusinessData<UserDetailEntity> selectUserDetailByuuid(String uuid)
	{
		BusinessData<UserDetailEntity> bd = null;
		try{
			UserDetailEntityCriteria uec = new UserDetailEntityCriteria();
			uec.createCriteria().andUserkeyEqualTo(uuid);

			UserDetailEntity ude = userDetailEntityMapper.selectByExampleForOne(uec);
			bd = new BusinessData<UserDetailEntity>(false,null,ude);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<UserDetailEntity>(false,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null);
		}
		catch(Exception e){
			bd = new BusinessData<UserDetailEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<UserAddressEntity> selectUserAddressByuuid(String uuid){
		BusinessData<UserAddressEntity> bd = null;
		try{
			UserAddressEntityCriteria uae = new UserAddressEntityCriteria();
			uae.createCriteria().andUserkeyEqualTo(uuid);

			UserAddressEntity ude = userAddressEntityMapper.selectByExampleForOne(uae);

			bd = new BusinessData<UserAddressEntity>(false,null,ude);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<UserAddressEntity>(false,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null);
		}
		catch(Exception e){
			bd = new BusinessData<UserAddressEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> insertUserAddress(UserAddressEntity uae) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = userAddressEntityMapper.insert(uae);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> insertUserDetail(UserDetailEntity ude) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = userDetailEntityMapper.insert(ude);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteUserDetail(String userUuid) {
		UserDetailEntityCriteria uae = new UserDetailEntityCriteria();

		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			uae.createCriteria().andUserkeyEqualTo(userUuid);
			rows = userDetailEntityMapper.deleteByExample(uae);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteUserAddress(String userUuid) {
		UserAddressEntityCriteria uae = new UserAddressEntityCriteria();

		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			uae.createCriteria().andUserkeyEqualTo(userUuid);
			rows = userAddressEntityMapper.deleteByExample(uae);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateUserAddress(UserAddressEntity uae) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows = userAddressEntityMapper.updateByPrimaryKeySelective(uae);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateUserDetail(UserDetailEntity ude) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			UserDetailEntityCriteria udec = new UserDetailEntityCriteria();
			udec.createCriteria().andUserkeyEqualTo(ude.getUserkey());
			rows = userDetailEntityMapper.updateByExampleSelective(ude, udec);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<Boolean>(false,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,rows,null);
		}
		catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<UserEntity> selectUserByuuid(String uuid) {
		UserEntityCriteria criteria = new UserEntityCriteria();
		if (uuid != null) {
			criteria.createCriteria().andUuidEqualTo(uuid);
		}
		return selectUser(criteria, null, null);
	}


	@Override
	public BusinessData<UserEntity> selectUserByAdmin(int isAdmin, Integer pageIndex, Integer pageSize,
			String orderRank, String orderParam) {
		UserEntityCriteria criteria = new UserEntityCriteria();

		criteria.createCriteria().andIsadminEqualTo(isAdmin);

		return selectUser(criteria, pageIndex, pageSize);
	}


	@Override
	public BusinessData<UserEntity> selectUserBySelective(UserEntity entity,String selective, Integer pageIndex, Integer pageSize,
			String orderRank, String orderParam) {
		UserEntityCriteria criteria = new UserEntityCriteria();
		UserEntityCriteria userNameCriteria = new UserEntityCriteria();
		UserEntityCriteria emailCriteria = new UserEntityCriteria();
		UserEntityCriteria mobileCriteria = new UserEntityCriteria();
		if (!StringUtil.isNull(selective)) {
			criteria.or(userNameCriteria.createCriteria().andUsernameLike(selective));
			criteria.or(emailCriteria.createCriteria().andEmailLike(selective));
			criteria.or(mobileCriteria.createCriteria().andPhoneLike(selective));
		}

		if (entity.getIsadmin() != null) {
			criteria.createCriteria().andIsadminEqualTo(entity.getIsadmin());
		}

		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());

		return selectUser(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<UserEntity> selectUserById(long id) {
		UserEntityCriteria criteria = new UserEntityCriteria();
			criteria.createCriteria().andIdEqualTo(id);
		return selectUser(criteria, null, null);
	}

}
