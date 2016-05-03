package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserAddressEntity;
import com.bhe.dao.mybatis.model.UserAddressEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressEntityMapper {
    int countByExample(UserAddressEntityCriteria example);

    int deleteByExample(UserAddressEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAddressEntity record);

    int insertSelective(UserAddressEntity record);

    List<UserAddressEntity> selectByExample(UserAddressEntityCriteria example);

    UserAddressEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAddressEntity record, @Param("example") UserAddressEntityCriteria example);

    int updateByExample(@Param("record") UserAddressEntity record, @Param("example") UserAddressEntityCriteria example);

    int updateByPrimaryKeySelective(UserAddressEntity record);

    int updateByPrimaryKey(UserAddressEntity record);

    UserAddressEntity selectByExampleForOne(UserAddressEntityCriteria example);
}