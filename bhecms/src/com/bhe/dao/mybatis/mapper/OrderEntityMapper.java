package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.OrderEntity;
import com.bhe.dao.mybatis.model.OrderEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderEntityMapper {
    int countByExample(OrderEntityCriteria example);

    int deleteByExample(OrderEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    List<OrderEntity> selectByExampleWithBLOBs(OrderEntityCriteria example);

    List<OrderEntity> selectByExample(OrderEntityCriteria example);

    OrderEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderEntity record, @Param("example") OrderEntityCriteria example);

    int updateByExampleWithBLOBs(@Param("record") OrderEntity record, @Param("example") OrderEntityCriteria example);

    int updateByExample(@Param("record") OrderEntity record, @Param("example") OrderEntityCriteria example);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKeyWithBLOBs(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);

    OrderEntity selectByExampleForOne(OrderEntityCriteria example);
}