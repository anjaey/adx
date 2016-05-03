package com.bhe.business.system;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductSearchEntity;
import com.bhe.util.common.BusinessData;

@Service
public interface IProSearchBusiness {
	/**
	 * @author: jsy
	 * @date: 2015年8月30日上午7:47:54
	 * @description:插入商品关键字搜索实体
	 * @param entity
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public  BusinessData<Boolean>  insertProSearch(ProductSearchEntity entity);
	/**
	 * @author: jsy
	 * @date: 2015年8月30日上午7:48:57
	 * @description:删除
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> delProSearch(Long id);
	/**
	 * @author: jsy
	 * @date: 2015年8月30日上午11:10:47
	 * @description:根据id查询信息
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductSearchEntity> selectProSearchById(Long id);
	/**
	 * @author: jsy
	 * @date: 2015年8月30日上午7:49:22
	 * @description:修改
	 * @param entity
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	
	public BusinessData<Boolean> updateProSearchByKey(ProductSearchEntity entity);
	
	/**
	 * @author: jsy
	 * @date: 2015年8月30日上午7:49:43
	 * @description:查询
	 * @param title
	 * @param minPri
	 * @param maxPri
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductSearchEntity> selectProSearchByKey(String title,String minPri,String maxPri,Integer pageIndex,Integer pageSize);
	
	/**
	 * @author: yichuan
	 * @date: 2015年8月30日上午7:49:43
	 * @description:查询
	 * @param title
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductSearchEntity> selectProSearchByTitle(String title,String minPri,String maxPri,Integer pageIndex,Integer pageSize);
	
	
	public BusinessData<ProductSearchEntity> selectProSearchByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);
	/**
	 * @author: yichuan
	 * @date: 2015年8月30日上午7:49:43
	 * @description:查询 搜索热词  前 6位
	 * @param title
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductSearchEntity> selectProSearchKeyWordesTop(Integer i);
	

	
	
}
