package com.bhe.controller.web.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.MD5Util;
import com.bhe.util.common.UuidUtil;
/**
 * 登录与注册
 * @author: jsy
 * @date: 2015年8月18日下午2:39:07
 * @description:
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Controller
public class UserController extends BaseController{
	@Autowired
	private IUserBusiness iuserBusiness;
	
	/**
	 * 跳转登录页面
	 * @param froms
	 * @return
	 * @date 2015年8月17日 9:58:03
	 */
	@RequestMapping("/user/toLogin/loginPage.html")
	public ModelAndView toLogin(){

		return forwardPage("web/user/login");
	}
	
	/**
	 * @author: jsy
	 * @date: 2015年8月18日下午2:40:29
	 * @description: 用户登录
	 * @param requestMap
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	 
	@RequestMapping(value="/user/toLogin/login.html", method=RequestMethod.POST)
	public void login(@RequestParam Map<String, String> requestMap){
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			String userName=requestMap.get("userName");
			String pwd=requestMap.get("pwd");
			
			if (CommonUtil.isEmpty(userName) || CommonUtil.isEmpty(pwd)) {
				map.put("result", "0");
				this.writeJson(map);
			} else {
				//进行登陆
				BusinessData<UserEntity> user = iuserBusiness.selectUserByname(userName);
				if (null == user.getT()) { //用户名不存在
					map.put("result", ConstantUtil.USER_LOGIN_USERNAMENOTHINGNESS);
				} else {
					//判断密码
					String pwdmd5 = user.getT().getPassword();
					//加密
					String pwdcon = MD5Util.string2MD5(pwd);
					System.out.println(pwdmd5);
					System.out.println(pwdcon);
					//判断MD5密码是否一致
					if (pwdcon.equals(pwdmd5)) {
						//保持session
						this.request.getSession().setAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER, user.getT());

						// 前台导航
						this.request.getSession().setAttribute(ConstantUtil.SESSION_NAVIGATE, "1");
						
						//修改登录时间
						UserEntity ue = user.getT();
						
							ue.setLastlogintime(new Date());
							Integer count= ue.getLogincount();
							if (null==count) {
								count=0;
							} else {
								count++;
							}
							ue.setLogincount(count);
							iuserBusiness.updateUser(ue);
							map.put("result", ConstantUtil.USER_LOGIN_SUCCESS);
							
					} else {
						map.put("result", ConstantUtil.USER_LOGIN_USERNAMEORPWDNOT);
					}
					
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		this.writeJson(map);
	}
	
	/**
	 * @author: jsy
	 * @date: 2015年8月18日下午2:39:48
	 * @description:跳转用户注册页面
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/user/toLogin/registIndex.html")
	public ModelAndView toRegist(){
		
		return forwardPage("web/user/registPage");
	}
	
	/**
	 * 
	 * @author: jsy
	 * @date: 2015年8月18日下午2:39:37
	 * @description:用户注册
	 * @param param
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user/toLogin/regist.html")
	public void regist(@RequestParam String param){
		try {
			if (!CommonUtil.isEmpty(param)) {
				Map<String, Object> map = JsonUtil.JsonToObject(param,Map.class);
				Map<String,Object> userMap = (Map<String,Object>)map.get("info");  //获取用户基本信息
				Object password = userMap.get("password");
				String pwd = (String)password;
				pwd = MD5Util.string2MD5(pwd);
				userMap.put("password", pwd);
				
				Map<String,Object> detailedMap = (Map<String,Object>)map.get("detailed");  //获取用户详细信息

				UserEntity ue = (UserEntity) ListMapUtil.setEntityValue(userMap, UserEntity.class);
				ue.setCreatetime(new Date(0));		
				ue.setIsdelete(0);
				String uuid = UuidUtil.generateUUID();
				ue.setUuid(uuid);
				ue.setIsadmin(0);
				ue.setStatus(0);
				BusinessData<Boolean> insertUser = iuserBusiness.insertUser(ue);
				
				detailedMap.put("userkey", ue.getUuid());
				
				UserDetailEntity ude = (UserDetailEntity) ListMapUtil.setEntityValue(detailedMap, UserDetailEntity.class);
				ude.setCreatetime(new Date());
				
				BusinessData<Boolean> userDetail = iuserBusiness.insertUserDetail(ude);
				if(insertUser.isSuccess() && userDetail.isSuccess()){
					ude.setUserkey(uuid);
					this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
				}else {
					this.writeJson("returned", ConstantUtil.RETURN_FAIL);
				}
			} else {
				this.writeJson("returned", ConstantUtil.RETURN_FAIL);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月29日上午10:47:29
	 * @description:检验用户名是否存在
	 * @param userName
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/user/toLogin/checkUserName.html", method=RequestMethod.POST)
	public void checkUserName(String username){
		if(!CommonUtil.isEmpty(username)){
			BusinessData<UserEntity> user = iuserBusiness.selectUserByname(username);
			if (!CommonUtil.isEmpty(user.getT())) { //用户名存在
				this.writeJson("result", ConstantUtil.RETURN_FAIL);//返回验证失败
			}
		
		}
	}
	
	/**
	 * 退出方法 
	 * @param model
	 * @return
	 * @date 2015年7月23日下午5:31:55
	 */

	@RequestMapping(value="/web/toLogin/logout.html")
	public ModelAndView logout(ModelMap model){
		request.getSession().removeAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		return forwardPage("redirect:/");
	}
}
