package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserOrgEntity;
import com.bhe.dao.mybatis.model.UserOrgEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrgEntityMapper {
    int countByExample(UserOrgEntityCriteria example);

    int deleteByExample(UserOrgEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserOrgEntity record);

    int insertSelective(UserOrgEntity record);

    List<UserOrgEntity> selectByExample(UserOrgEntityCriteria example);

    UserOrgEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserOrgEntity record, @Param("example") UserOrgEntityCriteria example);

    int updateByExample(@Param("record") UserOrgEntity record, @Param("example") UserOrgEntityCriteria example);

    int updateByPrimaryKeySelective(UserOrgEntity record);

    int updateByPrimaryKey(UserOrgEntity record);

    UserOrgEntity selectByExampleForOne(UserOrgEntityCriteria example);
}