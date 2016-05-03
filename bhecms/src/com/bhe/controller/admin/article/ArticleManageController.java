package com.bhe.controller.admin.article;

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

import com.bhe.business.article.IArticleBusiness;
import com.bhe.business.article.IArticleClassBusiness;
import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.business.user.IUserBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ArticleClassEntity;
import com.bhe.dao.mybatis.model.ArticleEntity;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.StringUtil;
import com.bhe.util.common.UuidUtil;

/**
 * 文章管理模块
 * @author DP
 * @date 2015年7月24日下午2:59:32
 */

@Controller
public class ArticleManageController extends BaseController{

	@Autowired
	private IArticleBusiness articleBusiness;
	@Autowired
	private IArticleClassBusiness articleClassBusiness;
	@Autowired
	private IUserBusiness iuserBusiness;
	@Autowired
	private ISysResourceBusiness sysResourceBusiness;
	
	/**
	 * 
	 * @description ：文章列表首页
	 * @author：  Dengpeng
	 * @date ：  2015年8月4日下午2:14:58
	 * @param model
	 * @param pageIndex
	 * @param pageSize
	 * @param orderFile
	 * @param orderType
	 * @param title
	 * @return
	 * <br>-----------------------------<br>
	 * @editor： 
	 * @date： 
	 * @description： 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/articleIndex.html")
	public ModelAndView articleIndex(Model model,Integer pageIndex,Integer pageSize, String orderParam, String orderRank,Long type,String title){
		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "2");
		model.addAttribute("frameLeft", "admin/article/left.html");
		model.addAttribute("currIndex","1");
		model.addAttribute("title", title);
		model.addAttribute("type", type);
		if(null == pageIndex || 0 == pageIndex){
			pageIndex=1;
		}
		if(null == pageSize){
			pageSize=15;
		}
		try {
			BusinessData<ArticleEntity> bdue = articleBusiness.selectArticleByNoStatus(pageIndex, pageSize, orderParam, orderRank,type, 1,title);
		//	List<Map<String, Object>> entityMap = ListMapUtil.convertListEntityToListMap(bdue.getList());
			for(ArticleEntity article :  bdue.getList()){
				BusinessData<UserEntity> userEntity = iuserBusiness.selectUserByuuid(article.getAuthor());
				article.setAuthor(userEntity.getT().getUsername());
			}
			
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
			//model.addAttribute("articleType",);
			model.addAttribute("pageInfoMap",pageInfoMap);
		} catch (Exception e) {
			log.error(e);
		}
		
		return forwardPage("admin/article/articleIndex");
	}
	
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年7月31日上午11:40:38
	 * 描     述：  文章信息插入
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/updateArtiStatus.html",method=RequestMethod.POST)
	public void updateArtiStatus(String uuid,@RequestParam Integer status,String uuids){
		ArticleEntity entity = new ArticleEntity();
		entity.setStatus(status);
		Map<String, Object> map= new HashMap<String, Object>();
		if(!StringUtil.isNull(uuid)){
			entity.setUuid(uuid);
			map.put("result", articleBusiness.updateArcinfo(entity).isSuccess());
		}else if(!StringUtil.isNull(uuids)){
			String[] ids = uuids.split(",");
			int count=0;
			for (int i = 0; i <ids.length; i++) {
				entity.setUuid(ids[i]);
				if(!articleBusiness.updateArcinfo(entity).isSuccess()){
					count++;
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
	
	
	/**
	 * 
	 * @description ：物理删除 文章
	 * @author：  Dengpeng
	 * @date ：  2015年8月4日下午3:01:33
	 * @param uuid
	 * <br>-----------------------------<br>
	 * @editor： 
	 * @date： 
	 * @description： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/deleteArticle.html",method=RequestMethod.POST)
	public void deleteArticle(String uuid,String uuids){
		Map<String, Object> map= new HashMap<String, Object>();
		if(!StringUtil.isNull(uuid)){
			map.put("result", articleBusiness.deleteArcinfo(uuid).isSuccess());
		}else if(!StringUtil.isNull(uuids)){
			String[] ids = uuids.split(",");
			int count=0;
			for (int i = 0; i <ids.length; i++) {
				if(!articleBusiness.deleteArcinfo(ids[i]).isSuccess()){
					count++;
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
	
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日上午11:33:50
	 * 描     述： 文章添加
	 * <br>-----------------------------<br>
	 * 修 改 人： Dengpeng
	 * 日     期： 2015-8-4
	 * 描     述： 传uuid 过来 查找 文章 详情，并且在页面上显示 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/articleRelease.html")
	public ModelAndView articleRelease(Model model,String uuid,String type) {
		model.addAttribute("frameLeft", "admin/article/left.html");
		model.addAttribute("currIndex","1");
		if (!StringUtil.isNull(uuid)) {
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
			BusinessData<ArticleEntity> artBudata = articleBusiness.selectArcByUuid(uuid);
			ArticleEntity articleEntity = artBudata.getT();
			model.addAttribute("articleEntity", articleEntity);
		} else {
			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
		}
		if("rubbish".equals(type)){
			model.addAttribute("type", type);
			model.addAttribute("currIndex","3");
		}
		return forwardPage("admin/article/articleRelease");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月17日下午2:51:41
	 * @description:					查询分类数据用于树
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/getArtilceClassForTree.html",method=RequestMethod.POST)
	public void getArtilceClassForTree() {
		Map<String, List<ArticleClassEntity>> map = new HashMap<String, List<ArticleClassEntity>>();
		BusinessData<ArticleClassEntity> data = articleClassBusiness.selectArticleClassByAll(null, null);
		
		for (ArticleClassEntity entity : data.getList()) {
			List<ArticleClassEntity> list = map.get(entity.getParentid().toString());
			if (list == null) {
				list = new ArrayList<ArticleClassEntity>();
				list.add(entity);
				map.put(entity.getParentid().toString(), list);
			}else {
				list.add(entity);
			}
		}
		
		this.writeJson(map);
	}
	
	/**
	 * 
	 * @description ：添加文章
	 * @author：  schoff
	 * @date ：  2015年8月4日上午9:40:40
	 * <br>-----------------------------<br>
	 * @editor： 
	 * @date： 
	 * @description： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/addArticle.html",method=RequestMethod.POST)
	public ModelAndView addArticle(Model model,ArticleEntity entity){
		BusinessData<Boolean> data;
		if (CommonUtil.isEmpty(entity.getUuid())) {
			entity.setUuid(UuidUtil.generateUUID());
			entity.setStatus(0);
			entity.setIsshow(0);
			entity.setCreatetime(new Date());
			entity.setAuthor(((UserEntity) getAttribute(ConstantUtil.SESSION_LOGIN_USER)).getUuid());
			data = articleBusiness.insertArcinfo(entity);
			
		}else {
			data = articleBusiness.updateArcinfo(entity);
		}
		
		if (data.isSuccess()) {
			return forwardPage("redirect:/admin/article/articleIndex.html");
		}else {
			return forwardPage("redirect:/admin/article/articleRelease.html");
		}
		
	}
	
	/**
	 * 
	 * @description ：回收站首页
	 * @author：  Dengpeng
	 * @date ：  2015年8月4日下午3:09:27
	 * @param model
	 * @return
	 * <br>-----------------------------<br>
	 * @editor： 
	 * @date： 
	 * @description： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/recycleIndex.html")
	public ModelAndView recycleIndex(Model model,Integer pageIndex,Integer pageSize, String orderParam, String orderRank,String title) {
		model.addAttribute("frameLeft", "admin/article/left.html");
		model.addAttribute("currIndex","3");
		if(null == pageIndex || 0 == pageIndex){
			pageIndex=1;
		}
		if(null == pageSize){
			pageSize=15;
		}
		try {
			BusinessData<ArticleEntity> bdue = articleBusiness.selectArticleByStatus(pageIndex, pageSize, orderParam, orderRank, 1);
			for(ArticleEntity article :  bdue.getList()){
				BusinessData<UserEntity> userEntity = iuserBusiness.selectUserByuuid(article.getAuthor());
				article.setAuthor(userEntity.getT().getUsername());
			}
			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
			model.addAttribute("pageInfoMap",pageInfoMap);
		} catch (Exception e) {
			log.error(e);
		}
		return forwardPage("admin/article/recycleIndex");
	}
	
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月6日下午2:15:42
	 * 描     述：栏目管理
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/columnList.html")
	public ModelAndView columnList(Model model){
		model.addAttribute("frameLeft", "admin/article/left.html");
		model.addAttribute("currIndex","2");
		BusinessData<List<SysResourceEntity>> topList = sysResourceBusiness.selectSysResByparid(0,null,null,null);//获取一级菜单 
		model.addAttribute("topList", topList.getList());
		return forwardPage("/admin/article/columnList");
	}

	/**
	 * 创 建 人：Dengpeng  
	 * 日     期：  2015年8月6日下午2:27:26
	 * 描     述：分类管理
	 * <br>-----------------------------<br>
	 * 修 改 人： 林啸虎
	 * 日     期： 2015年8月11日 15:58:42
	 * 描     述： 页面显示
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/classifyList.html")
	public ModelAndView classifyList(Model model){
		model.addAttribute("frameLeft", "admin/article/left.html");
		model.addAttribute("currIndex","2");
		BusinessData<ArticleClassEntity> data = articleClassBusiness.selectArticleClassByParentId(0, null, null);
		List<Object> list = new ArrayList<Object>();
		for (ArticleClassEntity entity : data.getList()) {
			try {
				Map<String, Object> map = ListMapUtil.convertEntityToMap(entity);
				BusinessData<SysResourceEntity> selectSysResid = sysResourceBusiness.selectSysResid(Integer.parseInt(entity.getResoureceid()+""));
				map.put("resource", selectSysResid.getT().getNamecn());
				list.add(map);
			} catch (Exception e) {
				log.error("对象转map错误");
			}
		}
		model.addAttribute("data", list);
		return forwardPage("/admin/article/articleClass");
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月11日下午4:39:38
	 * 描     述：查询分类子集
	 * @param model
	 * @param parentid					需要的子集的父id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/classifyListSub.html")
	public void classifyListSub(Model model,int parentid){
		model.addAttribute("frameLeft", "admin/article/left.html");
		model.addAttribute("currIndex","2");
		BusinessData<ArticleClassEntity> data = articleClassBusiness.selectArticleClassByParentId(parentid, null, null);
		List<Object> list = new ArrayList<Object>();
		for (ArticleClassEntity entity : data.getList()) {
			try {
				Map<String, Object> map = ListMapUtil.convertEntityToMap(entity);
				BusinessData<SysResourceEntity> selectSysResid = sysResourceBusiness.selectSysResid(Integer.parseInt(entity.getResoureceid()+""));
				map.put("resource", selectSysResid.getT().getNamecn());
				list.add(map);
			} catch (Exception e) {
				log.error("对象转map错误");
			}
		}
		model.addAttribute("data", list);
		
		this.writeJson(model);
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日上午9:38:54
	 * 描     述：				查询所有类型
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/getAllArticleClass.html",method=RequestMethod.POST)
	public void getAllArticleClass() {
		BusinessData<ArticleClassEntity> data = articleClassBusiness.selectArticleClassByAll(null, null);
		
		Map<String, List<ArticleClassEntity>> map = new HashMap<String, List<ArticleClassEntity>>();
		
		for (ArticleClassEntity entity : data.getList()) {
			List<ArticleClassEntity> list = map.get(entity.getParentid().toString());
			if (list == null) {
				list = new ArrayList<ArticleClassEntity>();
				list.add(entity);
				map.put(entity.getParentid().toString(), list);
			}else {
				list.add(entity);
			}
		}
		
		this.writeJson(map);
	}
	
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日上午9:38:54
	 * 描     述：				查询所有栏目
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/getAllArticleSection.html",method=RequestMethod.POST)
	public void getAllArticleSection() {
		
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
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日上午9:20:06
	 * 描     述：			添加文章分类
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/doAddArticleClass.html",method=RequestMethod.POST)
	public void doAddArticleClass(Model model,ArticleClassEntity entity) {
		BusinessData<Boolean> data;
		if (!CommonUtil.isEmpty(entity.getNamecn())) {
			if (!CommonUtil.isEmpty(entity.getId())) {
				data = articleClassBusiness.updateArtCla(entity);
			}else {
				data = articleClassBusiness.insertArtCla(entity);
			}
		}else {
			data = new BusinessData<Boolean>(false, null, null);
		}
		
		this.writeJson("msg",data.isSuccess());
	}
	
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日上午10:30:12
	 * 描     述：					删除分类
	 * @param id				分类id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/doDelArticleClass.html",method=RequestMethod.POST)
	public void doDelArticleClass(@RequestParam long id){
		Map<String, Object> map = new HashMap<String, Object>();
		BusinessData<ArticleClassEntity> articleClassByParentId = articleClassBusiness.selectArticleClassByParentId(Integer.parseInt(id+""), null, null);
		if (articleClassByParentId.getList().size() != 0) {
			map.put("rst", false);
			map.put("msg", "无法删除，存在子级分类");
		}else {
			BusinessData<Boolean> data = articleClassBusiness.deleteArtClaByaId(id);
			map.put("rst", data.isSuccess());
		}
		
		this.writeJson(map);
	}
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日上午11:11:45
	 * 描     述：					查询单条数据
	 * @param id				需要查询的数据的id
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/article/getArcilceClassDetail.html",method=RequestMethod.POST)
	public void getArcilceClassDetail(int id) {
		BusinessData<ArticleClassEntity> data = articleClassBusiness.selectArtClaByid(id);
		
		this.writeJson("data", data.getT());
		
	}
	/**
	 * @author: jsy
	 * @date: 2015年8月24日下午3:39:46
	 * @description:检查名称是否重复
	 * @param namecn
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping("/admin/article/checkNameCn.html")
	public void checkNameCn(String namecn,Long id){
		BusinessData<ArticleClassEntity> article = articleClassBusiness.selectArticleClassByNameCn(namecn, null, null);
		
		if(article.getT() != null){
			if(!CommonUtil.isEmpty(id)){
				if(article.getT().getId() != id){
					this.writeJson("status", ConstantUtil.RETURN_FAIL);
				}else{
					this.writeJson("status", ConstantUtil.RETURN_SUCCESS);
				}
			}
		}else{
			this.writeJson("status", ConstantUtil.RETURN_SUCCESS);
		}
		this.writeJson("status", ConstantUtil.RETURN_FAIL);
		
	}
}
