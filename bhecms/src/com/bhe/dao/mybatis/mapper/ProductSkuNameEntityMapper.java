package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductSkuNameEntity;
import com.bhe.dao.mybatis.model.ProductSkuNameEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSkuNameEntityMapper {
    int countByExample(ProductSkuNameEntityCriteria example);

    int deleteByExample(ProductSkuNameEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSkuNameEntity record);

    int insertSelective(ProductSkuNameEntity record);

    List<ProductSkuNameEntity> selectByExample(ProductSkuNameEntityCriteria example);

    ProductSkuNameEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSkuNameEntity record, @Param("example") ProductSkuNameEntityCriteria example);

    int updateByExample(@Param("record") ProductSkuNameEntity record, @Param("example") ProductSkuNameEntityCriteria example);

    int updateByPrimaryKeySelective(ProductSkuNameEntity record);

    int updateByPrimaryKey(ProductSkuNameEntity record);

    ProductSkuNameEntity selectByExampleForOne(ProductSkuNameEntityCriteria example);
}