package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.dao.mybatis.model.SysDictEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictEntityMapper {
    int countByExample(SysDictEntityCriteria example);

    int deleteByExample(SysDictEntityCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(SysDictEntity record);

    int insertSelective(SysDictEntity record);

    List<SysDictEntity> selectByExample(SysDictEntityCriteria example);

    SysDictEntity selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") SysDictEntity record, @Param("example") SysDictEntityCriteria example);

    int updateByExample(@Param("record") SysDictEntity record, @Param("example") SysDictEntityCriteria example);

    int updateByPrimaryKeySelective(SysDictEntity record);

    int updateByPrimaryKey(SysDictEntity record);

    SysDictEntity selectByExampleForOne(SysDictEntityCriteria example);
}