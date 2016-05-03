package com.bhe.controller.web.product;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.order.IOrderBusiness;
import com.bhe.business.order.IOrderCartBusiness;
import com.bhe.business.order.IOrderDetailBusiness;
import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBrandBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.product.IProductCategoryBusiness;
import com.bhe.business.product.IProductFilterBusiness;
import com.bhe.business.product.IProductInquiriesBusiness;
import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.business.user.IUserAddressBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.controller.web.CommonController;
import com.bhe.dao.mybatis.model.OrderCartEntity;
import com.bhe.dao.mybatis.model.OrderDetailEntity;
import com.bhe.dao.mybatis.model.OrderEntity;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.ProductFilterEntity;
import com.bhe.dao.mybatis.model.ProductInquiriesEntity;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.StringUtil;

/**
 * 
 * 创 建 人： Dengpeng 
 * 日     期： 2015年8月13日下午5:42:27
 * 描     述：商品相关
 */
@Controller
public class ProductController extends BaseController{
	
	@Autowired
	private CommonController commonController;
	
	@Autowired
	private IProductBusiness iProductBusiness;
	
	@Autowired
	private IProductAttachmentBusiness iProductAttachmentBusiness;
	
	@Autowired
	private ISysResourceBusiness iSysResourceBusiness;
	
	@Autowired
	private IProductCategoryBusiness iProductCategoryBusiness;
	
	@Autowired
	private IProductBrandBusiness iProductBrandBusiness;
	
	@Autowired
	private IOrderCartBusiness iOrderCartBusiness;

	@Autowired
	private IOrderBusiness iOrderBusiness;
	
	@Autowired
	private IUserAddressBusiness iUserAddressBusiness;
	
	@Autowired
	private IProductInquiriesBusiness iProductInquiriesBusiness;

	@Autowired
	private IOrderDetailBusiness iOrderDetailBusiness;
	
	@Autowired
	private IProductFilterBusiness iProductFilterBusiness;
	
