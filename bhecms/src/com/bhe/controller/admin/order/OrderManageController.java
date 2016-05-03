package com.bhe.controller.admin.order;


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
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.order.IOrderBusiness;
import com.bhe.business.order.IOrderDetailBusiness;
import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.OrderDetailEntity;
import com.bhe.dao.mybatis.model.OrderEntity;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.DateUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.StringUtil;

/**
 * 订单管理模块
 * @author DP
 * @date 2015年7月24日下午3:14:30
 */

@Controller
public class OrderManageController extends BaseController{

	@Autowired
	private IOrderBusiness orderBusiness;
	
	@Autowired
	private IOrderDetailBusiness orderDetailBusiness;
	
	@Autowired
	private IUserBusiness userBusiness;
	
	@Autowired
	private IProductBusiness iProductBusiness;
	
	@Autowired
	private IProductAttachmentBusiness iProductAttachmentBusiness;
	
	/**
	 * 
	 * @description ：订购订单首页 
	 * @author：  
	 * @date ：  2015年8月5日上午10:24:44
	 * @param model
	 * @return ModelAndView
	 * <br>-----------------------------<br>
	 * @editor： 
	 * @date： 
	 * @description： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/orderIndex.html")
	public ModelAndView orderIndex(Model model ,@RequestParam Map<String,Object> requestMap,String orderCode, Integer pageIndex, Integer pageSize,Integer auditStatus,
			String beginDate,String endDate){
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "5");
		model.addAttribute("frameLeft", "admin/order/left.html");
		model.addAttribute("currIndex","1");
		model.addAttribute("beginDate", beginDate);
		model.addAttribute("endDate", endDate);
		model.addAttribute("orderCode", orderCode);
		model.addAttribute("auditStatus", auditStatus);
		return commonIndex(model, requestMap, orderCode, pageIndex, pageSize, auditStatus,0,beginDate,endDate);
	}
	

	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月10日上午10:23:53
	 * 描     述：租赁订单首页
	 * @param model
	 * @param entity
	 * @param pageIndex
	 * @param pageSize
	 * @param auditStatus 筛选 订单状态
	 * @param startTime endTime 筛选 下单时间 限制
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/leaseOrderIndex.html")
	public ModelAndView leaseOrderIndex(Model model ,@RequestParam Map<String,Object> requestMap,String orderCode, Integer pageIndex, Integer pageSize,Integer auditStatus,
			String beginDate,String endDate){
		model.addAttribute("frameLeft", "admin/order/left.html");
		model.addAttribute("currIndex","2");
		model.addAttribute("beginDate", beginDate);
		model.addAttribute("endDate", endDate);
		model.addAttribute("orderCode", orderCode);
		model.addAttribute("auditStatus", auditStatus);
		return commonIndex(model, requestMap, orderCode, pageIndex, pageSize, auditStatus,1,beginDate,endDate);
		
	}
	
	@RequestMapping("/admin/order/checkOrderTime.html")
	public void checkTime(String beginDate,String endDate){
		Map<String, String> map = new HashMap<String, String>();
		if(!CommonUtil.isEmpty(beginDate) && !CommonUtil.isEmpty(endDate)){
			Date beginTime = DateUtil.str2Date(beginDate);
			Date endTime= DateUtil.str2Date(endDate);
			if(beginTime.getTime()>endTime.getTime()){
				map.put("status", ConstantUtil.RETURN_FAIL);
			}else{
				map.put("status", ConstantUtil.RETURN_SUCCESS);
			}
		}
		this.writeJson(map);
		
	}

	/**
	 * 创 建 人：  首页公共方法
	 * 日     期：  2015年8月11日下午4:28:01
	 * 描     述：
	 * @param model
	 * @param requestMap
	 * @param orderCode
	 * @param pageIndex
	 * @param pageSize
	 * @param auditStatus
	 * @param orderType
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private ModelAndView commonIndex(Model model , Map<String,Object> requestMap,String orderCode, Integer pageIndex, Integer pageSize,Integer auditStatus,Integer orderType,String beginDate,String endDate){
		requestMap.put("orderType", orderType);//根据这个状态区分订单类型
		try {
			if(!StringUtil.isNull(beginDate)){
				Date begin = DateUtil.str2Date(beginDate);
				requestMap.put("beginDate", begin);
			}else{
				if(requestMap.containsKey("beginDate")){
					requestMap.remove("beginDate");
				}
			}
			if(!StringUtil.isNull(endDate)){
				Date end = DateUtil.str2Date(endDate);
				requestMap.put("endDate", end);
			}else{
				if(requestMap.containsKey("endDate")){
					requestMap.remove("endDate");
				}
				
			}
			if(StringUtil.isNull(orderCode)){
				if(requestMap.containsKey("orderCode")){
					requestMap.remove("orderCode");
				}
			}
			if (null == pageIndex || 0 == pageIndex) {
				pageIndex = 1;
			}
			if (null == pageSize) {
				pageSize = 15;
			}
			if (null == auditStatus || auditStatus == -1) {
				if(requestMap.containsKey("auditStatus")){
					requestMap.remove("auditStatus");
				}
			}
			if (requestMap.containsKey("startTime")&& requestMap.containsKey("endTime")) { // 根据日期筛选
				requestMap.put("startTime", DateUtil.str2Date(requestMap.get("startTime").toString()));
				requestMap.put("endTime", DateUtil.str2Date(requestMap.get("endTime").toString()));
			}
			
			BusinessData<OrderEntity> orderEntityBD = orderBusiness.selectOrderByEntityMap(requestMap, pageIndex, pageSize);//获取订单列表
			List<Map<String, Object>> listMap =  ListMapUtil.convertListEntityToListMap(orderEntityBD.getList());//转换为Listmap结构
			for(Map<String, Object> map : listMap){ //循环订单列表
				List<Map<String, Object>>  detailDataListMap =new ArrayList<Map<String,Object>>();
				
				BusinessData<OrderDetailEntity> orderDetail = orderDetailBusiness.selectOrderDetailByOrderCode(map.get("orderno").toString());//获取订单详情列表
				List<Map<String, Object>> detailListMap =  ListMapUtil.convertListEntityToListMap(orderDetail.getList());
				double totlePrice=0L;
				for (Map<String, Object> entity : detailListMap) {
					BusinessData<ProductEntity> proInfo = iProductBusiness.selectProInfo((Long)entity.get("productid"));
					ProductEntity pro =  proInfo.getT();
					//System.out.println(entity.get("price")+"==="+entity.get("count"));
					//价格统计
					totlePrice=totlePrice+(new BigDecimal(entity.get("price").toString())
																						.multiply(new BigDecimal(entity.get("count").toString()==null?"1":entity.get("count").toString()))
																						.longValue());
					entity.put("uuid", pro.getUuid());//商品UUID
					entity.put("productName", pro.getNamecn());//商品名称
					entity.put("modelName", pro.getModelname());//商品型号
					
					BusinessData<ProductAttachmentEntity> bdentity = iProductAttachmentBusiness.selectProductAttachmentBykey(true, pro.getUuid(),ConstantUtil.PRO_FILE_PROINFO);//获取商品图片信息
					ProductAttachmentEntity proatt = null;
					if (!CommonUtil.isEmpty(bdentity) && !CommonUtil.isEmpty(bdentity.getList())) { 
						if (bdentity.getList().size()>0) {
							proatt = bdentity.getList().get(0);
						}
					}
					
					//处理商品图片
					if (!CommonUtil.isEmpty(proatt)) {
						String url = ImageUtils.getImageUrl(proatt.getUrl());
						entity.put("imgurl", url); 
					} else {
						entity.put("imgurl", ConstantUtil.FTP_NOTRESOURCE_DEFAULT); //这儿处理默认图片
					}
					
					detailDataListMap.add(entity);
				}
				map.put("totlePrice", totlePrice);
				map.put("detailDataListMap", detailDataListMap);
				
				BusinessData<UserDetailEntity>  userDetailBD = userBusiness.selectUserDetailByuuid(map.get("userid").toString());//获取买家信息
				map.put("userName", userDetailBD.getT().getNamecn());
			}
			model.addAttribute("listMap",listMap);//数据信息
			orderEntityBD.setList(null);
			orderEntityBD.setT(null);//清空数据信息 只返回 分页信息
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(orderEntityBD);
			model.addAttribute("pageInfoMap",pageInfoMap);
		} catch (Exception e) {
			log.error(e);
		}
		if(orderType==0){
			return forwardPage("admin/order/orderIndex");
		}else{
			return forwardPage("admin/order/leaseOrderIndex");
		}
	}
	
	 
	
	
	
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月5日下午2:46:21
	 * 描     述：查看订单
	 * @param model
	 * @param orderCode
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/checkOrder.html")
	public ModelAndView checkOrder(Model model ,@RequestParam String orderCode){
		model.addAttribute("currIndex",1);
		model.addAttribute("frameLeft", "admin/order/left.html");
		
		BusinessData<OrderDetailEntity> orderDetail = orderDetailBusiness.selectOrderDetailByOrderCode(orderCode);
		model.addAttribute("orderDetailListCount",orderDetail.getList().size());
		try {
			List<Map<String, Object>> listMap =  ListMapUtil.convertListEntityToListMap(orderDetail.getList());
			for (Map<String, Object> entity : listMap) {
				BusinessData<ProductEntity> proInfo = iProductBusiness.selectProInfo((Long)entity.get("productid"));
				entity.put("productName", proInfo.getT().getNamecn());//商品名称
				entity.put("modelName", proInfo.getT().getModelname());//商品型号
			}
			model.addAttribute("orderDetailMap",listMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		BusinessData<OrderEntity> order = orderBusiness.selectOrderByOrderNo(orderCode, null, null);
		model.addAttribute("order",order.getT());
		BusinessData<UserEntity> userbd = userBusiness.selectUserByuuid(order.getT().getUserid());
		model.addAttribute("userInfo", userbd.getT());
		BusinessData<UserDetailEntity> userDetailBd = userBusiness.selectUserDetailByuuid(order.getT().getUserid());
		model.addAttribute("userDetailInfo", userDetailBd.getT());
		return forwardPage("admin/order/checkOrder");
	}
	
	/**
	 * 创 建 人：  Dengpeng 
	 * 日     期：  2015年8月10日下午2:05:53
	 * 描     述：查看租赁订单
	 * @param model
	 * @param orderCode
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/checkLeaseOrder.html")
	public ModelAndView checkLeaseOrder(Model model ,@RequestParam String orderCode){
		model.addAttribute("currIndex",2);
		model.addAttribute("frameLeft", "admin/order/left.html");
		
		BusinessData<OrderDetailEntity> orderDetail = orderDetailBusiness.selectOrderDetailByOrderCode(orderCode);
		model.addAttribute("orderDetailListCount",orderDetail.getList().size());
		try {
			List<Map<String, Object>> listMap =  ListMapUtil.convertListEntityToListMap(orderDetail.getList());
			for (Map<String, Object> entity : listMap) {
				BusinessData<ProductEntity> proInfo = iProductBusiness.selectProInfo((Long)entity.get("productid"));
				entity.put("productName", proInfo.getT().getNamecn());//商品名称
				entity.put("modelName", proInfo.getT().getModelname());//商品型号
			}
			model.addAttribute("orderDetailMap",listMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		BusinessData<OrderEntity> order = orderBusiness.selectOrderByOrderNo(orderCode, null, null);
		model.addAttribute("order",order.getT());
		BusinessData<UserEntity> userbd = userBusiness.selectUserByuuid(order.getT().getUserid());
		model.addAttribute("userInfo", userbd.getT());
		BusinessData<UserDetailEntity> userDetailBd = userBusiness.selectUserDetailByuuid(order.getT().getUserid());
		model.addAttribute("userDetailInfo", userDetailBd.getT());
		return forwardPage("admin/order/checkLeaseOrder");
	}
	
	/**
	 * 创 建 人：  DENGPENG
	 * 日     期：  2015年8月5日下午5:40:58
	 * 描     述：
	 * <br>-----------------------------<br>
	 * @param auditresult 审核结果
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/order/updateOrderStatus.html",method=RequestMethod.POST)
	public void updateOrderStatus(@RequestParam Long orderId,@RequestParam String auditresult){
		Map<String, Object> map= new HashMap<String, Object>();
		OrderEntity entity = new OrderEntity();
		entity.setId(orderId);
		if("pass".equals(auditresult)){
			entity.setAuditstatus(1);
		}else{
			entity.setAuditstatus(2);
		}
		map.put("result", orderBusiness.updateOrderByKey(entity).isSuccess());
		this.writeJson(map);
	}
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月10日上午9:36:45
	 * 描     述：查看订单基本信息页面
	 * @param model
	 * @param orderCode
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/orderBasicInfo.html")
	public ModelAndView orderBasicInfo(Model model ,@RequestParam String orderCode){
		model.addAttribute("frameLeft", "admin/order/left.html");
		BusinessData<OrderEntity> order = orderBusiness.selectOrderByOrderNo(orderCode, null, null);
		model.addAttribute("order",order.getT());
		BusinessData<UserEntity> userbd = userBusiness.selectUserByuuid(order.getT().getUserid());
		model.addAttribute("userInfo", userbd.getT());
		model.addAttribute("orderType","buy");
		return forwardPage("admin/order/orderBasicInfo");
	}
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月11日上午11:25:57
	 * 描     述：查看订单基本信息页面 （租赁订单）
	 * @param model
	 * @param orderCode
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/orderLeaseBasicInfo.html")
	public ModelAndView orderLeaseBasicInfo(Model model ,@RequestParam String orderCode){
		model.addAttribute("frameLeft", "admin/order/left.html");
		BusinessData<OrderEntity> order = orderBusiness.selectOrderByOrderNo(orderCode, null, null);
		model.addAttribute("order",order.getT());
		BusinessData<UserEntity> userbd = userBusiness.selectUserByuuid(order.getT().getUserid());
		model.addAttribute("userInfo", userbd.getT());
		model.addAttribute("orderType","lease");
		return forwardPage("admin/order/orderBasicInfo");
	}
	
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月10日下午2:46:25
	 * 描     述：修改基本信息
	 * @param orderId
	 * @param entity
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/order/updateBasicInfo.html",method=RequestMethod.POST)
	public void updateOrderInfo(@RequestParam Long orderId, @RequestParam Map<String, String> map ){
		OrderEntity entity = new OrderEntity();
		entity.setId(orderId);
		entity.setBuyername(map.get("buyername"));
		entity.setBuyerphone(map.get("buyerphone"));
		entity.setBuyermobile(map.get("buyermobile"));
		entity.setAddress(map.get("address"));
		if(map.containsKey("payprice")){
			entity.setPayprice(new BigDecimal(map.get("payprice")));
		}
		entity.setLeavemsg(map.get("leavemsg"));
		this.writeJson("result",orderBusiness.updateOrderByKey(entity));
	}
	
	
	
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月10日上午9:38:31
	 * 描     述：查看订单商品信息页面
	 * @param model
	 * @param orderCode
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/orderProductInfo.html")
	public ModelAndView orderProductInfo(Model model, @RequestParam String orderCode){
		model.addAttribute("frameLeft", "admin/order/left.html");
		BusinessData<OrderDetailEntity> orderDetail = orderDetailBusiness.selectOrderDetailByOrderCode(orderCode);
		BusinessData<OrderEntity> order = orderBusiness.selectOrderByOrderNo(orderCode, null, null);
		model.addAttribute("order",order.getT());
		
		model.addAttribute("orderDetailListCount",orderDetail.getList().size());
		try {
			List<Map<String, Object>> listMap =  ListMapUtil.convertListEntityToListMap(orderDetail.getList());
			for (Map<String, Object> entity : listMap) {
				BusinessData<ProductEntity> proInfo = iProductBusiness.selectProInfo((Long)entity.get("productid"));
				entity.put("productName", proInfo.getT().getNamecn());//商品名称
				entity.put("modelName", proInfo.getT().getModelname());//商品型号
			}
			model.addAttribute("orderDetailMap",listMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		return forwardPage("admin/order/orderProductInfo");
	}
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月11日上午11:22:44
	 * 描     述：查看产品信息
	 * @param model
	 * @param orderCode
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/order/orderLeaseProductInfo.html")
	public ModelAndView orderLeaseProductInfo(Model model, @RequestParam String orderCode){
		model.addAttribute("frameLeft", "admin/order/left.html");
		BusinessData<OrderEntity> order = orderBusiness.selectOrderByOrderNo(orderCode, null, null);
		model.addAttribute("order",order.getT());
		
		BusinessData<OrderDetailEntity> orderDetail = orderDetailBusiness.selectOrderDetailByOrderCode(orderCode);
		model.addAttribute("orderDetailListCount",orderDetail.getList().size());
		try {
			List<Map<String, Object>> listMap =  ListMapUtil.convertListEntityToListMap(orderDetail.getList());
			for (Map<String, Object> entity : listMap) {
				BusinessData<ProductEntity> proInfo = iProductBusiness.selectProInfo((Long)entity.get("productid"));
				entity.put("productName", proInfo.getT().getNamecn());//商品名称
				entity.put("modelName", proInfo.getT().getModelname());//商品型号
			}
			model.addAttribute("orderDetailMap",listMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		
		
		return forwardPage("admin/order/orderLeaseProductInfo");
	}
	
	/**
	 * 创 建 人： Dengpeng
	 * 日     期：  2015年8月10日下午3:01:57
	 * 描     述：修改商品信息
	 * @param orderId
	 * @param countStr
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/order/updateOrderProductInfo.html",method=RequestMethod.POST)
	public void updateOrderProductInfo(Map<String, Object> map,@RequestParam String valueMap){
		List<Map<String, Object>> listMap = JsonUtil.readJson2ListMap(valueMap);
		OrderDetailEntity entity=new OrderDetailEntity();
		int count =0;
		for (int i = 0; i < listMap.size(); i++) {
				entity.setId(Long.parseLong(listMap.get(i).get("id").toString()));
				entity.setCount(Integer.parseInt(listMap.get(i).get("count").toString()));
				if(listMap.get(i).containsKey("renttime")){
					entity.setRenttime(Integer.parseInt(listMap.get(i).get("renttime").toString()));
				}
				
				if(!orderDetailBusiness.updateOrderDetailByKey(entity).isSuccess()){
					count++;
				}
		}
		if(count>0){
			map.put("result",false);
			map.put("count",count);
		}else{
			map.put("result",true);
		}
		this.writeJson(map);
	}
	
	
	
	/**
	 * 创 建 人：  删除订单
	 * 日     期：  2015年8月6日上午9:38:34
	 * 描     述：
	 * @param orderNo
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/order/deleteOrder.html",method=RequestMethod.POST)
	public void deleteOrder(String id,String ids){
		Map<String, Object> map= new HashMap<String, Object>();
		if(null!=id){
			if(orderBusiness.deleteOrderByOrderNo(id).isSuccess()){
				if(orderDetailBusiness.deleteOrderDetailByOrderNo(id).isSuccess()){
					map.put("result",true);
				}else{
					map.put("result",false);
				}
			}else{
				map.put("result",false);
			}
		
		}else if(!StringUtil.isNull(ids)){
			String[] ides = ids.split(",");
			int count=0;
			for (int i = 0; i <ides.length; i++) {
				if(!orderBusiness.deleteOrderByOrderNo(ides[i]).isSuccess()){
					count++;
				}else{
					if(!orderDetailBusiness.deleteOrderDetailByOrderNo(ides[i]).isSuccess()){
						count++;
					}
				}
			}
			if(count>0){
				map.put("result", false);
				map.put("count", count);
			}else{
				map.put("result", true);
			}
		}
		this.writeJson(map);
	}
	
	
		
}
