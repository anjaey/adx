package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.OrderDetailEntity;
import com.bhe.dao.mybatis.model.OrderDetailEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailEntityMapper {
    int countByExample(OrderDetailEntityCriteria example);

    int deleteByExample(OrderDetailEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderDetailEntity record);

    int insertSelective(OrderDetailEntity record);

    List<OrderDetailEntity> selectByExample(OrderDetailEntityCriteria example);

    OrderDetailEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderDetailEntity record, @Param("example") OrderDetailEntityCriteria example);

    int updateByExample(@Param("record") OrderDetailEntity record, @Param("example") OrderDetailEntityCriteria example);

    int updateByPrimaryKeySelective(OrderDetailEntity record);

    int updateByPrimaryKey(OrderDetailEntity record);

    OrderDetailEntity selectByExampleForOne(OrderDetailEntityCriteria example);
}