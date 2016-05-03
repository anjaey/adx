package com.hy.develop.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 请求拦截,主页处理登录拦截
 *
 * @version 0.0.1
 */
public class ReqRespToThread extends HandlerInterceptorAdapter {

	@SuppressWarnings("unused")
	private Log log = LogFactory.getLog(ReqRespToThread.class);

	@Override
	public boolean preHandle(HttpServletRequest request,  
			HttpServletResponse response, Object handler) throws Exception {

//		String url = request.getServletPath();
		
		return true;

	}

}
