package com.bhe.business.product;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductInquiriesEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 产品附件
 * @author schoff [2015年7月27日]
 */
@Service
public interface IProductInquiriesBusiness {

	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertProductInquiries(ProductInquiriesEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductInquiriesByKey(Integer id);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateProductInquiriesByKey(ProductInquiriesEntity entity);
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductInquiriesEntity> selectProductInquiriesByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);

	/**
	 * @Description			查询数据[name]
	 * @param name			根据[name]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductInquiriesEntity> selectProductInquiriesByName(List<String> uuids, String name, Integer pageIndex, Integer pageSize, Integer state);
	
	/**
	 * @Description			查询数据[id]
	 * @param name			根据[id]查询
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductInquiriesEntity> selectProductInquiriesById(Integer uuid);
	
}
