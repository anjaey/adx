package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductAttributeEntity;
import com.bhe.dao.mybatis.model.ProductAttributeEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttributeEntityMapper {
    int countByExample(ProductAttributeEntityCriteria example);

    int deleteByExample(ProductAttributeEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductAttributeEntity record);

    int insertSelective(ProductAttributeEntity record);

    List<ProductAttributeEntity> selectByExample(ProductAttributeEntityCriteria example);

    ProductAttributeEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductAttributeEntity record, @Param("example") ProductAttributeEntityCriteria example);

    int updateByExample(@Param("record") ProductAttributeEntity record, @Param("example") ProductAttributeEntityCriteria example);

    int updateByPrimaryKeySelective(ProductAttributeEntity record);

    int updateByPrimaryKey(ProductAttributeEntity record);

    ProductAttributeEntity selectByExampleForOne(ProductAttributeEntityCriteria example);
}