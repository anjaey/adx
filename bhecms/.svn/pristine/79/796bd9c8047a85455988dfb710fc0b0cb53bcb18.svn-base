package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductBrandBusiness;
import com.bhe.dao.mybatis.mapper.ProductBrandEntityMapper;
import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.dao.mybatis.model.ProductBrandEntityCriteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.Order;
import com.bhe.util.common.PageUtil;

@Service
public class ProductBrandBusinessImpl extends BaseBusiness implements IProductBrandBusiness {

	@Autowired
	private ProductBrandEntityMapper productBrandEntityMapper;

	private BusinessData<Boolean> data = null;
	private BusinessData<ProductBrandEntity> dateEntity = null;

	private BusinessData<ProductBrandEntity> selectProductBrand(ProductBrandEntityCriteria criteria, Integer pageIndex, Integer pageSize) {
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductBrandEntity> list = productBrandEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductBrandEntity>(true, pageIndex, pageSize, null, productBrandEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常", e);
			dateEntity = new BusinessData<ProductBrandEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}

	@Override
	public BusinessData<Boolean> insertProductBrand(ProductBrandEntity entity) {
		try {
			primaryKey = productBrandEntityMapper.insertSelective(entity);
			data = new BusinessData<Boolean>(true, null, null, null);
		} catch (Exception e) {
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<Boolean> deleteProductBrandByKey(long primaryKey) {
		try {
			rows = productBrandEntityMapper.deleteByPrimaryKey(primaryKey);
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<Boolean> updateProductBrandByKey(ProductBrandEntity entity) {
		try {
			rows = productBrandEntityMapper.updateByPrimaryKeySelective(entity);
			data = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			data = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return data;
	}

	@Override
	public BusinessData<ProductBrandEntity> selectProductBrandByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductBrandEntityCriteria criteria = new ProductBrandEntityCriteria();

		return selectProductBrand(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductBrandEntity> selectProductBrandByNameCn(String nameCn, Integer pageIndex, Integer pageSize) {
		ProductBrandEntityCriteria criteria = new ProductBrandEntityCriteria();

		if (!CommonUtil.isEmpty(nameCn)) {
			criteria.createCriteria().andNamecnLike("%"+nameCn+"%");
		}

		return selectProductBrand(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductBrandEntity> selectProductBrandById(long id, Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		ProductBrandEntityCriteria criteria = new ProductBrandEntityCriteria();
		criteria.createCriteria().andIdEqualTo(id);

		return selectProductBrand(criteria, pageIndex, pageSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public BusinessData<ProductBrandEntity> selectByid(Long id) {
		ProductBrandEntity pe = productBrandEntityMapper.selectByPrimaryKey(id);
		@SuppressWarnings("rawtypes")
		BusinessData<ProductBrandEntity> budata = new BusinessData(true, null, pe);
		return budata;
	}

	@Override
	public BusinessData<ProductBrandEntity> selectProductBrandByIsShow(int isshow, Integer pageIndex, Integer pageSize, String orderParam, String orderRank) {
		ProductBrandEntityCriteria criteria = new ProductBrandEntityCriteria();
		criteria.createCriteria().andIsshowEqualTo(isshow);
		criteria.setOrderByClause(new Order(orderRank, orderParam).toString());
		
		return selectProductBrand(criteria, pageIndex, pageSize);
	}
}
