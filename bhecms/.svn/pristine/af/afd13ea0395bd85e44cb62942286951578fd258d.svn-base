package com.bhe.controller.admin.content;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductBusiness;
import com.bhe.business.system.IProSearchBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.controller.web.CommonController;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.ProductSearchEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ListMapUtil;

@Controller
public class ProductSearchKeyManagerController extends BaseController {
	@Autowired
	IProSearchBusiness iProSearchBusiness;

	@Autowired
	private IProductBusiness iProductBusiness;

	@Autowired
	private CommonController commonController;
	/**
	 * @author: jsy
	 * @date: 2015年8月31日上午9:54:49
	 * @description:跳转到商品关键字管理页面
	 * @param model
	 * @param pageindex
	 * @param pagesize
	 * @param title
	 * @param beginpic
	 * @param endpic
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/navigatebar/toProductSearchManage.html")
	public ModelAndView toProductSearch(Model model, Integer pageindex,
			Integer pagesize, String title, String beginpic, String endpic) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "7");
		model.addAttribute("title", title);
		model.addAttribute("beginpic", beginpic);
		model.addAttribute("endpic", endpic);

		try {
			if (null == pageindex || 0 == pageindex) {
				pageindex = 1;
			}
			if (null == pagesize) {
				pagesize = 15;
			}
			
			if ("undefined".equals(beginpic)) {
				beginpic = null;
			}
			
			if ("undefined".equals(endpic)) {
				endpic = null;
			}
			if ("undefined".equals(beginpic)) {
				beginpic = null;
			}
			
			if ("undefined".equals(endpic)) {
				endpic = null;
			}
			BusinessData<ProductSearchEntity> bdue = iProSearchBusiness.selectProSearchByKey(title, beginpic, endpic, pageindex, pagesize);
			Map<String, Object> listMap = ListMapUtil.convertEntityToMap(bdue);
			model.addAttribute("pageInfoMap", listMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/navigatebar/productSearchManage");
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月31日上午9:55:18
	 * @description:跳转到添加页面
	 * @param model
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/navigatebar/toAddProductSearch.html")
	public ModelAndView toaddProSearch(Model model, Long id) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "7");
		if (!CommonUtil.isEmpty(id)) {
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
			model.addAttribute("id", id);
			BusinessData<ProductSearchEntity> data = iProSearchBusiness
					.selectProSearchById(id);
			ProductSearchEntity proSearch = data.getT();
			if (!CommonUtil.isEmpty(proSearch)) {
				model.addAttribute("proSearch", proSearch);
			}
		} else {
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
		}

		return forwardPage("admin/navigatebar/addProductSearch");
	}
	
	/**
	 * @author: jsy
	 * @date: 2015年8月31日上午9:55:39
	 * @description:添加
	 * @param model
	 * @param title
	 * @param beginpic
	 * @param endpic
	 * @param count
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/navigatebar/addProductSearch.html")
	public void addProSolutions(Model model, String title, String beginpic,
			String endpic,Integer count) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "7");

		try {
			ProductSearchEntity entity = new ProductSearchEntity();
			entity.setTitle(title);
			entity.setBeginpic(beginpic);
			entity.setEndpic(endpic);
			entity.setCount(count);

			BusinessData<Boolean> bda = iProSearchBusiness.insertProSearch(entity);
			if (bda.getState() == true) {
				this.writeJson("result", ConstantUtil.RETURN_SUCCESS);
			} else {
				this.writeJson("result", ConstantUtil.RETURN_FAIL);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月31日上午9:55:53
	 * @description:修改
	 * @param model
	 * @param id
	 * @param title
	 * @param beginpic
	 * @param endpic
	 * @param count
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/navigatebar/updateProductSearch.html")
	public void updateProductSearch(Model model, Long id, String title,
			String beginpic, String endpic,Integer count) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex", "7");

		try {
			BusinessData<ProductSearchEntity> data = iProSearchBusiness
					.selectProSearchById(id);
			ProductSearchEntity proSearch = data.getT();
			if (!CommonUtil.isEmpty(proSearch)) {

				ProductSearchEntity entity = new ProductSearchEntity();
				entity.setId(proSearch.getId());
				entity.setTitle(title);
				entity.setBeginpic(beginpic);
				entity.setEndpic(endpic);
				entity.setCount(count);

				BusinessData<Boolean> bda = iProSearchBusiness.updateProSearchByKey(entity);

				if (bda.getState() == true) {
					this.writeJson("result", ConstantUtil.RETURN_SUCCESS);
				} else {
					this.writeJson("result", ConstantUtil.RETURN_FAIL);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月31日上午9:56:06
	 * @description:删除
	 * @param id
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/navigatebar/delProductSearch.html", method = RequestMethod.POST)
	public void delProductSearch(Long id) {
		BusinessData<Boolean> data = iProSearchBusiness.delProSearch(id);
		if (data.getState() == true) {
			this.writeJson("result", ConstantUtil.RETURN_SUCCESS);
		} else {
			this.writeJson("result", ConstantUtil.RETURN_FAIL);
		}
	}

	/**
	 * @author:易川
	 * @date: 2015年8月30日下午9:10:54
	 * @description: 根据输入条件查询 并跳转到 展示页面
	 * @param model
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping(value = "/web/product/productSearch.html")
	public ModelAndView productSearch(Model model, String title,
			String startprice, String endprice, Integer pageIndex,
			Integer pageSize) {
		model.addAttribute("title", title);
		model.addAttribute("startprice", startprice);
		model.addAttribute("endprice", endprice);
		
		try {
			if (CommonUtil.isEmpty(pageIndex)) {
				pageIndex = 1;
			}
			if (CommonUtil.isEmpty(pageSize)) {
				pageSize = 8;
			}
			
			boolean flag = true;

			if (!CommonUtil.isEmpty(title)) {
				BusinessData<ProductSearchEntity> hot = iProSearchBusiness
						.selectProSearchByTitle(title, null, null, null, null);
				if (!CommonUtil.isEmpty(hot.getT())) {
					ProductSearchEntity pse = hot.getT();
					pse.setCount(pse.getCount() + 1);
					flag = iProSearchBusiness.updateProSearchByKey(pse)
							.getState();
				} else {
					ProductSearchEntity pse = new ProductSearchEntity();
					pse.setTitle(title);
					pse.setBeginpic(startprice);
					pse.setEndpic(endprice);
					pse.setCount(1);
					flag = iProSearchBusiness.insertProSearch(pse).getState();
				}
			}
			if (flag) {
				BusinessData<ProductEntity> search = iProductBusiness
						.selectProductByKeywords(title, startprice, endprice,
								pageIndex, pageSize);
				Map<String, Object> pageInfo = ListMapUtil
						.convertEntityToMap(search);
				pageInfo.put("list", commonController.getProductElseInfo(search.getList()));
				
				model.addAttribute("data", pageInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("/web/product/productSearchList");
	}
	/**
	 * @author:易川
	 * @date: 2015年8月30日下午9:10:54
	 * @description: 加载关键字
	 * @param model
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping(value = "/web/product/searchKeywords.html")
	public void searchKeywords(Model model) {
		try {
			BusinessData<ProductSearchEntity> keywords = iProSearchBusiness.selectProSearchKeyWordesTop(6);
			List<Map<String, Object>> listKeyWords = ListMapUtil.convertListEntityToListMap(keywords.getList());
			this.writeJson(listKeyWords);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
