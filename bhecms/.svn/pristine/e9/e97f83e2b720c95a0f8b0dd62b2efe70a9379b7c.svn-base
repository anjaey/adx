package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserGroupEntity;
import com.bhe.dao.mybatis.model.UserGroupEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupEntityMapper {
    int countByExample(UserGroupEntityCriteria example);

    int deleteByExample(UserGroupEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserGroupEntity record);

    int insertSelective(UserGroupEntity record);

    List<UserGroupEntity> selectByExample(UserGroupEntityCriteria example);

    UserGroupEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserGroupEntity record, @Param("example") UserGroupEntityCriteria example);

    int updateByExample(@Param("record") UserGroupEntity record, @Param("example") UserGroupEntityCriteria example);

    int updateByPrimaryKeySelective(UserGroupEntity record);

    int updateByPrimaryKey(UserGroupEntity record);

    UserGroupEntity selectByExampleForOne(UserGroupEntityCriteria example);
}