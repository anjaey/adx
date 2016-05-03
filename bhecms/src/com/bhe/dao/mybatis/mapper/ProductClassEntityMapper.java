package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductClassEntity;
import com.bhe.dao.mybatis.model.ProductClassEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductClassEntityMapper {
    int countByExample(ProductClassEntityCriteria example);

    int deleteByExample(ProductClassEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductClassEntity record);

    int insertSelective(ProductClassEntity record);

    List<ProductClassEntity> selectByExample(ProductClassEntityCriteria example);

    ProductClassEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductClassEntity record, @Param("example") ProductClassEntityCriteria example);

    int updateByExample(@Param("record") ProductClassEntity record, @Param("example") ProductClassEntityCriteria example);

    int updateByPrimaryKeySelective(ProductClassEntity record);

    int updateByPrimaryKey(ProductClassEntity record);

    ProductClassEntity selectByExampleForOne(ProductClassEntityCriteria example);
}