package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ProductAttachmentEntity;
import com.bhe.dao.mybatis.model.ProductAttachmentEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttachmentEntityMapper {
    int countByExample(ProductAttachmentEntityCriteria example);

    int deleteByExample(ProductAttachmentEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductAttachmentEntity record);

    int insertSelective(ProductAttachmentEntity record);

    List<ProductAttachmentEntity> selectByExample(ProductAttachmentEntityCriteria example);

    ProductAttachmentEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductAttachmentEntity record, @Param("example") ProductAttachmentEntityCriteria example);

    int updateByExample(@Param("record") ProductAttachmentEntity record, @Param("example") ProductAttachmentEntityCriteria example);

    int updateByPrimaryKeySelective(ProductAttachmentEntity record);

    int updateByPrimaryKey(ProductAttachmentEntity record);

    ProductAttachmentEntity selectByExampleForOne(ProductAttachmentEntityCriteria example);
}