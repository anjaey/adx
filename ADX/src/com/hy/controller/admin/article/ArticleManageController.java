package com.hy.controller.admin.article;
//package com.hy.controller.admin.article;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import com.hy.business.article.IArticleBusiness;
//import com.hy.business.article.IArticleClassBusiness;
//import com.hy.business.user.IUserBusiness;
//import com.hy.controller.admin.common.BaseController;
//import com.hy.dao.mybatis.model.ArticleClassEntity;
//import com.hy.dao.mybatis.model.ArticleEntity;
//import com.hy.dao.mybatis.model.UserEntity;
//import com.hy.util.common.BusinessData;
//import com.hy.util.common.CommonUtil;
//import com.hy.util.common.ConstantUtil;
//import com.hy.util.common.ListMapUtil;
//import com.hy.util.common.StringUtil;
//import com.hy.util.common.UuidUtil;
//
///**
// * 文章管理模块
// * @author DP
// * @date 2015年7月24日下午2:59:32
// */
//
//@Controller
//public class ArticleManageController extends BaseController{
//
//	@Autowired
//	private IArticleBusiness articleBusiness;
//	@Autowired
//	private IArticleClassBusiness articleClassBusiness;
//	@Autowired
//	private IUserBusiness iuserBusiness;
//	/**
//	 * 
//	 * @description ：文章列表首页
//	 * @author：  Dengpeng
//	 * @date ：  2015年8月4日下午2:14:58
//	 * @param model
//	 * @param pageIndex
//	 * @param pageSize
//	 * @param orderFile
//	 * @param orderType
//	 * @param title
//	 * @return
//	 * <br>-----------------------------<br>
//	 * @editor： 
//	 * @date： 
//	 * @description： 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/article/articleIndex.html")
//	public ModelAndView articleIndex(Model model,Integer pageIndex,Integer pageSize, String orderParam, String orderRank,Long type,String title){
//		this.setAttribute(ConstantUtil.SESSION_NAVIGATEBAR, "2");
//		model.addAttribute("frameLeft", "admin/article/left.html");
//		model.addAttribute("currIndex","1");
//		model.addAttribute("title", title);
//		model.addAttribute("type", type);
//		if(null == pageIndex || 0 == pageIndex){
//			pageIndex=1;
//		}
//		if(null == pageSize){
//			pageSize=15;
//		}
//		try {
//			BusinessData<ArticleEntity> bdue = articleBusiness.selectArticleByNoStatus(pageIndex, pageSize, orderParam, orderRank,type, 1,title);
//		//	List<Map<String, Object>> entityMap = ListMapUtil.convertListEntityToListMap(bdue.getList());
//			for(ArticleEntity article :  bdue.getList()){
//				BusinessData<UserEntity> userEntity = iuserBusiness.selectUserByuuid(article.getAuthor());
//				article.setAuthor(userEntity.getT().getUsername());
//			}
//			
//			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
//			//model.addAttribute("articleType",);
//			model.addAttribute("pageInfoMap",pageInfoMap);
//		} catch (Exception e) {
//			log.error(e);
//		}
//		
//		return forwardPage("admin/article/articleIndex");
//	}
//	
//	
//	/**
//	 * 创 建 人：  zhangyu
//	 * 日     期：  2015年7月31日上午11:40:38
//	 * 描     述：  文章信息插入
//	 * <br>-----------------------------<br>
//	 * 修 改 人： 
//	 * 日     期： 
//	 * 描     述： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/article/updateArtiStatus.html",method=RequestMethod.POST)
//	public void updateArtiStatus(String uuid,@RequestParam Integer status,String uuids){
//		ArticleEntity entity = new ArticleEntity();
//		entity.setStatus(status);
//		Map<String, Object> map= new HashMap<String, Object>();
//		if(!StringUtil.isNull(uuid)){
//			entity.setUuid(uuid);
//			map.put("result", articleBusiness.updateArcinfo(entity).isSuccess());
//		}else if(!StringUtil.isNull(uuids)){
//			String[] ids = uuids.split(",");
//			int count=0;
//			for (int i = 0; i <ids.length; i++) {
//				entity.setUuid(ids[i]);
//				if(!articleBusiness.updateArcinfo(entity).isSuccess()){
//					count++;
//				}
//			}
//			if(count>0){
//				map.put("result", false);
//				map.put("count", count);
//			}else{
//				map.put("result", true);
//			}
//		}
//		this.writeJson(map);
//		
//	}
//	
//	
//	/**
//	 * 
//	 * @description ：物理删除 文章
//	 * @author：  Dengpeng
//	 * @date ：  2015年8月4日下午3:01:33
//	 * @param uuid
//	 * <br>-----------------------------<br>
//	 * @editor： 
//	 * @date： 
//	 * @description： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/article/deleteArticle.html",method=RequestMethod.POST)
//	public void deleteArticle(String uuid,String uuids){
//		Map<String, Object> map= new HashMap<String, Object>();
//		if(!StringUtil.isNull(uuid)){
//			map.put("result", articleBusiness.deleteArcinfo(uuid).isSuccess());
//		}else if(!StringUtil.isNull(uuids)){
//			String[] ids = uuids.split(",");
//			int count=0;
//			for (int i = 0; i <ids.length; i++) {
//				if(!articleBusiness.deleteArcinfo(ids[i]).isSuccess()){
//					count++;
//				}
//			}
//			if(count>0){
//				map.put("result", false);
//				map.put("count", count);
//			}else{
//				map.put("result", true);
//			}
//		}
//		this.writeJson(map);
//	}
//	
//	
//	/**
//	 * 创 建 人：  schoff
//	 * 日     期：  2015年8月3日上午11:33:50
//	 * 描     述： 文章添加
//	 * <br>-----------------------------<br>
//	 * 修 改 人： Dengpeng
//	 * 日     期： 2015-8-4
//	 * 描     述： 传uuid 过来 查找 文章 详情，并且在页面上显示 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/article/articleRelease.html")
//	public ModelAndView articleRelease(Model model,String uuid,String type) {
//		model.addAttribute("frameLeft", "admin/article/left.html");
//		model.addAttribute("currIndex","1");
//		if (!StringUtil.isNull(uuid)) {
//			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOUPDATE);
//			BusinessData<ArticleEntity> artBudata = articleBusiness.selectArcByUuid(uuid);
//			ArticleEntity articleEntity = artBudata.getT();
//			model.addAttribute("articleEntity", articleEntity);
//		} else {
//			model.addAttribute("states", ConstantUtil.VIEW_FROS_TOADD);
//		}
//		if("rubbish".equals(type)){
//			model.addAttribute("type", type);
//			model.addAttribute("currIndex","3");
//		}
//		return forwardPage("admin/article/articleRelease");
//	}
//	
//	/**
//	 * @author: 林
//	 * @date: 2015年8月17日下午2:51:41
//	 * @description:					查询分类数据用于树
//	 * <br>-----------------------------<br>
//	 * @update:
//	 * @date: 
//	 * @description:	(注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/article/getArtilceClassForTree.html",method=RequestMethod.POST)
//	public void getArtilceClassForTree() {
//		Map<String, List<ArticleClassEntity>> map = new HashMap<String, List<ArticleClassEntity>>();
//		BusinessData<ArticleClassEntity> data = articleClassBusiness.selectArticleClassByAll(null, null);
//		
//		for (ArticleClassEntity entity : data.getList()) {
//			List<ArticleClassEntity> list = map.get(entity.getParentid().toString());
//			if (list == null) {
//				list = new ArrayList<ArticleClassEntity>();
//				list.add(entity);
//				map.put(entity.getParentid().toString(), list);
//			}else {
//				list.add(entity);
//			}
//		}
//		
//		this.writeJson(map);
//	}
//	
//	/**
//	 * 
//	 * @description ：添加文章
//	 * @author：  schoff
//	 * @date ：  2015年8月4日上午9:40:40
//	 * <br>-----------------------------<br>
//	 * @editor： 
//	 * @date： 
//	 * @description： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping(value="/admin/article/addArticle.html",method=RequestMethod.POST)
//	public ModelAndView addArticle(Model model,ArticleEntity entity){
//		BusinessData<Boolean> data;
//		if (CommonUtil.isEmpty(entity.getUuid())) {
//			entity.setUuid(UuidUtil.generateUUID());
//			entity.setStatus(0);
//			entity.setIsshow(0);
//			entity.setCreatetime(new Date());
//			entity.setAuthor(((UserEntity) getAttribute(ConstantUtil.SESSION_LOGIN_USER)).getUuid());
//			data = articleBusiness.insertArcinfo(entity);
//			
//		}else {
//			data = articleBusiness.updateArcinfo(entity);
//		}
//		
//		if (data.isSuccess()) {
//			return forwardPage("redirect:/admin/article/articleIndex.html");
//		}else {
//			return forwardPage("redirect:/admin/article/articleRelease.html");
//		}
//		
//	}
//	
//	/**
//	 * 
//	 * @description ：回收站首页
//	 * @author：  Dengpeng
//	 * @date ：  2015年8月4日下午3:09:27
//	 * @param model
//	 * @return
//	 * <br>-----------------------------<br>
//	 * @editor： 
//	 * @date： 
//	 * @description： (注明修改原因) 
//	 * <br>-----------------------------<br>
//	 */
//	@RequestMapping("/admin/article/recycleIndex.html")
//	public ModelAndView recycleIndex(Model model,Integer pageIndex,Integer pageSize, String orderParam, String orderRank,String title) {
//		model.addAttribute("frameLeft", "admin/article/left.html");
//		model.addAttribute("currIndex","3");
//		if(null == pageIndex || 0 == pageIndex){
//			pageIndex=1;
//		}
//		if(null == pageSize){
//			pageSize=15;
//		}
//		try {
//			BusinessData<ArticleEntity> bdue = articleBusiness.selectArticleByStatus(pageIndex, pageSize, orderParam, orderRank, 1);
//			for(ArticleEntity article :  bdue.getList()){
//				BusinessData<UserEntity> userEntity = iuserBusiness.selectUserByuuid(article.getAuthor());
//				article.setAuthor(userEntity.getT().getUsername());
//			}
//			Map<String,Object> pageInfoMap = ListMapUtil.convertEntityToMap(bdue);
//			model.addAttribute("pageInfoMap",pageInfoMap);
//		} catch (Exception e) {
//			log.error(e);
//		}
//		return forwardPage("admin/article/recycleIndex");
//	}
//	
//	
//}
