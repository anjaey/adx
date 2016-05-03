package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductFilterBusiness;
import com.bhe.dao.common.ICommonDao;
import com.bhe.dao.mybatis.mapper.ProductFilterEntityMapper;
import com.bhe.dao.mybatis.model.ProductFilterEntity;
import com.bhe.dao.mybatis.model.ProductFilterEntityCriteria;
import com.bhe.dao.mybatis.model.ProductFilterEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;

@Service
public class ProductFilterBusinessImpl extends BaseBusiness implements IProductFilterBusiness {

	@Autowired
	private ProductFilterEntityMapper productFilterMapper;
	
	@Autowired
	private ICommonDao commonDao;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<ProductFilterEntity> dateEntity = null;

	private BusinessData<ProductFilterEntity> selectProductFilter(ProductFilterEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductFilterEntity> list = productFilterMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductFilterEntity>(true, pageIndex, pageSize, null, productFilterMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductFilterEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductFilter(ProductFilterEntity entity) {
		try {
			primaryKey = productFilterMapper.insertSelective(entity);
			date = new BusinessData<Boolean>(true, null, null, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductFilterByKey(String primaryKey) {
		try {
			rows = productFilterMapper.deleteByPrimaryKey(primaryKey);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductFilterByKey(ProductFilterEntity entity) {
		try {
			rows = productFilterMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductFilterEntity> selectProductFilterByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductFilterEntityCriteria criteria = new ProductFilterEntityCriteria();
		
		
		return selectProductFilter(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductFilterEntity> selectProductFilterByName(String name, Integer pageIndex, Integer pageSize) {
		ProductFilterEntityCriteria criteria = new ProductFilterEntityCriteria();

		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectProductFilter(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductFilterEntity> selectProductFilterByCategoryid(Long categoryid,Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		ProductFilterEntityCriteria criteria = new ProductFilterEntityCriteria();
		
		if(categoryid != null){
			criteria.createCriteria().andCategoryidEqualTo(categoryid);
		}
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		
		return selectProductFilter(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductFilterEntity> selectProductFilterByUuid(String uuid) {
		ProductFilterEntityCriteria criteria = new ProductFilterEntityCriteria();
		
		if(uuid != null){
			criteria.createCriteria().andUuidEqualTo(uuid);
		}
		return selectProductFilter(criteria, null, null);
	}

	@Override
	//此处表设计有缺，暂时用sql语句
	public BusinessData<List<Map<String, Object>>> selectGroupPEByCateid(String cateid) {
		List<Map<String, Object>> listmap = null;
		BusinessData<List<Map<String, Object>>> bdlistmap = null;
		try {
			listmap = commonDao.selectList("select name,rank from t_product_filter where categoryid = '"+cateid+"' group by name,rank order by rank desc", null);
			bdlistmap = new BusinessData<List<Map<String,Object>>>(true, null, listmap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bdlistmap;
	}

	@Override
	public BusinessData<List<ProductFilterEntity>> selectPEByName(Long cateid, String name) {
		ProductFilterEntityCriteria pfe = new ProductFilterEntityCriteria();
		pfe.setOrderByClause(" attrank desc");
		Criteria filterc =  pfe.createCriteria();
		filterc.andNameEqualTo(name);
		filterc.andCategoryidEqualTo(cateid);
		List<ProductFilterEntity>  listpfe = productFilterMapper.selectByExample(pfe);
		BusinessData<List<ProductFilterEntity>> bdlistmap = new BusinessData<List<ProductFilterEntity>>(true, null, listpfe);
		return bdlistmap;
	}

}
