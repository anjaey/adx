package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.RoleEntity;
import com.bhe.dao.mybatis.model.RoleEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleEntityMapper {
    int countByExample(RoleEntityCriteria example);

    int deleteByExample(RoleEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    List<RoleEntity> selectByExample(RoleEntityCriteria example);

    RoleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleEntity record, @Param("example") RoleEntityCriteria example);

    int updateByExample(@Param("record") RoleEntity record, @Param("example") RoleEntityCriteria example);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);

    RoleEntity selectByExampleForOne(RoleEntityCriteria example);
}