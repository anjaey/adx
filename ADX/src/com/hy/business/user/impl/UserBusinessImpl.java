package com.hy.business.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.business.user.IUserBusiness;
import com.hy.dao.mybatis.mapper.UserbasicMapper;
import com.hy.dao.mybatis.model.UserbasicCriteria;
import com.hy.dao.mybatis.model.UserbasicCriteria.Criteria;
import com.hy.util.common.CommonUtil;

/**
 * 用户接口实现
 * @author hy
 *
 */
@Service
public class UserBusinessImpl implements IUserBusiness{

	@Autowired
	private UserbasicMapper userbasicMapper;
	
	@Override
	public Map<String, Object> login(Map<String, Object> map) {
		
		Map<String, Object> returnParam = new HashMap<String, Object>();
		
		//取出用户名
		Object userobj = map.get("");
		if (!CommonUtil.isEmpty(userobj)) {
			String userobjStr = userobj.toString();
			int index = userobjStr.indexOf("@");
			if (index == -1) {  //表示登录的是用户名   查询用户名
				
				UserbasicCriteria userbasicCriteria = new UserbasicCriteria();
				Criteria criteria = userbasicCriteria.createCriteria();
				criteria.andUsernameEqualTo(userobjStr);
				
//				userbasicMapper.selectByExampleForOne(example)
				
			} else {  //表示登录的是邮箱   查询邮箱
				
			}
			
			//根据
		}
		
		return returnParam;
	}

	@Override
	public Map<String, Object> register(Map<String, Object> map) {
		return null;
	}

	@Override
	public Map<String, Object> selectUserInfoOne(Map<String, Object> map) {
		//  Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateUserInfo(Map<String, Object> map) {
		//  Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectRoleByUserid(Integer userid) {
		//  Auto-generated method stub
		return null;
	}

}
