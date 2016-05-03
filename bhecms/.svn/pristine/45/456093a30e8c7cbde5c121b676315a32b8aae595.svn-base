package com.bhe.business.product.refactor;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * @author: 林
 * @date: 2015年8月31日下午4:44:01
 * @description: 产品业务层(重构)
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Service
public interface IProductBusiness {
	
	/**
	 * @author: 林
	 * @date: 2015年8月31日下午5:09:33
	 * @description: 添加数据
	 * @param map	需要添加的数据
	 * @return	影响行数，主键，状态码
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@Deprecated
	public Map<String, Object> insertProduct(Map<String, Object> map);
	
	/**
	 * @author: 林
	 * @date: 2015年8月31日下午5:11:59
	 * @description: 删除数据
	 * @param uuid 需要删除的数据的uuid
	 * @return 影响行数，状态码
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@Deprecated
	public Map<String, Object> deleteProductByUuid(String uuid);
	
	/**
	 * @author: 林
	 * @date: 2015年8月31日下午5:12:26
	 * @description: 批量删除数据
	 * @param ids 需要删除的数据的集合
	 * @return 影响行数，状态码
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@Deprecated
	public Map<String, Object> deleteProductByUuidList(List<String> uuids);
	
	/**
	 * @author: 林
	 * @date: 2015年8月31日下午5:13:24
	 * @description: 修改状态
	 * @param ids
	 * 			需要修改的数据uuid(批量修改格式使用逗号[,]分开)
	 * @param status 
	 * 			修改的值
	 * @return 影响行数，状态码
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@Deprecated
	public Map<String, Object> updateProductForStatus(String uuids, int status);
	
	/**
	 * @author: 林
	 * @date: 2015年8月31日下午5:17:55
	 * @description: 查询数据用于产品管理
	 * @param map 需要查询的数据的条件
	 * @return 数据的map集合
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@Deprecated
	public Map<String, Object> selectProductForManage(Map<String, Object> map);
	
	
	
		
}
