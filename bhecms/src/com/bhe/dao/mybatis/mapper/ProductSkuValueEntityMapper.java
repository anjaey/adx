package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductSkuValueEntity;
import com.bhe.dao.mybatis.model.ProductSkuValueEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSkuValueEntityMapper {
    int countByExample(ProductSkuValueEntityCriteria example);

    int deleteByExample(ProductSkuValueEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSkuValueEntity record);

    int insertSelective(ProductSkuValueEntity record);

    List<ProductSkuValueEntity> selectByExample(ProductSkuValueEntityCriteria example);

    ProductSkuValueEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSkuValueEntity record, @Param("example") ProductSkuValueEntityCriteria example);

    int updateByExample(@Param("record") ProductSkuValueEntity record, @Param("example") ProductSkuValueEntityCriteria example);

    int updateByPrimaryKeySelective(ProductSkuValueEntity record);

    int updateByPrimaryKey(ProductSkuValueEntity record);

    ProductSkuValueEntity selectByExampleForOne(ProductSkuValueEntityCriteria example);
}