package com.bhe.develop.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bhe.business.system.ISysDictBusiness;
import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.util.CacheTemp;

/**
 * 字典表缓存工具
 * @author sslf
 * @datetime 2015年7月8日上午11:43:44
 */
public class DictUtil {

	private Log log = LogFactory.getLog(DictUtil.class);
	
	@Autowired
	private ISysDictBusiness sysDictBusinessImpl;
	
	private Map<String, List<SysDictEntity>> result;
	
	
	/**创 建 人：  陈建伟
	 * 日     期：  2015年8月7日下午2:48:51
	 * 描     述：根据英文名称 得到他自己这条数据
	 * @param nameEn 目标数据的英文名称
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */ 
	public static SysDictEntity getSelf(String nameEn){
		return CacheTemp.dataMap.get(nameEn);
	}
	
	/**
	 * 根据字典表中的英文名称获取该节点的直接子类
	 * @param nameEn 该节点的英文名称
	 * @return List 子类集合
	 * @author sslf
	 */
	public static List<SysDictEntity> getChilds(String nameEn){
		List<SysDictEntity> result = null;
		
		// 得到缓存里的该父节点的uuid
		String uuid = CacheTemp.nameMap.get(nameEn);
		
		// 得到直接子类
		result = CacheTemp.valuesMap.get(uuid); 
		
		return result;
	}
	
	
	
	/**
	 * 返回直接子节点 map对象
	 * @param nameEn
	 * @return
	 * @author 陈建伟
	 * <ul>
	 *  <li>陈建伟 2015年7月27日下午4:22:06 新建该方法</li>
	 * </ul>
	 */
	public static Map<String, SysDictEntity> getMapChilds(String nameEn){
		Map<String, SysDictEntity> result = new HashMap<String, SysDictEntity>();
		List<SysDictEntity> childs = getChilds(nameEn);
		
		// 判断该节点下面是否有直接子节点
		if (null != childs){
			for (SysDictEntity sysDictEntity : childs) {
				result.put(sysDictEntity.getNameen(), sysDictEntity);
			}
		}
		
		return result;
	}
	/**
	 * 得到该nameEn的所有子节点
	 * @param nameEn 该节点的英文名称
	 * @return  
	 * @author sslf
	 */
	public Map<String, List<SysDictEntity>> getAllChilds(String nameEn){
		this.result = new LinkedMap<String, List<SysDictEntity>>();
		
		getNextChild(nameEn);
		
		return this.result;
	}
	
	
	
	private void getNextChild(String nameEn){
		// 根据nameEn得到uuid
		String uuid = CacheTemp.nameMap.get(nameEn);
		
		// 得到目标节点的直接子节点
		List<SysDictEntity> tempList = CacheTemp.valuesMap.get(uuid);
		if (tempList != null){
			// 把当前的子节点添加的返回map中
			this.result.put(nameEn, tempList);
			for (SysDictEntity sysDictEntity : tempList) {
				getNextChild(sysDictEntity.getNameen());
			}
		}
	}
	
	/**
	 * 在字典表中新增一条字典数据
	 * @param sysDictEntity 新增数据对象，完整的数据
	 * @author sslf
	 */
	public void addDictCache(SysDictEntity sysDictEntity){
		String uuid = sysDictEntity.getUuid();
		// 新增nameMap
		CacheTemp.nameMap.put(sysDictEntity.getNameen(), uuid);
		
		// 新增dataMap
		CacheTemp.dataMap.put(sysDictEntity.getNameen(), sysDictEntity);
		
		// 新增valuesMap
		List<SysDictEntity> temp = CacheTemp.valuesMap.get(uuid);
		if (temp == null){
			temp = new ArrayList<SysDictEntity>();
			temp.add(sysDictEntity);
			CacheTemp.valuesMap.put(uuid, temp);
		}else {
			temp.add(sysDictEntity);
		}
	}
	
