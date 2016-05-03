package com.bhe.develop.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.StringUtil;

/**
 * 针对UEDITOR重写方法,不处理上传请求
 * @author 张强 2014年10月14日 下午3:22:24
 *
 */

public class UeditorMultipartResolver extends CommonsMultipartResolver {

	@Override
	public boolean isMultipart(HttpServletRequest request) {
		String requestURI = request.getRequestURI();
		if (!StringUtil.isNull(requestURI) && requestURI.indexOf(ConstantUtil.UEDITOR_UPLOAD_URL) != -1) {
			return false;
		}
		return super.isMultipart(request);
	}

}
