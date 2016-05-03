package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SurveyItemEntity;
import com.bhe.dao.mybatis.model.SurveyItemEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyItemEntityMapper {
    int countByExample(SurveyItemEntityCriteria example);

    int deleteByExample(SurveyItemEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(SurveyItemEntity record);

    int insertSelective(SurveyItemEntity record);

    List<SurveyItemEntity> selectByExample(SurveyItemEntityCriteria example);

    SurveyItemEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SurveyItemEntity record, @Param("example") SurveyItemEntityCriteria example);

    int updateByExample(@Param("record") SurveyItemEntity record, @Param("example") SurveyItemEntityCriteria example);

    int updateByPrimaryKeySelective(SurveyItemEntity record);

    int updateByPrimaryKey(SurveyItemEntity record);

    SurveyItemEntity selectByExampleForOne(SurveyItemEntityCriteria example);
}