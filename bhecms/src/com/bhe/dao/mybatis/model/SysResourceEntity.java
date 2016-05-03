package com.bhe.dao.mybatis.model;

import java.util.Date;

public class SysResourceEntity {
    private Integer id;

    private String namecn;

    private String nameen;

    private String code;

    private String url;

    private Integer parentid;

    private String description;

    private Integer status;

    private Date createtime;

    private Long templateid;

    private String metatitle;

    private String metakeyword;

    private String metadescrption;

    private Integer rank;

    private Integer isnewwindowsopen;

    private Integer isdigg;

    private Integer isshare;

    private Integer iscomment;

    private Integer browerpermission;

    private String extraurl;

    private String picurl;

    private String pidhdurl;

    private Integer operationafterverify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Long getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Long templateid) {
        this.templateid = templateid;
    }

    public String getMetatitle() {
        return metatitle;
    }

    public void setMetatitle(String metatitle) {
        this.metatitle = metatitle == null ? null : metatitle.trim();
    }

    public String getMetakeyword() {
        return metakeyword;
    }

    public void setMetakeyword(String metakeyword) {
        this.metakeyword = metakeyword == null ? null : metakeyword.trim();
    }

    public String getMetadescrption() {
        return metadescrption;
    }

    public void setMetadescrption(String metadescrption) {
        this.metadescrption = metadescrption == null ? null : metadescrption.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getIsnewwindowsopen() {
        return isnewwindowsopen;
    }

    public void setIsnewwindowsopen(Integer isnewwindowsopen) {
        this.isnewwindowsopen = isnewwindowsopen;
    }

    public Integer getIsdigg() {
        return isdigg;
    }

    public void setIsdigg(Integer isdigg) {
        this.isdigg = isdigg;
    }

    public Integer getIsshare() {
        return isshare;
    }

    public void setIsshare(Integer isshare) {
        this.isshare = isshare;
    }

    public Integer getIscomment() {
        return iscomment;
    }

    public void setIscomment(Integer iscomment) {
        this.iscomment = iscomment;
    }

    public Integer getBrowerpermission() {
        return browerpermission;
    }

    public void setBrowerpermission(Integer browerpermission) {
        this.browerpermission = browerpermission;
    }

    public String getExtraurl() {
        return extraurl;
    }

    public void setExtraurl(String extraurl) {
        this.extraurl = extraurl == null ? null : extraurl.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getPidhdurl() {
        return pidhdurl;
    }

    public void setPidhdurl(String pidhdurl) {
        this.pidhdurl = pidhdurl == null ? null : pidhdurl.trim();
    }

    public Integer getOperationafterverify() {
        return operationafterverify;
    }

    public void setOperationafterverify(Integer operationafterverify) {
        this.operationafterverify = operationafterverify;
    }
}