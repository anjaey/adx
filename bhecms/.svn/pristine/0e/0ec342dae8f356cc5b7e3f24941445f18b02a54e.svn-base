package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SysMessageEntity;
import com.bhe.dao.mybatis.model.SysMessageEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMessageEntityMapper {
    int countByExample(SysMessageEntityCriteria example);

    int deleteByExample(SysMessageEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(SysMessageEntity record);

    int insertSelective(SysMessageEntity record);

    List<SysMessageEntity> selectByExample(SysMessageEntityCriteria example);

    SysMessageEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysMessageEntity record, @Param("example") SysMessageEntityCriteria example);

    int updateByExample(@Param("record") SysMessageEntity record, @Param("example") SysMessageEntityCriteria example);

    int updateByPrimaryKeySelective(SysMessageEntity record);

    int updateByPrimaryKey(SysMessageEntity record);

    SysMessageEntity selectByExampleForOne(SysMessageEntityCriteria example);
}