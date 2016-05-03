package com.bhe.business.product.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhe.dao.mybatis.model.ProductSolutionsEntityCriteria;
import com.bhe.business.product.IProductSolutionsBusiness;
import com.bhe.dao.mybatis.mapper.ProductSolutionsEntityMapper;
import com.bhe.dao.mybatis.model.ProductSolutionsEntity;
import com.bhe.dao.mybatis.model.ProductSolutionsEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.PageUtil;

/**
 * @author: zhangyu
 * @date: 2015年8月17日下午4:15:01
 * @description:  实现解决方案接口
 * <br>-----------------------------<br>
 * @update:
 * @date: 
 * @description:	(注明修改原因) 
 * <br>-----------------------------<br>
 */
@Service
public class ProductSolutionsBusinessImpl implements IProductSolutionsBusiness{

	@Autowired
	private ProductSolutionsEntityMapper pseMapper;
	
	@Override
	public BusinessData<Boolean> insertSolutions(ProductSolutionsEntity pse) {
		int rowno = pseMapper.insert(pse);
		BusinessData<Boolean> bdbool = new BusinessData<Boolean>(true, null, rowno, null);
		return bdbool;
	}

	@Override
	public BusinessData<Boolean> deleteSolutions(String uuid) {
		int row = pseMapper.deleteByPrimaryKey(uuid);
		BusinessData<Boolean> bdbool = new BusinessData<Boolean>(true, null, row, null);
		return bdbool;
	}

	@Override
	public BusinessData<ProductSolutionsEntity> selectSolutions(String title,
			Integer pageIndex, Integer pageSize, String orderType, String orderFile) {
		ProductSolutionsEntityCriteria psec = new ProductSolutionsEntityCriteria();
		Criteria criteria = psec.createCriteria();
		
		if (!CommonUtil.isEmpty(title)) {
			criteria.andTitleLike("%"+title+"%");
		}
		
		BusinessData<ProductSolutionsEntity> bdbool = null;
		try {
			int count = pseMapper.countByExample(psec);
			
			if (!CommonUtil.isEmpty(orderType) && !CommonUtil.isEmpty(orderFile)) {
				psec.setOrderByClause(orderFile + " " + orderType);
			}
			
			if(pageIndex != null && pageSize != null){
				psec.setLimitStart(PageUtil.getStart(pageIndex, pageSize));
				psec.setLimitEnd(PageUtil.getEnt(pageIndex, pageSize));
			}
			
			List<ProductSolutionsEntity> listpse = pseMapper.selectByExample(psec);
			
			bdbool = new BusinessData<ProductSolutionsEntity>(true, pageIndex, pageSize ,null ,count , listpse);
		} catch (Exception e) {
			bdbool = new BusinessData<ProductSolutionsEntity>(true, pageIndex, pageSize ,null ,0 , null);
			e.printStackTrace();
		}
		return bdbool;
	}

	@Override
	public BusinessData<Boolean> updateSolutions(ProductSolutionsEntity pse) {
		BusinessData<Boolean> bdbool = null;
		try {
			int row = pseMapper.updateByPrimaryKey(pse);
			bdbool = new BusinessData<Boolean>(true, null, row, null);
		} catch(Exception e) {
			bdbool = new BusinessData<Boolean>(false, null, null, null);
		}
		return bdbool;
	}

	public BusinessData<ProductSolutionsEntity> selectSolutionByid(String uuid) {
		ProductSolutionsEntity pse = pseMapper.selectByPrimaryKey(uuid);
		BusinessData<ProductSolutionsEntity> bdbool = new BusinessData<ProductSolutionsEntity>(true, null, pse);
		return bdbool;
	}

}

