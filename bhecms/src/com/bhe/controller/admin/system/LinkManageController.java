package com.bhe.controller.admin.system;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhe.business.system.ISysLinkBusiness;
import com.bhe.controller.admin.common.BaseController;
import com.bhe.dao.mybatis.model.SysLinkEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ImageUtils;
import com.bhe.util.common.JsonUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.PageUtil;

/**
 * 创 建 人： zhangyu
 * 日     期： 2015年8月14日下午2:47:54
 * 描     述： 友情链接管理控制器
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Controller
public class LinkManageController extends BaseController {

	@Autowired
	private ISysLinkBusiness iSysLinkBusiness;

	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月8日上午11:16:05
	 * 描     述：进入导航管理页面
	 */
	@RequestMapping(value="/admin/link/tolinklist.html")
	public ModelAndView toLinkList(Model model, Integer pageIndex, Integer pageSize) {
		try {
			if (null == pageIndex || 0 == pageIndex) {
				pageIndex=1;
			}
			if (null == pageSize) {
				pageSize=15;
			}

			int rowno = PageUtil.getStart(pageIndex, pageSize);  //行号

			BusinessData<SysLinkEntity> link = iSysLinkBusiness.selectSysLinkByName(null, pageIndex, pageSize);
			List<SysLinkEntity> listsys = link.getList();

			List<Map<String, Object>> listobj = ListMapUtil.convertListEntityToListMap(listsys);
			if (!CommonUtil.isEmpty(listsys)) {
				for (Map<String, Object> map : listobj) {
					rowno ++;
					//设置图片
					Object urlobj = map.get("url");
					if (!CommonUtil.isEmpty(urlobj)) {
						String urlstr = urlobj.toString();
						urlstr = ImageUtils.getImageUrl(urlstr);
						map.put("url", urlstr);
					}

					//设置行号
					map.put("rowno", rowno);

					//处理状态
					Object statusobj = map.get("status");
					if (!CommonUtil.isEmpty(statusobj)) {
						String strtusstr = statusobj.toString();
						if ("1".equals(strtusstr)) {
							map.put("status", "显示");
						} else {
							map.put("status", "不显示");
						}
					}

				}
			}

			//转换
			Map<String, Object> linksmap;
			linksmap = ListMapUtil.convertEntityToMap(link);

			//重新设置list
			linksmap.put("list", listobj);

			model.addAttribute("frameLeft", "admin/navigatebar/left.html");
			model.addAttribute("currIndex","5");
			model.addAttribute("linksmap",linksmap);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return forwardPage("admin/navigatebar/linkManager");
	}


	/**
	 * @author: zhangyu
	 * @date: 2015年8月14日下午9:20:19
	 * @description: 删除数据
	 * @param id 编号
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/link/delLinkInfoById.html")
	public void delLinkInfoById(String id){
		if (!CommonUtil.isEmpty(id)) {
			Long idlong = Long.valueOf(id); 
			BusinessData<Boolean> bdboolean = iSysLinkBusiness.deleteSysLinkByKey(idlong);
			Boolean state = bdboolean.getState();
			if (state) {
				this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, ConstantUtil.RETURN_SUCCESS);
			} else {
				this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, ConstantUtil.RETURN_FAIL);
			}
		}
	}

	/**
	 * @author: zhangyu
	 * @date: 2015年8月14日下午9:21:25
	 * @description: 查看详情
	 * @param id
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/link/selectLinkInfoByid.html")
	public void selectLinkInfoByid(String id){
		Map<String, Object> map = null;
		try {
			if (!CommonUtil.isEmpty(id)) {
				Long idlong = Long.valueOf(id); 
				BusinessData<SysLinkEntity> bdsyslink = iSysLinkBusiness.selectByid(idlong);
				SysLinkEntity sysinfo = bdsyslink.getT();
				
				map = ListMapUtil.convertEntityToMap(sysinfo);
				//设置图片logo
				Object obj = map.get("url");
				if (!CommonUtil.isEmpty(obj)) {
					String objstr = obj.toString();
					String url = ImageUtils.getImageUrl(objstr);
					map.put("url", url);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, map);
	}

	/**
	 * @author: zhangyu
	 * @date: 2015年8月14日下午9:34:12  
	 * @description: 友情链接添加
	 * @param map
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@RequestMapping(value="/admin/link/addOrUpdateLinkInfo.html")
	@SuppressWarnings("unchecked")
	public void addOrUpdateLinkInfo(String param) {
		try {
			Map<String, Object> map = JsonUtil.JsonToObject(param,Map.class);
			if (!CommonUtil.isEmpty(map)) {
				SysLinkEntity syslinkinfo = (SysLinkEntity)ListMapUtil.setEntityValue(map, SysLinkEntity.class);
				Long id = syslinkinfo.getId();
				if (!CommonUtil.isEmpty(id)) {
					//查看当前id 是否存在
					BusinessData<SysLinkEntity>  bdentity = iSysLinkBusiness.selectByid(id);
					SysLinkEntity sle =bdentity.getT();
					
					if (CommonUtil.isEmpty(sle)) {
						iSysLinkBusiness.insertSysLink(syslinkinfo);
					} else {
						iSysLinkBusiness.updateSysLinkByKey(syslinkinfo);
					}
				} else {
					syslinkinfo.setCreatetime(new Date());
					iSysLinkBusiness.insertSysLink(syslinkinfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.writeJson(ConstantUtil.SYSTEM_DATA_RETURN, ConstantUtil.RETURN_SUCCESS);
	}

}
