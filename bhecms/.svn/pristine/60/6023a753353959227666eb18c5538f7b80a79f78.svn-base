package com.bhe.controller.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.business.product.IProductBrandBusiness;
import com.bhe.business.system.ISysResourceBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.ListMapUtil;

@Controller
public class CommonController extends BaseController{

	@Autowired
	private IProductBrandBusiness iProductBrandBusiness;

	@Autowired
	private IProductAttachmentBusiness iProductAttachmentBusiness;

	@Autowired
	private ISysResourceBusiness iSysResourceBusiness; 

	/**
	 * @author: zhangyu
	 * @date: 2015年8月24日下午4:49:25
	 * @description: 获取图片
	 * @param listmap
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public List<Map<String, Object>> getProductElseInfomap(List<Map<String, Object>> listmap){
		List<ProductEntity> list = new ArrayList<ProductEntity>();
		try {
			for (Map<String, Object> map : listmap) {
				Map<String, Object> tempMap = ListMapUtil.mapKeyToLowerCase(map);
				ProductEntity pe = (ProductEntity) ListMapUtil.setEntityValue(tempMap, ProductEntity.class);
				list.add(pe);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getProductElseInfo(list);
	}
	
	
	

	/**
	 * @author: 获取商品主图片，品牌
	 * @date: 2015年8月15日上午9:27:57
	 * @description:
	 * @param list
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public List<Map<String, Object>> getProductElseInfo(List<ProductEntity> list){
		List<Map<String, Object>> listMap;
		try {
			listMap = ListMapUtil.convertListEntityToListMap(list);
			for (Map<String, Object> map : listMap) {//获取每个产品的 品牌名称
				map.put("brandName", iProductBrandBusiness.selectByid((long)map.get("brandid")).getT().getNamecn());
				//查询商品封面(附件表中的主图片)
				BusinessData<ProductAttachmentEntity> bdentity = iProductAttachmentBusiness.selectProductAttachmentBykey(true, map.get("uuid").toString(),ConstantUtil.PRO_FILE_PROINFO);
				ProductAttachmentEntity proatt = null;
				if (!CommonUtil.isEmpty(bdentity) && !CommonUtil.isEmpty(bdentity.getList())) { 
					if (bdentity.getList().size()>0) {
						proatt = bdentity.getList().get(0);
					}
				}
				//处理商品图片
				if (!CommonUtil.isEmpty(proatt)) {
					String url = ImageUtils.getImageUrl(proatt.getUrl());
					map.put("productImgurl", url); 
				} else {
					map.put("productImgurl",ConstantUtil.FTP_NOTRESOURCE_DEFAULT); //这儿处理默认图片
				}
			}

		} catch (Exception e) {
			log.error(e);
			return null;
		}
		return listMap;

	}
	/**
	 * @author: Dengpeng
	 * @date: 2015年8月18日下午2:47:46
	 * @description:图片处理
	 * @param list
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public List<ProductAttachmentEntity> imgOperation(List<ProductAttachmentEntity> list){
		if(!list.isEmpty()){
			for (ProductAttachmentEntity proatt : list) {
				String url = ImageUtils.getImageUrl(proatt.getUrl());
				proatt.setUrl(url);
			}
		}
		return list;
	}


	public Map<String, Object> getProductElseInfo(ProductEntity productEntity){
		Map<String, Object> map;
		try {
			map = ListMapUtil.convertEntityToMap(productEntity);
			map.put("brandName", iProductBrandBusiness.selectByid((long)map.get("brandid")).getT().getNamecn());
			//查询商品封面(附件表中的主图片)
			BusinessData<ProductAttachmentEntity> bdentity = iProductAttachmentBusiness.selectProductAttachmentBykey(true, map.get("uuid").toString(),ConstantUtil.PRO_FILE_PROINFO);
			ProductAttachmentEntity proatt = null;
			if (!CommonUtil.isEmpty(bdentity) && !CommonUtil.isEmpty(bdentity.getList())) { 
				if (bdentity.getList().size()>0) {
					proatt = bdentity.getList().get(0);
				}
			}
			//处理商品图片
			if (!CommonUtil.isEmpty(proatt)) {
				String url = ImageUtils.getImageUrl(proatt.getUrl());
				map.put("productImgurl", url); 
			} else {
				map.put("productImgurl",ConstantUtil.FTP_NOTRESOURCE_DEFAULT); //这儿处理默认图片
			}
			return map;
		} catch (Exception e) {
			log.error(e);
			return null;
		}
	}


	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月14日下午1:54:21
	 * 描     述：递归查找 所有 导航
	 * @param parentId
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public List<Map<String,Object>>  findResourceToTree(Integer parentId){
		List<Map<String,Object>> listmap = new ArrayList<Map<String,Object>>();
		List<SysResourceEntity> list = iSysResourceBusiness.selectSysResByparid(parentId,0,"rank",null).getT();
		for (SysResourceEntity entity : list) {
			Map<String,Object> entityMap = new HashMap<String,Object>();
			entityMap.put("url", entity.getUrl());
			entityMap.put("name", entity.getNamecn());
			entityMap.put("code", entity.getCode());
			entityMap.put("id", entity.getId());
			if(!list.isEmpty()){
				List<Map<String,Object>> child = findResourceToTree(entity.getId());
				if(!child.isEmpty()){
					entityMap.put("child",child);
				}

			}
			listmap.add(entityMap);
		}
		return listmap;
	}

}
