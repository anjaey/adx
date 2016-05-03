package com.bhe.dao.mybatis.model;

import java.util.Date;

public class ProductAttachmentEntity {
    private Long id;

    private String name;

    private String url;

    private String hdurl;

    private Integer status;

    private Date createtime;

    private Integer attachmenttype;

    private String keyid;

    private Integer ismain;

    private String filemodule;

    private String uuid;

    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl == null ? null : hdurl.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getAttachmenttype() {
        return attachmenttype;
    }

    public void setAttachmenttype(Integer attachmenttype) {
        this.attachmenttype = attachmenttype;
    }

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public Integer getIsmain() {
        return ismain;
    }

    public void setIsmain(Integer ismain) {
        this.ismain = ismain;
    }

    public String getFilemodule() {
        return filemodule;
    }

    public void setFilemodule(String filemodule) {
        this.filemodule = filemodule == null ? null : filemodule.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}