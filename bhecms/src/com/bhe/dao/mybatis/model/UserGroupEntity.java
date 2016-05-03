package com.bhe.dao.mybatis.model;

public class UserGroupEntity {
    private Long id;

    private String namecn;

    private Long parentid;

    private Integer maxattachment;

    private Integer maxattachmentall;

    private String allowsuffix;

    private Integer cancomment;

    private Integer isshowcommentverify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Integer getMaxattachment() {
        return maxattachment;
    }

    public void setMaxattachment(Integer maxattachment) {
        this.maxattachment = maxattachment;
    }

    public Integer getMaxattachmentall() {
        return maxattachmentall;
    }

    public void setMaxattachmentall(Integer maxattachmentall) {
        this.maxattachmentall = maxattachmentall;
    }

    public String getAllowsuffix() {
        return allowsuffix;
    }

    public void setAllowsuffix(String allowsuffix) {
        this.allowsuffix = allowsuffix == null ? null : allowsuffix.trim();
    }

    public Integer getCancomment() {
        return cancomment;
    }

    public void setCancomment(Integer cancomment) {
        this.cancomment = cancomment;
    }

    public Integer getIsshowcommentverify() {
        return isshowcommentverify;
    }

    public void setIsshowcommentverify(Integer isshowcommentverify) {
        this.isshowcommentverify = isshowcommentverify;
    }
}