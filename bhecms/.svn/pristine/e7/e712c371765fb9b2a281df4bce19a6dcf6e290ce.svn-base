package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.TemplateClassEntity;
import com.bhe.dao.mybatis.model.TemplateClassEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateClassEntityMapper {
    int countByExample(TemplateClassEntityCriteria example);

    int deleteByExample(TemplateClassEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TemplateClassEntity record);

    int insertSelective(TemplateClassEntity record);

    List<TemplateClassEntity> selectByExampleWithBLOBs(TemplateClassEntityCriteria example);

    List<TemplateClassEntity> selectByExample(TemplateClassEntityCriteria example);

    TemplateClassEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TemplateClassEntity record, @Param("example") TemplateClassEntityCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TemplateClassEntity record, @Param("example") TemplateClassEntityCriteria example);

    int updateByExample(@Param("record") TemplateClassEntity record, @Param("example") TemplateClassEntityCriteria example);

    int updateByPrimaryKeySelective(TemplateClassEntity record);

    int updateByPrimaryKeyWithBLOBs(TemplateClassEntity record);

    int updateByPrimaryKey(TemplateClassEntity record);

    TemplateClassEntity selectByExampleForOne(TemplateClassEntityCriteria example);
}