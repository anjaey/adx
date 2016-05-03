package com.bhe.controller.admin.product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductAttributeBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.system.ISysAttachmentBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductAttributeEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.PageUtil;

/**
 * 创 建 人： zhangyu
 * 日     期： 2015年8月8日上午11:06:54
 * 描     述：  产品调价控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */

@Controller
public class ProPriceManageController extends BaseController {

	@Autowired
	IProductBusiness iProductBusiness;
	
	@Autowired
	IUserBusiness iUserBusiness;
	
	@Autowired
	ISysAttachmentBusiness iSysAttachmentBusiness;
	
	@Autowired
	IProductAttachmentBusiness iProductAttachmentBusiness;
	
	@Autowired
	IProductAttributeBusiness iProductAttributeBusiness;
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月8日上午11:07:56
	 * 描     述：  产品调价
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
	@RequestMapping("/admin/product/tobatchprice.html")
	public ModelAndView toProductList(Model model,Integer pageindex,Integer pagesize, String orderFile, String orderType,String param,Long type){
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","11");
		model.addAttribute("param", param);
		model.addAttribute("type", type);

		try {
			if (null == pageindex || 0 == pageindex) {
				pageindex=1;
			}
			if (null == pagesize) {
				pagesize=15;
			}
			//行号
			int rowno = PageUtil.getStart(pageindex, pagesize);
			
			//查询产品数据
			BusinessData<ProductEntity> bdue = iProductBusiness.selectProductByIsDel(0, pageindex, pagesize, null, param, type, null);
			
			//处理数据
			List<ProductEntity> prolist = bdue.getList();
			List<Map<String,Object>> listmap = ListMapUtil.convertListEntityToListMap(prolist);
			
			
			for (Map<String, Object> map : listmap) {
				rowno ++;
				map.put("rowno", rowno);
				
				//查询商品封面(附件表中的主图片)
				BusinessData<ProductAttachmentEntity> bdentity = iProductAttachmentBusiness.selectProductAttachmentBykey(true, map.get("uuid").toString(), ConstantUtil.PRO_FILE_PROINFO);
				ProductAttachmentEntity proatt = null;
				if (!CommonUtil.isEmpty(bdentity) && !CommonUtil.isEmpty(bdentity.getList())) { 
					if (bdentity.getList().size()>0) {
						proatt = bdentity.getList().get(0);
					}
				}
				
				//处理商品图片
				if (!CommonUtil.isEmpty(proatt)) {
					String url = ImageUtils.getImageUrl(proatt.getUrl());
					map.put("imgurl", url); 
				} else {
					map.put("imgurl", ConstantUtil.FTP_NOTRESOURCE_DEFAULT); //这儿处理默认图片
				}
				
				//查询商品类型
				Object objcla = map.get("clazzid");
				if (!CommonUtil.isEmpty(objcla)) {
					String strcla = objcla.toString();
					Long longcla = Long.decode(strcla);
					BusinessData<ProductAttributeEntity> pae = iProductAttributeBusiness.selectProductByid(longcla);
					
					ProductAttributeEntity paeentity = pae.getT();
					if (!CommonUtil.isEmpty(paeentity)) {
						map.put("clazzname", paeentity.getName());
					}
				}
				
				//处理商品状态
				Object objsta = map.get("status");
				if (!CommonUtil.isEmpty(objsta)) {
					String strsta = objsta.toString();
					if ("1".equals(strsta)) { //上架
						map.put("status", "上架");
					} else{ //下架
						map.put("status", "下架");
					}
				}
				
			}

			Map<String, Object> mapentity = ListMapUtil.convertEntityToMap(bdue);
			//重新设置list
			mapentity.put("list", listmap);
			
			//加入查询的商品数据
			model.addAttribute("pageInfoMap",mapentity);
			
			//加入商品分类数据
//			model.addAttribute(arg0, arg1)
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return forwardPage("admin/product/batchPrice");
	}
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月11日上午10:44:10
	 * 描     述：  批量调价
	 * @param param
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/batchPrice.html")
	public void batchPrice(String param){
		ProductEntity pe = null;
		
		List<Map<String, Object>> listmap = JsonUtil.readJson2ListMap(param);
		for (Map<String, Object> map : listmap) {
			String uuid = map.get("uuid").toString();
			String price = map.get("price").toString();
			
			pe = new ProductEntity();
			pe.setUuid(uuid);
			Double pricedou = Double.parseDouble(price);
			BigDecimal pricebig = BigDecimal.valueOf(pricedou);
			pe.setPrice(pricebig);
			
			iProductBusiness.updateProductByKey(pe);
		}
	}
	
}
