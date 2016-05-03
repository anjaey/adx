package com.bhe.controller.admin.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductCategoryBusiness;
import com.bhe.business.product.IProductFilterBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.dao.mybatis.model.ProductFilterEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.UuidUtil;

@Controller
public class ProductFilterController extends BaseController {

	@Autowired
	private IProductFilterBusiness productFilterBusiness;
	@Autowired
	private IUserBusiness userBusiness;
	@Autowired
	private IProductCategoryBusiness productCategoryBusiness;

	/**
	 * @author: 林
	 * @date: 2015年8月18日下午2:12:29
	 * @description: 产品条件筛选主页 
	 * <br>-----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/product/toProductFilter.html")
	public ModelAndView toProductFilter(Model model, Long categoryid,Integer pageSize, Integer pageIndex) {
 		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex", "12");
		BusinessData<ProductFilterEntity> data;
		if(CommonUtil.isEmpty(pageIndex)){
			pageIndex = 1;
		}
		if(CommonUtil.isEmpty(pageSize)){
			pageSize = 15;
		}
		if(categoryid == null || categoryid == -1){
			data = productFilterBusiness.selectProductFilterByCategoryid(null, pageIndex, pageSize, null, null);
		}else {
			data = productFilterBusiness.selectProductFilterByCategoryid(categoryid, pageIndex, pageSize, null, null);
		}
		Map<String, Object> map = null;
		List<Object> list = new ArrayList<Object>();

		for (ProductFilterEntity entity : data.getList()) {
			try {
				map = ListMapUtil.convertEntityToMap(entity);
				BusinessData<UserEntity> userByuuid = userBusiness.selectUserByuuid(entity.getAuthor());
				map.put("username", userByuuid.getT().getUsername());
				BusinessData<ProductCategoryEntity> proCateById = productCategoryBusiness.selectProCateById(entity.getCategoryid());
				map.put("categoryname", proCateById.getT().getNamecn());
			} catch (Exception e) {
				log.error("map转换错误");
			}
			list.add(map);
		}

		model.addAttribute("data", list);
		model.addAttribute("categoryid", categoryid);
		model.addAttribute("pageIndex", data.getPageIndex());
		model.addAttribute("countPage", data.getCountPage());
		return forwardPage("admin/product/productFilterManage");
	}

	
	/**
	 * @author: 林
	 * @date: 2015年8月25日下午8:47:19
	 * @description: 查询产品分类用于树的显示
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/product/getAllProductForTree.html",method=RequestMethod.POST)
	public void getAllProductForTree() {
		BusinessData<ProductCategoryEntity> proCateByParentId = productCategoryBusiness.selectProCateByAll();
		
		Map<String, List<ProductCategoryEntity>> map = new HashMap<String, List<ProductCategoryEntity>>();
		
		for (ProductCategoryEntity entity : proCateByParentId.getList()) {
			List<ProductCategoryEntity> list = map.get(entity.getParentid().toString());
			if (list == null) {
				list = new ArrayList<ProductCategoryEntity>();
				list.add(entity);
				map.put(entity.getParentid().toString(), list);
			}else {
				list.add(entity);
			}
		}
		
		this.writeJson(map);
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月19日上午11:17:22
	 * @description:					添加数据
	 * @param entity					实体对象
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/product/doAddProductFilter.html", method = RequestMethod.POST)
	public void doAddProductFilter(ProductFilterEntity entity) {
		Map<String, Object> map = new HashMap<String, Object>();
		BusinessData<Boolean> data;
		if(CommonUtil.isEmpty(entity.getName())){
			map.put("rst", ConstantUtil.RETURN_PARAME_ERROR);
		}else {
			if(!CommonUtil.isEmpty(entity.getUuid())){
				if (CommonUtil.isEmpty(entity.getValue())) {
					entity.setValue("");
				}
				if (CommonUtil.isEmpty(entity.getValuemin())) {
					entity.setValuemin("");
				}
				if (CommonUtil.isEmpty(entity.getValuemax())) {
					entity.setValuemax("");
				}
				data = productFilterBusiness.updateProductFilterByKey(entity);
			}else {
				entity.setUuid(UuidUtil.generateUUID());
				entity.setAuthor(((UserEntity)this.getSession().getAttribute(ConstantUtil.SESSION_LOGIN_USER)).getUuid());
				entity.setCreatetime(new Date());
				
				data = productFilterBusiness.insertProductFilter(entity);
			}
			if (data.isSuccess()) {
				map.put("rst", ConstantUtil.RETURN_SUCCESS);
			}else{
				map.put("rst", ConstantUtil.RETURN_FAIL);
			}
		}
		
		this.writeJson(map);
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月19日上午11:24:11
	 * @description:					删除数据
	 * @param uuid						参数
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/product/doDelProductFilter.html", method = RequestMethod.POST)
	public void doDelProductFilter(String uuid) {
		Map<String, Object> map = new HashMap<String, Object>();
		BusinessData<Boolean> data = productFilterBusiness.deleteProductFilterByKey(uuid);
		if (data.isSuccess()) {
			map.put("rst", ConstantUtil.RETURN_SUCCESS);
		}else{
			map.put("rst", ConstantUtil.RETURN_FAIL);
		}

		this.writeJson(map);
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月19日上午11:29:53
	 * @description:					查询数据根据uuid
	 * @param uuid
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/admin/product/getProductFilter.html", method = RequestMethod.POST)
	public void getProductFilter(String uuid) {
		Map<String, Object> map = new HashMap<String, Object>();
		BusinessData<ProductFilterEntity> data = productFilterBusiness.selectProductFilterByUuid(uuid);
		
		map.put("single", data.getT());
		
		this.writeJson(map);
	}
}
