package com.hy.business.article.impl;
//package com.hy.business.article.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.hy.business.BaseBusiness;
//import com.hy.business.article.IArticleAttachmentBusiness;
//import com.hy.dao.mybatis.mapper.ArticleAttachmentEntityMapper;
//import com.hy.dao.mybatis.model.ArticleAttachmentEntity;
//import com.hy.dao.mybatis.model.ArticleAttachmentEntityCriteria;
//import com.hy.util.common.BusinessData;
//import com.hy.util.common.ErrorCodeUtil;
//import com.hy.util.common.PageUtil;
//
//@Service
//public class ArticleAttachmentBusinessImpl extends BaseBusiness implements IArticleAttachmentBusiness {
//
//	@Autowired
//	private ArticleAttachmentEntityMapper articleAttachmentEntityMapper;
//	
//	private BusinessData<Boolean> date = null;
//	private BusinessData<ArticleAttachmentEntity> dateEntity = null;
//
//	private BusinessData<ArticleAttachmentEntity> selectArticleAttachment( criteria, Integer pageIndex, Integer pageSize){
//		try {
//			if (pageIndex != null && pageSize != null) {
//				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
//				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
//			}
//			List<ArticleAttachmentEntity> list = articleAttachmentEntityMapper.selectByExample(criteria);
//			dateEntity = new BusinessData<ArticleAttachmentEntity>(true, pageIndex, pageSize, null, articleAttachmentEntityMapper.countByExample(criteria), list);
//		} catch (Exception e) {
//			log.error("未知异常",e);
//			dateEntity = new BusinessData<ArticleAttachmentEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
//		}
//		return dateEntity;
//	}
//	
//	@Override
//	public BusinessData<Boolean> insertArticleAttachment(ArticleAttachmentEntity entity) {
//		try {
//			primaryKey = articleAttachmentEntityMapper.insertSelective(entity);
//			date = new BusinessData<Boolean>(true, null, null, null);
//		}catch (Exception e) {
//			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
//		}
//		return date;
//	}
//	
//	@Override
//	public BusinessData<Boolean> deleteArticleAttachmentByKey(long primaryKey) {
//		try {
//			rows = articleAttachmentEntityMapper.deleteByPrimaryKey(primaryKey);
//			date = new BusinessData<Boolean>(true, null, rows, null);
//		} catch (Exception e) {
//			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
//			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
//		}
//		return date;
//	}
//
//	@Override
//	public BusinessData<Boolean> updateArticleAttachmentByKey(ArticleAttachmentEntity entity) {
//		try {
//			rows = articleAttachmentEntityMapper.updateByPrimaryKeySelective(entity);
//			date = new BusinessData<Boolean>(true, null, rows, null);
//		} catch (Exception e) {
//			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
//			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
//		}
//		return date;
//	}
//
//	@Override
//	public BusinessData<ArticleAttachmentEntity> selectArticleAttachmentByEntity(ArticleAttachmentEntity entity, Integer pageIndex, Integer pageSize) {
//		ArticleAttachmentEntityCriteria criteria = new ArticleAttachmentEntityCriteria();
//		
//		
//		return selectArticleAttachment(criteria, pageIndex, pageSize);
//	}
//
//	@Override
//	public BusinessData<ArticleAttachmentEntity> selectArticleAttachmentByArticleid(Long articleid, Integer pageIndex, Integer pageSize) {
//		ArticleAttachmentEntityCriteria criteria = new ArticleAttachmentEntityCriteria();
//		
//		if (articleid != null) {
//			criteria.createCriteria().andArticleidEqualTo(articleid);
//		}
//		
//		return selectArticleAttachment(criteria, pageIndex, pageSize);
//	}
//
//}
