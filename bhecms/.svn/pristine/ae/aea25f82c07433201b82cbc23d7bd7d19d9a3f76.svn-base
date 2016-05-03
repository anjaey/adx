package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductSearchEntity;
import com.bhe.dao.mybatis.model.ProductSearchEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSearchEntityMapper {
    int countByExample(ProductSearchEntityCriteria example);

    int deleteByExample(ProductSearchEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSearchEntity record);

    int insertSelective(ProductSearchEntity record);

    List<ProductSearchEntity> selectByExample(ProductSearchEntityCriteria example);

    ProductSearchEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSearchEntity record, @Param("example") ProductSearchEntityCriteria example);

    int updateByExample(@Param("record") ProductSearchEntity record, @Param("example") ProductSearchEntityCriteria example);

    int updateByPrimaryKeySelective(ProductSearchEntity record);

    int updateByPrimaryKey(ProductSearchEntity record);

    ProductSearchEntity selectByExampleForOne(ProductSearchEntityCriteria example);
}