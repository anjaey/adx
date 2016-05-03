package com.bhe.controller.admin.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBrandBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.product.IProductInquiriesBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.ProductInquiriesEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.UuidUtil;

/**
 * @author: 易川
 * @date: 2015 08 27
 * @description: 询价控制层<br>
 *               -----------------------------<br>
 * @update:
 * @date:
 * @description: (注明修改原因) <br>
 *               -----------------------------<br>
 */
@Controller
public class ProInquiriesController extends BaseController {

	@Autowired
	private IProductInquiriesBusiness iProductInquiriesBusiness;
	@Autowired
	private IProductBusiness iProductBusiness;
	@Autowired
	private IProductAttachmentBusiness iProductAttachmentBusiness;
	@Autowired
	private IProductBrandBusiness iProductBrandBusiness;

	/**
	 * @author: yichuan
	 * @date: 2015-8-27 14:05:00
	 * @description: 跳转并查询询价
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
	@RequestMapping("/admin/product/toInquiriesManager.html")
	public ModelAndView toInquiriesManager(Model model, String title, String name, Integer pageIndex, Integer pageSize,
			String orderFile, String orderType, Integer states) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "4");
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex", "13");
		model.addAttribute("title", title);
		model.addAttribute("state", states);
		model.addAttribute("name", name);
		try {
			if (null == pageIndex || 0 == pageIndex) {
				pageIndex = 1;
			}
			if (null == pageSize) {
				pageSize = 15;
			}
			//条件查询处理产品信息
			BusinessData<ProductEntity> products = iProductBusiness.selectProductByNameCn(title, null, null);
			List<String> uuids = new ArrayList<String>();
			if(!CommonUtil.isEmpty(products)){
				for(ProductEntity p : products.getList()){
					uuids.add(p.getUuid());
				}
			}
			BusinessData<ProductInquiriesEntity> bdpse = iProductInquiriesBusiness.selectProductInquiriesByName(uuids, name,
					pageIndex, pageSize, states);
			List<Map<String, Object>> listmap = ListMapUtil.convertListEntityToListMap(bdpse.getList());
			if (!CommonUtil.isEmpty(listmap)) {
				for (Map<String, Object> map : listmap) {
					if (!CommonUtil.isEmpty(map)) {
						// 处理性别
						String sex = map.get("sex").toString();
						if(!CommonUtil.isEmpty(sex)){
							if ("1".equals(sex)) {
								map.put("sex", "男");
							} else {
								map.put("sex", "女");
							}
						}
						// 处理状态
						String state = map.get("state").toString();
						if(!CommonUtil.isEmpty(state)){
							if ("1".equals(state)) {
								map.put("state", "已处理");
							} else {
								map.put("state", "未处理");
							}
						}
						String uuidstr = map.get("uuid").toString();
						// 处理产品名
						BusinessData<ProductEntity> product = iProductBusiness.selectProInfoByUuid(uuidstr);
						if (!CommonUtil.isEmpty(product)) {
							Map<String, Object> productmap = ListMapUtil.convertEntityToMap(product.getT());
							map.put("productname", productmap.get("namecn"));
						}
						// 处理图片
						BusinessData<ProductAttachmentEntity> productAtta = iProductAttachmentBusiness
								.selectProductAttachmentBykey(true, uuidstr, null);
						if (!CommonUtil.isEmpty(productAtta)) {
							Object urlObj = productAtta.getT().getUrl();
							if (!CommonUtil.isEmpty(urlObj)) {
								map.put("url", ImageUtils.getImageUrl(urlObj));
							}
						}

					}
				}
			}
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdpse);
			pageInfoMap.put("list", listmap);
			model.addAttribute("pageInfoMap", pageInfoMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/productInquiries");
	}

	/**
	 * @author: yichaun
	 * @date: 2015 08 27 14: 11: 00
	 * @description: 跳转到修改页面
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/toUpdataProInquiries.html")
	public ModelAndView toUpdataProInquiries(Model model, Integer id) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "4");
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex", "13");
		model.addAttribute("states", "1");
		try {

			// 获取数据
			BusinessData<ProductInquiriesEntity> data = iProductInquiriesBusiness.selectProductInquiriesById(id);
			if (!CommonUtil.isEmpty(data)) {
				Map<String, Object> datamap = ListMapUtil.convertEntityToMap(data.getT());
				// 处理产品信息
				String uuidstr = (String) datamap.get("uuid");
				BusinessData<ProductEntity> product = iProductBusiness.selectProInfoByUuid(uuidstr);
				if (!CommonUtil.isEmpty(product)) {
					Map<String, Object> productmap = ListMapUtil.convertEntityToMap(product.getT());
					Long brandid = (Long) productmap.get("brandid");
					// 处理品牌
					BusinessData<ProductBrandEntity> probrand = iProductBrandBusiness.selectByid(brandid);
					productmap.put("brandname", probrand.getT().getNamecn());
					datamap.put("product", productmap);
				}
				// 处理图片
				BusinessData<ProductAttachmentEntity> productAtta = iProductAttachmentBusiness
						.selectProductAttachmentBykey(true, uuidstr, null);
				if (!CommonUtil.isEmpty(productAtta)) {
					Object urlObj = productAtta.getT().getUrl();
					if (!CommonUtil.isEmpty(urlObj)) {
						datamap.put("url", ImageUtils.getImageUrl(urlObj));
					}
				}
				model.addAttribute("data", datamap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/addProductInquiries");
	}

	/**
	 * @author: yichuan
	 * @return
	 * @date: 2015年8月27日下午12:06:00
	 * @description: 添加询价
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/addProductInquiries.html")
	public ModelAndView addProductInquiries(Model model, ProductInquiriesEntity entity) {
		BusinessData<Boolean> data;
		if (CommonUtil.isEmpty(entity.getUuid())) {
			entity.setUuid(UuidUtil.generateUUID());
			data = iProductInquiriesBusiness.insertProductInquiries(entity);
		} else {
			data = iProductInquiriesBusiness.updateProductInquiriesByKey(entity);
		}
		model.addAttribute("data", data);
		return forwardPage("redirect:/admin/product/toInquiriesManager.html");
	}

	/**
	 * @author: yichuan
	 * @date: 2015-8-27 14:22:00
	 * @description: 删除询价
	 * @param uuid
	 *            <br>
	 *            -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping("/admin/product/delInquiries.html")
	public void delSolutionInfo(String uuids) {
		List<Map<String, Object>> listmap = JsonUtil.readJson2ListMap(uuids);
		for (Map<String, Object> map : listmap) {
			String idObj = map.get("uuid").toString();
			Integer id = Integer.parseInt(idObj);
			iProductInquiriesBusiness.deleteProductInquiriesByKey(id);
		}
		this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, ConstantUtil.RETURN_SUCCESS);
	}

}
