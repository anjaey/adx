package com.bhe.business.product;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductDetailEntity;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 产品主要表
 * @author schoff [2015年7月27日]
 */
@Service
public interface IProductBusiness {
	
	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertProduct(ProductEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductByKey(long primaryKey);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteProductByUuid(String uuid);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值  uuid
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateProductByKey(ProductEntity entity);
	
	/**
	 * @Description			查询数据[自定义]
	 * @param isdelete		是否查询回收箱的数据  0 只查询回收箱的数据  1 查询正常数据  2 查询所有数据
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductEntity> selectProductByIsDel(Integer isdelete, Integer pageIndex, Integer pageSize, List<Long> classIds, String content, Long type, Integer status);

	/**
	 * @Description			查询数据[nameCn]
	 * @param nameCn		根据[nameCn]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductEntity> selectProductByNameCn(String nameCn, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[brandid]
	 * @param brandid		根据[brandid]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<ProductEntity> selectProductByBrandid(long brandid, Integer pageIndex, Integer pageSize,
			String orderParam, String orderRank);
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月5日上午10:05:18
	 * 描     述：  根据品牌编号统计商品数量
	 * @param brandid
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Integer> selectProductCount(Long brandid);
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月10日下午5:25:27
	 * 描     述：  根据品牌id 查询商品信息
	 * @param id
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductEntity> selectProInfo(Long id);
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月11日上午11:39:39
	 * 描     述：  根据品牌编号统计产品数量
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Integer> selectProByBranNoCount(Long id);
	
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015年8月11日下午5:53:29
	 * 描     述：  添加产品详细信息
	 * @param pde
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> insertProDetail(ProductDetailEntity pde);
	/**
	 * 创 建 人：  zhangyu
	 * 日     期：  2015-8-11下午8:47:26
	 * 描     述： 修改产品详细信息
	 * @param pde
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateProDetail(ProductDetailEntity pde);
	
	/**
	 * 创 建 人： zhangyu
	 * 日     期：  2015-8-11下午8:59:13
	 * 描     述： 根据产品编号查询产品详细信息
	 * @param uuid
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductDetailEntity> selectProDetailByUuid(String uuid);

	/**
	 * 创 建 人： zhangyu
	 * 日     期：  2015-8-11下午8:59:24
	 * 描     述： 根据编号查询产品信息
	 * @param uuid
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ProductEntity> selectProInfoByUuid(String uuid);
	
	
	/**
		 * 创 建 人：  Dengpeng
		 * 日     期：  2015年8月13日下午5:20:51
		 * 描     述：获取热门产品
		 * @param entity
		 * @param pageIndex
		 * @param pageSize
		 * @return
		 * <br>-----------------------------<br>
		 * 修 改 人： 
		 * 日     期： 
		 * 描     述： (注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectHotProduct(ProductEntity entity,Integer status,Integer pageIndex, Integer pageSize, Integer toshowproduct, Integer topopular);
		
		/**
		 * 创 建 人：  Dengpeng
		 * 日     期：  2015年8月13日下午5:21:32
		 * 描     述： 新品上市
		 * @param entity
		 * @param pageIndex
		 * @param pageSize
		 * @return
		 * <br>-----------------------------<br>
		 * 修 改 人： 
		 * 日     期： 
		 * 描     述： (注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectNewProduct(ProductEntity entity,Integer status,Integer pageIndex, Integer pageSize);
		
		/**
		 * @author: Dengpeng
		 * @date: 2015年8月15日上午9:34:04
		 * @description:根据商品 排序查找
		 * @param entity
		 * @param pageIndex
		 * @param pageSize
		 * @return
		 * <br>-----------------------------<br>
		 * @update:
		 * @date: 
		 * @description:	(注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectProductByLevel(ProductEntity entity,Integer status,Integer pageIndex, Integer pageSize);
		
		/**
		 * @author: Dengpeng
		 * @date: 2015年8月18日上午9:45:59
		 * @description:根据产品分类获取产品
		 * @param clazzId
		 * @param pageIndex
		 * @param pageSize
		 * @return
		 * <br>-----------------------------<br>
		 * @update:
		 * @date: 
		 * @description:	(注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<Map<String, Object>> selectProductByClazzId(String sql, Long clazzId,Integer status,Integer pageIndex, Integer pageSize);
		
		/**
		 * @author: Dengpeng
		 * @date: 2015年8月18日上午11:17:58
		 * @description:根据showtype 获取商品
		 * @param showType
		 * @param pageIndex
		 * @param pageSize
		 * @return
		 * <br>-----------------------------<br>
		 * @update:
		 * @date: 
		 * @description:	(注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectProductByShowType(Integer showType,Integer status,Integer pageIndex, Integer pageSize);
		
		/**
		 * @author: Dengpeng 
		 * @date: 2015年8月19日下午2:29:20
		 * @description:获取同类其他产品
		 * @param clazzId
		 * @param pageIndex
		 * @param pageSize
		 * @return
		 * <br>-----------------------------<br>
		 * @update:
		 * @date: 
		 * @description:	(注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectOtherProductByClazzId(Long id,Long clazzId,Integer status,Integer pageIndex, Integer pageSize);
	
		/**
		 * @author: 林
		 * @date: 2015年8月24日下午5:57:12
		 * @description:					根据产品id 查询数据
		 * @param id						产品id
		 * @return
		 * <br>-----------------------------<br>
		 * @update:
		 * @date: 
		 * @description:	(注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectProductById(long id);

		
		
		/**
		 * @author: yichuan
		 * @date: 2015年8月30日下午10：30
		 * @description:					根据产品关键字 查询数据
		 * @param id						产品id
		 * @return
		 * <br>-----------------------------<br>
		 * @update:
		 * @date: 
		 * @description:	(注明修改原因) 
		 * <br>-----------------------------<br>
		 */
		public BusinessData<ProductEntity> selectProductByKeywords(String title, String startprice, String endprice, Integer pageIndex, Integer pageSize);
		
}
