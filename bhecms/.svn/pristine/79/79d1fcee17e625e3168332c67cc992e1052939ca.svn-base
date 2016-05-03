package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.TemplateEntity;
import com.bhe.dao.mybatis.model.TemplateEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateEntityMapper {
    int countByExample(TemplateEntityCriteria example);

    int deleteByExample(TemplateEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TemplateEntity record);

    int insertSelective(TemplateEntity record);

    List<TemplateEntity> selectByExampleWithBLOBs(TemplateEntityCriteria example);

    List<TemplateEntity> selectByExample(TemplateEntityCriteria example);

    TemplateEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TemplateEntity record, @Param("example") TemplateEntityCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TemplateEntity record, @Param("example") TemplateEntityCriteria example);

    int updateByExample(@Param("record") TemplateEntity record, @Param("example") TemplateEntityCriteria example);

    int updateByPrimaryKeySelective(TemplateEntity record);

    int updateByPrimaryKeyWithBLOBs(TemplateEntity record);

    int updateByPrimaryKey(TemplateEntity record);

    TemplateEntity selectByExampleForOne(TemplateEntityCriteria example);
}