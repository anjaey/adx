package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductAttributeValueEntity;
import com.bhe.dao.mybatis.model.ProductAttributeValueEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttributeValueEntityMapper {
    int countByExample(ProductAttributeValueEntityCriteria example);

    int deleteByExample(ProductAttributeValueEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductAttributeValueEntity record);

    int insertSelective(ProductAttributeValueEntity record);

    List<ProductAttributeValueEntity> selectByExample(ProductAttributeValueEntityCriteria example);

    ProductAttributeValueEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductAttributeValueEntity record, @Param("example") ProductAttributeValueEntityCriteria example);

    int updateByExample(@Param("record") ProductAttributeValueEntity record, @Param("example") ProductAttributeValueEntityCriteria example);

    int updateByPrimaryKeySelective(ProductAttributeValueEntity record);

    int updateByPrimaryKey(ProductAttributeValueEntity record);

    ProductAttributeValueEntity selectByExampleForOne(ProductAttributeValueEntityCriteria example);
}