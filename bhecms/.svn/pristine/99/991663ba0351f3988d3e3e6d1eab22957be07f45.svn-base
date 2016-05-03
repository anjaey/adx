package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductMaterialEntity;
import com.bhe.dao.mybatis.model.ProductMaterialEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMaterialEntityMapper {
    int countByExample(ProductMaterialEntityCriteria example);

    int deleteByExample(ProductMaterialEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductMaterialEntity record);

    int insertSelective(ProductMaterialEntity record);

    List<ProductMaterialEntity> selectByExample(ProductMaterialEntityCriteria example);

    ProductMaterialEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductMaterialEntity record, @Param("example") ProductMaterialEntityCriteria example);

    int updateByExample(@Param("record") ProductMaterialEntity record, @Param("example") ProductMaterialEntityCriteria example);

    int updateByPrimaryKeySelective(ProductMaterialEntity record);

    int updateByPrimaryKey(ProductMaterialEntity record);

    ProductMaterialEntity selectByExampleForOne(ProductMaterialEntityCriteria example);
}