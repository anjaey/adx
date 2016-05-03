package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.LogLoginEntity;
import com.bhe.dao.mybatis.model.LogLoginEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogLoginEntityMapper {
    int countByExample(LogLoginEntityCriteria example);

    int deleteByExample(LogLoginEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(LogLoginEntity record);

    int insertSelective(LogLoginEntity record);

    List<LogLoginEntity> selectByExample(LogLoginEntityCriteria example);

    LogLoginEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogLoginEntity record, @Param("example") LogLoginEntityCriteria example);

    int updateByExample(@Param("record") LogLoginEntity record, @Param("example") LogLoginEntityCriteria example);

    int updateByPrimaryKeySelective(LogLoginEntity record);

    int updateByPrimaryKey(LogLoginEntity record);

    LogLoginEntity selectByExampleForOne(LogLoginEntityCriteria example);
}