	/**
	 * @author:Dengpeng
	 * @date: 2015年8月20日上午10:10:54
	 * @description: 产品列表页面 ，根据不同参数 跳转不同页面
	 * @param model
	 * @param code
	 * @param pfeParam  当前选中的筛选信息
	 * @return
	 * <br>-----------------------------<br>
	 * @update: 
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/productList.html")
	public ModelAndView productList(Model model,@RequestParam String code,Integer pid, Integer cid){
		model.addAttribute("pid",pid);
		model.addAttribute("cid",cid);
		model.addAttribute("code", code);
		BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode(code);
		if(null!=sysResBd.getT()){
			String picurl = sysResBd.getT().getPicurl();
			model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
			List<ProductCategoryEntity> cateList = iProductCategoryBusiness.selectProCateByResId(sysResBd.getT().getId(),true).getList();
			model.addAttribute("cateList",cateList);
			BusinessData<ProductEntity> recomendBd = iProductBusiness.selectProductByShowType(ConstantUtil.WEB_NAV_RECOMENDPRODUCT, 1, 1, 4); // 推荐产品
			List<Map<String, Object>> recomendListMap = commonController.getProductElseInfo(recomendBd.getList());
			model.addAttribute("recomendList",recomendListMap);
			return forwardPage("web/product/productList");	
		}else{
			return forwardPage("err/404");	
		}
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月17日下午4:13:12
	 * @description:获取左侧导航栏
	 * @param parentId
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/getChildTree.html",method=RequestMethod.POST)
	public void getChildTree(@RequestParam Integer parentId){
		this.writeJson(iProductCategoryBusiness.selectProCateByParentId(parentId).getList());
	}
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月29日下午2:19:47
	 * @description:  跳转到搜索页面
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/toAllSearch.html")
	public ModelAndView toAllSearch(Model model){
		return forwardPage("web/product/productSearchList");	
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月17日下午4:13:30
	 * @description:获取产品列表
	 * @param map
	 * @param id
	 * @param pageIndex
	 * @param pageSize
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/getProductList.html",method=RequestMethod.POST)
	public void getProductList(@RequestParam Map<String,Object> map, @RequestParam Long id, Integer pageIndex,
			Integer pageSize, String param){
			if (null == pageIndex) {
				pageIndex=0;
			}else if(pageIndex>=1){
				pageIndex=pageIndex-1;
			}
			if (null == pageSize) {
				pageSize=9;
			}

			try {
				//生成sql
				StringBuffer sb = new StringBuffer();
				
				//处理已经筛选的导航
				List<Map<String, Object>> fileterlistmap = null;

				//根据分类查询筛选导航信息
				List<Map<String, Object>> pfelistmap = null;
				if (!CommonUtil.isEmpty(param) && !"[]".equals(param)) {
					fileterlistmap = JsonUtil.readJson2ListMap(param);
					if (!CommonUtil.isEmpty(fileterlistmap)) {
						for (Map<String, Object> filemap : fileterlistmap) {
							String state = filemap.get("state").toString();  //状态
							String filename = filemap.get("fileName").toString();  //字段名称
							if ("1".equals(state)) {  //固定的值
								String value = filemap.get("value").toString();  //固定的值
								sb.append(" and "+ filename +" = '"+ value +"'");
							} else { //范围
								String minvalue = filemap.get("minvalue").toString();  //最大值
								String maxvalue = filemap.get("maxvalue").toString();  //最小值

								sb.append(" and "+ filename +" >= "+ minvalue +" and "+ filename +" <= "+ maxvalue);
							}
						}
					}
				} else {
					if (!CommonUtil.isEmpty(id)) {
						String cidstr = id.toString();
						Long loncidstr = Long.valueOf(cidstr);
						BusinessData<List<Map<String, Object>>> listobj = iProductFilterBusiness.selectGroupPEByCateid(cidstr);
						pfelistmap = listobj.getT();
						for (Map<String, Object> pfemap : pfelistmap) {
							Object obj = pfemap.get("name");  //取出标题
							//判断当前分类是否已经选中
							List<ProductFilterEntity> pfelist = null;
							
							if (!CommonUtil.isEmpty(obj)) {
								String name = obj.toString();
								BusinessData<List<ProductFilterEntity>> pfelistbd = iProductFilterBusiness.selectPEByName(loncidstr, name);
								if (!CommonUtil.isEmpty(pfelistbd)) {
									pfelist = pfelistbd.getT();
								} 
							}
							
							List<Map<String, Object>> listmap = ListMapUtil.convertListEntityToListMap(pfelist);
							pfemap.put("pfelist", listmap);
						}
						
					}
				}
				
				List<Map<String, Object>> searchparams = JsonUtil.readJson2ListMap(map.get("searchparam").toString());
				
				if(searchparams.size() != 0){
					
					String pricemin = (String) searchparams.get(0).get("pricemin");
					String pricemax = (String) searchparams.get(0).get("pricemax");
					String productname = (String) searchparams.get(0).get("productname");
					if(!CommonUtil.isEmpty(pricemin)){
						sb.append(" and price >= "+pricemin+"");
					}
					if(!CommonUtil.isEmpty(pricemax)){
						sb.append(" and price <= "+pricemax+"");
					}
					if(!CommonUtil.isEmpty(productname)){
						sb.append(" and namecn like '%"+productname+"%'");
					}
				}
				
				

				BusinessData<Map<String, Object>> productBd = iProductBusiness.selectProductByClazzId(sb.toString(), id, 1, pageIndex, pageSize);
				List<Map<String, Object>> productListMap = null;
				if (!CommonUtil.isEmpty(productBd.getList())) {
					List<Map<String, Object>>  products = productBd.getList();
					productListMap = commonController.getProductElseInfomap(products);
					productBd.setList(null);
					productBd.setT(null);
					map.put("productBd", productBd);
				}

				map.put("fileterlistmap", fileterlistmap);
				map.put("pfelistmap",pfelistmap);
				map.put("productListMap", productListMap);
			} catch (Exception e) {
				//  Auto-generated catch block
				e.printStackTrace();
			}
			this.writeJson(map);
	}

	/**
	 * @author: Dengpeng
	 * @date: 2015年8月18日下午5:19:35
	 * @description:根据产品 获取左侧导航
	 * @param model
	 * @param entity
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public ModelAndView getLeftNav(Model model,ProductEntity entity){
		BusinessData<ProductCategoryEntity> cateEntity = iProductCategoryBusiness.selectProductCategoryById(entity.getClazzid());//获取所属子分类
		model.addAttribute("cateEntity", cateEntity.getT());
		
		BusinessData<ProductCategoryEntity> brotherCateList = iProductCategoryBusiness.selectProCateByParentId(cateEntity.getT().getParentid());//同级分类
		model.addAttribute("brotherCateList", brotherCateList.getList());
		
		BusinessData<ProductCategoryEntity> parentCate = iProductCategoryBusiness.selectProductCategoryById(cateEntity.getT().getParentid());//获取父级分类,获取栏目ID
		BusinessData<ProductCategoryEntity> cateList = iProductCategoryBusiness.selectProCateByResId(parentCate.getT().getResourceid(),true);
		BusinessData<SysResourceEntity> resourceBd = iSysResourceBusiness.selectSysResid(parentCate.getT().getResourceid().intValue());
		
		model.addAttribute("code",resourceBd.getT().getCode());
		model.addAttribute("cateList",cateList.getList());
		
		
		return forwardPage("web/product/productList");
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月18日下午1:47:20
	 * @description: 获取商品详情
	 * @param model
	 * @param uuid
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/productDetail.html")
	public ModelAndView productDetail(Model model,@RequestParam String uuid){
		model.addAttribute("uuid", uuid);
		BusinessData<ProductEntity> recomendBd = iProductBusiness.selectProductByShowType(ConstantUtil.WEB_NAV_RECOMENDPRODUCT, 1,1, 4); // 推荐产品
		List<Map<String, Object>> recomendListMap = commonController.getProductElseInfo(recomendBd.getList());
		model.addAttribute("recomendList",recomendListMap);
		
		ProductEntity entity = iProductBusiness.selectProInfoByUuid(uuid).getT();
		if(null!=entity){
			getLeftNav(model, entity);
			Map<String, Object> productInfoMap = commonController.getProductElseInfo(entity);
			model.addAttribute("productInfoMap",productInfoMap);
			BusinessData<ProductAttachmentEntity> attachmentBd = iProductAttachmentBusiness.selectProductAttachmentBykey(false, uuid,ConstantUtil.PRO_FILE_PROINFO);
			model.addAttribute("imgList", commonController.imgOperation(attachmentBd.getList()));
			
			BusinessData<ProductAttachmentEntity> downloadBd = iProductAttachmentBusiness.selectProductAttachmentBykey(false, uuid,ConstantUtil.PRO_FILE_SPEC);
			model.addAttribute("downloadList", commonController.imgOperation(downloadBd.getList()));
			
			model.addAttribute("productDetail", iProductBusiness.selectProDetailByUuid(uuid).getT());
			
			BusinessData<ProductEntity> otherProductBd = iProductBusiness.selectOtherProductByClazzId(entity.getId(), entity.getClazzid(),1 ,1, 4);//获取4个同类产品
			
			model.addAttribute("otherProductList",otherProductBd.getList());
			
		}
		
		return forwardPage("web/product/productDetail");
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月21日上午11:59:48
	 * @description:添加购物车
	 * @param map
	 * @param uuid
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/addToCar.html",method=RequestMethod.POST)
	public void addToCar(Map<String,Object> map,@RequestParam String uuid){
	
		UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		if(null==user){
			map.put("result", 0);
		}else{
			BusinessData<OrderCartEntity> orderCarBd = iOrderCartBusiness.selectOrderByUuid(uuid, user.getUuid());
			if(orderCarBd.getT()!=null){//已存在该产品
				OrderCartEntity orderCar = orderCarBd.getT();
				orderCar.setCount(orderCar.getCount()+1);
				if(iOrderCartBusiness.updateOrderByKey(orderCar).getState()){
					map.put("result", 1);
				}else{
					map.put("result", 2);
				}
			}else{
				OrderCartEntity orderCar = new OrderCartEntity();
				orderCar.setCount(1);
				orderCar.setCreateuser(user.getUuid());
				orderCar.setCreatetime(new Date());
				orderCar.setProductid(uuid);
				if(iOrderCartBusiness.insertOrderByBeach(orderCar).getState()){
					map.put("result", 1);
				}else{
					map.put("result", 2);
				}
			}
		}
		this.writeJson(map);
	}
	
	
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月20日上午10:27:16
	 * @description:购物车
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/buyProductCar.html")
	public ModelAndView buyProductCar(Model model){
		UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		if(null==user){
			return forwardPage("web/user/login");
		}else{
			List<OrderCartEntity> list = iOrderCartBusiness.selectAll(user.getUuid()).getList();
			List<Map<String, Object>> carListMap;
			List<Map<String, Object>> productListMap = new ArrayList<Map<String,Object>>();
			try {
				carListMap = ListMapUtil.convertListEntityToListMap(list);
				for (Map<String, Object> map : carListMap) {
					BusinessData<ProductEntity> productBd = iProductBusiness.selectProInfoByUuid(map.get("productid").toString());
					ProductEntity entity = productBd.getT();
					map.put("productName", entity.getNamecn());
					map.put("price", entity.getPrice());
					map.put("unit", entity.getUnit());
					map.put("productMaxCount", entity.getCount());
					Map<String, Object> elseInfoMap = commonController.getProductElseInfo(entity);
					map.put("productImgurl", elseInfoMap.get("productImgurl"));
					productListMap.add(map);
				}
				model.addAttribute("productListMap",productListMap );
				
			} catch (Exception e) {
				log.error(e);
			}
			return forwardPage("web/product/buyProductCar");
		}
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月28日下午3:20:24
	 * @description:删除购物车
	 * @param map
	 * @param uuid
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/delBuyCarPro.html")
	public void delBuyCarPro(Map<String,Object> map,@RequestParam String uuid){
		UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		if(null==user){
			map.put("result", 0);
		}else{
			if(iOrderCartBusiness.deleteOrderBySelective(uuid, user.getUuid()).isSuccess()){
				map.put("result", 1);
			}else{
				map.put("result", 2);
			}
		}
		this.writeJson(map);
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月27日下午2:23:05
	 * @description: 我要询价
	 * @param map
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/inquireProduct.html",method=RequestMethod.POST)
	public void inquireProduct(Model model,@RequestParam Map<String, String> map){
		ProductInquiriesEntity entity = new ProductInquiriesEntity();
		entity.setUsername(map.get("userName"));
		entity.setTel(map.get("tel"));
		entity.setPosition(map.get("position"));
		entity.setFirmname(map.get("firmName"));
		entity.setSex(Integer.parseInt(map.get("sex")));
		entity.setState(0);
		entity.setUuid(map.get("uuid"));
		entity.setContent(map.get("content"));
		if(iProductInquiriesBusiness.insertProductInquiries(entity).isSuccess()){
			this.writeJson("result",true);
		}else{
			this.writeJson("result",false);
		}
	}
	
	
	@RequestMapping(value="/web/product/compareProduct.html")
	public ModelAndView compareProduct(Model model,@RequestParam String uuids){
		try { 
			BusinessData<ProductEntity> recomendBd = iProductBusiness.selectProductByShowType(ConstantUtil.WEB_NAV_RECOMENDPRODUCT, 1,1, 4); // 推荐产品
			List<Map<String, Object>> recomendListMap = commonController.getProductElseInfo(recomendBd.getList());
			Map<String, Object> map = new HashMap<String, Object>();
			
			model.addAttribute("recomendList",recomendListMap);
			
			String[] uuidstr = uuids.split(",");
			for(int i = 0; i < uuidstr.length; i++){
				ProductEntity entity = iProductBusiness.selectProInfoByUuid(uuidstr[i]).getT();
				Map<String, Object> entitymap = ListMapUtil.convertEntityToMap(entity);
				
				if(null!=entity){
					getLeftNav(model, entity);
				}
				//处理品牌
				Long brandid = entity.getBrandid();
				BusinessData<ProductBrandEntity> brand = iProductBrandBusiness.selectByid(brandid);
				if(!CommonUtil.isEmpty(brand)){
					ProductBrandEntity brandentity = brand.getT();
					entitymap.put("brandname", brandentity.getNamecn());
				}
				//处理图片
				String idstr = entity.getUuid();
				String url = "";
				BusinessData<ProductAttachmentEntity>  proatt = iProductAttachmentBusiness.selectProductAttachmentBykey(true, idstr, ConstantUtil.PRO_FILE_PROINFO);
				if (!CommonUtil.isEmpty(proatt)) {
					List<ProductAttachmentEntity> paelist = proatt.getList();
					if (!CommonUtil.isEmpty(paelist) && paelist.size() > 0) {
						ProductAttachmentEntity pae = paelist.get(0);
						url = ImageUtils.getImageUrl(pae.getUrl());
					}
					entitymap.put("url", url);
				}
				//处理空字段
				for(String key : entitymap.keySet()){
					if(CommonUtil.isEmpty(entitymap.get(key)) || "".equals(entitymap.get(key))){
						entitymap.put(key, "-");
					}
				}
				map.put("entity"+(i+1), entitymap);
			}
			model.addAttribute("map", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("web/product/compareProduct");
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月21日下午2:15:34
	 * @description:跳转填写地址页面
	 * @param model
	 * @param map
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/confirm_order.html",method=RequestMethod.POST)
	public ModelAndView confirm_order(Model model,@RequestParam String valueMap,@RequestParam String rentOrBuy){
		UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		if(null==user){
			return forwardPage("web/user/login");
		}else{
			model.addAttribute("rentOrBuy",rentOrBuy);
			model.addAttribute("valueMap",valueMap );
			List<Map<String, Object>> listMap = JsonUtil.readJson2ListMap(valueMap); 
			List<Map<String, Object>> productListMap = new ArrayList<Map<String,Object>>();
			double sumAll=0L;
			for (Map<String, Object> map : listMap) {
				BusinessData<ProductEntity> productBd = iProductBusiness.selectProInfoByUuid(map.get("uuid").toString());
				ProductEntity entity = productBd.getT();
				map.put("id", entity.getId());
				map.put("productName", entity.getNamecn());
				map.put("price", entity.getPrice());
				map.put("unit", entity.getUnit());
				map.put("productMaxCount", entity.getCount());
				int count =Integer.parseInt( map.get("count").toString());
				double sum = entity.getPrice().multiply(new BigDecimal(count)).doubleValue();
				sumAll=sumAll+sum;
				map.put("sum",sum);
				Map<String, Object> elseInfoMap = commonController.getProductElseInfo(entity);
				map.put("productImgurl", elseInfoMap.get("productImgurl"));
				productListMap.add(map);
			}
				
			model.addAttribute("sumAll",sumAll );
			model.addAttribute("productListMap",productListMap);
		
			BusinessData<UserAddressEntity> userAddressList = iUserAddressBusiness.selectAllUserAddress(user.getUuid());
			model.addAttribute("userAddressList",userAddressList.getList() );
				
			return forwardPage("web/product/confirm_order");
		}
	}
	
	
	
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月21日下午1:57:07
	 * @description:下订单
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/saveOrder.html",method=RequestMethod.POST)
	public void saveOrder(Model model,@RequestParam String valueMap,@RequestParam String otherInfo){
		Map<String,Integer> resultMap =  new HashMap<String, Integer>();
		UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		List<Map<String, Object>> valueListMap = JsonUtil.readJson2ListMap(valueMap);
		Map<String, Object> otherInfoMap = JsonUtil.readJson2Map(otherInfo);
		if(null==user){
			resultMap.put("result", 0);
		}else{
			BusinessData<UserAddressEntity> addressBd = iUserAddressBusiness.selectUserAddressById(Long.parseLong(otherInfoMap.get("addressId").toString()));
			UserAddressEntity address =addressBd.getT();
			if(address==null){
				resultMap.put("result", 0);
				this.writeJson(resultMap);
				return;
			}
			OrderEntity order = new OrderEntity();
			if("buy".equals(otherInfoMap.get("rentOrBuy").toString())){
				order.setOrdertype(0);
			}else if("rent".equals(otherInfoMap.get("rentOrBuy").toString())){
				order.setOrdertype(1);
			}else{
				resultMap.put("result", 0);
				this.writeJson(resultMap);
				return;
			}
			Random r = new Random();
			long currentTime = System.currentTimeMillis();
			SimpleDateFormat formatter = new SimpleDateFormat("MMddHHmm");
			Date date = new Date(currentTime);
			String orderCode="OD"+formatter.format(date)+r.nextInt(99);
			order.setOrderno(orderCode);
			order.setUserid(user.getUuid());
			order.setBuyername(address.getUsername());
			order.setBuyerphone(address.getPhone());
			order.setBuyermobile(address.getMobile());
			order.setProvince(address.getProvince());
			order.setCity(address.getCity());
			order.setDistricts(address.getAddress());
			order.setLeavemsg(otherInfoMap.get("detailContent").toString());
			order.setCreatetime(new Date());
			order.setAuditstatus(0);
			String totlePrice = otherInfoMap.get("totalPrice").toString().replaceAll(",", "");
			order.setTotalprice(new BigDecimal(totlePrice));
			order.setPayprice(new BigDecimal(totlePrice));
			order.setPaystatus(0);
			
			if(iOrderBusiness.insertOrder(order).getState()){
				for (Map<String, Object> map : valueListMap) {
					OrderDetailEntity entity = new OrderDetailEntity();
					entity.setOrdercode(orderCode);
					entity.setProductid(Long.parseLong(map.get("pid").toString()));
					entity.setPrice(new BigDecimal(map.get("price").toString()));
					entity.setCount(Integer.parseInt(map.get("count").toString()));
					if("rent".equals(otherInfoMap.get("rentOrBuy").toString())){
						entity.setRenttime(Integer.parseInt(map.get("rentTime").toString()));
						entity.setRentunit(map.get("rentUnit").toString());
					}
					entity.setUserid(user.getId());
					entity.setProductname(map.get("productName").toString());
					if(iOrderDetailBusiness.insertOrderDetail(entity).getState()){
						OrderCartEntity car = new OrderCartEntity();
						car.setProductid(map.get("uuid").toString());
						car.setCreateuser(user.getUuid());
						iOrderCartBusiness.deleteOrderBySelective(map.get("uuid").toString(), user.getUuid());
						//库存修改
						//ProductEntity product = new ProductEntity();
						
						
					}
				}
				resultMap.put("result", 1);
			}else{
				resultMap.put("result", 0);
			}
		}
		this.writeJson(resultMap);
	}
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月21日下午2:33:50
	 * @description:保存，添加收货地址
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/product/updateShippingAddress.html",method=RequestMethod.POST)
	public void  updateShippingAddress(@RequestParam Map<String,String> map,String id){
		//{province=天津市, city=天津市, districts=河东区, username=, zipCode=, phone=区号-电话号码-分机号, mobile=, address=, isDefault=0}
		Map<String,Integer> resultMap =  new HashMap<String, Integer>();
		UserEntity user = (UserEntity) this.getAttribute(ConstantUtil.SESSION_LOGIN_BEFOREUSER);
		if(null==user){
			resultMap.put("result", 0);
		}else{
				UserAddressEntity address = new UserAddressEntity();
				address.setProvince(map.get("province"));
				address.setCity(map.get("city"));
				address.setDistricts(map.get("districts"));
				address.setAddress(map.get("address"));
				address.setUserkey(user.getUuid());
				address.setUsername(map.get("username"));
				address.setMobile(map.get("mobile"));
				address.setPhone(map.get("phone"));
				address.setZipcode(map.get("zipCode"));
				address.setIsdefault(Integer.parseInt(map.get("isDefault")));
				
			if(StringUtil.isNull(id)){
				BusinessData<UserAddressEntity> allUserAddress = iUserAddressBusiness.selectAllUserAddress(user.getUuid());
				if(allUserAddress.getCount() < ConstantUtil.DIGITAL_SIX){
					if(address.getIsdefault() == 1){
						iUserAddressBusiness.updateIsDefaultToClear(user.getUuid());
					}
					BusinessData<Boolean> userAddressByBeach = iUserAddressBusiness.insertUserAddressByBeach(address);
					if(userAddressByBeach.getState()){
						resultMap.put("result", 1);
					}
				}else {
					resultMap.put("result", -1);
				}
			}else{
				address.setId(Long.parseLong(id));
				if(address.getIsdefault() == 1){
					iUserAddressBusiness.updateIsDefaultToClear(user.getUuid());
				}
				BusinessData<Boolean> data = iUserAddressBusiness.updateUserAddressByKey(address);
				if(data.isSuccess()){
					resultMap.put("result", 1);
				}else {
					resultMap.put("result", 0);
				}
			}
		}
		this.writeJson(resultMap);
		
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月21日下午5:20:55
	 * @description:					合作品牌
	 * @param model
	 * @param code						合作品牌英文名称
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/web/product/toCooperationBran.html")
	public ModelAndView toCooperationBran(Model model,String code) {
		
		BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode("companyprofile");
		if (null != sysResBd.getT()) {
			String picurl = sysResBd.getT().getPicurl();
			model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
		}
		
		BusinessData<ProductBrandEntity> productBrandByIsShow = iProductBrandBusiness.selectProductBrandByIsShow(1, null, null, "rank", "desc");
		
		model.addAttribute("entityList", productBrandByIsShow.getList());
		model.addAttribute("code", code);
		
		return forwardPage("/web/product/cooperationbrand");
	}
	
	
}
