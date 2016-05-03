package com.bhe.business.article;

import org.springframework.stereotype.Service;
import com.bhe.dao.mybatis.model.ArticleClassEntity;
import com.bhe.util.common.BusinessData;

/** 
 * 创 建 人： zhangyu
 * 日     期： 2015年7月30日上午10:26:00
 * 描     述：文章分类业务处理接口
 * --------------------------------------
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * --------------------------------------
 */
@Service
public interface IArticleClassBusiness {

	/**
	* 创 建 人： zhangyu
	* 日     期：  2015年7月30日上午10:28:08
	* 描     述： 文章分类添加
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> insertArtCla(ArticleClassEntity ace);
	
	/**
	* 创 建 人： zhangyu
	* 日     期：  2015年7月30日上午10:28:57
	* 描     述： 文章分类批量删除
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> deleteArtClaByaId(Long id);
	
	/**
	* 创 建 人： zhangyu
	* 日     期：  2015年7月30日上午10:30:41
	* 描     述： 文章分类修改
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<Boolean> updateArtCla(ArticleClassEntity ace);
	
	/**
	* 创 建 人： zhangyu
	* 日     期：  2015年7月30日上午10:40:02
	* 描     述： 文章分类分页查询 支持排序 和根据文章分类标题进行查询 
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<ArticleClassEntity> selectArtClaPage(Integer pageIndex,Integer pageSize,
			Integer orderType,Integer orderFile,String artClatitle);
	
	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015年7月31日上午11:09:40
	 * 描     述： 根据id查询文章分类详情
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleClassEntity> selectArtClaByid(Integer id);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日下午3:37:07
	 * 描     述：查询所有类型
	 * @param pageIndex					当前页数[可为空]
	 * @param pageSize					每页显示数[可为空]
	 */
	public BusinessData<ArticleClassEntity> selectArticleClassByAll(Integer pageIndex, Integer pageSize);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月11日下午4:11:12
	 * 描     述：根据父id查询所有类型
	 * @param parentId					父id
	 * @param pageIndex					当前页数[可为空]
	 * @param pageSize					每页显示数[可为空]
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleClassEntity> selectArticleClassByParentId(int parentId,Integer pageIndex, Integer pageSize);
	
	/**
	 * @author: 林
	 * @date: 2015年8月21日上午11:32:27
	 * @description:					根据类型查询分类
	 * @param resoureceId
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleClassEntity> selectArticleClassByResoureceId(long resoureceId,Integer pageIndex, Integer pageSize);
	
	/**
	 * 创 建 人：  Dengpeng 
	 * 日     期：  2015年8月13日下午4:12:52
	 * 描     述：根据英文 名字查找
	 * @param parentId
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleClassEntity> selectArticleClassByNameEn(String nameEn,Integer pageIndex, Integer pageSize);
	
	/**
	 * @author: jsy
	 * @date: 2015年8月24日下午5:38:18
	 * @description:根据中文 名字查找
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
	public BusinessData<ArticleClassEntity> selectArticleClassByNameCn(String nameCn,Integer pageIndex, Integer pageSize);
	
}
