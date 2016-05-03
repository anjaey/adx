package com.bhe.controller.admin.order;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.controller.admin.common.BaseController;

/**
 * 创 建 人：  zhangyu
 * 日     期： 2015年8月3日下午2:46:36
 * 描     述： 评论控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */

@Controller
public class ProCommentController extends BaseController {
	
	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015年8月3日下午2:28:39
	 * 描     述：  跳转到产品评论列表页面
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/oderComment.html")
	public ModelAndView toProComment(Model model){
		model.addAttribute("frameLeft", "admin/order/left.html");
		model.addAttribute("currIndex","4");
		return forwardPage("admin/order/oderComment");
	}
	
}