	/**
	 * 根据nameEn 修改该条缓存数据的内容和状态，如果目标数据是顶级节点，就只能修改状态字段
	 * @param nameEn 修改目标英文名称
	 * @param content 要替换的内容
	 * @param status 要修改的状态
	 * @author sslf
	 */
	public void updateDictCache(String nameEn,String content,Integer status){
		// 判断是不是等级节点
		String parentId = CacheTemp.nameParentIdMap.get(nameEn);
		if (StringUtils.isNotEmpty(parentId)){
			// 不是顶级节点
			// 得到该节点的直接父节点
			update(nameEn, content, status, parentId);
		}else {
			// 是顶级节点
			update(nameEn, content, status, CacheTemp.superParentId);
		}
	}

	private void update(String nameEn, String content, Integer status, String parentId) {
		List<SysDictEntity> list = CacheTemp.valuesMap.get(parentId);
		for (SysDictEntity sysDictEntity : list) {
			if (nameEn.equals(sysDictEntity.getNameen())){
				if (StringUtils.isNoneBlank(content)){
					sysDictEntity.setContent(content);
				}
				if (status != null){
					sysDictEntity.setStatus(status);
				}
			}
		}
		// 修改dataMap
		SysDictEntity tempData = CacheTemp.dataMap.get(nameEn);
		if (StringUtils.isNoneBlank(content)){
			tempData.setContent(content);
		}
		if (status != null){
			tempData.setStatus(status);
		}
		
	}
	
	/**
	 * 根据nameEn 修改该条缓存数据的内容
	 * @param nameEn 修改目标英文名称
	 * @param content 要替换的内容
	 * @author sslf
	 */
	public void updateDictCache(String nameEn,String content){
		updateDictCache(nameEn,content,null);
	}
	
	/**
	 * 根据nameEn 修改该条缓存数据的状态
	 * @param nameEn 修改目标英文名称
	 * @param status 要修改的状态
	 * @author sslf
	 */
	public void updateDictCache(String nameEn,Integer status){
		updateDictCache(nameEn,null,status);
	}
	
	/**
	 * 根据英文名称删除字典表中的一条数据
	 * @param nameEn 要删除的英文名称
	 * @author sslf
	 */
	public void deleteDictCache(String nameEn){
		String uuid = CacheTemp.nameMap.get(nameEn);
		if (StringUtils.isNotEmpty(uuid)){
			// 删除nameMap
			CacheTemp.nameMap.remove(nameEn);
			// 删除dataMap
			CacheTemp.dataMap.remove(nameEn);
			
			// 删除valuesMap
			// 如果该节点是父节点，就删除下面的所有子节点
			String parentId = CacheTemp.nameParentIdMap.get(nameEn);
			
			if (StringUtils.isNotBlank(parentId)){
				CacheTemp.valuesMap.remove(uuid);
				CacheTemp.nameParentIdMap.remove(nameEn);
			}else { 
				// 如果该节点是子节点
				List<SysDictEntity> list = CacheTemp.valuesMap.get(parentId);
				Integer index = null;
				for (int i = 0; i < list.size(); i++) {
					if (nameEn.equals(list.get(i))){
						index = i;
						break;
					}
				}
				// 根据下标删除对象
				list.remove(index);
				
				// 判断删除该子节点后，这个list是否为空，如果是，顺带也删除
				//TODO 字典工具递归删除
			}
			
			
		}
	}
	/**
	 * 刷新缓存字典数据，调用此方法会重新加载所有的字典数据，推荐在字典数据发生重大变化后使用该方法，如果只是新增修改数据，还是调用对应的修改新增方法来更新缓存
	 * @author sslf
	 */
	public void refreshDictCache(){
		this.log.debug("准备刷新字典缓存数据");
		
		// 清空旧的缓存
		CacheTemp.nameMap = null;
		CacheTemp.valuesMap = null;
		CacheTemp.dataMap = null;
		
		try {
			this.sysDictBusinessImpl.selectAll();
			this.log.debug("字典缓存刷新成功");
		} catch (Exception e) {
			this.log.error(e,e);
		}
	}

	/**
	 * 获取顶级节点
	 * @author sslf
	 */
	public List<SysDictEntity> getSuperNode() {
		return CacheTemp.valuesMap.get(CacheTemp.superParentId);
	}
}
