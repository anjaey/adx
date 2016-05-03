package com.bhe.business.product;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 产品品牌
 * @author schoff [2015年7月27日]
 */
@Service
public interface IProductBrandBusiness {

	/**
	 * @Description 插入数据
	 * @param entity
	 *            需要插入的数据
	 * @return State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertProductBrand(ProductBrandEntity entity);

	/**
	 * @Description 根据主键删除数据
	 * @param primaryKey
	 *            需要删除的数据的主键
	 * @return State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductBrandByKey(long primaryKey);

	/**
	 * @Description 根据主键修改数据
	 * @param entity
	 *            需要修改的数据包含主键的值
	 * @return State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateProductBrandByKey(ProductBrandEntity entity);

	/**
	 * @Description 查询数据[自定义]
	 * @param entity
	 *            需要查询的数据条件
	 * @param pageIndex
	 *            当前页数
	 * @param pageSize
	 *            每页显示数
	 * @return State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductBrandEntity> selectProductBrandByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);

	/**
	 * @Description 查询数据[nameCn]
	 * @param nameCn
	 *            根据[nameCn]查询
	 * @param pageIndex
	 *            当前页数
	 * @param pageSize
	 *            每页显示数
	 * @return State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductBrandEntity> selectProductBrandByNameCn(String nameCn, Integer pageIndex, Integer pageSize);

	/**
	 * @Description 查询数据[id]
	 * @param id
	 *            根据[id]查询
	 * @param pageIndex
	 *            当前页数
	 * @param pageSize
	 *            每页显示数
	 * @return State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductBrandEntity> selectProductBrandById(long id, Integer pageIndex, Integer pageSize, String orderParam, String orderRank);

	/**
	 * @author: 林
	 * @date: 2015年8月24日下午1:49:13
	 * @description: 查询所有显示或者不显示的数据
	 * @param isshow
	 *            是否显示
	 * @param pageIndex
	 * @param pageSize
	 * @param orderParam
	 * @param orderRank
	 * @return <br>
	 *         -----------------------------<br>
	 * @update:
	 * @date:
	 * @description: (注明修改原因) <br>
	 *               -----------------------------<br>
	 */
	public BusinessData<ProductBrandEntity> selectProductBrandByIsShow(int isshow, Integer pageIndex, Integer pageSize, String orderParam, String orderRank);

	/**
	 * 创 建 人： zhangyu 日 期： 2015年8月11日下午1:51:21 描 述： 根据品牌ID查询品牌信息
	 * 
	 * @param id
	 * @return <br>
	 *         -----------------------------<br>
	 *         修 改 人： 日 期： 描 述： (注明修改原因) <br>
	 *         -----------------------------<br>
	 */
	public BusinessData<ProductBrandEntity> selectByid(Long id);

}
