package com.bhe.controller.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.article.IArticleBusiness;
import com.bhe.business.article.IArticleClassBusiness;
import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.business.system.ISysCarouselBusiness;
import com.bhe.business.system.ISysDictBusiness;
import com.bhe.business.system.ISysLinkBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ArticleClassEntity;
import com.bhe.dao.mybatis.model.ArticleEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.SysCarouselEntity;
import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.dao.mybatis.model.SysLinkEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;


@Controller
public class IndexController  extends BaseController{
	
	@Autowired
	private CommonController commonController;

	@Autowired
	private IProductBusiness iProductBusiness;
	
	@Autowired
	IProductAttachmentBusiness iProductAttachmentBusiness;
	
	@Autowired
	private IArticleClassBusiness iArticleClassBusiness; 
	
	@Autowired
	private IArticleBusiness iArticleBusiness; 
	
	
	@Autowired
	private ISysCarouselBusiness iSysCarouselBusiness; 
	
	@Autowired
	private ISysLinkBusiness iSysLinkBusiness; 
	@Autowired
	private ISysDictBusiness sysDictBusiness; 
	
	@RequestMapping(value="/web/product/{code:[a-z]+.do}")
	public void indexT(@PathVariable String code){  
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("textualPart", code);
		
		this.writeJson(map);
	}
	
	
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月13日下午2:25:14
	 * 描     述：拦截跟路径，设置跳转
	 * @param map
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/")
	public ModelAndView index(Model model,Integer pageIndex, Integer pageSize){

		List<SysCarouselEntity> list = iSysCarouselBusiness.selectSysCarouselByType(1, null, null).getList();
		model.addAttribute("imgList",list);
		
		
	//	model.addAttribute("cateList",iProductCategoryBusiness.selectProCateByParentId(1).getList());//查询产品分类
		
		//获取关于我们
		ArticleClassEntity entity = iArticleClassBusiness.selectArticleClassByNameEn(ConstantUtil.ABOUT_US, null, null).getT();
		ArticleEntity t = iArticleBusiness.selectArticleByClassId(entity.getId(), null, null).getT();
		model.addAttribute("aboutus", t);
		
		//获取新闻列表
		entity =iArticleClassBusiness.selectArticleClassByNameEn(ConstantUtil.NEWS_CENTER, null, null).getT();
		List<ArticleEntity> list2 = iArticleBusiness.selectArticleByClassId(entity.getId(), 1, 10).getList();
		model.addAttribute("newsCenter",list2);
		
		//获取联系方式
		entity = iArticleClassBusiness.selectArticleClassByNameEn(ConstantUtil.CONTACT_WAY, null, null).getT();
		model.addAttribute("contactWay", iArticleBusiness.selectArticleByClassId(entity.getId(), null, null).getT());
		
		ProductEntity pe = new ProductEntity();
		model.addAttribute("hotProductListMap",commonController.getProductElseInfo(iProductBusiness.selectHotProduct(pe,1, 1, 8, 1, 1).getList()));
		model.addAttribute("newProductListMap",commonController.getProductElseInfo(iProductBusiness.selectNewProduct(pe,1, 1, 8).getList()));
		model.addAttribute("providedListMap",commonController.getProductElseInfo(iProductBusiness.selectProductByLevel(pe,1, 1, 8).getList()));

		//友情连接
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sortOrder", "rank desc");
		List<SysLinkEntity> linkList = iSysLinkBusiness.selectSysLinkByMap(map, 1, 3).getList();
		for (SysLinkEntity link : linkList) {
			link.setUrl(ImageUtils.getImageUrl(link.getUrl()));
		}
		model.addAttribute("sysLinkList",linkList);
		
		//获取流动图片
		BusinessData<SysCarouselEntity> data = iSysCarouselBusiness.selectSysCarouselByType(1, null, null);
		String realUrl = ImageUtils.getImageUrl("/");
		model.addAttribute("data", data.getList());
		model.addAttribute("realUrl", realUrl);
		
		// 轮播图片时间间隔
		SysDictEntity flashviewdate = sysDictBusiness.selectDictBynameEn("flashviewdate");
		model.addAttribute("flashviewdate", flashviewdate.getContent());
		
		return forwardPage("web/index");
	}
	
	
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月27日上午9:28:55
	 * @description:首页加载更多
	 * @param model
	 * @param pageIndex
	 * @param pageSize
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/web/loadMore.html",method=RequestMethod.POST)
	public void loadMore(@RequestParam Integer type,Integer pageIndex, Integer pageSize){
		Map<String, Object> map = new HashMap<String, Object>();
		List<ProductEntity> list = null;
		if(1==type){
			list = iProductBusiness.selectHotProduct(null,1, pageIndex, 8, 1 ,1).getList();
			map.put("listSize",list.size());
			map.put("moreList", commonController.getProductElseInfo(list));
		}else if(2==type){
			list =iProductBusiness.selectNewProduct(null,1, pageIndex, 8).getList();
			map.put("listSize",list.size());
			map.put("moreList", commonController.getProductElseInfo(list));
		}else if(3==type){
			list =iProductBusiness.selectProductByLevel(null,1, pageIndex, 8).getList();
			map.put("listSize",list.size());
			map.put("moreList", commonController.getProductElseInfo(list));
		}
		this.writeJson(map);
	}

	
	
	
}
