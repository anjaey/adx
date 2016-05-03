package com.bhe.dao.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class ArticleEntity {
    private String uuid;

    private Long classid;

    private String title;

    private String subtitle;

    private String author;

    private Integer isshow;

    private Date createtime;

    private Integer isextraurl;

    private String extralurl;

    private String titlecolor;

    private Integer isbold;

    private String summary;

    private Integer isautocreatesummary;

    private String fromwhere;

    private Integer readpermission;

    private Integer toplevel;

    private Integer rank;

    private String articletype;

    private Long templateid;

    private Integer hasatachment;

    private Integer hasmedia;

    private Integer isdownpic;

    private BigDecimal price;

    private Integer status;

    private Integer hits;

    private String content;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Long getClassid() {
        return classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsextraurl() {
        return isextraurl;
    }

    public void setIsextraurl(Integer isextraurl) {
        this.isextraurl = isextraurl;
    }

    public String getExtralurl() {
        return extralurl;
    }

    public void setExtralurl(String extralurl) {
        this.extralurl = extralurl == null ? null : extralurl.trim();
    }

    public String getTitlecolor() {
        return titlecolor;
    }

    public void setTitlecolor(String titlecolor) {
        this.titlecolor = titlecolor == null ? null : titlecolor.trim();
    }

    public Integer getIsbold() {
        return isbold;
    }

    public void setIsbold(Integer isbold) {
        this.isbold = isbold;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getIsautocreatesummary() {
        return isautocreatesummary;
    }

    public void setIsautocreatesummary(Integer isautocreatesummary) {
        this.isautocreatesummary = isautocreatesummary;
    }

    public String getFromwhere() {
        return fromwhere;
    }

    public void setFromwhere(String fromwhere) {
        this.fromwhere = fromwhere == null ? null : fromwhere.trim();
    }

    public Integer getReadpermission() {
        return readpermission;
    }

    public void setReadpermission(Integer readpermission) {
        this.readpermission = readpermission;
    }

    public Integer getToplevel() {
        return toplevel;
    }

    public void setToplevel(Integer toplevel) {
        this.toplevel = toplevel;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getArticletype() {
        return articletype;
    }

    public void setArticletype(String articletype) {
        this.articletype = articletype == null ? null : articletype.trim();
    }

    public Long getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Long templateid) {
        this.templateid = templateid;
    }

    public Integer getHasatachment() {
        return hasatachment;
    }

    public void setHasatachment(Integer hasatachment) {
        this.hasatachment = hasatachment;
    }

    public Integer getHasmedia() {
        return hasmedia;
    }

    public void setHasmedia(Integer hasmedia) {
        this.hasmedia = hasmedia;
    }

    public Integer getIsdownpic() {
        return isdownpic;
    }

    public void setIsdownpic(Integer isdownpic) {
        this.isdownpic = isdownpic;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}