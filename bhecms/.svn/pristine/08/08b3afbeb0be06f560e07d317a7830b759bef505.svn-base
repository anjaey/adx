package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.PermissionResourceEntity;
import com.bhe.dao.mybatis.model.PermissionResourceEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionResourceEntityMapper {
    int countByExample(PermissionResourceEntityCriteria example);

    int deleteByExample(PermissionResourceEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionResourceEntity record);

    int insertSelective(PermissionResourceEntity record);

    List<PermissionResourceEntity> selectByExample(PermissionResourceEntityCriteria example);

    PermissionResourceEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionResourceEntity record, @Param("example") PermissionResourceEntityCriteria example);

    int updateByExample(@Param("record") PermissionResourceEntity record, @Param("example") PermissionResourceEntityCriteria example);

    int updateByPrimaryKeySelective(PermissionResourceEntity record);

    int updateByPrimaryKey(PermissionResourceEntity record);

    PermissionResourceEntity selectByExampleForOne(PermissionResourceEntityCriteria example);
}