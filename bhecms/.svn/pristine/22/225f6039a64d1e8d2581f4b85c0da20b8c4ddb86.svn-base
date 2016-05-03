package com.bhe.controller.admin.product;

import java.util.ArrayList;
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
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;

/**
 * 创 建 人：  zhangyu
 * 日     期： 2015年8月3日下午2:39:35
 * 描     述：产品分类控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Controller
public class ProCategoryManageController extends BaseController {

	@Autowired
	IProductCategoryBusiness productCategoryBusiness;

	/**
	 * 创 建 人：zhangyu
	 * 日     期：  2015年8月3日上午11:21:38
	 * 描     述： 跳转到产品分类管理列表页面
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/productCategory.html")
	public ModelAndView toProCategoryList(Model model,Integer pageindex,Integer pagesize){
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","3");

		if (null == pageindex || 0 == pageindex) {
			pageindex=1;
		}

		if (null == pagesize) {
			pagesize=15;
		}
		
		BusinessData<ProductCategoryEntity> data = productCategoryBusiness.selectProCateByParentId(0);
		
		model.addAttribute("data", data.getList());
		return forwardPage("admin/product/productCategoryManage");
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月6日上午9:18:15
	 * 描     述：  根据pid查询产品分类子类
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/product/finidProCateSub.html",method=RequestMethod.POST)
	public void finidProCateSub(int parentid){
		long pid = parentid;
		BusinessData<ProductCategoryEntity> data = productCategoryBusiness.selectProductCategoryByNameCn(null,null,null,pid);
		this.writeJson("data", data.getList());
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月14日下午3:18:31
	 * 描     述：					获取产品分类用于树形展示
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>s
	 */
	@RequestMapping(value="/admin/product/getProductCaegoryForTree.html",method=RequestMethod.POST)
	public void getProductCaegoryByTree(){
		BusinessData<ProductCategoryEntity> data = productCategoryBusiness.selectProCateByAll(null, null, null, null);
		
		Map<String, List<ProductCategoryEntity>> map = new HashMap<String, List<ProductCategoryEntity>>();
		
		for (ProductCategoryEntity entity : data.getList()) {
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
	 * 创 建 人：  林
	 * 日     期：  2015年8月14日下午2:18:39
	 * 描     述：					添加商品分类
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/product/doAddProductCategory.html",method=RequestMethod.POST)
	public void doAddProductCategory(ProductCategoryEntity entity) {
		BusinessData<Boolean> data;
		
		if (entity.getId() != null) {
			data = productCategoryBusiness.updateProductCategoryByKey(entity);
		}else {
			data = productCategoryBusiness.insertProductCategory(entity);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		if (data.isSuccess()) {
			map.put("msg", "1");
		}else{
			map.put("msg", "0");
		}
		this.writeJson(map);
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月5日下午3:12:21
	 * 描     述：  根据主键删除产品分类信息
	 * <br>-----------------------------<br>
	 * 修 改 人： 林
	 * 日     期： 2015年8月14日 15:57:57
	 * 描     述： 重构
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/product/doDelProductCategory.html",method=RequestMethod.POST)
	public void doDelProductCategory(int id){
		Map<String, Object> map = new HashMap<String, Object>();
		
		BusinessData<ProductCategoryEntity> proCateByParentId = productCategoryBusiness.selectProCateByParentId(id);
		if(!CommonUtil.isEmpty(proCateByParentId.getList())){
			map.put("msg", "-1");
		}else{
			BusinessData<Boolean> data = productCategoryBusiness.deleteProductCategoryByKey(id);
			if(data.isSuccess()){
				map.put("msg", "1");
			}else{
				map.put("msg", "0");
			}
		}
		this.writeJson(map);
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月14日下午4:17:06
	 * @description:					查询单条数据信息
	 * @param id
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/product/getProductCategory.html")
	public void getProductCategory(int id) {
		BusinessData<ProductCategoryEntity> data = productCategoryBusiness.selectProductCategoryById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", data.getT());
		this.writeJson(map);
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月24日下午3:39:46
	 * @description:检查名称是否重复
	 * @param namecn
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/checkCategroyNameCn.html")
	public void checkNameCn(String namecn){
		BusinessData<ProductCategoryEntity> product = productCategoryBusiness.selectProductCategoryByNameCn(namecn, null, null);
		if(product.getT() != null){
			this.writeJson("status", ConstantUtil.RETURN_FAIL);
		}else{
			this.writeJson("status", ConstantUtil.RETURN_SUCCESS);
		}
	}
}
