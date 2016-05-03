package com.bhe.business.article.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.article.IArticleKeywordsBusiness;
import com.bhe.dao.mybatis.mapper.ArticleKeywordsEntityMapper;
import com.bhe.dao.mybatis.model.ArticleKeywordsEntity;
import com.bhe.dao.mybatis.model.ArticleKeywordsEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;

@Service
public class ArticleKeywordsBusinessImpl extends BaseBusiness implements IArticleKeywordsBusiness {

	@Autowired
	private ArticleKeywordsEntityMapper articleKeywordsEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<ArticleKeywordsEntity> dateEntity = null;

	private BusinessData<ArticleKeywordsEntity> selectArticleKeywords(ArticleKeywordsEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ArticleKeywordsEntity> list = articleKeywordsEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ArticleKeywordsEntity>(true, pageIndex, pageSize, null, articleKeywordsEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ArticleKeywordsEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertArticleKeywords(ArticleKeywordsEntity entity) {
		try {
			primaryKey = articleKeywordsEntityMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteArticleKeywordsByKey(long primaryKey) {
		try {
			rows = articleKeywordsEntityMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateArticleKeywordsByKey(ArticleKeywordsEntity entity) {
		try {
			rows = articleKeywordsEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ArticleKeywordsEntity> selectArticleKeywordsByEntity(ArticleKeywordsEntity entity, Integer pageIndex, Integer pageSize) {
		ArticleKeywordsEntityCriteria criteria = new ArticleKeywordsEntityCriteria();
		
		
		return selectArticleKeywords(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ArticleKeywordsEntity> selectArticleKeywordsByName(String name, Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		ArticleKeywordsEntityCriteria criteria = new ArticleKeywordsEntityCriteria();
		
		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		
		return selectArticleKeywords(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ArticleKeywordsEntity> selectArticleKeywordsByArticleId(
			long articleId, Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		ArticleKeywordsEntityCriteria criteria = new ArticleKeywordsEntityCriteria();
		
		criteria.createCriteria().andArticleidEqualTo(articleId);
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		
		return selectArticleKeywords(criteria, pageIndex, pageSize);
	}

}
