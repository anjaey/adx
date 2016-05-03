package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserEntity;
import com.bhe.dao.mybatis.model.UserEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper {
    int countByExample(UserEntityCriteria example);

    int deleteByExample(UserEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    List<UserEntity> selectByExample(UserEntityCriteria example);

    UserEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityCriteria example);

    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityCriteria example);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserEntity selectByExampleForOne(UserEntityCriteria example);
}