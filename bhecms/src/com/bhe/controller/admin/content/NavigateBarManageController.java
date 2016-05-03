package com.bhe.controller.admin.content;

import java.io.IOException;
import java.io.InputStream;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.system.ISysCarouselBusiness;
import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.SysCarouselEntity;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.FtpUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.UuidUtil;

@Controller
public class NavigateBarManageController extends BaseController {
	
	@Autowired
	private ISysResourceBusiness sysResourceBusiness;
	@Autowired
	private ISysCarouselBusiness sysCarouselBusiness;
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日下午3:29:18
	 * 描     述：					添加导航栏
	 * @param map
	 * @param parentid
	 * @param barName
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/doAddNavigateBar.html",method=RequestMethod.POST)
	public void doAddNavigateBar(SysResourceEntity entity){
		BusinessData<Boolean> data;
		Map<String, Object> map = new HashMap<String, Object>();
		if(CommonUtil.isEmpty(entity.getNamecn())){
			map.put("rst", ConstantUtil.RETURN_PARAME_ERROR);
		}else {
			if(entity.getId() != null){
				data = sysResourceBusiness.updateSysRes(entity);
			}else {
				entity.setCreatetime(new Date());
				data = sysResourceBusiness.insertSysRes(entity);
			}
			if(data.isSuccess()){
				map.put("rst", ConstantUtil.RETURN_SUCCESS);
			}else {
				map.put("rst", ConstantUtil.RETURN_FAIL);
			}
		}
		
		this.writeJson(map);
	}
	
	/**
	 * 创 建 人：  xhlim
	 * 日     期：  2015年8月13日下午10:05:37
	 * 描     述：					删除导航栏
	 * @param id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/doDelNavigateBar.html",method=RequestMethod.POST)
	public void doDelNavigateBar(int id){
		BusinessData<List<SysResourceEntity>> sysResByparid = sysResourceBusiness.selectSysResByparid(id,null,null,null);
		if(!CommonUtil.isEmpty(sysResByparid.getT())){
			this.writeJson("rst", "-1");
		}else {
			BusinessData<Boolean> data = sysResourceBusiness.deleteSysRes(id);
			this.writeJson("rst",data.isSuccess());
		}
	}
	
	/**
	 * 创 建 人：  xhlim
	 * 日     期：  2015年8月13日下午10:08:52
	 * 描     述：					查询单条数据
	 * @param id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/getNavigateBar.html",method=RequestMethod.POST)
	public void getNavigateBar(int id){
		 BusinessData<SysResourceEntity> data = sysResourceBusiness.selectSysResid(id);
		 this.writeJson(data.getT());
	}
	/**
	 * 创 建 人：  xhlim
	 * 日     期：  2015年8月13日下午10:08:52
	 * 描     述：					查询单条数据
	 * @param id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/addImg.html",method=RequestMethod.POST)
	public void addImg(Integer id, String picurl){
		if(!CommonUtil.isEmpty(id)){
			BusinessData<SysResourceEntity> data = sysResourceBusiness.selectSysResid(id);
			SysResourceEntity resourceEntity = data.getT();
			resourceEntity.setPicurl(picurl);
			BusinessData<Boolean> resoult = sysResourceBusiness.updateSysRes(resourceEntity);
			if(resoult.getState()){
				this.writeJson(ConstantUtil.RETURN_SUCCESS);
			}else{
				this.writeJson(ConstantUtil.RETURN_FAIL);
			}
		}
	}
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月10日下午3:51:06
	 * 描     述：进入内容主页面
	 */
	@RequestMapping(value="/admin/navigatebar/toNavigateBarIndex.html")
	public ModelAndView toNavigateBarIndex(Model model) {
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "3");
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex","1");
		BusinessData<List<SysResourceEntity>> data = sysResourceBusiness.selectSysResByparid(0,null,"rank",null);
		List<SysResourceEntity> dataList =  data.getT();
		try {
			for (SysResourceEntity sys : dataList) {
				//处理图片
				String picurl = sys.getPicurl();
				sys.setPicurl(ImageUtils.getImageUrl(picurl));
			}
			model.addAttribute("data", dataList);
		} catch (Exception e) {
			//  Auto-generated catch block
			e.printStackTrace();
		}
		
