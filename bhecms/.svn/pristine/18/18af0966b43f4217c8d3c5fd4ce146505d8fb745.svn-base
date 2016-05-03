package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ArticleAttachmentEntity;
import com.bhe.dao.mybatis.model.ArticleAttachmentEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleAttachmentEntityMapper {
    int countByExample(ArticleAttachmentEntityCriteria example);

    int deleteByExample(ArticleAttachmentEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleAttachmentEntity record);

    int insertSelective(ArticleAttachmentEntity record);

    List<ArticleAttachmentEntity> selectByExample(ArticleAttachmentEntityCriteria example);

    ArticleAttachmentEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleAttachmentEntity record, @Param("example") ArticleAttachmentEntityCriteria example);

    int updateByExample(@Param("record") ArticleAttachmentEntity record, @Param("example") ArticleAttachmentEntityCriteria example);

    int updateByPrimaryKeySelective(ArticleAttachmentEntity record);

    int updateByPrimaryKey(ArticleAttachmentEntity record);

    ArticleAttachmentEntity selectByExampleForOne(ArticleAttachmentEntityCriteria example);
}