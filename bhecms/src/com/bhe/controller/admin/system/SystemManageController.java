package com.bhe.controller.admin.system;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.system.ISysDictBusiness;
import com.bhe.business.user.ILoginLogBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.LogLoginEntity;
import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.FileUpload;
import com.bhe.util.common.ListMapUtil;

/**
 * 系统管理模块
 * @author DP
 * @date 2015年7月24日上午10:33:48
 */

@Controller
public class SystemManageController extends BaseController{

	@Autowired
	private ISysDictBusiness sysDictBusinessImpl;
	@Autowired
	private ILoginLogBusiness loginLogBusinessImpl;
	
	/**
	 * 系统配置 首页 （站点配置）
	 * @param model
	 * @return
	 * @date 2015年7月28日下午1:37:57
	 */
	
	@RequestMapping("/admin/system/systemIndex.html")
	public ModelAndView manageIndex(Model model){
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "7");
		 model.addAttribute("frameLeft", "admin/system/left.html");
		 
		 Map<String, SysDictEntity> basicInfoMap= sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_BASIC_INFO);
		 Map<String, SysDictEntity> companyInfoMap=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_COMPANY_INFO); 
		 Map<String, SysDictEntity> flashviewMap=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_FLASHVIEW); 
		 Map<String, SysDictEntity> siteSetting=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_SITE_SETTING); 
		 
		 model.addAttribute("bInfoMap", basicInfoMap);
		 model.addAttribute("cInfoMap", companyInfoMap);
		 model.addAttribute("flashview", flashviewMap);
		 model.addAttribute("siteSetting", siteSetting);
		 model.addAttribute("currIndex","1");
		 
		return forwardPage("admin/system/systemIndex");
	}

	/**
	 * 保存站点配置 信息
	 * @param model
	 * @param params
	 * @return
	 * @date 2015年7月28日下午1:38:52
	 */
	@RequestMapping(value="/admin/system/updateWebSiteInfo.html",method=RequestMethod.POST)
	public ModelAndView updateWebSiteInfo(Model model,@RequestParam Map<String,Object> params){
		model.addAttribute("frameLeft", "admin/system/left.html");
		updateContent(params);
		return forwardPage("redirect:/admin/system/systemIndex.html");
	}
	
	/**
	 * 全局配置
	 * @param model
	 * @return
	 * @date 2015年7月28日下午1:38:30
	 */
	
	@RequestMapping("/admin/system/globalSetIndex.html")
	public ModelAndView globalSetIndex(Model model){
		model.addAttribute("frameLeft", "admin/system/left.html");
		model.addAttribute("currIndex","2");
		
		
		 Map<String, SysDictEntity> loginSetingMap= sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_LOGIN_SETTING);
		 Map<String, SysDictEntity> memberSettingMap=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_MEMBER_SETTING); 
		 Map<String, SysDictEntity> watermarkSetting=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_WATERMARK_SETTING); 
		 Map<String, SysDictEntity> portSetting=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_PORT_SETTING); 
		 Map<String, SysDictEntity> otherSetting=sysDictBusinessImpl.selectChildsMap(ConstantUtil.SYSTEM_SETTING_OTHER_SETTING); 
		 
		 model.addAttribute("loginMap", loginSetingMap);
		 model.addAttribute("memberMap", memberSettingMap);
		 model.addAttribute("waterMap", watermarkSetting);
		 model.addAttribute("portMap", portSetting);
		 model.addAttribute("otherMap", otherSetting);
	
		return forwardPage("admin/system/globalSetIndex");
	}
	
	/**
	 * 保存站点配置 信息
	 * @param model
	 * @param params
	 * @return
	 * @date 2015年7月28日下午1:38:52
	 */
	@RequestMapping(value="/admin/system/updateGlobalInfo.html",method=RequestMethod.POST)
	public ModelAndView updateGlobalInfo(Model model,@RequestParam Map<String,Object> params){
		model.addAttribute("frameLeft", "admin/system/left.html");
		updateContent(params);
		return forwardPage("redirect:/admin/system/globalSetIndex.html");
	}
	
	/**
	 * 更新内容方法
	 * @param params
	 * @date 2015年7月29日下午3:52:29
	 */
	private void updateContent(Map<String,Object> params){
		if(params==null||params.isEmpty()){
			return;
		}
		 Set<Entry<String, Object>> entrySet = params.entrySet();
		 for(Entry<String, Object> entity:entrySet){
			 Map<String, Object> map=new HashMap<String, Object>();
			 map.put("nameen",entity.getKey());
			 map.put("content", entity.getValue());
			 sysDictBusinessImpl.updateByNameen(map);
		 }
	}
	
	@RequestMapping(value="/admin/system/uploadWaterImg.html",method=RequestMethod.POST)
	public void uploadWaterImg(Map<String,String> map,@RequestParam("imgurls") CommonsMultipartFile mFile){
		try {
			String fileName = FileUpload.fileUp(mFile, "F:/apache-tomcat-8.0.23/webapps/bhecms/WEB-INF/upload");
			map.put("fileName", fileName);
		} catch (IOException e) {
			map.put("result", "1");
			this.writeJson(map);
			return;
		}
		map.put("result", "0");
		this.writeJson(map);
	}
	
	
	
	/**
	 * 日志管理 （登录日志，操作日志）
	 * 创 建 人：  BJY
	 * 日     期：  2015年7月31日上午10:45:18
	 * 描     述：
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/system/logManage.html")
	public ModelAndView logManage(Model model,Integer pageIndex, Integer pageSize,String param){
		model.addAttribute("frameLeft", "admin/system/left.html");
		model.addAttribute("currIndex","3");
		
		if(null == pageIndex || 0 == pageIndex){
			pageIndex=1;
		}
		if(null == pageSize){
			pageSize=15;
		}
		
		try {
			BusinessData<LogLoginEntity> lle = loginLogBusinessImpl.selectLogs(pageSize, pageIndex, null, null,param);
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(lle);
			model.addAttribute("pageInfoMap",pageInfoMap);
			model.addAttribute("param", param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forwardPage("admin/system/logManage");
	}
	

	/**
	 * 创 建 人： 林啸虎  
	 * 日     期：  2015年8月6日下午2:31:47
	 * 描     述：获取直接子节点
	 * @param top					节点英文名字
	 */
	@RequestMapping(value="/system/getChilds.html",method=RequestMethod.POST)
	public void getChilds(String top){
		if (top == null || "".equals(top.trim())) {
			top = "0dingjijiedian0";
		}
		Map<String, SysDictEntity> selectChildsMap = sysDictBusinessImpl.selectChildsMap(top);
		this.writeJson(selectChildsMap);
	}
	
	/**
	 * 创 建 人：  林啸虎
	 * 日     期：  2015年8月6日下午2:33:25
	 * 描     述：获取所有子节点
	 * @param top					节点英文名字
	 */
	@RequestMapping(value="/system/getAllChilds.html",method=RequestMethod.POST)
	public void getAllChilds(String top){
		if (top == null || "".equals(top.trim())) {
			top = "0dingjijiedian0";
		}
		Map<String, List<SysDictEntity>> selectAllChilds = sysDictBusinessImpl.selectAllChilds(top);
		this.writeJson(selectAllChilds);
	}
	

}
