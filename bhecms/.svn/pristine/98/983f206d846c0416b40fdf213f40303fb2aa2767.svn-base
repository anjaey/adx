package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductInquiriesEntity;
import com.bhe.dao.mybatis.model.ProductInquiriesEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInquiriesEntityMapper {
    int countByExample(ProductInquiriesEntityCriteria example);

    int deleteByExample(ProductInquiriesEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductInquiriesEntity record);

    int insertSelective(ProductInquiriesEntity record);

    List<ProductInquiriesEntity> selectByExample(ProductInquiriesEntityCriteria example);

    ProductInquiriesEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductInquiriesEntity record, @Param("example") ProductInquiriesEntityCriteria example);

    int updateByExample(@Param("record") ProductInquiriesEntity record, @Param("example") ProductInquiriesEntityCriteria example);

    int updateByPrimaryKeySelective(ProductInquiriesEntity record);

    int updateByPrimaryKey(ProductInquiriesEntity record);

    ProductInquiriesEntity selectByExampleForOne(ProductInquiriesEntityCriteria example);
}