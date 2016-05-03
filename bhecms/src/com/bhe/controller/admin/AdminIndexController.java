package com.bhe.controller.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.user.IUserBusiness;
import com.bhe.business.user.IUserMessageBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.dao.mybatis.model.UserMessageEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ListMapUtil;

/**
 * 后台首页
 * @author BJY
 * @date 2015年7月23日下午4:29:50
 */

@Controller
public class AdminIndexController  extends BaseController{
	@Autowired
	private IUserBusiness iuserBusiness;
	@Autowired
	private IUserMessageBusiness iUserMessageBusiness;
	
	@RequestMapping(value="/admin/index.html")
	public ModelAndView index(Model model){
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "1");
		model.addAttribute("frameLeft", "admin/common/indexLeft.html");
		
		UserEntity me = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
		model.addAttribute("username", me.getUsername());
		model.addAttribute("now",me.getLastlogintime().toString());
		model.addAttribute("logincount", me.getLogincount());
		
		try {
			UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_USER);
			BusinessData<UserMessageEntity> msgBd = iUserMessageBusiness.selectUserMessageByToUserId(user.getUuid(), null, null, "createtime", "desc",null,null);
			List<Map<String, Object>> listMap = ListMapUtil.convertListEntityToListMap(msgBd.getList(),"yyyy-MM-dd HH:mm");
			for (Map<String, Object> map : listMap) {
			 	Integer  issee = (Integer) map.get("status");
			 	if(issee==1){//代表已经回复，需要查出 上一条
			 		UserMessageEntity entity = new UserMessageEntity();
			 		entity.setFromid((Long) map.get("id"));
			 		BusinessData<UserMessageEntity> msgEntityBd = iUserMessageBusiness.selectUserMessageByEntity(entity, null, null, "createtime", "desc");
			 		map.put("answerTime", msgEntityBd.getT().getCreatetime());
			 	}
				BusinessData<UserEntity> userEntityBd = iuserBusiness.selectUserByuuid(map.get("fromuserid").toString());
				map.put("fromUserName", userEntityBd.getT().getUsername());
			}
			model.addAttribute("count", msgBd.getCount());
			model.addAttribute("listMap", listMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		return forwardPage("admin/index");
	}
}
