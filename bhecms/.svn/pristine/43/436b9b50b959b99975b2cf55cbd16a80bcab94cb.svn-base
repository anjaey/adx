package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductFilterEntity;
import com.bhe.dao.mybatis.model.ProductFilterEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductFilterEntityMapper {
    int countByExample(ProductFilterEntityCriteria example);

    int deleteByExample(ProductFilterEntityCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(ProductFilterEntity record);

    int insertSelective(ProductFilterEntity record);

    List<ProductFilterEntity> selectByExample(ProductFilterEntityCriteria example);

    ProductFilterEntity selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ProductFilterEntity record, @Param("example") ProductFilterEntityCriteria example);

    int updateByExample(@Param("record") ProductFilterEntity record, @Param("example") ProductFilterEntityCriteria example);

    int updateByPrimaryKeySelective(ProductFilterEntity record);

    int updateByPrimaryKey(ProductFilterEntity record);

    ProductFilterEntity selectByExampleForOne(ProductFilterEntityCriteria example);
}