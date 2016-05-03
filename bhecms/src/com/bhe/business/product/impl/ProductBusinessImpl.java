package com.bhe.business.product.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductBusiness;
import com.bhe.dao.common.ICommonDao;
import com.bhe.dao.mybatis.mapper.ProductDetailEntityMapper;
import com.bhe.dao.mybatis.mapper.ProductEntityMapper;
import com.bhe.dao.mybatis.model.ProductDetailEntity;
import com.bhe.dao.mybatis.model.ProductDetailEntityCriteria;
import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.ProductEntityCriteria;
import com.bhe.dao.mybatis.model.ProductEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductBusinessImpl extends BaseBusiness implements IProductBusiness {

	@Autowired
	private ProductEntityMapper productEntityMapper;
	
	@Autowired
	private ProductDetailEntityMapper productDetailEntityMapper;
	
	@Autowired
	private ICommonDao commonDao;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductEntity> dateEntity = null;

	private BusinessData<ProductEntity> selectProduct(ProductEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductEntity> list = productEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductEntity>(true, pageIndex, pageSize, null, productEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProduct(ProductEntity entity) {
		try {
			primaryKey = productEntityMapper.insert(entity);
			date = new BusinessData<Boolean>(true, null, primaryKey, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, primaryKey, null);
		}
 		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductByKey(long primaryKey) {
		try {
			ProductEntityCriteria pec = new ProductEntityCriteria();
			pec.createCriteria().andIdEqualTo(primaryKey);
			rows = productEntityMapper.deleteByExample(pec);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductByUuid(String uuid) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();
		if (uuid != null) {
			criteria.createCriteria().andUuidEqualTo(uuid);
		}
		try {
			rows = productEntityMapper.deleteByExample(criteria);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductByKey(ProductEntity entity) {
		try {
			ProductEntityCriteria pec = new ProductEntityCriteria();
			pec.createCriteria().andUuidEqualTo(entity.getUuid());
			rows = productEntityMapper.updateByExampleSelective(entity, pec);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductEntity> selectProductByIsDel(Integer isdelete, Integer pageIndex, Integer pageSize, List<Long> classIds, String content, Long type, Integer status) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();
		Criteria cri = criteria.createCriteria();
		if (isdelete == 0) {//查询回收箱的数据
			cri.andIsdeleteEqualTo(isdelete);
		}else if (isdelete == 1) { //不查询回收箱的数据
			cri.andIsdeleteIsNull();
		}
		if(!CommonUtil.isEmpty(type) && type != -1){
			cri.andClazzidEqualTo(type);
		}
		if(!CommonUtil.isEmpty(classIds)){
			cri.andClazzidIn(classIds);
		}
		if(!CommonUtil.isEmpty(status) && status != -1){
			cri.andStatusEqualTo(status);
		}
		if(!CommonUtil.isEmpty(content)){
			cri.andNamecnLike("%"+ content +"%");
//			criteria.or(cri.andModelnameLike("%"+ content +"%"));
		}
		//默认按照时间排序
		criteria.setOrderByClause(" createtime desc");
		return selectProduct(criteria, pageIndex, pageSize);
	}


	@Override
	public BusinessData<ProductEntity> selectProductByNameCn(String nameCn, Integer pageIndex, Integer pageSize) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();

		if (nameCn != null) {
			criteria.createCriteria().andNamecnLike("%"+nameCn+"%");
		}
		
		return selectProduct(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<Integer> selectProductCount(Long brandid) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();
		criteria.createCriteria().andBrandidEqualTo(brandid);
		int count = productEntityMapper.countByExample(criteria);
		BusinessData<Integer> dateEntity = new BusinessData<Integer>(true,null,count);
		
		return dateEntity;
	}

	@Override
	public BusinessData<ProductEntity> selectProductByBrandid(long brandid, Integer pageIndex, Integer pageSize, 
			String orderParam, String orderRank) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();

		criteria.createCriteria().andBrandidEqualTo(brandid);
		
		return selectProduct(criteria, pageIndex, pageSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public BusinessData<ProductEntity> selectProInfo(Long id) {
		ProductEntity pe = productEntityMapper.selectByPrimaryKey(id);
		
		@SuppressWarnings("rawtypes")
		BusinessData<ProductEntity> budata = new BusinessData(true,null,pe);
		return budata;
	}

	@SuppressWarnings("unchecked")
	@Override
	public BusinessData<Integer> selectProByBranNoCount(Long id) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();
		criteria.createCriteria().andBrandidEqualTo(id);
		int count = productEntityMapper.countByExample(criteria);
		@SuppressWarnings("rawtypes")
		BusinessData<Integer> budata = new BusinessData(true,null,count);
		return budata;
	}

	@Override
	public BusinessData<Boolean> insertProDetail(ProductDetailEntity pde) {
		try {
			primaryKey = productDetailEntityMapper.insert(pde);
			date = new BusinessData<Boolean>(true, null, primaryKey, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, primaryKey, null);
		}
 		return date;
	}

	@Override
	public BusinessData<Boolean> updateProDetail(ProductDetailEntity pde) {
		
		try {
			primaryKey = productDetailEntityMapper.updateByPrimaryKey(pde);
			date = new BusinessData<Boolean>(true, null, primaryKey, null);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, primaryKey, null);
		}
 		return date;
	}

	@Override
	public BusinessData<ProductDetailEntity> selectProDetailByUuid(String uuid) {
		ProductDetailEntityCriteria pec = new ProductDetailEntityCriteria();
		pec.createCriteria().andUuidEqualTo(uuid);
		
		ProductDetailEntity pde = productDetailEntityMapper.selectByExampleForOne(pec);
		BusinessData<ProductDetailEntity> bdpe = new BusinessData<>(true,null,pde);
		return bdpe;
	}

	@Override
	public BusinessData<ProductEntity> selectProInfoByUuid(String uuid) {
		ProductEntityCriteria pec = new ProductEntityCriteria();
		pec.createCriteria().andUuidEqualTo(uuid);
		
		ProductEntity pe = productEntityMapper.selectByExampleForOne(pec);
		
		BusinessData<ProductEntity> bdpe = new BusinessData<>(true,null,pe);
		return bdpe;
	}
	@Override
	public BusinessData<ProductEntity> selectHotProduct(ProductEntity entity,Integer status,
			Integer pageIndex, Integer pageSize, Integer toshowproduct, Integer topopular) {
		ProductEntityCriteria pec = new ProductEntityCriteria();
		Criteria criteria = pec.createCriteria();
		criteria.andStatusEqualTo(status);
		criteria.andToshowproductEqualTo(toshowproduct);
		criteria.andTopopularEqualTo(topopular);
		pec.setOrderByClause("saycount desc");
		return selectProduct(pec, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductEntity> selectNewProduct(ProductEntity entity,Integer status,
			Integer pageIndex, Integer pageSize) {
		ProductEntityCriteria pec = new ProductEntityCriteria();
		pec.createCriteria().andStatusEqualTo(status);
		pec.setOrderByClause("createTime desc");
		return selectProduct(pec, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductEntity> selectProductByLevel(
			ProductEntity entity,Integer status, Integer pageIndex, Integer pageSize) {
		ProductEntityCriteria pec = new ProductEntityCriteria();
		pec.createCriteria().andStatusEqualTo(status);
		pec.setOrderByClause("level desc");
		return selectProduct(pec, pageIndex, pageSize);
	}
	
	@Override
	public BusinessData<Map<String, Object>> selectProductByClazzId(
			String sql, Long clazzId,Integer status, Integer pageIndex, Integer pageSize) {
		
		BusinessData<Map<String, Object>> listmapdb = null;
		try {
			String sqlstr = "select * from t_product where clazzid = ? and status=1 "+
		sql +" order by createtime desc limit ?,?";
			List<Object> paramList = new ArrayList<Object>();
			paramList.add(clazzId);
			//select * from t_product where clazzid = ? and status=1  order by createtime desc limit ?,?
			Long totalCount = commonDao.selectTotalCount(sqlstr, paramList);
			
			List<Map<String, Object>> listmap = commonDao.selectListSimple(sqlstr, clazzId, pageIndex, pageSize);
			listmapdb = new BusinessData<Map<String,Object>>(true, pageIndex, pageSize, null, totalCount.intValue(), listmap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listmapdb;
	}



	@Override
	public BusinessData<ProductEntity> selectProductByShowType(Integer showType,Integer status,
			Integer pageIndex, Integer pageSize) {
		ProductEntityCriteria pec = new ProductEntityCriteria();
		Criteria createCriteria = pec.createCriteria();
		createCriteria.andStatusEqualTo(status);
		createCriteria.andShowtypeEqualTo(showType);
		pec.setOrderByClause("level desc");
		return selectProduct(pec, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductEntity> selectOtherProductByClazzId(
			Long id, Long clazzId,Integer status, Integer pageIndex, Integer pageSize) {
		ProductEntityCriteria pec = new ProductEntityCriteria();
		Criteria createCriteria = pec.createCriteria();
		createCriteria.andStatusEqualTo(status);
		createCriteria.andIdNotEqualTo(id);
		createCriteria.andClazzidEqualTo(clazzId);
		pec.setOrderByClause("level desc");
		
		return selectProduct(pec, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductEntity> selectProductById(long id) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();
		criteria.createCriteria().andIdEqualTo(id);
		return selectProduct(criteria, null, null);
	}

	@Override
	public BusinessData<ProductEntity> selectProductByKeywords(
			String title, String startprice, String endprice,
			Integer pageIndex, Integer pageSize) {
		ProductEntityCriteria criteria = new ProductEntityCriteria();
		Criteria pec = criteria.createCriteria();
		if (!CommonUtil.isEmpty(title)){
			pec.andKeywordsLike("%" + title + "%");
		}
		if (!CommonUtil.isEmpty(startprice)){
			BigDecimal minPri = new BigDecimal(startprice);
			pec.andPriceGreaterThanOrEqualTo(minPri);
		}
		if (!CommonUtil.isEmpty(endprice)){
			BigDecimal maxPri = new BigDecimal(endprice);
			pec.andPriceLessThanOrEqualTo(maxPri);
		}
		return selectProduct(criteria, pageIndex, pageSize);
	}
}
