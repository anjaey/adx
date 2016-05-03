package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.RolePermissionEntity;
import com.bhe.dao.mybatis.model.RolePermissionEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionEntityMapper {
    int countByExample(RolePermissionEntityCriteria example);

    int deleteByExample(RolePermissionEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);

    List<RolePermissionEntity> selectByExample(RolePermissionEntityCriteria example);

    RolePermissionEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RolePermissionEntity record, @Param("example") RolePermissionEntityCriteria example);

    int updateByExample(@Param("record") RolePermissionEntity record, @Param("example") RolePermissionEntityCriteria example);

    int updateByPrimaryKeySelective(RolePermissionEntity record);

    int updateByPrimaryKey(RolePermissionEntity record);

    RolePermissionEntity selectByExampleForOne(RolePermissionEntityCriteria example);
}