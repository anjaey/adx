package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SysLinkEntity;
import com.bhe.dao.mybatis.model.SysLinkEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLinkEntityMapper {
    int countByExample(SysLinkEntityCriteria example);

    int deleteByExample(SysLinkEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLinkEntity record);

    int insertSelective(SysLinkEntity record);

    List<SysLinkEntity> selectByExample(SysLinkEntityCriteria example);

    SysLinkEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysLinkEntity record, @Param("example") SysLinkEntityCriteria example);

    int updateByExample(@Param("record") SysLinkEntity record, @Param("example") SysLinkEntityCriteria example);

    int updateByPrimaryKeySelective(SysLinkEntity record);

    int updateByPrimaryKey(SysLinkEntity record);

    SysLinkEntity selectByExampleForOne(SysLinkEntityCriteria example);
}