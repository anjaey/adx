package com.bhe.controller.admin.common;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UEditorController extends BaseController {
	
    /**
     * 跳转访问WEB-INF下 res/common/js/ueditor/jsp/controller.jsp文件
     * @author	schoff
     * @return String
     * @throws IOException 
     */
    @RequestMapping("controller.htm")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return forwardPage("../../res/common/js/ueditor/jsp/controller");
	}
    
    public String convert(String utfString){
        StringBuilder sb = new StringBuilder();
        int i = -1;
        int pos = 0;
          
        while((i=utfString.indexOf("\\u", pos)) != -1){
            sb.append(utfString.substring(pos, i));
            if(i+5 < utfString.length()){
                pos = i+6;
                sb.append((char)Integer.parseInt(utfString.substring(i+2, i+6), 16));
            }
        }
          
        return sb.toString();
    }
}
