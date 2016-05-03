package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductCommentEntity;
import com.bhe.dao.mybatis.model.ProductCommentEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCommentEntityMapper {
    int countByExample(ProductCommentEntityCriteria example);

    int deleteByExample(ProductCommentEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductCommentEntity record);

    int insertSelective(ProductCommentEntity record);

    List<ProductCommentEntity> selectByExample(ProductCommentEntityCriteria example);

    ProductCommentEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductCommentEntity record, @Param("example") ProductCommentEntityCriteria example);

    int updateByExample(@Param("record") ProductCommentEntity record, @Param("example") ProductCommentEntityCriteria example);

    int updateByPrimaryKeySelective(ProductCommentEntity record);

    int updateByPrimaryKey(ProductCommentEntity record);

    ProductCommentEntity selectByExampleForOne(ProductCommentEntityCriteria example);
}