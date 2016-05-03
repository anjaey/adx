package com.bhe.controller.web.user;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.business.user.IUserCustomerBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.dao.mybatis.model.UserCustomerEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.ListMapUtil;

/**
 * 客户名录
 * @author: jsy
 * @date: 2015年8月18日下午2:11:45
 * @description:
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Controller
public class CustomerController extends BaseController{

	@Autowired
	private IUserCustomerBusiness userCustomerBusiness;
	
	@Autowired
	private ISysResourceBusiness iSysResourceBusiness;

	/** 跳转到客户名录页面
	 * @author: jsy
	 * @date: 2015年8月18日下午2:11:59
	 * @description:
	 * @param model
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/toCustomerIndex.html")
	public ModelAndView toCustomerIndex(Model model,Integer pageIndex, Integer pageSize, String  code) {
		model.addAttribute("code", code);
		try {
			BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode(code);
			if (null != sysResBd.getT()) {
				String picurl = sysResBd.getT().getPicurl();
				model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
			}
			BusinessData<UserCustomerEntity> data = userCustomerBusiness.selectUserCustomerByAll(pageIndex, pageSize);
			List<UserCustomerEntity> listuce = data.getList();
			List<Map<String, Object>> listmap = ListMapUtil.convertListEntityToListMap(listuce);
			for (Map<String, Object> map : listmap) {
				Object obj = map.get("logo");
				if (!CommonUtil.isEmpty(obj)) {
					String logo = obj.toString();
					logo = ImageUtils.getImageUrl(logo);
					map.put("logo", logo);
				}
			}
			model.addAttribute("data", listmap);
			model.addAttribute("currIndex","4");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("web/user/customerIndex");
	}
}
