package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.ArticleEntity;
import com.bhe.dao.mybatis.model.ArticleEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleEntityMapper {
    int countByExample(ArticleEntityCriteria example);

    int deleteByExample(ArticleEntityCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(ArticleEntity record);

    int insertSelective(ArticleEntity record);

    List<ArticleEntity> selectByExampleWithBLOBs(ArticleEntityCriteria example);

    List<ArticleEntity> selectByExample(ArticleEntityCriteria example);

    ArticleEntity selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ArticleEntity record, @Param("example") ArticleEntityCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ArticleEntity record, @Param("example") ArticleEntityCriteria example);

    int updateByExample(@Param("record") ArticleEntity record, @Param("example") ArticleEntityCriteria example);

    int updateByPrimaryKeySelective(ArticleEntity record);

    int updateByPrimaryKeyWithBLOBs(ArticleEntity record);

    int updateByPrimaryKey(ArticleEntity record);

    ArticleEntity selectByExampleForOne(ArticleEntityCriteria example);
}