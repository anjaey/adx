package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductCategoryEntity;
import com.bhe.dao.mybatis.model.ProductCategoryEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryEntityMapper {
    int countByExample(ProductCategoryEntityCriteria example);

    int deleteByExample(ProductCategoryEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductCategoryEntity record);

    int insertSelective(ProductCategoryEntity record);

    List<ProductCategoryEntity> selectByExample(ProductCategoryEntityCriteria example);

    ProductCategoryEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductCategoryEntity record, @Param("example") ProductCategoryEntityCriteria example);

    int updateByExample(@Param("record") ProductCategoryEntity record, @Param("example") ProductCategoryEntityCriteria example);

    int updateByPrimaryKeySelective(ProductCategoryEntity record);

    int updateByPrimaryKey(ProductCategoryEntity record);

    ProductCategoryEntity selectByExampleForOne(ProductCategoryEntityCriteria example);
}