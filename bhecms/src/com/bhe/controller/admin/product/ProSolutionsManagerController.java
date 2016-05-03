package com.bhe.controller.admin.product;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductSolutionsBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.controller.web.product.SolutionsControl;
import com.bhe.dao.mybatis.model.ProductSolutionsEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.UuidUtil;

/**
 * @author: zhangyu
 * @date: 2015广朿7日下卿:40:00
 * @description: 解决方案控制噿 <br>
 *               -----------------------------<br>
 * @update:
 * @date:
 * @description: (注明修改原因) <br>
 *               -----------------------------<br>
 */
@Controller
public class ProSolutionsManagerController extends BaseController {

	@Autowired
	private IProductSolutionsBusiness iProductSolutionsBusiness;
	
	@Autowired
	private SolutionsControl solutionsControl;
	/**
	 * @author: zhangyu
	 * @date: 2015-8-192:00:25
	 * @description: 跳转并查询解决方案信恿
	 * @param model
	 * @param pageindex
	 * @param pagesize
	 * @param orderFile
	 * @param orderType
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/tosolutionsManager.html")
	public ModelAndView tosolutionsManager(Model model, String title, Integer pageIndex, Integer pageSize, String orderFile,
			String orderType) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "6");
		model.addAttribute("title",title);
		if (CommonUtil.isEmpty(pageIndex)) {
			pageIndex = 1;
		}
		if (CommonUtil.isEmpty(pageSize)) {
			pageSize = 15;
		}
		try {
			BusinessData<ProductSolutionsEntity> bdpse = iProductSolutionsBusiness.selectSolutions(title, pageIndex,
					pageSize, orderType, orderFile);
			Map<String, Object> map = ListMapUtil.convertEntityToMap(bdpse);
			model.addAttribute(ConstantUtil.SYSTEM_DATA_RETURN, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/productSolutionsManager");
	}

	/**
	 * @author: zhangyu
	 * @date: 2015年8月19日下午5:52:26
	 * @description: 跳转到添加页面
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/toaddProductSolutions.html")
	public ModelAndView toaddProSolutions(Model model) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "6");
		model.addAttribute("states", "0");
		return forwardPage("admin/product/addProductSolutions");
	}

	/**
	 * @author: zhangyu
	 * @date: 2015年8月19日下午5:52:26
	 * @description: 跳转到修改页面
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/toUpdataProSolutions.html")
	public ModelAndView toUpdataProSolutions(Model model, String uuid) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "6");
		model.addAttribute("states", "1");
		
		//获取数据
		BusinessData<ProductSolutionsEntity> data =  iProductSolutionsBusiness.selectSolutionByid(uuid);
		//处理客户信息 （图片）
		Map<String, Object> map = solutionsControl.findSolutionsByid(uuid);
		model.addAttribute(ConstantUtil.SYSTEM_DATA_RETURN, map);
		model.addAttribute("data", data.getT());
		return forwardPage("admin/product/addProductSolutions");
	}

	/**
	 * @author: zhangyu
	 * @date: 2015-8-192:04:39
	 * @description: 删除解决方案信息
	 * @param uuid
	 *            <br>
	 *            -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/delSolutionInfo.html")
	public void delSolutionInfo(String uuids) {
		List<Map<String, Object>> listmap = JsonUtil.readJson2ListMap(uuids);
		for (Map<String, Object> map : listmap) {
			String uuid = map.get("uuid").toString();
			iProductSolutionsBusiness.deleteSolutions(uuid);
		}
		this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, ConstantUtil.RETURN_SUCCESS);
	}

	/**
	 * @author: zhangyu
	 * @date: 2015-8-19:40:48
	 * @description: 修改解决方案基本信息
	 * @param map
	 *            <br>
	 *            -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	public void updateSolutionInfo(@RequestParam Map<String, Object> map, String sortid, String[] customers,
			String[] recommendpros, String[] championpros) {
		// 修改解决方案基本信息
		try {
			if (!CommonUtil.isEmpty(map)) {
				Object obj = map.get("uuid");
				if (!CommonUtil.isEmpty(obj)) {
					ProductSolutionsEntity pse = (ProductSolutionsEntity) ListMapUtil.setEntityValue(map,
							ProductSolutionsEntity.class);
					iProductSolutionsBusiness.updateSolutions(pse);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, ConstantUtil.RETURN_SUCCESS);
	}

	/**
	 * @author: yichuan
	 * @return
	 * @date: 2015年8月20日下午4:18:00
	 * @description: 添加解决方案
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/addProductSolutions.html")
	public void addProSolutions(ProductSolutionsEntity entity) {
		BusinessData<Boolean> data;
		if (CommonUtil.isEmpty(entity.getUuid())) {
			entity.setUuid(UuidUtil.generateUUID());
			data = iProductSolutionsBusiness.insertSolutions(entity);
		} else {
			data = iProductSolutionsBusiness.updateSolutions(entity);
		}
		if (data.isSuccess()) {
			this.writeJson(ConstantUtil.RETURN_SUCCESS);
		} else {
			this.writeJson(ConstantUtil.RETURN_FAIL);
		}

	}
}
