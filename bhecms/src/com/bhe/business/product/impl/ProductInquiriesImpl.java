package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductInquiriesBusiness;
import com.bhe.dao.mybatis.mapper.ProductInquiriesEntityMapper;
import com.bhe.dao.mybatis.model.ProductInquiriesEntity;
import com.bhe.dao.mybatis.model.ProductInquiriesEntityCriteria;
import com.bhe.dao.mybatis.model.ProductInquiriesEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductInquiriesImpl extends BaseBusiness implements IProductInquiriesBusiness {

	@Autowired
	private ProductInquiriesEntityMapper productInquiriesEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<ProductInquiriesEntity> dateEntity = null;

	private BusinessData<ProductInquiriesEntity> selectProductInquiries(ProductInquiriesEntityCriteria criteria,
			Integer pageIndex, Integer pageSize) {
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductInquiriesEntity> list = productInquiriesEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductInquiriesEntity>(true, pageIndex, pageSize, null,
					productInquiriesEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常", e);
			dateEntity = new BusinessData<ProductInquiriesEntity>(false, pageIndex, pageSize,
					ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}

	@Override
	public BusinessData<Boolean> insertProductInquiries(ProductInquiriesEntity entity) {
		try {
			primaryKey = productInquiriesEntityMapper.insert(entity);
			date = new BusinessData<Boolean>(true, null, null, primaryKey);
		} catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> deleteProductInquiriesByKey(Integer id) {
		try {
			ProductInquiriesEntityCriteria paec = new ProductInquiriesEntityCriteria();
			paec.createCriteria().andIdEqualTo(id);
			productInquiriesEntityMapper.deleteByExample(paec);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date; // Auto-generated method stub
	}

	@Override
	public BusinessData<Boolean> updateProductInquiriesByKey(ProductInquiriesEntity entity) {
		try {
			rows = productInquiriesEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION, e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductInquiriesEntity> selectProductInquiriesByMap(Map<String, Object> map, Integer pageIndex,
			Integer pageSize) {
		ProductInquiriesEntityCriteria criteria = new ProductInquiriesEntityCriteria();

		return selectProductInquiries(criteria, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductInquiriesEntity> selectProductInquiriesByName(List<String> uuids, String name, Integer pageIndex,
			Integer pageSize, Integer state) {
		ProductInquiriesEntityCriteria criteriapec = new ProductInquiriesEntityCriteria();
		Criteria criteria = criteriapec.createCriteria();
		if(!CommonUtil.isEmpty(state) && state != -1){
			criteria.andStateEqualTo(state);
		}
		criteria.andUuidIn(uuids);
		if (!CommonUtil.isEmpty(name)) {
			criteria.andUsernameLike("%" + name + "%");
		}

		return selectProductInquiries(criteriapec, pageIndex, pageSize);
	}

	@Override
	public BusinessData<ProductInquiriesEntity> selectProductInquiriesById(Integer uuid) {
		ProductInquiriesEntity pse = productInquiriesEntityMapper.selectByPrimaryKey(uuid);
		BusinessData<ProductInquiriesEntity> bdbool = new BusinessData<ProductInquiriesEntity>(true, null, pse);
		return bdbool;
	}
}
