package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.OrderTypeEntity;
import com.bhe.dao.mybatis.model.OrderTypeEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTypeEntityMapper {
    int countByExample(OrderTypeEntityCriteria example);

    int deleteByExample(OrderTypeEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderTypeEntity record);

    int insertSelective(OrderTypeEntity record);

    List<OrderTypeEntity> selectByExample(OrderTypeEntityCriteria example);

    OrderTypeEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderTypeEntity record, @Param("example") OrderTypeEntityCriteria example);

    int updateByExample(@Param("record") OrderTypeEntity record, @Param("example") OrderTypeEntityCriteria example);

    int updateByPrimaryKeySelective(OrderTypeEntity record);

    int updateByPrimaryKey(OrderTypeEntity record);

    OrderTypeEntity selectByExampleForOne(OrderTypeEntityCriteria example);
}