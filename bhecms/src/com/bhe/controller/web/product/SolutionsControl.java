package com.bhe.controller.web.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.product.IProductCategoryBusiness;
import com.bhe.business.product.IProductSolutionsBusiness;
import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.business.user.IUserCustomerBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.ProductSolutionsEntity;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.dao.mybatis.model.UserCustomerEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;

/**
 * @author: zhangyu
 * @date: 2015年8月20日上午9:59:36
 * @description: 解决方案控制器 <br>
 *               -----------------------------<br>
 * @update:
 * @date:
 * @description: (注明修改原因) <br>
 *               -----------------------------<br>
 */
@Controller
public class SolutionsControl extends BaseController {

	@Autowired
	IProductSolutionsBusiness iProductSolutionsBusiness;

	@Autowired
	private IProductBusiness iProductBusiness;

	@Autowired
	private IProductAttachmentBusiness iProductAttachmentBusiness;

	@Autowired
	private IProductCategoryBusiness iProductCategoryBusiness;

	@Autowired
	private IUserCustomerBusiness iUserCustomerBusiness;

	@Autowired
	private ISysResourceBusiness iSysResourceBusiness;

	/**
	 * @author: zhangyu
	 * @date: 2015年8月20日下午2:07:23
	 * @description: 跳转到解决方案
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	@RequestMapping(value = "/web/product/toSolutions.html")
	public ModelAndView toSolutions(Model model, String code, String uuid) {
		model.addAttribute("code", code);
		List<Map<String, Object>> listmap = null;
		try {
			BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode(code);
			if (null != sysResBd.getT()) {
				String picurl = sysResBd.getT().getPicurl();
				model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
			}
			BusinessData<ProductSolutionsEntity> bdprse = iProductSolutionsBusiness.selectSolutions(null, null, null,
					null, null);
			if (!CommonUtil.isEmpty(bdprse)) {
				List<ProductSolutionsEntity> listpse = bdprse.getList();
				listmap = ListMapUtil.convertListEntityToListMap(listpse);
			}

			model.addAttribute(ConstantUtil.SYSTEM_DATA_RETURN, listmap);

			Map<String, Object> map = null;
			if (CommonUtil.isEmpty(uuid)) {
				// 查询第一个
				if (!CommonUtil.isEmpty(listmap) && listmap.size() > 0) {
					Map<String, Object> mapobj = listmap.get(0);
					uuid = mapobj.get("uuid").toString();
					map = findSolutionsByid(uuid);
				}
			} else {
				// 查询第一个
				map = findSolutionsByid(uuid);

			}
			model.addAttribute("solution", map);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("web/solutions/solutionsList");

	}

	/**
	 * @author: zhangyu
	 * @date: 2015年8月21日上午9:49:51
	 * @description:
	 * @param uuid
	 *            <br>
	 *            -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	public Map<String, Object> findSolutionsByid(String uuid) {
		Map<String, Object> map = null;
		try {
			BusinessData<ProductSolutionsEntity> bdprse = iProductSolutionsBusiness.selectSolutionByid(uuid);
			if (!CommonUtil.isEmpty(bdprse)) {
				ProductSolutionsEntity pse = bdprse.getT();

				map = ListMapUtil.convertEntityToMap(pse);
				Object procategoryidobj = map.get("procategoryid");
				Object prochampionobj = map.get("prochampion");
				Object Customerobj = map.get("customer");

				// 获取推荐产品
				if (!CommonUtil.isEmpty(procategoryidobj)) {
					String procate = procategoryidobj.toString();
					List<Map<String, Object>> procatelistobj = JsonUtil.readJson2ListMap(procate);
					// 由于推荐产品中涉及到了分类，需要循环取出分类后在循环取出产品进行处理[{"sortid":"001","pros":[{uuid},{uuid}]},{"sortid":"002","pros":[{uuid},{uuid}]}]
					List<Map<String, Object>> products = new ArrayList<Map<String, Object>>();
					for (Map<String, Object> map2 : procatelistobj) {
						Map<String, Object> sortmap = new HashMap<String, Object>();
						String sortid = (String) map2.get("sortid");
						Object prosobj = map2.get("pros"); // 取出产品信息
						if (!CommonUtil.isEmpty(sortid)) {
							BusinessData<ProductCategoryEntity> data = iProductCategoryBusiness
									.selectProCateById(Long.parseLong(sortid));
							Map<String, Object> datamap = ListMapUtil.convertEntityToMap(data.getT());
							sortmap.put("sort", datamap);
						}
						if (!CommonUtil.isEmpty(prosobj)) {
							List<Map<String, Object>> listmapobj = new ArrayList<Map<String, Object>>();
							@SuppressWarnings("unchecked")
							List<Map<String, Object>> listmap = (List<Map<String, Object>>) prosobj;
							// 根据里面的uuid 查询产品信息
							for (Map<String, Object> map3 : listmap) {
								String uuidstr = map3.get("uuid").toString();

								// 查询附件信息
								BusinessData<ProductAttachmentEntity> proatt = iProductAttachmentBusiness
										.selectProductAttachmentBykey(true, uuidstr, ConstantUtil.PRO_FILE_PROINFO);
								// 图片路径
								String url = null;
								if (!CommonUtil.isEmpty(proatt)) {
									List<ProductAttachmentEntity> paelist = proatt.getList();
									if (!CommonUtil.isEmpty(paelist) && paelist.size() > 0) {
										ProductAttachmentEntity pae = paelist.get(0);
										url = ImageUtils.getImageUrl(pae.getUrl());
									}
								}

								// 查询产品
								BusinessData<ProductEntity> pedata = iProductBusiness.selectProInfoByUuid(uuidstr);
								ProductEntity pe = pedata.getT();
								Map<String, Object> mappe = ListMapUtil.convertEntityToMap(pe);
								mappe.put("url", url);
								listmapobj.add(mappe);
							}

							// 赋值
							sortmap.put("pros", listmapobj);
						}
						products.add(sortmap);
					}
					map.put("products", products);
					map.put("procatelist", procatelistobj);
				}

				// 获取销售冠军
				if (!CommonUtil.isEmpty(prochampionobj)) {
					String prochampion = prochampionobj.toString();
					List<Map<String, Object>> prochampionlistobj = JsonUtil.readJson2ListMap(prochampion);

					List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
					for (Map<String, Object> map2 : prochampionlistobj) {
						String uuidstr = map2.get("id").toString();

						BusinessData<ProductEntity> bdpe = iProductBusiness.selectProInfoByUuid(uuidstr);
						ProductEntity peinfo = bdpe.getT();
						Map<String, Object> mapobj = ListMapUtil.convertEntityToMap(peinfo);

						// 处理图片,这个主要是取出主图。
						String url = "";
						BusinessData<ProductAttachmentEntity> proatt = iProductAttachmentBusiness
								.selectProductAttachmentBykey(true, uuidstr, ConstantUtil.PRO_FILE_PROINFO);
						if (!CommonUtil.isEmpty(proatt)) {
							List<ProductAttachmentEntity> paelist = proatt.getList();
							if (!CommonUtil.isEmpty(paelist) && paelist.size() > 0) {
								ProductAttachmentEntity pae = paelist.get(0);
								url = ImageUtils.getImageUrl(pae.getUrl());
							}
						}
						mapobj.put("url", url);
						listmap.add(mapobj);
					}

					map.put("prochampionlist", listmap);
				}

				// 获取主要客户
				if (!CommonUtil.isEmpty(Customerobj)) {
					String customer = Customerobj.toString();
					List<Map<String, Object>> customerlistobj = JsonUtil.readJson2ListMap(customer);
					List<Map<String, Object>> customerlistmap = new ArrayList<Map<String, Object>>();
					for (Map<String, Object> map2 : customerlistobj) {
						String id = map2.get("id").toString();
						Long idlon = Long.valueOf(id);
						// 处理图片
						BusinessData<UserCustomerEntity> bduce = iUserCustomerBusiness.selectUserCustomerById(idlon);
						UserCustomerEntity uce = bduce.getT();
						Map<String, Object> mapobj = ListMapUtil.convertEntityToMap(uce);
						Object obj = mapobj.get("logo");
						if (!CommonUtil.isEmpty(obj)) {
							String url = ImageUtils.getImageUrl(obj);
							mapobj.put("url", url);
							mapobj.put("uuid", id);
						}
						customerlistmap.add(mapobj);
					}
					map.put("customerlis", customerlistmap);
				}
				map.put("title", pse.getTitle());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}
