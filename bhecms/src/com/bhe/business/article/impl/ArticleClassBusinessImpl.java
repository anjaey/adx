package com.bhe.business.article.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.article.IArticleClassBusiness;
import com.bhe.dao.mybatis.mapper.ArticleClassEntityMapper;
import com.bhe.dao.mybatis.model.ArticleClassEntity;
import com.bhe.dao.mybatis.model.ArticleClassEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

/** 
 * 创 建 人： zhangyu
 * 日     期： 2015年7月30日上午10:50:01
 * 描     述： 文章分类业务接口实现
 * --------------------------------------
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * --------------------------------------
 */
@Service
public class ArticleClassBusinessImpl extends BaseBusiness implements IArticleClassBusiness {

	@Autowired
	private ArticleClassEntityMapper articleClassEntityMapper;
	
	private BusinessData<ArticleClassEntity> dateEntity = null;
	
	private BusinessData<ArticleClassEntity> selectArticleClass(ArticleClassEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ArticleClassEntity> list = articleClassEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ArticleClassEntity>(true, pageIndex, pageSize, null, articleClassEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ArticleClassEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	
	/** 
	 * 创 建 人： zhangyu
	 * 日     期：2015年7月30日上午10:50:01
	 * 描     述：添加
	 * --------------------------------------
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述：  TODO(注明修改原因) 
	 * --------------------------------------
	 */
	@Override
	public BusinessData<Boolean> insertArtCla(ArticleClassEntity ace) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  articleClassEntityMapper.insertSelective(ace);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	/** 
	 * 创 建 人： zhangyu
	 * 日     期：2015年7月30日上午10:50:01
	 * 描     述：
	 * --------------------------------------
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述：  TODO(注明修改原因) 
	 * --------------------------------------
	 */
	@Override
	public BusinessData<Boolean> deleteArtClaByaId(Long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  articleClassEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	/** 
	 * 创 建 人： zhangyu
	 * 日     期：2015年7月30日上午10:50:01
	 * 描     述：
	 * --------------------------------------
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述：  TODO(注明修改原因) 
	 * --------------------------------------
	 */
	@Override
	public BusinessData<ArticleClassEntity> selectArtClaPage(Integer pageIndex,
			Integer pageSize, Integer orderType, Integer orderFile,
			String artClatitle) {
		
		ArticleClassEntityCriteria acec= new ArticleClassEntityCriteria();
		BusinessData<ArticleClassEntity> bd = null;
		
		try{
			acec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			acec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));
			
			if(!CommonUtil.isEmpty(orderType,orderFile)){
				acec.setOrderByClause("order by ${"+orderFile+"} ${"+orderType+"}");
			}
			
			if(!CommonUtil.isEmpty(artClatitle)){
				acec.createCriteria().andNamecnEqualTo(artClatitle);
			}
			
			//分页查询
			List<ArticleClassEntity> auticlelist = articleClassEntityMapper.selectByExample(acec);
			
			//得到数量
			Integer count = articleClassEntityMapper.countByExample(new ArticleClassEntityCriteria());
			bd = new BusinessData<ArticleClassEntity>(true,pageIndex,pageSize,null,count,auticlelist);
		}
		catch(NullPointerException e){  //空指针异常捕捉
			bd = new BusinessData<ArticleClassEntity>(false,pageIndex,pageSize,ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null,null);
		}
		catch(Exception e){
			bd = new BusinessData<ArticleClassEntity>(false,pageIndex,pageSize,ErrorCodeUtil.UNKNOWN_EXCEPTION,null,null);
		}
		return bd;
	}

	/** 
	* 创 建 人： zhangyu
	* 日     期：2015年7月30日上午11:14:41
	* 描     述：
	* --------------------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述：  TODO(注明修改原因) 
	* --------------------------------------
	*/ 
	@Override
	public BusinessData<Boolean> updateArtCla(ArticleClassEntity ace) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try{
			rows =  articleClassEntityMapper.updateByPrimaryKeySelective(ace);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		}catch(Exception e){
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<ArticleClassEntity> selectArtClaByid(Integer id) {
		BusinessData<ArticleClassEntity> bd = null;
		try{
			ArticleClassEntity artCle =  articleClassEntityMapper.selectByPrimaryKey(id.longValue());
			bd = new BusinessData<ArticleClassEntity>(true, null, artCle);
		}
		catch(java.lang.NullPointerException e){
			bd = new BusinessData<ArticleClassEntity>(false, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION,null);
		}
		catch(Exception e){
			bd = new BusinessData<ArticleClassEntity>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION,null);
		}
		return bd;
	}

	@Override
	public BusinessData<ArticleClassEntity> selectArticleClassByAll( Integer pageIndex, Integer pageSize) {
		
		return selectArticleClass(new ArticleClassEntityCriteria(), pageIndex, pageSize);
	}


	@Override
	public BusinessData<ArticleClassEntity> selectArticleClassByParentId(int parentId, Integer pageIndex, Integer pageSize) {
		ArticleClassEntityCriteria criteria = new ArticleClassEntityCriteria();
		criteria.createCriteria().andParentidEqualTo(parentId);
		
		return selectArticleClass(criteria, pageIndex, pageSize);
	}


	@Override
	public BusinessData<ArticleClassEntity> selectArticleClassByNameEn(
			String nameEn, Integer pageIndex, Integer pageSize) {
		ArticleClassEntityCriteria criteria = new ArticleClassEntityCriteria();
		criteria.createCriteria().andNameenEqualTo(nameEn);
		
		
		return selectArticleClass(criteria, pageIndex, pageSize);
	}


	@Override
	public BusinessData<ArticleClassEntity> selectArticleClassByResoureceId(long resoureceId, Integer pageIndex, Integer pageSize) {
		ArticleClassEntityCriteria criteria = new ArticleClassEntityCriteria();
		criteria.createCriteria().andResoureceidEqualTo(resoureceId);
		
		return selectArticleClass(criteria, pageIndex, pageSize);
	}


	@Override
	public BusinessData<ArticleClassEntity> selectArticleClassByNameCn(String nameCn, Integer pageIndex, Integer pageSize) {
		ArticleClassEntityCriteria criteria = new ArticleClassEntityCriteria();
		criteria.createCriteria().andNamecnEqualTo(nameCn);
		return selectArticleClass(criteria, pageIndex, pageSize);
	}
	
	
}
