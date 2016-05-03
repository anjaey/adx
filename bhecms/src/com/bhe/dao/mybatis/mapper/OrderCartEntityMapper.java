package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.OrderCartEntity;
import com.bhe.dao.mybatis.model.OrderCartEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCartEntityMapper {
    int countByExample(OrderCartEntityCriteria example);

    int deleteByExample(OrderCartEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderCartEntity record);

    int insertSelective(OrderCartEntity record);

    List<OrderCartEntity> selectByExample(OrderCartEntityCriteria example);

    OrderCartEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderCartEntity record, @Param("example") OrderCartEntityCriteria example);

    int updateByExample(@Param("record") OrderCartEntity record, @Param("example") OrderCartEntityCriteria example);

    int updateByPrimaryKeySelective(OrderCartEntity record);

    int updateByPrimaryKey(OrderCartEntity record);

    OrderCartEntity selectByExampleForOne(OrderCartEntityCriteria example);
}