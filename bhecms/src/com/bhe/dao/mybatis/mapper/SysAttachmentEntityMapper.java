package com.bhe.dao.mybatis.mapper;

import com.bhe.dao.mybatis.model.SysAttachmentEntity;
import com.bhe.dao.mybatis.model.SysAttachmentEntityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAttachmentEntityMapper {
    int countByExample(SysAttachmentEntityCriteria example);

    int deleteByExample(SysAttachmentEntityCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(SysAttachmentEntity record);

    int insertSelective(SysAttachmentEntity record);

    List<SysAttachmentEntity> selectByExample(SysAttachmentEntityCriteria example);

    SysAttachmentEntity selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") SysAttachmentEntity record, @Param("example") SysAttachmentEntityCriteria example);

    int updateByExample(@Param("record") SysAttachmentEntity record, @Param("example") SysAttachmentEntityCriteria example);

    int updateByPrimaryKeySelective(SysAttachmentEntity record);

    int updateByPrimaryKey(SysAttachmentEntity record);

    SysAttachmentEntity selectByExampleForOne(SysAttachmentEntityCriteria example);
}