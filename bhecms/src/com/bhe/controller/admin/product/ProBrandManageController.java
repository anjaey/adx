package com.bhe.controller.admin.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductBrandBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.PageUtil;

/**
 * 创 建 人：  zhangyu
 * 日     期： 2015年8月3日下午2:30:33
 * 描     述： 产品品牌控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */

@Controller
public class ProBrandManageController extends BaseController {

	@Autowired
	private IProductBrandBusiness productBrandBusiness;

	@Autowired
	private IProductBusiness productBusiness;

	/**
	 * 创 建 人：zhangyu
	 * 日     期：  2015年8月3日上午11:21:38
	 * 描     述： 跳转到产品品牌管理列表页面
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/productBrandManage.html")
	public ModelAndView toProBrandList(Model model,Integer pageindex,Integer pagesize,String param){
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","2");
		model.addAttribute("namecn", param);
		try {
			if (null == pageindex || 0 == pageindex) {
				pageindex=1;
			}
			if (null == pagesize) {
				pagesize=15;
			}
			
			//处理行号
			int rowno = PageUtil.getStart(pageindex, pagesize);
			
			/*查询产品数据*/
			BusinessData<ProductBrandEntity> bdue = productBrandBusiness.selectProductBrandByNameCn(param, pageindex, pagesize);
			List<Map<String,Object>> listmap = ListMapUtil.convertListEntityToListMap(bdue.getList());
			for (Map<String, Object> map : listmap) {
				rowno++;
				
				Object idobj = map.get("id");
				if (!CommonUtil.isEmpty(idobj)) {
					/*产品数量*/
					String id = idobj.toString();
					BusinessData<Integer> productByBrandid = productBusiness.selectProductCount(Long.parseLong(id));
					Integer count =  productByBrandid.getT();
					map.put("procount", count);
				}
				map.put("rowno", rowno);
			}
			
			Map<String, Object> mapentity = ListMapUtil.convertEntityToMap(bdue);
			
			//重新设置list
			mapentity.put("list", listmap);
			model.addAttribute("pageInfoMap", mapentity);
			
		} catch (Exception e) {
			log.error("查询错误",e);
		}

		return forwardPage("admin/product/productBrandManage");
	}


	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月5日下午2:46:03
	 * 描     述：跳转到添加品牌页面
	 * @param model
	 * @param pageindex
	 * @param pagesize
	 * @param orderFile
	 * @param orderType
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/toaddProBrand.html")
	public ModelAndView toaddProDustbinList(Model model,Long id){
		
		if (!CommonUtil.isEmpty(id)) {
			BusinessData<ProductBrandEntity> productBrandById = productBrandBusiness.selectProductBrandById(id, null, null, null, null);
			model.addAttribute("prdouct", productBrandById.getT());
		}
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","2");
		model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
		return forwardPage("admin/product/addProductBrand");
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月4日上午10:15:08
	 * 描     述：  新增产品信息
	 * @param map
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/addproBrandinfo.html")
	public ModelAndView addProtInfo(ProductBrandEntity entity,Model model){
		BusinessData<Boolean> data;
		if (CommonUtil.isEmpty(entity.getId())) {
			data = productBrandBusiness.insertProductBrand(entity);
		}else {
			data = productBrandBusiness.updateProductBrandByKey(entity);
		}
		if (data.isSuccess()) {
			return forwardPage("redirect:/admin/product/productBrandManage.html");
		}else {
			return forwardPage("redirect:/admin/product/toaddProBrand.html");
		}
	}
	
	
	

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月5日下午2:49:03
	 * 描     述：产品品牌的修改
	 * @param map
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/updateproBrand.html")
	public void updateProInfo(@RequestParam Map<String, Object> map){
		try {
			ProductBrandEntity pe = (ProductBrandEntity) ListMapUtil.setEntityValue(map, ProductEntity.class);
			if (null != pe) {
				BusinessData<Boolean> busin = productBrandBusiness.updateProductBrandByKey(pe);
				if (busin.getRows() > 0) {  //修改
					this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
				} else {
					this.writeJson("returned", ConstantUtil.RETURN_FAIL);
				}
			}
			this.writeJson("returned", ConstantUtil.RETURN_FAIL);
		} catch (Exception e) {
			e.printStackTrace();
			this.writeJson("returned", ConstantUtil.RETURN_FAIL);
		}
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月4日上午10:35:10
	 * 描     述： 删除产品品牌
	 * @param uuids 产品key
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/delProBrand.html")
	public void delProInfo(Integer nos){
		BusinessData<ProductEntity> productByBrandid = productBusiness.selectProductByBrandid(nos, null, null, null, null);
		if (productByBrandid.getCount() != 0) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("msg", "当前品牌下面管理了产品，请先删除产品");
			map.put("returned", ConstantUtil.RETURN_FAIL);
			this.writeJson(map);
		}else {
			productBrandBusiness.deleteProductBrandByKey(nos);
			this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
		}
	}
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月11日下午1:49:31
	 * 描     述：  查看详情
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/proBrandInfo.html")
	public ModelAndView toBrandInfo(Model model,Long id,String namecn){
		try {
			BusinessData<ProductBrandEntity> bubrand = productBrandBusiness.selectByid(id);

			ProductBrandEntity pb = bubrand.getT();
			Map<String, Object> map = ListMapUtil.convertEntityToMap(pb);
			model.addAttribute("returned", map);
			model.addAttribute("frameLeft", "admin/product/left.html");
			model.addAttribute("currIndex","2");
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
			model.addAttribute("namecn",namecn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/addProductBrand");
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月24日下午3:39:08
	 * @description:检查名称是否重复
	 * @param namecn
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/checkNameCn.html")
	public void checkNameCn(String namecn){
		BusinessData<ProductBrandEntity > product = productBrandBusiness.selectProductBrandByNameCn(namecn, null, null);
		if(product.getT() != null){
			this.writeJson("status", ConstantUtil.RETURN_FAIL);
		}else{
			this.writeJson("status", ConstantUtil.RETURN_SUCCESS);
		}
	}
}

