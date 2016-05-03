package com.bhe.controller.web.article;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.article.IArticleBusiness;
import com.bhe.business.article.IArticleClassBusiness;
import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ArticleClassEntity;
import com.bhe.dao.mybatis.model.ArticleEntity;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;

@Controller
public class ArticleController extends BaseController {

	@Autowired
	private IArticleBusiness iArticleBusiness;

	@Autowired
	private IArticleClassBusiness iArticleClassBusiness;
	@Autowired
	private ISysResourceBusiness iSysResourceBusiness;

	@RequestMapping("/web/article/newsDetail.html")
	public ModelAndView newsDetail(Model model, @RequestParam String uuid) {
		model.addAttribute("entity", iArticleBusiness.selectArcByUuid(uuid).getT());

		return forwardPage("web/article/ariticleContent");
	}

	@RequestMapping("/web/article/newsList.html")
	public ModelAndView newsList(Model model, Integer pageIndex, Integer pageSize) {
		if (null == pageIndex || 0 == pageIndex) {
			pageIndex = 1;
		}
		if (null == pageSize) {
			pageSize = 15;
		}
		ArticleClassEntity entity = iArticleClassBusiness.selectArticleClassByNameEn(ConstantUtil.NEWS_CENTER, null, null).getT();
		List<ArticleEntity> articleList = iArticleBusiness.selectArticleByClassId(entity.getId(), pageIndex, pageSize).getList();

		model.addAttribute("articleList", articleList);
		model.addAttribute("pageTitle", "新闻中心");

		return forwardPage("web/article/articleList");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月20日上午10:46:00
	 * @description:					进入内容页面
	 * @param type
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/web/article/toContentPage.html")
	public ModelAndView toContentPage(String code) {
		
		switch (code) {
		case ConstantUtil.COMPANY_PROFILE:
			return forwardPage("redirect:/web/article/toCompanyProfile.html?code="+code);
		case ConstantUtil.COOPERATION_BRAND:
			return forwardPage("redirect:/web/product/toCooperationBran.html?code="+code);
		case ConstantUtil.COMPANY_CULTURE:
			return forwardPage("redirect:/web/article/toCompanyCulture.html?code="+code);
		case ConstantUtil.NEWS_CENTER:
			return forwardPage("redirect:/web/article/toNewsCenter.html?code="+code);
		default:
			return forwardPage("err/404");
		}
	}

	/**
	 * @author: 林
	 * @date: 2015年8月24日上午9:05:43
	 * @description:					公司介绍
	 * @param model
	 * @param code						公司介绍英文名称
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/web/article/toCompanyProfile.html")
	public ModelAndView toCompanyProfile(Model model, String code) {
		
		BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode(code);
		if (null != sysResBd.getT()) {
			String picurl = sysResBd.getT().getPicurl();
			model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
		}
		
		BusinessData<SysResourceEntity> sysResByNameEn = iSysResourceBusiness.selectSysResByNameEn(code, null, null);
		
		BusinessData<ArticleClassEntity> articleClassByResoureceId = iArticleClassBusiness.selectArticleClassByResoureceId(sysResByNameEn.getT().getId(), null, null);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		for (ArticleClassEntity entity : articleClassByResoureceId.getList()) {
			BusinessData<ArticleEntity> artByClaid = iArticleBusiness.selectArticleByClassId(entity.getId(), null, null);
			map.put(entity.getNameen(), artByClaid.getList());
		}
		
		model.addAttribute("map", map);
		model.addAttribute("code", code);
		return forwardPage("/web/article/companyPorfile");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月24日上午10:22:46
	 * @description:					公司文化
	 * @param model
	 * @param code
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/web/article/toCompanyCulture.html")
	public ModelAndView toCompanyCulture(Model model, String code) {
		
		BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode("companyprofile");
		if (null != sysResBd.getT()) {
			String picurl = sysResBd.getT().getPicurl();
			model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
		}
		
		BusinessData<SysResourceEntity> sysResByNameEn = iSysResourceBusiness.selectSysResByNameEn(code, null, null);
		
		BusinessData<ArticleClassEntity> articleClassByResoureceId = iArticleClassBusiness.selectArticleClassByResoureceId(sysResByNameEn.getT().getId(), null, null);
		 
		Map<String, Object> map = new HashMap<String, Object>();
		
		for (ArticleClassEntity entity : articleClassByResoureceId.getList()) {
			BusinessData<ArticleEntity> artByClaid = iArticleBusiness.selectArticleByClassId(entity.getId(), null, null);
			map.put(entity.getNameen(), artByClaid.getList());
		}
		
		model.addAttribute("map", map);
		model.addAttribute("code", code);
		return forwardPage("/web/article/companyCulture");
	}
	
	
	/**
	 * @author: 林
	 * @date: 2015年8月24日上午11:12:01
	 * @description:					新闻中心
	 * @param model
	 * @param code
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/web/article/toNewsCenter.html")
	public ModelAndView toNewsCenter(Model model, String code) {
		
		BusinessData<SysResourceEntity> sysResBd = iSysResourceBusiness.selectSysResByCode("companyprofile");
		if (null != sysResBd.getT()) {
			String picurl = sysResBd.getT().getPicurl();
			model.addAttribute("picurl", ImageUtils.getImageUrl(picurl));
		}
		
		BusinessData<SysResourceEntity> sysResByNameEn = iSysResourceBusiness.selectSysResByNameEn(code, null, null);
		
		BusinessData<ArticleClassEntity> articleClassByResoureceId = iArticleClassBusiness.selectArticleClassByResoureceId(sysResByNameEn.getT().getId(), null, null);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		for (ArticleClassEntity entity : articleClassByResoureceId.getList()) {
			BusinessData<ArticleEntity> artByClaid = iArticleBusiness.selectArticleByClassId(entity.getId(), null, null);
			map.put(entity.getNameen(), artByClaid.getList());
		}
		
		model.addAttribute("map", map);
		model.addAttribute("code", code);
		return forwardPage("/web/article/newsCenter");
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月24日下午2:28:15
	 * @description:					查看单个文章信息
	 * @param uuid						文章的uuid
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value = "/web/article/getSingleArticle.html")
	public ModelAndView getSingleArticle(Model model, String uuid) {
		
		BusinessData<ArticleEntity> selectArcByUuid = iArticleBusiness.selectArcByUuid(uuid);
		
		model.addAttribute("entity", selectArcByUuid.getT());
		return forwardPage("/web/article/singleArticle");
	}
	

}
