package com.bhe.business.article.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.article.IArticleBusiness;
import com.bhe.dao.mybatis.mapper.ArticleEntityMapper;
import com.bhe.dao.mybatis.model.ArticleEntity;
import com.bhe.dao.mybatis.model.ArticleEntityCriteria;
import com.bhe.dao.mybatis.model.ArticleEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;

/**
 * 实现文章业务接口
 * 
 * @Description
 * @author zhangyu [2015年7月25日 上午10:13:13]
 */
@Service
public class ArticleBusinessImpl extends BaseBusiness implements IArticleBusiness {

	@Autowired
	private ArticleEntityMapper articleEntityMapper;
	// private IArticlek

	@SuppressWarnings("unused")
	private BusinessData<Boolean> date = null;
	private BusinessData<ArticleEntity> dateEntity = null;

	private BusinessData<ArticleEntity> selectArticle(ArticleEntityCriteria criteria, Integer pageIndex, Integer pageSize) {
		try {
			List<ArticleEntity> list;
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
				list = articleEntityMapper.selectByExample(criteria);
			} else {
				list = articleEntityMapper.selectByExampleWithBLOBs(criteria);
			}

			dateEntity = new BusinessData<ArticleEntity>(true, pageIndex, pageSize, null, articleEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常", e);
			dateEntity = new BusinessData<ArticleEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}

	@Override
	public BusinessData<ArticleEntity> selectArclist(Integer pageSize, Integer pageIndex, String orderFile, String orderType, String title) {
		ArticleEntityCriteria aec = new ArticleEntityCriteria();
		BusinessData<ArticleEntity> bd = null;

		try {
			aec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			aec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));

			if (!CommonUtil.isEmpty(orderType, orderFile)) {
				aec.setOrderByClause("order by ${" + orderFile + "} ${" + orderType + "}");
			}

			// 分页查询
			List<ArticleEntity> userlist = articleEntityMapper.selectByExampleWithBLOBs(aec);

			// 得到数量
			Integer count = articleEntityMapper.countByExample(new ArticleEntityCriteria());
			bd = new BusinessData<ArticleEntity>(true, pageIndex, pageSize, null, count, userlist);
		} catch (NullPointerException e) { // 空指针异常捕捉
			bd = new BusinessData<ArticleEntity>(false, pageIndex, pageSize, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null, null);
		} catch (Exception e) {
			bd = new BusinessData<ArticleEntity>(false, pageIndex, pageSize, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> insertArcinfo(ArticleEntity art) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = articleEntityMapper.insertSelective(art);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteArcinfo(String uuid) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = articleEntityMapper.deleteByPrimaryKey(uuid);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateArcinfo(ArticleEntity art) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = articleEntityMapper.updateByPrimaryKeySelective(art);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<ArticleEntity> selectArcByUuid(String uuid) {
		BusinessData<ArticleEntity> bd = null;
		try {
			ArticleEntity ae = articleEntityMapper.selectByPrimaryKey(uuid);
			return new BusinessData<ArticleEntity>(true, null, ae);
		} catch (Exception e) {
			bd = new BusinessData<ArticleEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null);
		}
		return bd;
	}

	@Override
	public BusinessData<ArticleEntity> selectArtByClaid(long id, Integer pageIndex, Integer pageSize, String orderType, String orderFile) {
		ArticleEntityCriteria aec = new ArticleEntityCriteria();
		BusinessData<ArticleEntity> bd = null;

		try {
			aec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			aec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));

			if (!CommonUtil.isEmpty(orderType, orderFile)) {
				aec.setOrderByClause("order by ${" + orderFile + "} ${" + orderType + "}");
			}

			// 分页查询
			List<ArticleEntity> userlist = articleEntityMapper.selectByExampleWithBLOBs(aec);

			// 得到数量
			Integer count = articleEntityMapper.countByExample(new ArticleEntityCriteria());
			bd = new BusinessData<ArticleEntity>(true, pageIndex, pageSize, null, count, userlist);
		} catch (NullPointerException e) { // 空指针异常捕捉
			bd = new BusinessData<ArticleEntity>(false, pageIndex, pageSize, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null, null);
		} catch (Exception e) {
			bd = new BusinessData<ArticleEntity>(false, pageIndex, pageSize, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return bd;
	}

	@Override
	public BusinessData<ArticleEntity> selectArticleBySelective(Integer pageIndex, Integer pageSize, String orderParam, String orderRank, String articleType, String title, String uuid, String author, String dateFrom, String dateTo) {
		ArticleEntityCriteria criteria = new ArticleEntityCriteria();

		if (articleType != null) {
			criteria.createCriteria().andArticletypeLike(articleType);
		}
		if (title != null) {
			criteria.createCriteria().andTitleLike(title);
		}
		if (uuid != null) {
			criteria.createCriteria().andUuidEqualTo(uuid);
		}
		if (author != null) {
			criteria.createCriteria().andAuthorEqualTo(author);
		}
		// 修改时间，数据库无字段
		// if (dateFrom != null && dateTo != null) {
		// criteria.createCriteria().and
		// }

		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());

		return selectArticle(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ArticleEntity> selectArticleByStatus(Integer pageIndex, Integer pageSize, String orderParam, String orderRank, int status) {
		ArticleEntityCriteria criteria = new ArticleEntityCriteria();

		criteria.createCriteria().andStatusEqualTo(status);

		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());

		return selectArticle(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ArticleEntity> selectArticleByNoStatus(Integer pageIndex, Integer pageSize, String orderParam, String orderRank, Long classId,int noStatus,String title) {
		ArticleEntityCriteria criteria = new ArticleEntityCriteria();
		criteria.setOrderByClause("createtime desc");
		Criteria cr = criteria.createCriteria();
		if(!CommonUtil.isEmpty(classId) && classId != -1){
			cr.andClassidEqualTo(classId);
		}
		if(!CommonUtil.isEmpty(title)){
			cr.andTitleLike("%"+title+"%");
		}
		cr.andStatusNotEqualTo(noStatus);
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());

		return selectArticle(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ArticleEntity> selectArticleByClassId(Long classId, Integer pageIndex, Integer pageSize) {
		ArticleEntityCriteria criteria = new ArticleEntityCriteria();
		Criteria createCriteria = criteria.createCriteria();
		createCriteria.andStatusEqualTo(0);
		createCriteria.andClassidEqualTo(classId);

		return selectArticle(criteria, pageIndex, pageSize);
	}
}
