package com.bhe.controller.admin.user;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.user.IUserCustomerBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.UserCustomerEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.FtpUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.UuidUtil;

/**
 * 创 建 人： 林
 * 日     期： 2015年8月13日下午2:44:35
 * 描     述：					客服名录
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Controller
public class UserCustomerController extends BaseController {
	
	@Autowired
	private IUserCustomerBusiness userCustomerBusiness;
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日下午3:29:50
	 * 描     述：					图片上传
	 * @param file
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/addFle.html")
	public void uploadFile(@RequestParam("file") MultipartFile file) {
		//取出FTP路径
		String dir = ConstantUtil.FTP_OTHERROOTDIR_NAME;

		Map<String, Object> map = new HashMap<String, Object>();
		try {
			//获取文件名称
			String orginalName = file.getOriginalFilename();
			
			//得到生成的文件名称
			String filename = CommonUtil.getNewFilename(orginalName);

			//获取文件流
			InputStream is = file.getInputStream();
			if (!CommonUtil.isEmpty(is)) {
				String uuid = UuidUtil.generateUUID();
				//拼接路径
				String url = dir + "/" +uuid +"/" + filename;
				//上传FTP
				Boolean bool = FtpUtil.uploadSingleImage(url, is);
				if(bool){
					map.put("uuid",uuid);
					map.put("url", ImageUtils.getImageUrl("/"+url));
					map.put("relaUrl", url);
					map.put("msg", "1");
				}else {
					map.put("msg", "0");
				}
			} else {
				map.put("msg", "0");
			} 

		} catch (IOException e) {
			map.put("msg", "0");
			log.error("文件流获取失败",e);
		}
		this.writeJson("rst",map);
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日下午3:54:11
	 * 描     述：					进入管理页面
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/toUserCustomer.html")
	public ModelAndView toUserCustomer(Model model,Integer pageIndex, Integer pageSize) {
		
		BusinessData<UserCustomerEntity> data = userCustomerBusiness.selectUserCustomerByAll(pageIndex, pageSize);
		
		String realUrl = ImageUtils.getImageUrl("/");
		model.addAttribute("realUrl", realUrl);
		
		model.addAttribute("data", data.getList());
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex","4");
		return forwardPage("/admin/user/userCustomerIndex");
	}

	/**
	 * @author: zhangyu
	 * @date: 2015年8月19日上午11:09:13
	 * @description:  查询所有客户名录 并返回list
	 * @param model
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/findAllCustomer.html")
	public void findAllCustomer(Model model){
		List<Map<String, Object>> listmap = null;
		try {
			BusinessData<UserCustomerEntity> data = userCustomerBusiness.selectUserCustomerByAll(null, null);
			
			List<UserCustomerEntity> listcus = data.getList();
			listmap = ListMapUtil.convertListEntityToListMap(listcus);
			for (Map<String, Object> map : listmap) {  //设置图片
				Object obj = map.get("logo");
				if (!CommonUtil.isEmpty(obj)) {
					String urlstr = obj.toString();
					String url = ImageUtils.getImageUrl(urlstr);
					map.put("logo", url);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.writeJson(listmap);
	}
	
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日下午3:57:39
	 * 描     述：					添加名录
	 * @param entity
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/doAddUserCustomer.html")
	public void doAddUserCustomer(UserCustomerEntity entity) {
		BusinessData<Boolean> data;
		if(entity.getId() != null){
			data = userCustomerBusiness.updateUserCustomerByKey(entity);
		}else {
			entity.setCreatetime(new Date());
			data = userCustomerBusiness.insertUserCustomer(entity);
		}
		this.writeJson("rst",data.isSuccess());
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日下午4:25:46
	 * 描     述：					删除名录
	 * @param id				删除测名录id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/doDelUserCustomer.html")
	public void doDelUserCustomer(long id) {
		BusinessData<Boolean> data = userCustomerBusiness.deleteUserCustomerByKey(id);
		
		this.writeJson("rst",data.isSuccess());
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日下午4:33:46
	 * 描     述：					查询单条数据
	 * @param id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/user/getUserCustomerById.html")
	public void getUserCustomerById(long id) {
		BusinessData<UserCustomerEntity> data = userCustomerBusiness.selectUserCustomerById(id);
		
		this.writeJson("data", data.getT());
	}
	
}
