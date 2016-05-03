package com.bhe.controller.admin.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.user.ILoginLogBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.LogLoginEntity;
import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.MD5Util;
import com.bhe.util.common.StringUtil;
import com.bhe.util.common.UuidUtil;

/**
 * 用户管理模块
 * @author Dp
 * @date 2015年7月24日下午3:12:21
 */

@Controller
public class UserManageController extends BaseController{
	@Autowired
	private IUserBusiness iuserBusiness;
	@Autowired
	private ILoginLogBusiness iLoginLogBusiness;
	/**
	 * 跳转登陆页面
	 * @param froms
	 * @return
	 * @date 2015年7月23日下午4:34:05
	 */
	@RequestMapping("/admin/toLogin/loginIndex.html")
	public ModelAndView toLogin(){

		return forwardPage("admin/common/login");
	}
	
	/**
	 * 用户登录
	 * zhangyu [2015年7月25日 上午11:53:22]
	 * 
	 * @param requestMap
	 */
	@RequestMapping(value="/admin/toLogin/login.html", method=RequestMethod.POST)
	public void login(@RequestParam Map<String, String> requestMap,HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			String userName=requestMap.get("userName");
			String pwd=requestMap.get("pwd");
			String ip = request.getRemoteAddr();
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
					//判断MD5密码是否一致
					if (pwdcon.equals(pwdmd5)) {
						map.put("result", ConstantUtil.USER_LOGIN_SUCCESS);
						//保持session
						this.request.getSession().setAttribute(ConstantUtil.SESSION_LOGIN_USER, user.getT());
						// 后台导航
						this.request.getSession().setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "1");
						
						//修改登录时间
						UserEntity ue = user.getT();
						if (ue.getIsadmin() == 0 ) {
							map.put("result", ConstantUtil.USER_LOGIN_USERNAMEORPWDNOT);
						} else {
							ue.setLastlogintime(new Date());
							Integer count = ue.getLogincount();
							if (null==count) {
								count=0;
							} else {
								count++;
							}
							ue.setLogincount(count);
							iuserBusiness.updateUser(ue);
							//添加登录日志
							LogLoginEntity logLogin = new LogLoginEntity();
							logLogin.setUserid(ue.getId().toString());
							logLogin.setUsername(ue.getUsername());
							logLogin.setIp(ip);
							logLogin.setCreatetime(new Date());
							logLogin.setTitle("登录");
							logLogin.setIsdelete(0);
							iLoginLogBusiness.insertLogLogin(logLogin);	
						}
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
	 * 退出方法 
	 * @param model
	 * @return
	 * @date 2015年7月23日下午5:31:55
	 */

	@RequestMapping(value="/admin/toLogin/logout.html")
	public ModelAndView logout(ModelMap model){
		request.getSession().removeAttribute(ConstantUtil.SESSION_LOGIN_USER);
		return forwardPage("admin/common/login");
	}

	

	/**
	 * 
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年7月30日下午5:56:43
	 * 描     述：用户首页
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/userIndex.html")
	public ModelAndView userIndex(Model model,Integer pageIndex,Integer pageSize, String orderFile, String orderType,String searchKey){
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "6");
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		if(null == pageIndex || 0 == pageIndex){
			pageIndex=1;
		}
		if(null == pageSize){
			pageSize=15;
		}
		try {
			UserEntity entity = new UserEntity();
			entity.setIsadmin(0);
			BusinessData<UserEntity> bdue = iuserBusiness.selectUserBySelective(entity,searchKey, pageIndex, pageSize, orderFile, orderType);
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
			model.addAttribute("pageInfoMap",pageInfoMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/user/userIndex");
	}
	
	
	/**
	 * 用户编辑
	 * 创 建 人：  DP
	 * 日     期：  2015年7月30日下午5:57:02
	 * 描     述：
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/userEdit.html")
	public ModelAndView userEdit(Model model,String  uuid){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		if(!StringUtil.isNull(uuid)){
			try {
				model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
				//获取用户基本信息
				BusinessData<UserEntity> ue = iuserBusiness.selectUserByuuid(uuid);
				Map<String, Object> uemap = ListMapUtil.convertEntityToMap(ue.getT());
				
				//获取用户地址信息
				BusinessData<UserAddressEntity> ueaddress = iuserBusiness.selectUserAddressByuuid(uuid);
				Map<String,Object> ueaddressmap = ListMapUtil.convertEntityToMap(ueaddress.getT());
	
				//获取用户详细信息
				BusinessData<UserDetailEntity> uedetai = iuserBusiness.selectUserDetailByuuid(uuid);
				Map<String,Object> uedetaimap = ListMapUtil.convertEntityToMap(uedetai.getT());
				
				model.addAttribute("uemap",uemap);
				model.addAttribute("ueaddress",ueaddressmap);
				model.addAttribute("uedetaimap",uedetaimap);
			} catch (Exception e) {
				log.error(e);
			}
		}else{
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
		}
		return forwardPage("admin/user/userEdit");
	}
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月13日上午10:23:50
	 * 描     述：管理员 添加，编辑
	 * @param model
	 * @param requestMap
	 * @param userType
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/adminEdit.html")
	public ModelAndView adminEdit(Model model,String  uuid){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","3");
		if(!StringUtil.isNull(uuid)){
			try {
				//获取用户基本信息
				BusinessData<UserEntity> ue = iuserBusiness.selectUserByuuid(uuid);
				Map<String, Object> uemap = ListMapUtil.convertEntityToMap(ue.getT());
				
				//获取用户地址信息
				BusinessData<UserAddressEntity> ueaddress = iuserBusiness.selectUserAddressByuuid(uuid);
				Map<String,Object> ueaddressmap = ListMapUtil.convertEntityToMap(ueaddress.getT());
	
				//获取用户详细信息
				BusinessData<UserDetailEntity> uedetai = iuserBusiness.selectUserDetailByuuid(uuid);
				Map<String,Object> uedetaimap = ListMapUtil.convertEntityToMap(uedetai.getT());
				
				model.addAttribute("uemap",uemap);
				model.addAttribute("ueaddress",ueaddressmap);
				model.addAttribute("uedetaimap",uedetaimap);
				model.addAttribute("states",ConstantUtil.VIEW_FROS_TOUPDATE);
				
			} catch (Exception e) {
				log.error(e);
			}
		}else{
			model.addAttribute("states",ConstantUtil.VIEW_FROS_TOADD);
		}
		return forwardPage("admin/user/adminEdit");
	}
	
	/**
	 * 
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年7月31日下午2:30:00
	 * 描     述：添加管理员帐号
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/saveUserInfo.html",method=RequestMethod.POST)
	public void saveUserInfo(Map<String,Object> map,String userEntityStr ,String detailEntityStr){
		UserDetailEntity detailEntity= JsonUtil.JsonToObject(detailEntityStr, UserDetailEntity.class);
		UserEntity userEntity= JsonUtil.JsonToObject(userEntityStr, UserEntity.class);
		if(null==detailEntity||null==userEntity){
			map.put("result", ErrorCodeUtil.LANG_ILLEGALARGUMENTEXCEPTION);
		}else{
			String uuid = userEntity.getUuid();
			if(null!=uuid){
				if(iuserBusiness.updateUser(userEntity).isSuccess()){
					if(iuserBusiness.updateUserDetail(detailEntity).isSuccess()){
						map.put("result",ConstantUtil.DIGITAL_ONE);//更新成功
					}else{
						map.put("result",ConstantUtil.DIGITAL_ZERO);//更新失败
					}
				}else{
					map.put("result",ConstantUtil.DIGITAL_ZERO );//更新失败
					
				}
			}else{
				if(null==userEntity.getUsername()){
					map.put("result", ErrorCodeUtil.LANG_MISSARGUMENTEXCEPTION);
				}else{
					BusinessData<UserEntity> ue = iuserBusiness.selectUserByname(userEntity.getUsername());
					if(null!=ue.getT()){
						map.put("result", ConstantUtil.DIGITAL_TWO);
					}else{
						String key=UuidUtil.generateUUID();
						userEntity.setUuid(key);
						userEntity.setPassword(MD5Util.string2MD5(ConstantUtil.USER_SETTING_DEFAULT_PWD));
						userEntity.setCreatetime(new Date());
						UserEntity currentUser =  (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
						userEntity.setCreateuser(currentUser.getUuid());
						userEntity.setLogincount(0);
						detailEntity.setUserkey(key);
						
						BusinessData<Boolean> flag = iuserBusiness.insertUser(userEntity);
						if(flag.isSuccess()){
							flag=iuserBusiness.insertUserDetail(detailEntity);
							if(flag.isSuccess()){
								map.put("result", ConstantUtil.DIGITAL_ONE);//更新成功
								map.put("uuid",key);//返回主键 供查询
							}else{
								map.put("result", ConstantUtil.DIGITAL_ZERO);//更新失败
							}
						}else{
							map.put("result", ConstantUtil.DIGITAL_ZERO);//更新失败
						}
					}
				}
			}
		}
		this.writeJson(map);
	}
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月7日下午4:00:49
	 * 描     述：单个修改 用户信息，批量修改
	 * @param uuid
	 * @param uuids
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/updateUserInfo.html",method=RequestMethod.POST)
	public void updateUserInfo(String uuid,String uuids,UserEntity userEntity){
		Map<String, Object> map= new HashMap<String, Object>();
		if(!StringUtil.isNull(uuid)){
			userEntity.setUuid(uuid);
			map.put("result",  iuserBusiness.updateUser(userEntity).isSuccess());
		}else if(!StringUtil.isNull(uuids)){
			String[] ids = uuids.split(",");
			int count=0;
			for (int i = 0; i <ids.length; i++) {
				userEntity.setUuid(ids[i]);
				if(! iuserBusiness.updateUser(userEntity).isSuccess()){
					count++;
				}
			}
			if(count>0){
				map.put("result", false);
				map.put("count", count);
			}else{
				map.put("result", true);
			}
		}
		this.writeJson(map);
	}
	
	

	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月3日下午2:54:00
	 * 描     述：   管理员 列表
	 * @param model
	 * @param pageindex
	 * @param pagesize
	 * @param orderFile
	 * @param orderType
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/adminList.html")
	public ModelAndView adminList(Model model,Integer pageindex,Integer pagesize, String orderFile, String orderType){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","3");
		if(null == pageindex || 0 == pageindex){
			pageindex=1;
		}
		if(null == pagesize){
			pagesize=15;
		}
		try {
			BusinessData<UserEntity> bdue = iuserBusiness.selectUserByAdmin(1, pageindex, pagesize, orderFile, orderType);
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
			model.addAttribute("pageInfoMap",pageInfoMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		return forwardPage("admin/user/adminList");
	}
	
	
	
	/**
	 * 会员组管理
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年7月31日上午10:38:55
	 * 描     述：
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/userGroupManage.html")
	public ModelAndView userGroupManage(Model model){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		
		
		
		return forwardPage("admin/user/userGroupManage");
	}
	
	
	/**
	 * 
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年7月31日上午10:43:47
	 * 描     述：角色管理
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/roleManage.html")
	public ModelAndView roleManage(Model model){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		
		
		
		return forwardPage("admin/user/roleManage");
	}
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月3日下午3:38:44
	 * 描     述：角色添加（编辑）
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/userRoleEdit.html")
	public ModelAndView roleEdit(Model model){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		
		
		
		return forwardPage("admin/user/userRoleEdit");
	}
	
	/**
	 * 
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年7月31日上午10:43:47
	 * 描     述：部门管理
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/departManage.html")
	public ModelAndView departManage(Model model){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		
		
		
		return forwardPage("admin/user/departManage");
	}
	/**
	 * 
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年7月31日上午10:44:36
	 * 描     述：站内信
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/user/websiteMsg.html")
	public ModelAndView websiteMsg(Model model){
		model.addAttribute("frameLeft", "admin/user/left.html");
		model.addAttribute("currIndex","1");
		
		
		
		return forwardPage("admin/user/websiteMsg");
	}
	
	

	/**
	 * 根据编号删除用户信息
	 * zhangyu [2015年7月27日 下午4:06:02]
	 * 
	 * @param uuid
	 */
	public void dropUserInfo(@RequestParam String uuid){
		List<String> uuids = new ArrayList<String>();
		Map<String,Object> map = new HashMap<String,Object>();

		try {
			uuids.add(uuid);
			//BusinessData<Boolean> row = iuserBusiness.deleteUser(uuids);
			//map.put("row", row.getRows());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.writeJson(map);
	}

	/**
	 * 查看详情（包括地址等信息）
	 * zhangyu [2015年7月27日 下午4:09:40]
	 * 
	 * @param uuid
	 */
	public void findUserInfoByuuid(@RequestParam String uuid){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			//获取用户基本信息
			BusinessData<UserEntity> ue = iuserBusiness.selectUserByuuid(uuid);
			Map<String,Object> uemap = ListMapUtil.convertEntityToMap(ue.getT());

			//获取用户地址信息
			//BusinessData<UserAddressEntity> ueaddress = iuserBusiness.selectUserAddressByuuid(uuid);
		//	Map<String,Object> ueaddressmap = ListMapUtil.convertEntityToMap(ueaddress.getT());

			//获取用户详细信息
			BusinessData<UserDetailEntity> uedetai = iuserBusiness.selectUserDetailByuuid(uuid);
			Map<String,Object> uedetaimap = ListMapUtil.convertEntityToMap(uedetai.getT());

			map.putAll(uemap);
		//	map.putAll(ueaddressmap);
			map.putAll(uedetaimap);

		} catch (Exception e) {
			e.printStackTrace();
		}

		this.writeJson(map);
	}

	/**
	 * 根据uuid修改用户信息
	 * zhangyu [2015年7月27日 下午4:16:19]
	 * 
	 * @param requestMap
	 */
	public void updateUserInfoByuuid(@RequestParam Map<String, Object> requestMap){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			//BusinessData<Boolean> row = iuserBusiness.updateUser(requestMap);
			//map.put("row",row.getRows());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.writeJson(map);
	}

	/**
	 * 分页查询用户信息
	 * zhangyu [2015年7月27日 下午4:18:50]
	 * 
	 * @param username
	 */
	public void findUserInfo(@RequestParam Integer pageindex,@RequestParam Integer pagesize,@RequestParam String orderFile,@RequestParam String orderType){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BusinessData<UserEntity> bdue = iuserBusiness.selectUsers(pagesize, pageindex, orderFile, orderType,null);

			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
			map.putAll(pageInfoMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.writeJson(map);
	}
}
