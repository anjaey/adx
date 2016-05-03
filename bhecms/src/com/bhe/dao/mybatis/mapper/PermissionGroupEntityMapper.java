package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.PermissionGroupEntity;
import com.bhe.dao.mybatis.model.PermissionGroupEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionGroupEntityMapper {
    int countByExample(PermissionGroupEntityCriteria example);

    int deleteByExample(PermissionGroupEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionGroupEntity record);

    int insertSelective(PermissionGroupEntity record);

    List<PermissionGroupEntity> selectByExample(PermissionGroupEntityCriteria example);

    PermissionGroupEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionGroupEntity record, @Param("example") PermissionGroupEntityCriteria example);

    int updateByExample(@Param("record") PermissionGroupEntity record, @Param("example") PermissionGroupEntityCriteria example);

    int updateByPrimaryKeySelective(PermissionGroupEntity record);

    int updateByPrimaryKey(PermissionGroupEntity record);

    PermissionGroupEntity selectByExampleForOne(PermissionGroupEntityCriteria example);
}