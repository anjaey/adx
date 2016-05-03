package com.bhe.business.product;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 产品附件
 * @author schoff [2015年7月27日]
 */
@Service
public interface IProductAttachmentBusiness {

	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertProductAttachment(ProductAttachmentEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductAttachmentByKey(String uuid);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateProductAttachmentByKey(ProductAttachmentEntity entity);
	
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月12日下午2:16:26
	 * 描     述：修改当前数据为主图		
	 * @param uuid
	 * @param ismain 状态
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateProductByUuid(String uuid,ProductAttachmentEntity pae);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductAttachmentEntity> selectProductAttachmentByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);

	/**
	 * @Description			查询数据[name]
	 * @param name			根据[name]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductAttachmentEntity> selectProductAttachmentByName(String name, Integer pageIndex, Integer pageSize);
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月10日上午10:30:55
	 * 描     述：  根据主键查询附件信息
	 * @param isMain  true 查询当前附件的主附件   false 查询相关的所有附件
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductAttachmentEntity> selectProductAttachmentBykey(Boolean isMain, String key, String filemodule);
}
