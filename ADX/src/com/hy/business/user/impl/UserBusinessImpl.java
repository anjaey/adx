package com.hy.business.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hy.business.user.IUserBusiness;
import com.hy.dao.mybatis.mapper.UserbasicMapper;
import com.hy.dao.mybatis.model.Userbasic;
import com.hy.dao.mybatis.model.UserbasicCriteria;
import com.hy.dao.mybatis.model.UserbasicCriteria.Criteria;
import com.hy.util.common.CommonUtil;
import com.hy.util.common.ConstantUtil;
import com.hy.util.common.MD5Util;


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
	public Map<String, Object> login(Map<String, Object> map, HttpServletRequest reqeust) {
		
		Map<String, Object> returnParam = new HashMap<String, Object>();
		//取出用户名
		Object userobj = map.get("username");
		if (!CommonUtil.isEmpty(userobj)) {
			Userbasic userbasic = null;
			UserbasicCriteria userbasicCriteria = new UserbasicCriteria();
			Criteria criteria = userbasicCriteria.createCriteria();
			criteria.andStateEqualTo(1);
			criteria.andIsdeleteEqualTo(1);
			
			String userobjStr = userobj.toString();
			int index = userobjStr.indexOf("@");
			if (index == -1) {  //表示登录的是用户名   查询用户名
				criteria.andUsernameEqualTo(userobjStr);
				
			} else {  //表示登录的是邮箱   查询邮箱
				criteria.andEmilEqualTo(userobjStr);
			}

			userbasic = userbasicMapper.selectByExampleForOne(userbasicCriteria);
			if (!CommonUtil.isEmpty(userbasic)) {
				String pwd = userbasic.getPwd();
				
				String pwdstr = map.get("pwd").toString();
				String newpwd = MD5Util.string2MD5(pwdstr);
				if (newpwd.equals(pwd)) {  //密码相同，登录成功
					returnParam.put("state", ConstantUtil.USER_LOGIN_SUCCESS);
					
					//保存用户信息到session 
					reqeust.getSession().setAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER, userbasic);
					
				} else {  //密码错误
					returnParam.put("state",ConstantUtil.USER_LOGIN_USERNAMEORPWDNOT);
				}
			} else {
				//用户名不存在
				returnParam.put("state", ConstantUtil.USER_LOGIN_USERNAMENOTHINGNESS);
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
