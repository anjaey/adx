package com.bhe.business.product.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ProductAttachmentEntityCriteria.Criteria;
import com.bhe.dao.mybatis.model.ProductAttachmentEntityCriteria;
import com.bhe.business.BaseBusiness;
import com.bhe.business.product.IProductAttachmentBusiness;
import com.bhe.dao.mybatis.mapper.ProductAttachmentEntityMapper;
import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.PageUtil;

@Service
public class ProductAttachmentImpl extends BaseBusiness implements IProductAttachmentBusiness {

	@Autowired
	private ProductAttachmentEntityMapper productAttachmentEntityMapper;
	
	private BusinessData<Boolean> date = null;
	private BusinessData<ProductAttachmentEntity> dateEntity = null;

	private BusinessData<ProductAttachmentEntity> selectProductAttachment(ProductAttachmentEntityCriteria criteria, Integer pageIndex, Integer pageSize){
		try {
			if (pageIndex != null && pageSize != null) {
				criteria.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				criteria.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			List<ProductAttachmentEntity> list = productAttachmentEntityMapper.selectByExample(criteria);
			dateEntity = new BusinessData<ProductAttachmentEntity>(true, pageIndex, pageSize, null, productAttachmentEntityMapper.countByExample(criteria), list);
		} catch (Exception e) {
			log.error("未知异常",e);
			dateEntity = new BusinessData<ProductAttachmentEntity>(false, pageIndex, pageSize, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, null, null);
		}
		return dateEntity;
	}
	
	@Override
	public BusinessData<Boolean> insertProductAttachment(ProductAttachmentEntity entity) {
		try {
			primaryKey = productAttachmentEntityMapper.insert(entity);
			date = new BusinessData<Boolean>(true, null, null, primaryKey);
		}catch (Exception e) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> deleteProductAttachmentByKey(String uuid) {
		try {
			ProductAttachmentEntityCriteria paec = new ProductAttachmentEntityCriteria();
			paec.createCriteria().andUuidEqualTo(uuid);
			productAttachmentEntityMapper.deleteByExample(paec);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> updateProductAttachmentByKey(ProductAttachmentEntity entity) {
		try {
			rows = productAttachmentEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			log.error(ErrorCodeUtil.UNKNOWN_EXCEPTION,e);
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}

	@Override
	public BusinessData<ProductAttachmentEntity> selectProductAttachmentByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize) {
		ProductAttachmentEntityCriteria criteria = new ProductAttachmentEntityCriteria();
		
		
		return selectProductAttachment(criteria, pageIndex, pageSize);
	}
	
	@Override
	public BusinessData<ProductAttachmentEntity> selectProductAttachmentByName( String name, Integer pageIndex, Integer pageSize) {
		ProductAttachmentEntityCriteria criteria = new ProductAttachmentEntityCriteria();
		
		if (name != null) {
			criteria.createCriteria().andNameLike(name);
		}
		
		return selectProductAttachment(criteria, pageIndex, pageSize);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public BusinessData<ProductAttachmentEntity> selectProductAttachmentBykey(
			Boolean isMain, String key, String filemodule) {
		ProductAttachmentEntityCriteria paec = new ProductAttachmentEntityCriteria();
		Criteria criter = paec.createCriteria();
		if (!CommonUtil.isEmpty(key)) {
			criter.andKeyidEqualTo(key);
		}
		if (isMain) {
			criter.andIsmainEqualTo(1);
		}
		if (!CommonUtil.isEmpty(filemodule)) {
			criter.andFilemoduleEqualTo(filemodule);
		}
		List<ProductAttachmentEntity> proList = productAttachmentEntityMapper.selectByExample(paec);
		
		@SuppressWarnings("unchecked")
		BusinessData<ProductAttachmentEntity> budata = new BusinessData(true,null,null,null,null,proList);
		return budata;
	}

	@Override
	public BusinessData<Boolean> updateProductByUuid(String uuid,ProductAttachmentEntity pae) {
		ProductAttachmentEntityCriteria paec = new ProductAttachmentEntityCriteria();
		paec.createCriteria().andUuidEqualTo(uuid);
		int row = productAttachmentEntityMapper.updateByExampleSelective(pae, paec);
		
		BusinessData<Boolean> budata = new BusinessData<>(true,null,row,null);
		return budata;
	}
}
