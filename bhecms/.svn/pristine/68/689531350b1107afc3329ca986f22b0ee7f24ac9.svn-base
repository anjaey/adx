package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ArticleClassEntity;
import com.bhe.dao.mybatis.model.ArticleClassEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleClassEntityMapper {
    int countByExample(ArticleClassEntityCriteria example);

    int deleteByExample(ArticleClassEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleClassEntity record);

    int insertSelective(ArticleClassEntity record);

    List<ArticleClassEntity> selectByExample(ArticleClassEntityCriteria example);

    ArticleClassEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleClassEntity record, @Param("example") ArticleClassEntityCriteria example);

    int updateByExample(@Param("record") ArticleClassEntity record, @Param("example") ArticleClassEntityCriteria example);

    int updateByPrimaryKeySelective(ArticleClassEntity record);

    int updateByPrimaryKey(ArticleClassEntity record);

    ArticleClassEntity selectByExampleForOne(ArticleClassEntityCriteria example);
}