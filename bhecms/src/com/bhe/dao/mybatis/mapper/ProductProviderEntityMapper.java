package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductProviderEntity;
import com.bhe.dao.mybatis.model.ProductProviderEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductProviderEntityMapper {
    int countByExample(ProductProviderEntityCriteria example);

    int deleteByExample(ProductProviderEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductProviderEntity record);

    int insertSelective(ProductProviderEntity record);

    List<ProductProviderEntity> selectByExample(ProductProviderEntityCriteria example);

    ProductProviderEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductProviderEntity record, @Param("example") ProductProviderEntityCriteria example);

    int updateByExample(@Param("record") ProductProviderEntity record, @Param("example") ProductProviderEntityCriteria example);

    int updateByPrimaryKeySelective(ProductProviderEntity record);

    int updateByPrimaryKey(ProductProviderEntity record);

    ProductProviderEntity selectByExampleForOne(ProductProviderEntityCriteria example);
}