package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserDetailEntity;
import com.bhe.dao.mybatis.model.UserDetailEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailEntityMapper {
    int countByExample(UserDetailEntityCriteria example);

    int deleteByExample(UserDetailEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserDetailEntity record);

    int insertSelective(UserDetailEntity record);

    List<UserDetailEntity> selectByExample(UserDetailEntityCriteria example);

    UserDetailEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserDetailEntity record, @Param("example") UserDetailEntityCriteria example);

    int updateByExample(@Param("record") UserDetailEntity record, @Param("example") UserDetailEntityCriteria example);

    int updateByPrimaryKeySelective(UserDetailEntity record);

    int updateByPrimaryKey(UserDetailEntity record);

    UserDetailEntity selectByExampleForOne(UserDetailEntityCriteria example);
}