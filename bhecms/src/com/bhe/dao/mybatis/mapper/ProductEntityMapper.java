package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductEntity;
import com.bhe.dao.mybatis.model.ProductEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductEntityMapper {
    int countByExample(ProductEntityCriteria example);

    int deleteByExample(ProductEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    List<ProductEntity> selectByExample(ProductEntityCriteria example);

    ProductEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductEntity record, @Param("example") ProductEntityCriteria example);

    int updateByExample(@Param("record") ProductEntity record, @Param("example") ProductEntityCriteria example);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);

    ProductEntity selectByExampleForOne(ProductEntityCriteria example);
}