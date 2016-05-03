package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SysCarouselEntity;
import com.bhe.dao.mybatis.model.SysCarouselEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCarouselEntityMapper {
    int countByExample(SysCarouselEntityCriteria example);

    int deleteByExample(SysCarouselEntityCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(SysCarouselEntity record);

    int insertSelective(SysCarouselEntity record);

    List<SysCarouselEntity> selectByExample(SysCarouselEntityCriteria example);

    SysCarouselEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysCarouselEntity record, @Param("example") SysCarouselEntityCriteria example);

    int updateByExample(@Param("record") SysCarouselEntity record, @Param("example") SysCarouselEntityCriteria example);

    int updateByPrimaryKeySelective(SysCarouselEntity record);

    int updateByPrimaryKey(SysCarouselEntity record);

    SysCarouselEntity selectByExampleForOne(SysCarouselEntityCriteria example);
}