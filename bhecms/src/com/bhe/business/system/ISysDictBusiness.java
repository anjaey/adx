package com.bhe.business.system;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.util.common.BusinessData;

/**
 * 系统字典业务层接口
 * @author sslf
 * @datetime 2015年7月7日上午9:49:22
 */
@Service
public interface ISysDictBusiness {
	
	public void selectAll() throws Exception;
	
	
	/**
	 * @Description 数据库数据更新，以主键进行更新
	 * @author schoff [2015年7月21日]
	 * @param map		包含需要更新的数据字段及对应的值，更新的条件及对应的值<p>
	 * 	EP:<p>
	 * 		Map<String, Object> map = new HashMap<String, Object>();<p>
	 *		map.put("name", "test");	// 需要更新字段及值<p>
	 *		map.put("主键字段", "值") 		// 更新的条件的值<p>
	 *	PS:修改表中name为test条件为主键<p>
	 * @return State
	 */
	public BusinessData<Boolean> updateByKey(Map<String, Object> map);
	
	/**
	 * @Description 根据nameen来修改数据库数据,,支持修改namecn,content,description,status字段<p>
	 * @author schoff [2015年7月22日]
	 * @param map		包含需要更新的数据字段及对应的值，更新的条件及对应的值<p>
	 * 	EP:<p>
	 * 		Map<String, Object> map = new HashMap<String, Object>();<p>
	 *		map.put("name", "test");	// 需要更新字段及值<p>
	 *		map.put("nameen", "1"); 	// 更新的条件的值<p>
	 *	PS:修改name为test条件是nameen为1的数据
	 * @return State
	 */
	public BusinessData<Boolean> updateByNameen(Map<String, Object> map);
	
	/**
	 * @Description 数据库数据删除，根据主键删除
	 * @author schoff [2015年7月21日]
	 * @param map		删除的条件及对应的值
	 * 	EP:<p>
	 * 		Map<String, Object> map = new HashMap<String, Object>();<p>
	 *		map.put("主键字段", "值");		// 删除的条件及对应的值
	 * 	PS:删除表中id为1的所有数据
	 * @return State
	 */
	public BusinessData<Boolean> deleteByKey(Map<String, Object> map);
	
	/**
	 * @Description 根据字典表中的英文名称获取该节点的直接子类
	 * @author schoff [2015年7月21日]
	 * @param nameEn				该节点的英文名称
	 * @return State<SysDictEntity>	
	 */
	public BusinessData<SysDictEntity> selectChilds(String nameEn);

	/**
	 * @author: 林
	 * @date: 2015年8月27日上午10:16:59
	 * @description:					根据英文名称查询数据
	 * @param nameEn					需要查询的数据
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public SysDictEntity selectDictBynameEn(String nameEn);
	
	/**
	 * @Description 根据字典表中的英文名称获取该节点的直接子类
	 * @author schoff [2015年7月27日]
	 * @param nameEn				该节点的英文名称
	 * @return Map<String,SysDictEntity>
	 */
	public Map<String, SysDictEntity> selectChildsMap(String nameEn);
	
	/**
	 * @Description 得到该nameEn的所有子节点
	 * @author schoff [2015年7月21日]
	 * @param nameEn 							该节点的英文名称
	 * @return Map<String,List<SysDictEntity>>	所有对应的子节点
	 */
	public Map<String, List<SysDictEntity>> selectAllChilds(String nameEn);
	
	/**
	 * @Description	获取所有顶级节点
	 * @author schoff [2015年7月22日]
	 * @return State<SysDictEntity>
	 */
	public BusinessData<SysDictEntity> selectTopNode();
	
	
}