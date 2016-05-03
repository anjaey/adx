package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SurveyEntity;
import com.bhe.dao.mybatis.model.SurveyEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyEntityMapper {
    int countByExample(SurveyEntityCriteria example);

    int deleteByExample(SurveyEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(SurveyEntity record);

    int insertSelective(SurveyEntity record);

    List<SurveyEntity> selectByExample(SurveyEntityCriteria example);

    SurveyEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SurveyEntity record, @Param("example") SurveyEntityCriteria example);

    int updateByExample(@Param("record") SurveyEntity record, @Param("example") SurveyEntityCriteria example);

    int updateByPrimaryKeySelective(SurveyEntity record);

    int updateByPrimaryKey(SurveyEntity record);

    SurveyEntity selectByExampleForOne(SurveyEntityCriteria example);
}