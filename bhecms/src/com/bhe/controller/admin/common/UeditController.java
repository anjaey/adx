package com.bhe.controller.admin.common;

import java.io.FileInputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhe.develop.ueditor.ActionEnter;
import com.bhe.develop.ueditor.define.ActionMap;
import com.bhe.util.common.CacheMapUtil;
import com.bhe.util.common.DateUtil;
import com.bhe.util.common.FtpUtil;
import com.bhe.util.common.ImageConvert;
import com.bhe.util.common.JsonUtil;

@RestController
public class UeditController extends BaseController {
	private Log log = LogFactory.getLog(this.getClass());

	/**
	 * uedit总控制器
	 */
	@RequestMapping(value = "/admin/uedit", method = RequestMethod.GET)
	public void toUedit(@RequestParam("action") String departmentId) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setHeader("Content-Type", "text/html");

			URL resource = UeditController.class.getClassLoader().getResource(
					"/");
			String path = resource.getPath();
			String decodePath = URLDecoder.decode(path, "utf-8");

			ActionEnter actionEnter = new ActionEnter(request, decodePath
					+ "/config/uedit/");
			String exec = actionEnter.exec();
			writeJson(exec);
		} catch (Exception e) {
			log.error("获取百度编辑器配置出错", e);
			// 使用LOG输出日志
		}
	}

	/**
	 * uedit总控制器
	 */
	@RequestMapping(value = "/admin/uedit", method = RequestMethod.POST)
	public void toUeditPost(@RequestParam("action") String departmentId) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setHeader("Content-Type", "text/html");

			URL resource = UeditController.class.getClassLoader().getResource(
					"/");
			String path = resource.getPath();
			String decodePath = URLDecoder.decode(path, "utf-8");

			String actionType = request.getParameter("action");

			ActionEnter actionEnter = new ActionEnter(request, decodePath
					+ "/config/uedit/");

			String exec = actionEnter.exec();

			Map<String, Object> ueditToFtp = ueditToFtp(actionType, decodePath,
					exec);

			ueditToFtp.put("test","estss");
			writeJson(ueditToFtp);
		} catch (Exception e) {
			log.error("获取百度编辑器配置出错", e);
			// 使用LOG输出日志
		}
	}

	/**
	 * 将UEDIT编辑器里的图片上传到FTP
	 * 
	 * @param actionType
	 * @param exce
	 *            UEDIT上传后的数据
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> ueditToFtp(String actionType, String path,
			String exce) throws Exception {

		Map<String, Object> excMap = JsonUtil.JsonToObject(exce, Map.class);

		String state = excMap.get("state").toString();

		if ("SUCCESS".equals(state)) {
			String url = excMap.get("url").toString();
			String title = excMap.get("title").toString();

			int indexOf = path.indexOf("/classes");
			String realpath = path.substring(0, indexOf);
			realpath += url;

			int actionCode = ActionMap.getType(actionType);

			switch (actionCode) {
			// case ActionMap.CONFIG:
			case ActionMap.UPLOAD_IMAGE:
			case ActionMap.UPLOAD_SCRAWL:
			case ActionMap.UPLOAD_VIDEO:
			case ActionMap.UPLOAD_FILE:
				FileInputStream imgFileInputStream = new FileInputStream(
						realpath);
				String ftppath = CacheMapUtil.getConfigPropMap()
						.get("ueditimgurl").toString();

				Integer year = DateUtil.getYear(new Date());
				ftppath += year;

				Integer month = DateUtil.getMonth(new Date());
				String monthStr = null;
				String dateStr = null;
				if (month <= 9) {
					monthStr = "0" + month;
				} else {
					monthStr = String.valueOf(month);
				}

				Integer date = DateUtil.getDate(new Date());
				if (date <= 9) {
					dateStr = "0" + date;
				} else {
					dateStr = String.valueOf(date);
				}

				ftppath += "/" + monthStr + dateStr + "/" + title;

				// String imgType = url.substring(url.lastIndexOf(".")+1);
				// boolean compressStatus = ImageUtil.compressSize(620, 0,
				// realpath, realpath, imgType, true);
				boolean compressStatus = ImageConvert.compressImage(realpath,
						realpath, 620, true);
				if (compressStatus) {
					boolean status = FtpUtil.uploadSingleImage(ftppath,
							imgFileInputStream);

					if (!status) {
						log.error("UEDIT上传文件到FTP上失败" + ftppath);
					} else {
						String readUploadpath = CacheMapUtil.getConfigPropMap()
								.get("imghost").toString()
								+ ftppath;
						excMap.put("url", readUploadpath);
					}
				} else {
					log.error("图片剪裁失败" + realpath);
				}

				break;
			case ActionMap.CATCH_IMAGE:
				break;
			case ActionMap.LIST_IMAGE:
			case ActionMap.LIST_FILE:
				break;

			}
		}

		return excMap;
	}

	/**
	 * uedit总控制器
	 */
	@RequestMapping(value = "/admin/uploadimg", method = RequestMethod.GET)
	public void uploadimg() {
		try {
			request.setCharacterEncoding("utf-8");
			response.setHeader("Content-Type", "text/html");

			URL resource = UeditController.class.getClassLoader().getResource(
					"/");
			String path = resource.getPath();
			String decodePath = URLDecoder.decode(path, "utf-8");

			ActionEnter actionEnter = new ActionEnter(request, decodePath
					+ "/config/uedit/");
			String exec = actionEnter.exec();
			writeJson(exec);
		} catch (Exception e) {
			log.error("获取百度编辑器配置出错", e);
			// 使用LOG输出日志
		}
	}
}
