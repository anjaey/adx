package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.OrderPrintEntity;
import com.bhe.dao.mybatis.model.OrderPrintEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPrintEntityMapper {
    int countByExample(OrderPrintEntityCriteria example);

    int deleteByExample(OrderPrintEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderPrintEntity record);

    int insertSelective(OrderPrintEntity record);

    List<OrderPrintEntity> selectByExample(OrderPrintEntityCriteria example);

    OrderPrintEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderPrintEntity record, @Param("example") OrderPrintEntityCriteria example);

    int updateByExample(@Param("record") OrderPrintEntity record, @Param("example") OrderPrintEntityCriteria example);

    int updateByPrimaryKeySelective(OrderPrintEntity record);

    int updateByPrimaryKey(OrderPrintEntity record);

    OrderPrintEntity selectByExampleForOne(OrderPrintEntityCriteria example);
}