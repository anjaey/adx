package com.bhe.controller.admin.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bhe.controller.admin.common.BaseController;

/**
 * 创 建 人：  zhangyu
 * 日     期： 2015年8月3日下午2:43:02
 * 描     述： 产品类型控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */

@Controller
public class ProClassManageController extends BaseController {
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月3日下午2:44:56
	 * 描     述： 跳转到产品类型管理列表页面
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/ProductClassManage.html")
	public ModelAndView toProClassList(Model model){
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","4");
		
		return forwardPage("admin/product/ProductClassManage");
	}
	
	
	
	
}
