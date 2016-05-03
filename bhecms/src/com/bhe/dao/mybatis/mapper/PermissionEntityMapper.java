package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.PermissionEntity;
import com.bhe.dao.mybatis.model.PermissionEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionEntityMapper {
    int countByExample(PermissionEntityCriteria example);

    int deleteByExample(PermissionEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    List<PermissionEntity> selectByExample(PermissionEntityCriteria example);

    PermissionEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionEntity record, @Param("example") PermissionEntityCriteria example);

    int updateByExample(@Param("record") PermissionEntity record, @Param("example") PermissionEntityCriteria example);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);

    PermissionEntity selectByExampleForOne(PermissionEntityCriteria example);
}