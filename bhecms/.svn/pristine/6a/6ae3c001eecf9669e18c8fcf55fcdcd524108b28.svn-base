package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductSolutionsEntity;
import com.bhe.dao.mybatis.model.ProductSolutionsEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSolutionsEntityMapper {
    int countByExample(ProductSolutionsEntityCriteria example);

    int deleteByExample(ProductSolutionsEntityCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(ProductSolutionsEntity record);

    int insertSelective(ProductSolutionsEntity record);

    List<ProductSolutionsEntity> selectByExample(ProductSolutionsEntityCriteria example);

    ProductSolutionsEntity selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ProductSolutionsEntity record, @Param("example") ProductSolutionsEntityCriteria example);

    int updateByExample(@Param("record") ProductSolutionsEntity record, @Param("example") ProductSolutionsEntityCriteria example);

    int updateByPrimaryKeySelective(ProductSolutionsEntity record);

    int updateByPrimaryKey(ProductSolutionsEntity record);

    ProductSolutionsEntity selectByExampleForOne(ProductSolutionsEntityCriteria example);
}