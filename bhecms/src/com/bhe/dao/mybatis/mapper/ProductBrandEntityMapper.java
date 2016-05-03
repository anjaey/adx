package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductBrandEntity;
import com.bhe.dao.mybatis.model.ProductBrandEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBrandEntityMapper {
    int countByExample(ProductBrandEntityCriteria example);

    int deleteByExample(ProductBrandEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductBrandEntity record);

    int insertSelective(ProductBrandEntity record);

    List<ProductBrandEntity> selectByExample(ProductBrandEntityCriteria example);

    ProductBrandEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductBrandEntity record, @Param("example") ProductBrandEntityCriteria example);

    int updateByExample(@Param("record") ProductBrandEntity record, @Param("example") ProductBrandEntityCriteria example);

    int updateByPrimaryKeySelective(ProductBrandEntity record);

    int updateByPrimaryKey(ProductBrandEntity record);

    ProductBrandEntity selectByExampleForOne(ProductBrandEntityCriteria example);
}