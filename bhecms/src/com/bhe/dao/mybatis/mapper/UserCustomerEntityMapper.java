package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.UserCustomerEntity;
import com.bhe.dao.mybatis.model.UserCustomerEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCustomerEntityMapper {
    int countByExample(UserCustomerEntityCriteria example);

    int deleteByExample(UserCustomerEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCustomerEntity record);

    int insertSelective(UserCustomerEntity record);

    List<UserCustomerEntity> selectByExample(UserCustomerEntityCriteria example);

    UserCustomerEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCustomerEntity record, @Param("example") UserCustomerEntityCriteria example);

    int updateByExample(@Param("record") UserCustomerEntity record, @Param("example") UserCustomerEntityCriteria example);

    int updateByPrimaryKeySelective(UserCustomerEntity record);

    int updateByPrimaryKey(UserCustomerEntity record);

    UserCustomerEntity selectByExampleForOne(UserCustomerEntityCriteria example);
}