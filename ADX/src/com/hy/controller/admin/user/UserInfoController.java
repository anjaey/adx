package com.hy.controller.admin.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hy.business.user.IUserBusiness;
import com.hy.controller.common.BaseController;


/**
 * 用户相关控制器
 * @author hy
 *
 */
@Controller
public class UserInfoController extends BaseController{
	
	@Autowired
	IUserBusiness userBusiness;
	
	@RequestMapping("/view/user/login")
	public void login(@RequestParam Map<String, Object> map) {
		Map<String, Object> userMap = userBusiness.login(map, this.request);
		this.writeJson(userMap);
	}
	
}


//package com.hy.controller.admin.user;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.hy.business.user.IUserBusiness;
//import com.hy.business.user.IUserMessageBusiness;
//import com.hy.controller.admin.common.BaseController;
//import com.hy.dao.mybatis.model.UserDetailEntity;
//import com.hy.dao.mybatis.model.UserEntity;
//import com.hy.dao.mybatis.model.UserMessageEntity;
//import com.hy.util.common.BusinessData;
//import com.hy.util.common.ConstantUtil;
//import com.hy.util.common.ErrorCodeUtil;
//import com.hy.util.common.JsonUtil;
//import com.hy.util.common.ListMapUtil;
//import com.hy.util.common.MD5Util;
//import com.hy.util.common.StringUtil;
//
//@Controller
//public class UserInfoController extends BaseController{
//
//	@Autowired
//	private IUserBusiness iuserBusiness;
//	
//	@Autowired
//	private IUserMessageBusiness iUserMessageBusiness;
//
//	/**
//	 * 
//	 * 创 建 人：  BJY
//	 * 日     期：  2015年8月3日上午11:26:43
//	 * 描     述： 个人中心首页
//	 * @param model
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： TODO(注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/userInfoManage.html")
//	public ModelAndView userInfoManage(Model model){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "8");
//		model.addAttribute("currIndex","1");
//		UserEntity entity =(UserEntity) this.getSession().getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//		try {
//			//获取用户基本信息
//			BusinessData<UserEntity> ue = iuserBusiness.selectUserByuuid(entity.getUuid());
//			Map<String, Object> uemap = ListMapUtil.convertEntityToMap(ue.getT());
//
//			//获取用户详细信息
//			BusinessData<UserDetailEntity> uedetai = iuserBusiness.selectUserDetailByuuid(entity.getUuid());
//			Map<String,Object> uedetaimap = ListMapUtil.convertEntityToMap(uedetai.getT());
//
//			model.addAttribute("uemap",uemap);
//			model.addAttribute("uedetaimap",uedetaimap);
//		} catch (Exception e) {
//			log.error(e);
//		}
//		return forwardPage("admin/personalCenter/userInfoManage");
//	}
//
//
//	/**
//	 * 创 建 人：  BJY
//	 * 日     期：  2015年8月3日下午5:15:03
//	 * 描     述： 修改 个人信息
//	 * @param map
//	 * @param userEntityStr
//	 * @param detailEntityStr
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/personalCenter/updateUserInfo.html",method=RequestMethod.POST)
//	public void updateUserInfo(Map<String,Object> map,String userEntityStr ,String detailEntityStr){
//		UserDetailEntity detailEntity= JsonUtil.JsonToObject(detailEntityStr, UserDetailEntity.class);
//		UserEntity userEntity= JsonUtil.JsonToObject(userEntityStr, UserEntity.class);
//
//		if(null==detailEntity||null==userEntity){
//			map.put("r", ErrorCodeUtil.LANG_ILLEGALARGUMENTEXCEPTION);
//		}else{
//			UserEntity entity = (UserEntity) this.getSession().getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//			
//			detailEntity.setUserkey(entity.getUuid());
//			userEntity.setUuid(entity.getUuid());
//			
//			BusinessData<Boolean> flag = iuserBusiness.updateUser(userEntity);
//			
//			if(flag.isSuccess()){
//				BusinessData<UserDetailEntity> temp = iuserBusiness.selectUserDetailByuuid(entity.getUuid());
//				if(null == temp.getT()){
//					flag=iuserBusiness.insertUserDetail(detailEntity);	
//				}else{
//					flag=iuserBusiness.updateUserDetail(detailEntity);
//				}
//				if(flag.isSuccess()){
//					map.put("r", ConstantUtil.DIGITAL_ONE);//更新成功
//				}else{
//					map.put("r", ConstantUtil.DIGITAL_ZERO);//更新失败
//				}
//			}else{
//				map.put("r", ConstantUtil.DIGITAL_ZERO);
//			}
//		}
//		this.writeJson(map);
//	}
//
//	
//	
//	
//	/**
//	 * 创 建 人：Dengpeng  
//	 * 日     期：  2015年8月6日下午4:48:03
//	 * 描     述：站内信 我的发件列表
//	 * @param model
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/myReciveMsges.html")
//	public ModelAndView myReciveMsges(Model model,UserMessageEntity entity,String title,Integer status){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","2");
//		model.addAttribute("title", title);
//		model.addAttribute("issee", status);
//		try {
//			UserEntity me = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//			BusinessData<UserMessageEntity> msgBd = iUserMessageBusiness.selectUserMessageByToUserId(me.getUuid(), null, null, "createtime", "desc",title,status);
//			List<Map<String, Object>> listMap = ListMapUtil.convertListEntityToListMap(msgBd.getList(),"yyyy-MM-dd HH:mm");
//			for (Map<String, Object> map : listMap){
//			 	Integer issee = (Integer) map.get("status");
//			 	if(issee==1){//代表已经回复，需要查出 上一条
//			 		entity = new UserMessageEntity();
//			 		entity.setFromid((Long) map.get("id"));
//			 		BusinessData<UserMessageEntity> msgEntityBd = iUserMessageBusiness.selectUserMessageByEntity(entity, null, null, "createtime", "desc");
//			 		map.put("answerTime", msgEntityBd.getT().getCreatetime());
//			 	}
//				BusinessData<UserEntity> userEntityBd = iuserBusiness.selectUserByuuid(map.get("fromuserid").toString());
//				map.put("fromUserName", userEntityBd.getT().getUsername());
//			}
//			model.addAttribute("count", msgBd.getCount());
//			model.addAttribute("listMap", listMap);
//		} catch (Exception e) {
//			log.error(e);
//		}
//		return forwardPage("admin/personalCenter/myReciveMsges");
//	}
//	
//	/**
//	 * 创 建 人：  Dengpeng
//	 * 日     期：  2015年8月8日上午10:10:07
//	 * 描     述：回复信息
//	 * @param model
//	 * @param toUserId
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/replyMsgEdit.html")
//	public ModelAndView replyMsgEdit(Model model,@RequestParam String toUserId, Long lastId){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","4");
//		model.addAttribute("lastId",lastId);
//		BusinessData<UserMessageEntity> selectUserMessageById = iUserMessageBusiness.selectUserMessageById(lastId);
//		UserMessageEntity entity = selectUserMessageById.getT();
//		if(null!=entity){
//			entity.setIssee(1);//表示已经查看
//			iUserMessageBusiness.updateUserMessageByKey(entity);
//		}
//		model.addAttribute("toUserEntity",iuserBusiness.selectUserByuuid(toUserId).getT());
//		return forwardPage("admin/personalCenter/userMsgEdit");
//	}
//	
//	
//	
//	/**
//	 * 创 建 人：Dengpeng  
//	 * 日     期：  2015年8月7日上午10:11:25
//	 * 描     述：站内信 我的发件列表
//	 * @param model
//	 * @param entity
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/mySendMsges.html")
//	public ModelAndView mySendMsges(Model model,UserMessageEntity entity,String title,Integer status){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","3");
//		model.addAttribute("title", title);
//		model.addAttribute("issee", status);
//		try {
//			UserEntity me = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//			BusinessData<UserMessageEntity> msgBd = iUserMessageBusiness.selectUserMessageByFromUserId(me.getUuid(), null, null, "createtime", "desc",title,status);
//			List<Map<String, Object>> listMap = ListMapUtil.convertListEntityToListMap(msgBd.getList(),"yyyy-MM-dd HH:mm");
//			for (Map<String, Object> map : listMap) {
//				BusinessData<UserEntity> userEntityBd = iuserBusiness.selectUserByuuid(map.get("touserid").toString());
//				map.put("toUserName", userEntityBd.getT().getUsername());
//			}
//			model.addAttribute("count", msgBd.getCount());
//			model.addAttribute("listMap", listMap);
//		} catch (Exception e) {
//			log.error(e);
//		}
//		return forwardPage("admin/personalCenter/mySendMsges");
//	}
//	
//	/**
//	 * 创 建 人：  Dengpeng
//	 * 日     期：  2015年8月7日上午10:22:05
//	 * 描     述：发送站内信
//	 * @param model
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/userMsgEdit.html")
//	public ModelAndView userMsgEdit(Model model){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","4");
//		UserEntity me =  (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//		List<UserEntity> list=iuserBusiness.selectUserByAdmin(1, null, null, null, null).getList();
//		for (int i=0; i<list.size()&&null!=list;i++) {
//			if(me.getId()==list.get(i).getId()){
//				list.remove(i);
//			}
//		}
//		model.addAttribute("adminList",list);
//		return forwardPage("admin/personalCenter/userMsgEdit");
//	}
//	
//	/**
//	 * 创 建 人：  Dengpeng
//	 * 日     期：  2015年8月8日上午9:40:41
//	 * 描     述：查看收信
//	 * @param model
//	 * @param msgId
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/showReciveMsg.html")
//	public ModelAndView showReciveMsg(Model model,@RequestParam Long msgId){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","4");
//		model.addAttribute("msgType","receive");
//		BusinessData<UserMessageEntity> msgbd = iUserMessageBusiness.selectUserMessageById(msgId);	
//		UserMessageEntity entity = msgbd.getT();
//		model.addAttribute("entity",entity);
//		if(null!=entity){
//			model.addAttribute("userName",iuserBusiness.selectUserByuuid(entity.getTouserid()).getT().getUsername());
//		}
//		return forwardPage("admin/personalCenter/showUserMsg");
//	}
//	
//	/**
//	 * 创 建 人：  Dengpeng
//	 * 日     期：  2015年8月8日上午10:31:47
//	 * 描     述：查看发送的信件
//	 * @param model
//	 * @param msgId
//	 * @param msgType
//	 * @return
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/personalCenter/showSendMsg.html")
//	public ModelAndView showSendMsg(Model model,@RequestParam Long msgId){
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","3");
//		model.addAttribute("msgType","send");
//		BusinessData<UserMessageEntity> msgbd = iUserMessageBusiness.selectUserMessageById(msgId);	
//		UserMessageEntity entity = msgbd.getT();
//		model.addAttribute("entity",entity);
//		if(null!=entity){
//			entity.setIssee(1);//表示已经查看
//			model.addAttribute("entity",entity);
//			iUserMessageBusiness.updateUserMessageByKey(entity);
//			model.addAttribute("userName",iuserBusiness.selectUserByuuid(entity.getTouserid()).getT().getUsername());
//		}
//		return forwardPage("admin/personalCenter/showUserMsg");
//	}
//	
//	
//	
//	
//	
//	/**
//	 * 创 建 人：Dengpeng  
//	 * 日     期：  2015年8月7日上午10:59:50
//	 * 描     述：发送信件
//	 * @param toUserId
//	 * @param title
//	 * @param content
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/personalCenter/sendMsg.html",method=RequestMethod.POST)
//	public void sendMsg(@RequestParam String toUserId,@RequestParam String title,@RequestParam String content, Long lastId){
//		Map<String,Object> map = new HashMap<String, Object>();
//		UserEntity me =  (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//		UserMessageEntity entity = new UserMessageEntity();
//		if(null!=lastId){
//			UserMessageEntity msg = new UserMessageEntity();
//			msg.setFromuserid(me.getUuid());
//			msg.setId(lastId);
//			msg.setStatus(1);//变成已回复
//			iUserMessageBusiness.updateUserMessageByKey(msg);
//			entity.setFromid(lastId);
//		}
//		entity.setFromuserid(me.getUuid());
//		entity.setTitle(title);
//		entity.setContent(content);
//		entity.setStatus(0);
//		entity.setTouserid(toUserId);
//		entity.setIssee(0);
//		entity.setCreatetime(new Date());
//		BusinessData<Boolean> insertResult = iUserMessageBusiness.insertUserMessage(entity);
//		map.put("result", insertResult.isSuccess());
//		this.writeJson(map);
//	}
//	
//	/**
//	 * 创 建 人：  Dengpeng
//	 * 日     期：  2015年8月8日上午11:28:03
//	 * 描     述：站内信删除
//	 * @param id 单个Id
//	 * @param ids 批量删除
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/personalCenter/deleteUserMsg.html",method=RequestMethod.POST)
//	public void deleteUserMsg(String id,String ids){
//		Map<String, Object> map= new HashMap<String, Object>();
//		if(!StringUtil.isNull(id)){
//			map.put("result", iUserMessageBusiness.deleteUserMessageByKey(Long.parseLong(id)).isSuccess());
//		}else if(!StringUtil.isNull(ids)){
//			String[] keys = ids.split(",");
//			int count=0;
//			for (int i = 0; i <keys.length; i++) {
//				if(!iUserMessageBusiness.deleteUserMessageByKey(Long.parseLong(keys[i])).isSuccess()){
//					count++;
//				}
//			}
//			if(count>0){
//				map.put("result", false);
//				map.put("count", count);
//			}else{
//				map.put("result", true);
//			}
//		}
//		this.writeJson(map);
//	}
//	
//	
//	/**
//	 *修改密码页面
//	 *jsy [2015年8月12号下午5:15:50]
//	 */
//	@RequestMapping(value="/admin/personalCenter/updatePwdMsg.html")
//	public ModelAndView updatePage(Model model) {
//		model.addAttribute("frameLeft", "admin/personalCenter/left.html");
//		model.addAttribute("currIndex","5");
//		
//		return forwardPage("admin/personalCenter/updatePwdMsg");
//	}
//	
//	
//	//判断// 判断密码
//	//加密
//	//返回
//	@RequestMapping(value="/admin/personalCenter/checkPwd.html",method=RequestMethod.POST)
//	public void checkPwd(@RequestParam String oldPassword){
//		Map<String, Object> map= new HashMap<String, Object>();
//		UserEntity me = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//		String  oldmd5 = MD5Util.string2MD5(oldPassword);
//		System.out.println(me.getPassword());
//		System.out.println(oldmd5);
//		if (me.getPassword().equals(oldmd5)) {
//			map.put("result", ConstantUtil.RETURN_SUCCESS);
//		}else{
//			map.put("result", ConstantUtil.RETURN_FAIL);
//		}
//		
//		this.writeJson(map);
//	}
//	
//	//修改
//	
//	/**
//	 *修改密码
//	 *jsy [2015年8月12号下午5:36:32]
//	 */
//	@RequestMapping(value="/admin/personalCenter/updatePwd.html",method=RequestMethod.POST)
//	public void updatePasswordById(@RequestParam String newPassword){
//		Map<String, Object> map= new HashMap<String, Object>();
//		UserEntity me = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
//		newPassword = MD5Util.string2MD5(newPassword);
//		
//			UserEntity ue = new UserEntity();
//			ue.setUuid(me.getUuid());
//			ue.setPassword(newPassword);
//			
//			BusinessData<Boolean> flag = iuserBusiness.updateUser(ue);
//			
//			if (flag.getState()) {
//				me.setPassword(newPassword);
//				map.put("result", ConstantUtil.RETURN_SUCCESS);
//			} else {
//				map.put("result", ConstantUtil.RETURN_FAIL);
//			}
//		this.writeJson(map);
//	}
//
//}