		return forwardPage("admin/navigatebar/navigateBarIndex");
	}
	
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月14日上午11:06:08
	 * 描     述：					查询子集返回map形式
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/getNavigateBarBySubToMap.html",method=RequestMethod.POST)
	public void getNavigateBarBySubToMap() {
		BusinessData<SysResourceEntity> data = sysResourceBusiness.selectSysResByAll(null, null);
		
		Map<String, List<SysResourceEntity>> map = new HashMap<String, List<SysResourceEntity>>();
		
		for (SysResourceEntity entity : data.getList()) {
			List<SysResourceEntity> list = map.get(entity.getParentid().toString());
			if (list == null) {
				list = new ArrayList<SysResourceEntity>();
				list.add(entity);
				map.put(entity.getParentid().toString(), list);
			}else {
				list.add(entity);
			}
		}
		
		this.writeJson(map);
	}
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月10日下午3:51:06
	 * 描     述：获取子节点
	 */
	@RequestMapping(value="/admin/navigatebar/getNavigateBarBySub.html",method=RequestMethod.POST)
	public void getNavigateBarBySub(Model model, Integer parentid) {
		
		BusinessData<List<SysResourceEntity>> data = sysResourceBusiness.selectSysResByparid(parentid,null,"rank",null);
		
		model.addAttribute("data", data.getT());
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex","1");
		
		this.writeJson(model);
	}
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月10日 17:04:34
	 * 描     述：进入内容主页面
	 */
	@RequestMapping("/admin/navigatebar/toNavigateBarContent.html")
	public ModelAndView toNavigateBarContent(Model model,Integer parentid) {
		
		BusinessData<List<SysResourceEntity>> data = sysResourceBusiness.selectSysResByparid(parentid,null,null,null);
		
		model.addAttribute("data", data.getT());
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex","2");
		
		return forwardPage("admin/navigatebar/navigateBarContent");
	}
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月10日 17:04:34
	 * 描     述：进入图片管理主页面
	 */
	@RequestMapping(value="/admin/navigatebar/toNavigateBarImg.html")
	public ModelAndView toNavigateBarImg(Model model,Integer pageIndex,Integer pageSize) {
		
		BusinessData<SysCarouselEntity> data = sysCarouselBusiness.selectSysCarouselByType(1, null, null);
		
		String realUrl = ImageUtils.getImageUrl("/");
		
		model.addAttribute("data", data.getList());
		
		model.addAttribute("realUrl", realUrl);
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex","3");
		
		return forwardPage("admin/navigatebar/navigateBarImg");
	}
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月10日 17:04:34
	 * 描     述：进入修改主页面
	 */
	@RequestMapping(value="/admin/navigatebar/toNavigateBarImgUpd.html")
	public ModelAndView toNavigateBarImgUpd(Model model,String msg,Integer id) {
		
		if(id != null){
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
			BusinessData<SysCarouselEntity> data = sysCarouselBusiness.selectSysCarouselById(id, null, null);
			model.addAttribute("data", data.getT());
		}else{
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
		}
		
		String realUrl = ImageUtils.getImageUrl("/");
		model.addAttribute("realUrl", realUrl);
		
		model.addAttribute("frameLeft", "admin/navigatebar/left.html");
		model.addAttribute("currIndex","3");
		
		if (!CommonUtil.isEmpty(msg)) {
			model.addAttribute("msg", msg);
		}
		
		return forwardPage("admin/navigatebar/navigateBarImgUpd");
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日下午7:50:55
	 * 描     述：					添加图片
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/doAddCarouselImg.html")
	public ModelAndView doAddCarouselImg(Model model,SysCarouselEntity entity) {
		BusinessData<Boolean> data;
		if(CommonUtil.isEmpty(entity.getUrl())){
			model.addAttribute("msg", "添加失败，图片不能为空");
			return forwardPage("redirect:/admin/navigatebar/toNavigateBarImgUpd.html");
		}else{
			if (entity.getId() != null) {
				data = sysCarouselBusiness.updateSysCarouselByKey(entity);
			}else {
				entity.setCreatetime(new Date());
				entity.setType(1);
				data = sysCarouselBusiness.insertSysCarousel(entity);
			}
			
			if (data.isSuccess()) {
				return forwardPage("redirect:/admin/navigatebar/toNavigateBarImg.html");
			}else {
				model.addAttribute("msg", "添加失败");
				return forwardPage("redirect:/admin/navigatebar/toNavigateBarImgUpd.html");
			}
		}
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日上午9:51:27
	 * 描     述：					删除轮播图片
	 * @param model
	 * @param id				信息id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/navigatebar/doDelCarouselImg.html",method=RequestMethod.POST)
	public void doDelCarouselImg(Model model,long id) {
		
		BusinessData<Boolean> data = sysCarouselBusiness.deleteSysCarouselByKey(id);
		
		this.writeJson("rst",data.isSuccess());
		
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月13日上午11:01:43
	 * 描     述：				图片上传
	 * @param file
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/navigatebar/addFle.html")
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
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月10日下午3:51:26
	 * 描     述：获取导航栏下一级
	 * @param id			需要获取的下级的父id
	 */
	@RequestMapping("/admin/navigatebar/doOpenBar.html")
	@ResponseBody
	public void doOpenBar(Integer id) {
		
		BusinessData<List<SysResourceEntity>> data = sysResourceBusiness.selectSysResByparid(id,null,null,null);
		
		this.writeJson(data);
	}
	
	@RequestMapping(value="/admin/navigatebar/getNavigateBarImg.html")
	public ModelAndView getNavigateBarImg() {
		
		return forwardPage("/admin/navigatebar/navigateBarImg");
	}
	
}
