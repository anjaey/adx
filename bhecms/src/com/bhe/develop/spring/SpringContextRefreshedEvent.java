package com.bhe.develop.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISysDictBusiness;
import com.bhe.util.common.PropertiesUtil;


/**
 * spring 容器初始化完成事件
 * @author sslf
 * @datetime 2015年7月8日上午10:42:14
 */
public class SpringContextRefreshedEvent implements ApplicationListener<ContextRefreshedEvent> {

	private Log log = LogFactory.getLog(SpringContextRefreshedEvent.class);
	
	@Autowired
	private ISysDictBusiness sysDictBusinessImpl;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		log.debug("初始化字典");
		try {
			this.sysDictBusinessImpl.selectAll();
			log.debug("初始化字典成功");
		} catch (Exception e) {
			log.error(e, e);
		}
		getTableNameToMap();
	}
	
	/**
	 * @author: 林
	 * @date: 2015年8月31日下午6:01:01
	 * @description: 获取配置文件中的表名到常量池map中
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private void getTableNameToMap() {
		String path = SpringContextRefreshedEvent.class.getResource("/").getPath();
		PropertiesUtil propertiesUtil = new PropertiesUtil(path+"tablename.properties");
		BaseBusiness.tablename = propertiesUtil.getAllProperty();
	}

	
}