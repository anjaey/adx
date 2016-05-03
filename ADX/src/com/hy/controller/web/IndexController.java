package com.hy.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hy.controller.common.BaseController;

@Controller
public class IndexController extends BaseController{
	
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
		return forwardPage("web/index");
	}
}

