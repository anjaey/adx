package com.hy.develop.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hy.util.common.CommonUtil;

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

		String url = request.getServletPath();
		//判断跳转位置
		if (!CommonUtil.isEmpty(url)) {
			int index = url.indexOf("/admin/");
			if (index == -1) {  //用户登录的前台
				
			}
			else {  //用户登录的后台

//				request.getSession()
			}
		}
		
		return true;

	}

}
