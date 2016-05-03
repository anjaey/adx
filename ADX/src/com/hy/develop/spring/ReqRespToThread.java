package com.hy.develop.spring;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hy.util.common.ConstantUtil;

/**
 * 请求,响应前置处理,将他们压入到管理栈中.
 *
 * @author 张强 2014年9月22日 下午3:55:22
 * @version 0.0.1
 */
public class ReqRespToThread extends HandlerInterceptorAdapter {
	
	@SuppressWarnings("unused")
	private Log log = LogFactory.getLog(ReqRespToThread.class);

	@Override
	public boolean preHandle(HttpServletRequest request,  
			HttpServletResponse response, Object handler) throws Exception {
		
		String url = request.getServletPath();
		//System.out.println(request.getMethod());
		//System.out.println(request.getRequestedSessionId());
		//System.out.println(request.getServletPath()+"="+request.getContextPath());
		
		
		
			if(url.indexOf("/account/")!=-1){
				
				String lastUrl = (String) request.getSession().getAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL);
				Object beforeObj= request.getSession(true).getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
				if (null != lastUrl && lastUrl.equals(url)&&null!=beforeObj) {
					String lastUrlWhithParam = (String) request.getSession().getAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL_PARAMS);
					request.getSession(false).removeAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL);
					request.getSession(false).removeAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL_PARAMS);
					response.sendRedirect(request.getContextPath()+lastUrlWhithParam);
					return true;
				}
				
				if(null==beforeObj){
					if(request.getMethod().equals("GET")){
						Map<String, String[]> params = request.getParameterMap(); 
						StringBuilder requestParam = new StringBuilder("?");
						for (String key : params.keySet()) {
							String[] values = params.get(key);  
							for (int i = 0; i < values.length; i++) {  
				                String value = values[i];  
				                requestParam.append(key + "=" + value + "&");
				            }  
						}
						requestParam.deleteCharAt(requestParam.length() - 1);
						request.getSession().setAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL, url);
						request.getSession().setAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL_PARAMS, url + requestParam);
					}else{
						request.getSession().setAttribute(ConstantUtil.BEFORE_LOGIN_LAST_URL_PARAMS, request.getContextPath());
					}
					response.sendRedirect(request.getContextPath()+"/user/toLogin/loginPage.html");
					return false;
				}else{
					return true;
				}
			}else if(url.indexOf("/admin/")!=-1){
				
				String lastUrl = (String) request.getSession().getAttribute(ConstantUtil.LOGIN_LAST_URL);
				Object obj= request.getSession(true).getAttribute(ConstantUtil.SESSION_LOGIN_USER);
				if (null != lastUrl && lastUrl.equals(url)&&null!=obj) {
					String lastUrlWhithParam = (String) request.getSession().getAttribute(ConstantUtil.LOGIN_LAST_URL_PARAMS);
					request.getSession(false).removeAttribute(ConstantUtil.LOGIN_LAST_URL);
					request.getSession(false).removeAttribute(ConstantUtil.LOGIN_LAST_URL_PARAMS);
					response.sendRedirect(request.getContextPath()+lastUrlWhithParam);
					return true;
				}
				
				if(null==obj){
					if(request.getMethod().equals("GET")){
						Map<String, String[]> params = request.getParameterMap(); 
						StringBuilder requestParam = new StringBuilder("?");
						for (String key : params.keySet()) {
							String[] values = params.get(key);  
							for (int i = 0; i < values.length; i++) {  
				                String value = values[i];  
				                requestParam.append(key + "=" + value + "&");
				            }  
						}
						requestParam.deleteCharAt(requestParam.length() - 1);
						request.getSession().setAttribute(ConstantUtil.LOGIN_LAST_URL, url);
						request.getSession().setAttribute(ConstantUtil.LOGIN_LAST_URL_PARAMS, url + requestParam);
					}else{
						request.getSession().setAttribute(ConstantUtil.LOGIN_LAST_URL_PARAMS, request.getContextPath()+"/admin/index.html");
					}
					//request.getRequestDispatcher("/admin/toLogin/loginIndex.html").forward(request, response);
					response.sendRedirect(request.getContextPath()+"/admin/toLogin/loginIndex.html");
					return false;
				}else{
					return true;
				}
			}else{
					return true;
			}
		}

}
