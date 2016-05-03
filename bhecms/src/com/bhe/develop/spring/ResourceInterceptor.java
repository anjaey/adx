package com.bhe.develop.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.bhe.business.system.ISysDictBusiness;
import com.bhe.controller.web.CommonController;
import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.util.common.ConstantUtil;

public class ResourceInterceptor extends HandlerInterceptorAdapter{

	@SuppressWarnings("unused")
	private Log log = LogFactory.getLog(ReqRespToThread.class);
	
	@Autowired
	private CommonController commonController;
	@Autowired
	private ISysDictBusiness sysDictBusiness;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//Object navObject = request.getSession().getAttribute(ConstantUtil.WEB_NAV_LISTMAP);
	//	if(null==navObject){
		//System.out.println(request.getRequestURI()+"=="+request.getMethod());
			request.setAttribute(ConstantUtil.WEB_NAV_LISTMAP, commonController.findResourceToTree(0));
		//} 
		return super.preHandle(request, response, handler);
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
		SysDictEntity copyrightcontrol = sysDictBusiness.selectDictBynameEn("copyrightcontrol");
		request.setAttribute("copyrightcontrol", copyrightcontrol.getContent());
		
		SysDictEntity hotline = sysDictBusiness.selectDictBynameEn("hotline");
		request.setAttribute("hotline", hotline.getContent());
		
		super.postHandle(request, response, handler, modelAndView);
	}
}
