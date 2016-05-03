package com.bhe.controller.web.user;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.order.IOrderBusiness;
import com.bhe.business.order.IOrderDetailBusiness;
import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.user.IUserAddressBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.business.user.IUserMessageBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.OrderDetailEntity;
import com.bhe.dao.mybatis.model.OrderEntity;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.dao.mybatis.model.UserMessageEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.ListMapUtil;

/**
 * 个人中心
 * 
 * @author: 林
 * @date: 2015年8月24日下午4:04:40
 */
@Controller
public class AccountCenterController extends BaseController {
	
	@Autowired
	private IOrderDetailBusiness orderDetailBusiness;
	@Autowired
	private IOrderBusiness orderBusiness;
	@Autowired
	private IProductBusiness productBusiness;
	@Autowired
	private IProductAttachmentBusiness productAttachmentBusiness;
	@Autowired
	private IUserMessageBusiness userMessageBusiness;
	@Autowired
	private IUserBusiness userBusiness;
	@Autowired
	private IUserAddressBusiness userAddressBusiness;
	
	/**
	 * 进入帐户管理安全设置
	 * @author: 林
	 * @date: 2015年8月24日下午4:44:47
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/toAccountCenter.html")
	public ModelAndView toAccountCenter(Model model) {
		model.addAttribute("currIndex","1");
		UserEntity userEntity = getUserEntity();
		
		model.addAttribute("userentity", userEntity);		
		return forwardPage("web/user/accountcenter");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月24日下午6:45:54
	 * @description:					修改密码
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/doUpdPassword.html")
	public ModelAndView doUpdPassword() {
		//UserEntity userEntity = getUserEntity();
		
		return forwardPage("web/user/accountcenter");
	}
	
	/**
	 * 进入帐户管理订单详情
	 * @author: 林
	 * @date: 2015年8月24日下午4:44:47
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/toOrderForm.html")
	public ModelAndView toOrderForm(Model model,Integer orderType,Integer pageIndex, Integer pageSize) {
		model.addAttribute("currIndex","2");
		UserEntity userEntity = getUserEntity();
		model.addAttribute("userentity", userEntity);
		
		if(CommonUtil.isEmpty(pageIndex)){
			pageIndex = 0;
		}
		if(CommonUtil.isEmpty(pageSize)){
			pageSize = 10;
		}
		Map<String, Object> entityMap = new HashMap<String ,Object>();
		entityMap.put("orderType", orderType);
		entityMap.put("userid", userEntity.getUuid());
		
		BusinessData<OrderEntity> orderByEntityMap = orderBusiness.selectOrderByEntityMap(entityMap, pageIndex, pageSize);
		
		try {
			List<Map<String, Object>> listMap =  ListMapUtil.convertListEntityToListMap(orderByEntityMap.getList());//转换为Listmap结构
			for(Map<String, Object> map : listMap){ //循环订单列表
				List<Map<String, Object>>  detailDataListMap =new ArrayList<Map<String,Object>>();
				
				BusinessData<OrderDetailEntity> orderDetail = orderDetailBusiness.selectOrderDetailByOrderCode(map.get("orderno").toString());//获取订单详情列表
				List<Map<String, Object>> detailListMap =  ListMapUtil.convertListEntityToListMap(orderDetail.getList());
				double totlePrice=0L;
				for (Map<String, Object> entity : detailListMap) {
					BusinessData<ProductEntity> proInfo = productBusiness.selectProInfo((Long)entity.get("productid"));
					ProductEntity pro =  proInfo.getT();
					//System.out.println(entity.get("price")+"==="+entity.get("count"));
					//价格统计
					totlePrice=totlePrice+(new BigDecimal(entity.get("price").toString())
							.multiply(new BigDecimal(entity.get("count").toString()==null?"1":entity.get("count").toString()))
							.longValue());
					entity.put("uuid", pro.getUuid());//商品UUID
					entity.put("productName", pro.getNamecn());//商品名称
					entity.put("modelName", pro.getModelname());//商品型号
					
					BusinessData<ProductAttachmentEntity> bdentity = productAttachmentBusiness.selectProductAttachmentBykey(true, pro.getUuid(),ConstantUtil.PRO_FILE_PROINFO);//获取商品图片信息
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
				model.addAttribute("entityList",listMap);//数据信息
				
			}
		} catch (Exception e) {
			log.error(e);
		}
		model.addAttribute("orderType", orderType);
		
		return forwardPage("web/user/orderform");
	}
	
	/**
	 * 进入帐户管理收货地址
	 * @author: 林
	 * @date: 2015年8月24日下午4:44:47
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/toShippingAddress.html")
	public ModelAndView toShippingAddress(Model model) {
		model.addAttribute("currIndex","4");
		UserEntity userEntity = getUserEntity();
		model.addAttribute("userentity", userEntity);
		
		if(userEntity != null){
			BusinessData<UserAddressEntity> data = userAddressBusiness.selectAllUserAddress(userEntity.getUuid());
			model.addAttribute("entityList", data.getList());
		}else {
			model.addAttribute("entityList", null);
		}
		return forwardPage("web/user/shippingaddress");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月24日下午8:20:55
	 * @description:					删除数据
	 * @param id
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/doDelUserAddress.html")
	public void doDelUserAddress(long id) {
		UserEntity userEntity = getUserEntity();
		BusinessData<Boolean> data = userAddressBusiness.deleteUserAddressByKey(id, userEntity.getUuid());
		Map<String, Object> map = new HashMap<String, Object>();
		if(data.isSuccess()){
			map.put("rst", ConstantUtil.RETURN_SUCCESS);
		}else {
			map.put("rst", ConstantUtil.RETURN_FAIL);
		}
		this.writeJson(map);
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日上午9:22:05
	 * @description:					设置默认地址
	 * @param id
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/doUpdDefault.html")
	public void doUpdDefault(long id) {
		UserEntity userEntity = getUserEntity();
		
		BusinessData<Boolean> data = userAddressBusiness.updateIsDefaultByKey(id, userEntity.getUuid());
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(data.isSuccess()){
			map.put("rst", ConstantUtil.RETURN_SUCCESS);
		}else {
			map.put("rst", ConstantUtil.RETURN_FAIL);
		}
		this.writeJson(map);
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月24日下午8:07:49
	 * @description:					根据id查询用户地址
	 * @param id						id
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/getUserAddressById.html")
	public void getUserAddressById(long id) {
		
		BusinessData<UserAddressEntity> data = userAddressBusiness.selectUserAddressById(id);
		
		this.writeJson(data.getT());
		
		 
	}

	/**
	 * 进入帐户管理个人信息
	 * @author: 林
	 * @date: 2015年8月24日下午4:44:47
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/toPersonalinfo.html")
	public ModelAndView toPersonalinfo(Model model) {
		model.addAttribute("currIndex","3");
		UserEntity userEntity = getUserEntity();
		model.addAttribute("userentity", userEntity);
		BusinessData<UserDetailEntity> data = userBusiness.selectUserDetailByuuid(userEntity.getUuid());
		model.addAttribute("userDetail", data.getT());
		
		return forwardPage("web/user/personalinfo");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月27日下午1:55:21
	 * @description:					修改个人中心信息学
	 * @param model
	 * @param map
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/doUpdPersonalInfo.html")
	public ModelAndView doUpdPersonalInfo(Model model,@RequestParam Map<String, String> map) {
		model.addAttribute("currIndex","3");
		UserEntity userEntity = getUserEntity();
		model.addAttribute("userentity", userEntity);
		
		UserDetailEntity userDetailEntity = new UserDetailEntity();
		userDetailEntity.setNamecn(map.get("namecn"));
		userDetailEntity.setGender(Integer.parseInt(map.get("gender")));
		userDetailEntity.setCompanyname(map.get("companyname"));
		userDetailEntity.setMainbusiness(map.get("mainbusiness"));
		userDetailEntity.setProvinces(map.get("province")+"-"+map.get("city")+"-"+map.get("districts"));
		userDetailEntity.setAddress(map.get("address"));
		userDetailEntity.setZipcode(map.get("zipcode"));
		userDetailEntity.setPhone(map.get("areacode")+"-"+map.get("phonecode")+"-"+map.get("extcode"));
		userDetailEntity.setContactinfo(Integer.parseInt(map.get("contactinfo")));
		userDetailEntity.setUserkey(userEntity.getUuid());
		
		BusinessData<Boolean> userDetail = userBusiness.updateUserDetail(userDetailEntity);
		if (userDetail.isSuccess()) {
			model.addAttribute("rst", "1");
		}else{
			model.addAttribute("rst", "0");
		}
		BusinessData<UserDetailEntity> data = userBusiness.selectUserDetailByuuid(userEntity.getUuid());
		model.addAttribute("userDetail", data.getT());
		
		return forwardPage("web/user/personalinfo");
	}
	
	/**
	 * 进入帐户管理站内信
	 * @author: 林
	 * @date: 2015年8月24日下午4:44:47
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/account/toStationLetter.html")
	public ModelAndView toStationLetter(Model model) {
		model.addAttribute("currIndex","5");
		UserEntity userEntity = getUserEntity();
		model.addAttribute("userentity", userEntity);
		if(userEntity != null ){
			BusinessData<UserMessageEntity> data = userMessageBusiness.selectUserMessageByToUserId(userEntity.getUuid(), null, null, null, null,null,null);
			model.addAttribute("entityList", data.getList());
		}else {
			model.addAttribute("entityList", null);
		}
		
		
		return forwardPage("web/user/stationletter");
	}
	
	
}
