package com.bhe.controller.admin.product;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductAttributeBusiness;
import com.bhe.business.product.IProductBrandBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.product.IProductCategoryBusiness;
import com.bhe.business.product.IProductClassBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.dao.mybatis.model.ProductClassEntity;
import com.bhe.dao.mybatis.model.ProductDetailEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.DateUtil;
import com.bhe.util.common.FtpUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.PageUtil;
import com.bhe.util.common.UuidUtil;

/**
 * 创 建 人：  Administrator
 * 日     期： 2015年8月3日下午2:27:16
 * 描     述： 产品管理
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */

@Controller
public class ProManageController extends BaseController {

	@Autowired
	IProductBusiness iProductBusiness;
	@Autowired
	com.bhe.business.product.refactor.IProductBusiness productBusiness;

	@Autowired
	IUserBusiness iUserBusiness;

	@Autowired
	IProductClassBusiness iProductClassBusiness;
	
	@Autowired
	IProductCategoryBusiness iProductCategoryBusiness;

	@Autowired
	IProductBrandBusiness iProductBrandBusiness;

	@Autowired
	IProductAttachmentBusiness iProductAttachmentBusiness;

	@Autowired
	IProductAttributeBusiness iProductAttributeBusiness;
	

	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015年8月3日下午2:28:39
	 * 描     述：  跳转到产品列表页面
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/admin/product/productManage.html")
	public ModelAndView toProductList(Model model,Integer pageindex,Integer pagesize, String orderFile, String orderType, String content, Long type, Integer status) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "4");
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","1");
		model.addAttribute("status",status);
		model.addAttribute("type",type);
		model.addAttribute("content",content);

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
			BusinessData<ProductEntity> bdue = iProductBusiness.selectProductByIsDel(2, pageindex, pagesize, null, content, type, status);

			//处理数据
			List<ProductEntity> prolist = bdue.getList();
			List<Map<String,Object>> listmap = ListMapUtil.convertListEntityToListMap(prolist);


			for (Map<String, Object> map : listmap) {
				rowno ++;
				map.put("rowno", rowno);

				Object objuser = map.get("userkey");
				if (!CommonUtil.isEmpty(objuser)) {
					//查询作者数据
					BusinessData<UserDetailEntity>  userentity = iUserBusiness.selectUserDetailByuuid(objuser.toString());
					if (!CommonUtil.isEmpty(userentity)) {
						Map<String, Object> usermap = ListMapUtil.convertEntityToMap(userentity.getT());
						map.put("user", usermap);
					}
				}

				//查询商品封面(附件表中的主图片)
				BusinessData<ProductAttachmentEntity> bdentity = iProductAttachmentBusiness.selectProductAttachmentBykey(true, map.get("uuid").toString(),ConstantUtil.PRO_FILE_PROINFO);
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

				//查询商品分类
				Object objcla = map.get("clazzid");
				if (!CommonUtil.isEmpty(objcla)) {
					String strcla = objcla.toString();
					Long longcla = Long.decode(strcla);
					BusinessData<ProductCategoryEntity> pae = iProductCategoryBusiness.selectProCateById(longcla);

					ProductCategoryEntity paeentity = pae.getT();
					if (!CommonUtil.isEmpty(paeentity)) {
						map.put("clazzname", paeentity.getNamecn());
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

//			Map<String, Object> mapentity = ListMapUtil.convertEntityToMap(bdue);
			//重新设置list
			//mapentity.put("list", listmap);

			Map<String, Object> requestMap = new HashMap<String, Object>();// 添加
			requestMap.put(ConstantUtil.RESULT_PAGEINDEX,pageindex);// 添加
			requestMap.put(ConstantUtil.RESULT_PAGESIZE,pagesize);// 添加
			requestMap.put(ConstantUtil.RESULT_ORDERPARAM,"id");// 添加
			requestMap.put(ConstantUtil.RESULT_ORDERRANK,"desc");// 添加
			if(status != null && status == -1){
				status = null;
			}
			if(type != null && type == -1){
				type = null;
			}
			if(content != null && "".equals(content)){
				content = null;
			}
			requestMap.put("status", status);// 添加
			requestMap.put("clazzid", type);// 添加
			requestMap.put("namecn", content);// 添加
			Map<String, Object> productForManage = productBusiness.selectProductForManage(requestMap); // 添加
			List<Map<String, Object>> list = (List<Map<String, Object>>) productForManage.get(ConstantUtil.RESULT_DATA); // 添加
			productForManage.put("list", list); // 添加

			model.addAttribute("pageInfoMap",productForManage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/productManage");
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月3日下午4:10:34
	 * 描     述：产品垃圾箱跳转
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/ProDustbinManager.html")
	public ModelAndView toProDustbinList(Model model,Integer pageindex,Integer pagesize, String orderFile, String orderType) {
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","5");
		return forwardPage("admin/product/ProDustbinManager");
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月4日下午2:47:12
	 * 描     述： 跳转到添加产品页面
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
	@RequestMapping("/admin/product/toaddProinfo.html")
	public ModelAndView toaddProDustbinList(Model model) {
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","1");

		try {
			//查询所有的品牌
			BusinessData<ProductBrandEntity> probrands = iProductBrandBusiness.selectProductBrandByMap(null, null, null);
			List<ProductBrandEntity> probrandlist = probrands.getList();
			List<Map<String, Object>> probrandlistmap = ListMapUtil.convertListEntityToListMap(probrandlist);
			model.addAttribute("probrandlistmap",probrandlistmap);
			
			List<Map<String, Object>> bdpeFilSpecemap = new ArrayList<Map<String,Object>>();
			model.addAttribute("bdpeFilSpecemap",bdpeFilSpecemap);
			List<Map<String, Object>> bdpeFilemap = new ArrayList<Map<String,Object>>();
			model.addAttribute("bdpeFilemap",bdpeFilemap);

			//生产UUID
			String uuid = UuidUtil.generateUUID();
			model.addAttribute("uuid", uuid);
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/addProduct");
	}
	
	
	/**
	 * @author: 林
	 * @date: 2015年8月15日上午9:47:35
	 * @description:					查询产品分类用于树
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/product/getProductCategoryForTree.html",method=RequestMethod.POST)
	public void getProductCategoryForTree() {
		BusinessData<ProductCategoryEntity> proCateByAll = iProductCategoryBusiness.selectProCateByAll(null, null, null, null);
		
		Map<String, List<ProductCategoryEntity>> map = new HashMap<String, List<ProductCategoryEntity>>();
		for (ProductCategoryEntity entity : proCateByAll.getList()) {
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
	 * 创 建 人：  Administrator
	 * 日     期：  2015-8-11下午8:52:50
	 * 描     述： 查询产品相关数据并跳转到产品详情页面
	 * @param model
	 * @param uuid
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/toselectProAndToProView.html")
	public ModelAndView toselectProAndToProView(Model model,String uuid) {
		model.addAttribute("frameLeft", "admin/product/left.html");
		model.addAttribute("currIndex","1");

		try {
			//查询所有的商品分类
			BusinessData<ProductClassEntity> proclas = iProductClassBusiness.selectProductClassByMap(null,null,null);
			List<ProductClassEntity> proclalist = proclas.getList();
			List<Map<String, Object>> proclalistmap = ListMapUtil.convertListEntityToListMap(proclalist);
			model.addAttribute("proclalistmap",proclalistmap);

			//查询所有的品牌
			BusinessData<ProductBrandEntity> probrands = iProductBrandBusiness.selectProductBrandByMap(null, null, null);
			List<ProductBrandEntity> probrandlist = probrands.getList();
			List<Map<String, Object>> probrandlistmap = ListMapUtil.convertListEntityToListMap(probrandlist);
			model.addAttribute("probrandlistmap",probrandlistmap);

			//根据编号查询产品
			BusinessData<ProductEntity> bdpe = iProductBusiness.selectProInfoByUuid(uuid);
			ProductEntity pe = bdpe.getT(); 
			Map<String, Object> pemap = ListMapUtil.convertEntityToMap(pe);
			model.addAttribute("bdpemap",pemap);
			
			//uuid
			if (!CommonUtil.isEmpty(pe)) {
				model.addAttribute("uuid",pe.getUuid());
			}

			//根据编号查询产品详情
			BusinessData<ProductDetailEntity> bdpde = iProductBusiness.selectProDetailByUuid(uuid);
			ProductDetailEntity pde = bdpde.getT();
			Map<String, Object> pdemap = ListMapUtil.convertEntityToMap(pde);
			model.addAttribute("bdpeDetailmap",pdemap);

			//根据编号查询产品相关附件（图片等）信息
			BusinessData<ProductAttachmentEntity> bdpae = iProductAttachmentBusiness.selectProductAttachmentBykey(false, uuid,ConstantUtil.PRO_FILE_PROINFO);
			List<ProductAttachmentEntity> paelist = bdpae.getList();
			List<Map<String, Object>> paelistmap = ListMapUtil.convertListEntityToListMap(paelist);
			//设置url
			ImageUtils.setlistmapImaUrl(paelistmap, "url");			
			model.addAttribute("bdpeFilemap",paelistmap);

			//根据编号查询规格附件
			BusinessData<ProductAttachmentEntity> bdpaeSpec = iProductAttachmentBusiness.selectProductAttachmentBykey(false, uuid,ConstantUtil.PRO_FILE_SPEC);
			List<ProductAttachmentEntity> paeSpeclist = bdpaeSpec.getList();
			List<Map<String, Object>> paeSpeclistmap = ListMapUtil.convertListEntityToListMap(paeSpeclist);
			//设置url
			ImageUtils.setlistmapImaUrl(paeSpeclistmap, "url");	
			model.addAttribute("bdpeFilSpecemap",paeSpeclistmap);
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/product/addProduct");
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
	@RequestMapping("/admin/product/addproinfo.html")
	@SuppressWarnings("unchecked")
	public void addandUpdateProtInfo(@RequestParam String param) {
		try {
			if (!CommonUtil.isEmpty(param)) {
				Map<String, Object> map = JsonUtil.JsonToObject(param,Map.class);
				Map<String,Object> promap = (Map<String,Object>)map.get("pro");  //获取商品基本信息
				Map<String,Object> detailedmap = (Map<String,Object>)map.get("detailed");  //获取商品详细信息

				Object obj = promap.get("uuid"); // 获取生成的uuid
				if (!CommonUtil.isEmpty(obj)) {
					String uuid = obj.toString();
					//查询当前编号的商品是否存在
					BusinessData<ProductEntity> bdpe = iProductBusiness.selectProInfoByUuid(uuid);
					ProductEntity peEntity = bdpe.getT();
					
					//转换类型
					Object priceObj = promap.get("price");    //单价
					Object weightObj = promap.get("weight");  // 重量
					Object bulkObj = promap.get("bulk");      // 体积
					BigDecimal pricebig = DateUtil.bigObjConvert(priceObj);
					BigDecimal weightbig = DateUtil.bigObjConvert(weightObj);
					BigDecimal bulkbig = DateUtil.bigObjConvert(bulkObj);
					promap.put("price", pricebig);
					promap.put("weight", weightbig);
					promap.put("bulk", bulkbig);
					
					
					if (!CommonUtil.isEmpty(peEntity)) {  //存在 进行修改
						//修改基本信息
						ProductEntity pe = (ProductEntity) ListMapUtil.setEntityValue(promap, ProductEntity.class);
						pe.setUpdatetime(new Date());
						iProductBusiness.updateProductByKey(pe);

						//修改详细信息
						ProductDetailEntity pd = (ProductDetailEntity) ListMapUtil.setEntityValue(detailedmap, ProductDetailEntity.class);
						if (!CommonUtil.isEmpty(pd)) {
							BusinessData<ProductDetailEntity>  bdde = iProductBusiness.selectProDetailByUuid(uuid);
							ProductDetailEntity pde = bdde.getT();
							if (!CommonUtil.isEmpty(pde)) { //修改
								iProductBusiness.updateProDetail(pd);
							} else { //添加
								iProductBusiness.insertProDetail(pd);
							}
						}
						
						
					} else {   //进行添加
						ProductEntity pe = (ProductEntity) ListMapUtil.setEntityValue(promap, ProductEntity.class);
						pe.setCreatetime(new Date());
						pe.setIsdelete(0);
						Map<String, Object> mapEntity = ListMapUtil.convertEntityToMap(pe);
						System.out.println(mapEntity.get("isdelete"));
						Map<String, Object> insertProduct = productBusiness.insertProduct(mapEntity);// 添加
						System.out.println(insertProduct.get(ConstantUtil.RESULT_PRIMARYKEY));// 添加
						//iProductBusiness.insertProduct(pe);

						ProductDetailEntity pd = (ProductDetailEntity) ListMapUtil.setEntityValue(detailedmap, ProductDetailEntity.class);
						pd.setUuid(pe.getUuid());
						iProductBusiness.insertProDetail(pd);
					}
				}
			}

			this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月4日上午10:35:10
	 * 描     述： 产品删除 分为直接删除和删除到回收站
	 * @param uuids 产品key
	 * @param state 状态 0 删除到垃圾箱  1 直接删除
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/delProInfo.html")
	public void delProInfo(String uuids,String state) {
		List<Map<String, Object>> listmap = JsonUtil.readJson2ListMap(uuids);
		
		if ("0".equals(state)) {
			for (Map<String, Object> map : listmap) {
				String uuid = map.get("uuid").toString();
				ProductEntity pe = new ProductEntity();
				pe.setUuid(uuid);
				pe.setIsdelete(0);
				iProductBusiness.updateProductByKey(pe);
			}
		} else {
			List<String> list = new ArrayList<String>();
			for (Map<String, Object> map : listmap) {
				String uuid = map.get("uuid").toString(); // 添加
				//Map<String, Object> deleteProductByUuid = productBusiness.deleteProductByUuid(uuid);// 添加
				//System.out.println(deleteProductByUuid.get(ConstantUtil.RESULT_ROWS));// 添加
				//iProductBusiness.deleteProductByUuid(uuid);
				list.add(uuid);// 添加
			}
			Map<String, Object> deleteProductByUuidList = productBusiness.deleteProductByUuidList(list);// 添加
			System.out.println(deleteProductByUuidList.get(ConstantUtil.RESULT_ROWS));// 添加
		}

		this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
	}
	
	
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月12日下午8:14:30
	 * 描     述：  商品的上架下架处理
	 * @param uuid
	 * @param state
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/proGroundOrUndercarriage.html")
	public void proGroundOrUndercarriage(String uuids,Integer status){
		List<Map<String, Object>> listmap = JsonUtil.readJson2ListMap(uuids);
		ProductEntity pe = null;
		String uuidss = "";// 添加
		for (Map<String, Object> map : listmap) {
			if (!CommonUtil.isEmpty(map)) {
				String uuid = map.get("uuid").toString();
				
				pe = new ProductEntity();
				pe.setUuid(uuid);
				pe.setStatus(status);
//				iProductBusiness.updateProductByKey(pe);
//				Map<String, Object> updateProductById = productBusiness.updateProductForStatus(uuid, status);// 添加
//				System.out.println(updateProductById.get(ConstantUtil.RESULT_ROWS));// 添加
				uuidss += uuid+",";
			}
		}
		Map<String, Object> updateProductById = productBusiness.updateProductForStatus(uuidss.substring(0, uuidss.length()-1), status);// 添加
		System.out.println(updateProductById.get(ConstantUtil.RESULT_ROWS));// 添加
		
		this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
	}
	
	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015-8-11下午9:50:42
	 * 描     述： 查询指定产品的附件信息
	 * @param model
	 * @param uuid
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/selectProFile.html")
	public void selectProFile(Model model,String uuid) {
		try {
			BusinessData<ProductAttachmentEntity> paebd = iProductAttachmentBusiness.selectProductAttachmentBykey(false, uuid, ConstantUtil.PRO_FILE_PROINFO);
			List<ProductAttachmentEntity> paelist = paebd.getList();
			List<Map<String,Object>> listmap = ListMapUtil.convertListEntityToListMap(paelist);
			model.addAttribute("paelist", listmap);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月12日下午6:05:29
	 * 描     述：  修改文件规格的附件
	 * @param model
	 * @param uuid
	 * @param title
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/updateProFile.html")
	public void updateProFile(String uuid,String title){
		ProductAttachmentEntity pae = new ProductAttachmentEntity();
		pae.setTitle(title);
		iProductAttachmentBusiness.updateProductByUuid(uuid, pae);
		this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
	}
	
	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015-8-11下午9:57:08
	 * 描     述： 删除产品的附件信息
	 * @param uuid
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/delProFile.html")
	public void delProFile(String fileid) {
		iProductAttachmentBusiness.deleteProductAttachmentByKey(fileid);
		this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
	}
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月12日上午11:28:26
	 * 描     述：  设置产品的主图片
	 * @param fileid
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/setMainPicPro.html")
	public void setMainPicPro(String fileid,Integer ismain,String prouuid){
		if (!(CommonUtil.isEmpty(fileid) && CommonUtil.isEmpty(ismain))) {
			//设置之前先清空这个产品的主图
			BusinessData<ProductAttachmentEntity>  bdpae = iProductAttachmentBusiness.selectProductAttachmentBykey(false, prouuid, ConstantUtil.PRO_FILE_PROINFO);
			List<ProductAttachmentEntity> paelist =  bdpae.getList();
			
			ProductAttachmentEntity pae = new ProductAttachmentEntity();
			pae.setIsmain(0);
			
			for (ProductAttachmentEntity productAttachmentEntity : paelist) {
				iProductAttachmentBusiness.updateProductByUuid(productAttachmentEntity.getUuid(), pae);
			}
			
			//设置主图
			pae = new ProductAttachmentEntity();
			pae.setIsmain(1);
			iProductAttachmentBusiness.updateProductByUuid(fileid, pae);
		}
		this.writeJson("returned", ConstantUtil.RETURN_SUCCESS);
	}

	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月6日下午2:57:50
	 * 描     述： 产品图片资料上传
	 * @param file
	 * @param map
	 * @param type  表示产品附件类型
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/addFle.html")
	public void uploadFile(@RequestParam("file") MultipartFile file,String uuid) {
		uploadProFile(file, uuid, ConstantUtil.PRO_FILE_PROINFO);
	}
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月12日下午5:20:39
	 * 描     述：  产品规格文件上传
	 * @param file
	 * @param uuid
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/uploadProSpec.html")
	public void uploadProSpec(@RequestParam("file") MultipartFile file,String uuid){
		uploadProFile(file, uuid, ConstantUtil.PRO_FILE_SPEC);
	}
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月6日下午2:57:50
	 * 描     述： 产品图片资料上传
	 * @param file
	 * @param map
	 * @param type  表示产品附件类型
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private void uploadProFile(MultipartFile file,String uuid,String type){
		
		//取出FTP路径
		String dir = ConstantUtil.FTP_PRODUCTROOTDIR_NAME;
		try {
			//获取文件名称
			String orginalName = file.getOriginalFilename();
			
			//得到生成的文件名称
			String filename = CommonUtil.getNewFilename(orginalName);

			//获取文件流
			InputStream is = file.getInputStream();
			if (!CommonUtil.isEmpty(is)) {
				//拼接路径
				String url = dir + "/" +uuid +"/" + filename;
				//上传FTP
				Boolean bool = FtpUtil.uploadSingleImage(url, is);
				if (bool) {
					//保存到附件表
					ProductAttachmentEntity pae = new ProductAttachmentEntity();
					String proattuuid = UuidUtil.generateUUID();
					pae.setCreatetime(new Date());
					pae.setKeyid(uuid);
					pae.setName(orginalName);
					pae.setUrl(url);
					pae.setStatus(1);
					pae.setAttachmenttype(0);
					pae.setUuid(proattuuid);
					pae.setFilemodule(type);
					iProductAttachmentBusiness.insertProductAttachment(pae);
					
					//设置数据
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("uuid",uuid);
					//拼接图片访问路径
					String urlstr = ImageUtils.getImageUrl("/"+url);
					map.put("url", urlstr);
					
					//设置主键
					map.put("uuid",proattuuid);
					
					this.writeJson("returned",map);
				}else{
					this.writeJson("returned",ConstantUtil.RETURN_FAIL);
				}
			} else {
				this.writeJson("returned",ConstantUtil.RETURN_FAIL);
			} 

		} catch (IOException e) {
			this.writeJson("returned",ConstantUtil.RETURN_FAIL);
			e.printStackTrace();
		}
	}
	
	/**
	 * 创 建 人：  yichuan
	 * 日     期：  2015年8月20日下午3:00:00
	 * 描     述：  查询所有产品
	 * @param file
	 * @param uuid
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/product/getProductList.html")
	public void getProductList(Long sortid , Integer pageindex,Integer pagesize ) {
		try {
			List<Long> classIds = new ArrayList<Long>();
			//根据父id 查询 分类 信息
			if(sortid != null){
				BusinessData<ProductCategoryEntity> clazz =  iProductCategoryBusiness.selectProCateByParentId(sortid);
				//处理数据
				if(!CommonUtil.isEmpty(clazz.getList())){
					//不为空   取出 子id
					for(ProductCategoryEntity productCategoryEntity : clazz.getList()){
						classIds.add(productCategoryEntity.getId());
					}
				}else{
					//为空 本体作为子id 
					classIds.add(sortid);
				}
			}
			//查询产品数据
			BusinessData<ProductEntity> bdue = iProductBusiness.selectProductByIsDel(2, pageindex, pagesize, classIds, null, null, null);
			
			//处理数据
			List<ProductEntity> prolist = bdue.getList();
			List<Map<String,Object>> listmap = ListMapUtil.convertListEntityToListMap(prolist);
			
			for (Map<String, Object> map : listmap) {

				//查询商品封面(附件表中的主图片)
				BusinessData<ProductAttachmentEntity> bdentity = iProductAttachmentBusiness.selectProductAttachmentBykey(true, map.get("uuid").toString(),ConstantUtil.PRO_FILE_PROINFO);
				ProductAttachmentEntity proatt = null;
				if (!CommonUtil.isEmpty(bdentity) && !CommonUtil.isEmpty(bdentity.getList())) { 
					if (bdentity.getList().size()>0) {
						proatt = bdentity.getList().get(0);
					}
				}
				//处理商品图片
				if (!CommonUtil.isEmpty(proatt)) {
					String url = ImageUtils.getImageUrl(proatt.getUrl());
					map.put("logo", url); 
				} else {
					map.put("logo", ConstantUtil.FTP_NOTRESOURCE_DEFAULT); //这儿处理默认图片
				}
				//处理商品名称
				if (!CommonUtil.isEmpty(map)) {
					String title = (String) map.get("namecn");
					map.put("title", title); 
				} 
				//处理id  将uuid 赋值给 id 
				map.put("id",map.get("uuid"));
			}
			this.writeJson(listmap);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
