package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.dao.mybatis.model.SysResourceEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceEntityMapper {
    int countByExample(SysResourceEntityCriteria example);

    int deleteByExample(SysResourceEntityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysResourceEntity record);

    int insertSelective(SysResourceEntity record);

    List<SysResourceEntity> selectByExample(SysResourceEntityCriteria example);

    SysResourceEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysResourceEntity record, @Param("example") SysResourceEntityCriteria example);

    int updateByExample(@Param("record") SysResourceEntity record, @Param("example") SysResourceEntityCriteria example);

    int updateByPrimaryKeySelective(SysResourceEntity record);

    int updateByPrimaryKey(SysResourceEntity record);

    SysResourceEntity selectByExampleForOne(SysResourceEntityCriteria example);
}