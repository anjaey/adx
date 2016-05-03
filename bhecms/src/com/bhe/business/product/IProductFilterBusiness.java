package com.bhe.business.product;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductFilterEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 产品属性筛选
 * @author schoff [2015年7月27日]
 */
@Service
public interface IProductFilterBusiness {
	
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertProductFilter(ProductFilterEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductFilterByKey(String primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateProductFilterByKey(ProductFilterEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductFilterEntity> selectProductFilterByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);

	/**
	 * @Description			查询数据[name]
	 * @param name			根据[name]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductFilterEntity> selectProductFilterByName(String name, Integer pageIndex, Integer pageSize);
	
	/**
	 * @author: 林
	 * @date: 2015年8月18日下午2:43:38
	 * @description:					根据类型id查询所有数据
	 * @param pageIndex					当前页数
	 * @param pageSize					每页显示数
	 * @param orderParam				排序字段
	 * @param orderRank					排序方式[desc,默认为正序]
	 * @return							数据集合对象
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductFilterEntity> selectProductFilterByCategoryid(Long categoryid, Integer pageIndex, Integer pageSize,String orderParam ,String orderRank);
	
	/**
	 * @author: 林
	 * @date: 2015年8月19日上午11:30:56
	 * @description:					根据uuid 查询数据
	 * @param uuid						主键
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductFilterEntity> selectProductFilterByUuid(String uuid);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月24日上午10:41:16
	 * @description:  分组查询指定分类的属性，按属性排序，attrank 越大在前面，返回属性值和序号。
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<List<Map<String, Object>>> selectGroupPEByCateid(String cateid);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月24日上午11:22:06
	 * @description:  根据属性值查询属性对应的属性值 根据rank 排序  越大在前。
	 * @param name
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<List<ProductFilterEntity>> selectPEByName(Long cateid, String name);
}
