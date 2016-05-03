package com.bhe.business.article;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ArticleAttachmentEntity;
import com.bhe.util.common.BusinessData;

/**
 * 创 建 人：  schoff
 * 日     期： 2015年8月1日上午10:00:50
 * 描     述：文章附件表
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Service
public interface IArticleAttachmentBusiness {

	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:01:06
	 * 描     述：附件数据添加
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> insertArticleAttachment(ArticleAttachmentEntity entity);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:02:11
	 * 描     述：文章附件删除
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> deleteArticleAttachmentByKey(long key);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:02:48
	 * 描     述：文章附件数据修改，以主键为条件
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<Boolean> updateArticleAttachmentByKey(ArticleAttachmentEntity entity);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:03:28
	 * 描     述：文章附件数据查询，支持分页，[条件自定义]
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleAttachmentEntity> selectArticleAttachmentByEntity(ArticleAttachmentEntity entity, Integer pageIndex,Integer pageSize);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:05:34
	 * 描     述：文章附件查询数据[articleid]
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： TODO(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleAttachmentEntity> selectArticleAttachmentByArticleid(Long articleid, Integer pageIndex,Integer pageSize);
}
