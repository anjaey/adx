package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ArticleKeywordsEntity;
import com.bhe.dao.mybatis.model.ArticleKeywordsEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleKeywordsEntityMapper {
    int countByExample(ArticleKeywordsEntityCriteria example);

    int deleteByExample(ArticleKeywordsEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleKeywordsEntity record);

    int insertSelective(ArticleKeywordsEntity record);

    List<ArticleKeywordsEntity> selectByExample(ArticleKeywordsEntityCriteria example);

    ArticleKeywordsEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleKeywordsEntity record, @Param("example") ArticleKeywordsEntityCriteria example);

    int updateByExample(@Param("record") ArticleKeywordsEntity record, @Param("example") ArticleKeywordsEntityCriteria example);

    int updateByPrimaryKeySelective(ArticleKeywordsEntity record);

    int updateByPrimaryKey(ArticleKeywordsEntity record);

    ArticleKeywordsEntity selectByExampleForOne(ArticleKeywordsEntityCriteria example);
}