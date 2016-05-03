package com.bhe.business.product;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 产品分类
 * @author schoff [2015年7月27日]
 */
@Service
public interface IProductCategoryBusiness {
	
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertProductCategory(ProductCategoryEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductCategoryByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateProductCategoryByKey(ProductCategoryEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductCategoryEntity> selectProductCategoryByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);

	/**
	 * @Description			查询数据[nameCn]
	 * @param nameCn		根据[nameCn]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductCategoryEntity> selectProductCategoryByNameCn(String nameCn, Integer pageIndex, Integer pageSize,long parentid);
	
	/**
	 * @author: jsy
	 * @date: 2015年8月24日下午5:41:31
	 * @description:根据[nameCn]查询
	 * @param nameCn
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductCategoryEntity> selectProductCategoryByNameCn(String nameCn, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[id]
	 * @param id			根据[id]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductCategoryEntity> selectProductCategoryById(long id);
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月14日下午2:50:44
	 * 描     述：					查询所有数据
	 * @param pageIndex			当前页数
	 * @param pageSize			每页显示数
	 * @param orderParam		排序的参数
	 * @param orderRank			排序的方式[desc 倒序]
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductCategoryEntity> selectProCateByAll(Integer pageIndex, Integer pageSize, String orderParam, String orderRank);
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月6日上午10:35:30
	 * 描     述： 查询当前分类的子分类的数量
	 * @param parentid
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Integer> selectProCateCount(long id);
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月13日下午2:43:51
	 * 描     述：根据父Id 查询
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductCategoryEntity> selectProCateByParentId(long id);
	
	/**
	 * @author: 林
	 * @date: 2015年8月25日下午8:51:29
	 * @description: 查询所有数据
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductCategoryEntity> selectProCateByAll();
	/**
	 * @author: Dengpeng 
	 * @date: 2015年8月17日上午10:12:55
	 * @description:根据 resources Id 查询 分类
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductCategoryEntity> selectProCateByResId(long id,boolean isParent);
	
	/**
	 * @author: 林
	 * @date: 2015年8月18日下午3:17:10
	 * @description:					根据id查询数据
	 * @param id						需要查询的id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductCategoryEntity> selectProCateById(long id);

}
