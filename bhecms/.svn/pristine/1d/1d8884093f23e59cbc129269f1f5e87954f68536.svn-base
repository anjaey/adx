package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserMessageEntity;
import com.bhe.dao.mybatis.model.UserMessageEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMessageEntityMapper {
    int countByExample(UserMessageEntityCriteria example);

    int deleteByExample(UserMessageEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserMessageEntity record);

    int insertSelective(UserMessageEntity record);

    List<UserMessageEntity> selectByExampleWithBLOBs(UserMessageEntityCriteria example);

    List<UserMessageEntity> selectByExample(UserMessageEntityCriteria example);

    UserMessageEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserMessageEntity record, @Param("example") UserMessageEntityCriteria example);

    int updateByExampleWithBLOBs(@Param("record") UserMessageEntity record, @Param("example") UserMessageEntityCriteria example);

    int updateByExample(@Param("record") UserMessageEntity record, @Param("example") UserMessageEntityCriteria example);

    int updateByPrimaryKeySelective(UserMessageEntity record);

    int updateByPrimaryKeyWithBLOBs(UserMessageEntity record);

    int updateByPrimaryKey(UserMessageEntity record);

    UserMessageEntity selectByExampleForOne(UserMessageEntityCriteria example);
}