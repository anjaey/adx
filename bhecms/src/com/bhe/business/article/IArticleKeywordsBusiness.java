package com.bhe.business.article;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ArticleKeywordsEntity;
import com.bhe.util.common.BusinessData;

/**
 * 创 建 人：  schoff
 * 日     期： 2015年8月1日上午10:00:50
 * 描     述：文章关键字表
 */
@Service
public interface IArticleKeywordsBusiness {

	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:01:06
	 * 描     述：关键字数据添加
	 */
	public BusinessData<Boolean> insertArticleKeywords(ArticleKeywordsEntity entity);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:02:11
	 * 描     述：文章关键字删除
	 */
	public BusinessData<Boolean> deleteArticleKeywordsByKey(long key);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:02:48
	 * 描     述：文章关键字数据修改，以主键为条件
	 */
	public BusinessData<Boolean> updateArticleKeywordsByKey(ArticleKeywordsEntity entity);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:03:28
	 * 描     述：文章关键字数据查询，支持分页，[条件自定义]
	 */
	public BusinessData<ArticleKeywordsEntity> selectArticleKeywordsByEntity(ArticleKeywordsEntity entity, Integer pageIndex,Integer pageSize);
	
	/**
	 * 
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午10:05:34
	 * 描     述：文章关键字查询数据[name]
	 * @param name					关键字
	 * @param orderParam			排序参数
	 * @param orderRank				排序方式 [倒序(desc)还是正序(null)]
	 */
	public BusinessData<ArticleKeywordsEntity> selectArticleKeywordsByName(String name, Integer pageIndex,Integer pageSize, String orderParam, String orderRank);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期： 2015年8月3日 09:32:51
	 * 描     述：文章关键字查询数据[articleId]
	 * @param articleId				文章id
	 * @param orderParam			排序参数
	 * @param orderRank				排序方式 [倒序(desc)还是正序(null)]
	 */
	public BusinessData<ArticleKeywordsEntity> selectArticleKeywordsByArticleId(long articleId, Integer pageIndex,Integer pageSize, String orderParam, String orderRank);
	
	
}
