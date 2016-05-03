package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.PermissionGroupLinkEntity;
import com.bhe.dao.mybatis.model.PermissionGroupLinkEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionGroupLinkEntityMapper {
    int countByExample(PermissionGroupLinkEntityCriteria example);

    int deleteByExample(PermissionGroupLinkEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionGroupLinkEntity record);

    int insertSelective(PermissionGroupLinkEntity record);

    List<PermissionGroupLinkEntity> selectByExample(PermissionGroupLinkEntityCriteria example);

    PermissionGroupLinkEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionGroupLinkEntity record, @Param("example") PermissionGroupLinkEntityCriteria example);

    int updateByExample(@Param("record") PermissionGroupLinkEntity record, @Param("example") PermissionGroupLinkEntityCriteria example);

    int updateByPrimaryKeySelective(PermissionGroupLinkEntity record);

    int updateByPrimaryKey(PermissionGroupLinkEntity record);

    PermissionGroupLinkEntity selectByExampleForOne(PermissionGroupLinkEntityCriteria example);
}