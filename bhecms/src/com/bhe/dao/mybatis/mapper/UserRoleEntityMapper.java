package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserRoleEntity;
import com.bhe.dao.mybatis.model.UserRoleEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleEntityMapper {
    int countByExample(UserRoleEntityCriteria example);

    int deleteByExample(UserRoleEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleEntity record);

    int insertSelective(UserRoleEntity record);

    List<UserRoleEntity> selectByExample(UserRoleEntityCriteria example);

    UserRoleEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRoleEntity record, @Param("example") UserRoleEntityCriteria example);

    int updateByExample(@Param("record") UserRoleEntity record, @Param("example") UserRoleEntityCriteria example);

    int updateByPrimaryKeySelective(UserRoleEntity record);

    int updateByPrimaryKey(UserRoleEntity record);

    UserRoleEntity selectByExampleForOne(UserRoleEntityCriteria example);
}