package com.bhe.business.product;

import org.springframework.stereotype.Service;
import com.bhe.dao.mybatis.model.ProductSolutionsEntity;
import com.bhe.util.common.BusinessData;

/**
 * @author: zhangyu
 * @date: 2015年8月17日下午3:46:58
 * @description:  解决方案接口
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Service
public interface IProductSolutionsBusiness {

	/**
	 * @author: zhangyu
	 * @date: 2015年8月17日下午3:47:51
	 * @description:  添加解决方案基本信息
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> insertSolutions(ProductSolutionsEntity pse);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月17日下午3:58:49
	 * @description: 删除解决方案
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> deleteSolutions(String uuid);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月18日下午1:43:43
	 * @description:  修改解决方案基本信息
	 * @param pse
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateSolutions(ProductSolutionsEntity pse);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月17日下午4:02:00
	 * @description:  查询解决方案信息
	 * @param title 为空是查询所有
	 * @param pageIndex 
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductSolutionsEntity> selectSolutions(String title, Integer pageIndex, Integer pageSize, String orderType, String orderFile);
	
	/**
	 * @author: zhangyu
	 * @date: 2015年8月21日上午9:15:48
	 * @description:  查询详情
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductSolutionsEntity> selectSolutionByid(String uuid);
}
