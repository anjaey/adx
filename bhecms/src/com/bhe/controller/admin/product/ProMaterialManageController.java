package com.bhe.controller.admin.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.controller.admin.common.BaseController;

/**
 * 创 建 人：  zhangyu
 * 日     期： 2015年8月3日下午2:30:33
 * 描     述： 物流公司控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */

@Controller
public class ProMaterialManageController extends BaseController {
	
	/**
	 * 创 建 人：zhangyu
	 * 日     期：  2015年8月3日上午11:21:38
	 * 描     述： 跳转到物流公司管理列表页面
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/productMaterial.html")
	public ModelAndView toProductList(Model model){
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","9");
		return forwardPage("admin/product/productMaterial");
	}
	
}
