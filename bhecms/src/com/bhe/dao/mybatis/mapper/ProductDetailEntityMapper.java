package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductDetailEntity;
import com.bhe.dao.mybatis.model.ProductDetailEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailEntityMapper {
    int countByExample(ProductDetailEntityCriteria example);

    int deleteByExample(ProductDetailEntityCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(ProductDetailEntity record);

    int insertSelective(ProductDetailEntity record);

    List<ProductDetailEntity> selectByExample(ProductDetailEntityCriteria example);

    ProductDetailEntity selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ProductDetailEntity record, @Param("example") ProductDetailEntityCriteria example);

    int updateByExample(@Param("record") ProductDetailEntity record, @Param("example") ProductDetailEntityCriteria example);

    int updateByPrimaryKeySelective(ProductDetailEntity record);

    int updateByPrimaryKey(ProductDetailEntity record);

    ProductDetailEntity selectByExampleForOne(ProductDetailEntityCriteria example);
}