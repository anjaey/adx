package com.hy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hy.controller.common.BaseController;

@Controller
@RequestMapping ( "/admin")
public class AdminIndexController extends BaseController{
	
	/**
	 * 跳转主页
	 * @author hy
	 * @date 2016年4月29日下午4:13:19
	 * @return
	 * @update
	 * @date
	 */
	@RequestMapping("/")
	public ModelAndView toIndex() {
		return forwardPage("admin/index");
	}
	
	/**
	 * 跳转到登录页面
	 * @author hy
	 * @date 2016年5月3日下午5:54:48
	 * @update
	 * @date
	 */
	@RequestMapping(value = "/login")
	public ModelAndView tologin() {
		return forwardPage("admin/login");
	}
}

