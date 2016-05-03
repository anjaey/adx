package com.bhe.dao.mybatis.model;

import java.util.Date;

public class ProductFilterEntity {
    private String uuid;

    private Long categoryid;

    private String name;

    private String valuemin;

    private String valuemax;

    private String value;

    private String attvalue;

    private Integer isshow;

    private String author;

    private Integer rank;

    private Integer attrank;

    private String filename;

    private Date createtime;

    private Integer state;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValuemin() {
        return valuemin;
    }

    public void setValuemin(String valuemin) {
        this.valuemin = valuemin == null ? null : valuemin.trim();
    }

    public String getValuemax() {
        return valuemax;
    }

    public void setValuemax(String valuemax) {
        this.valuemax = valuemax == null ? null : valuemax.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getAttvalue() {
        return attvalue;
    }

    public void setAttvalue(String attvalue) {
        this.attvalue = attvalue == null ? null : attvalue.trim();
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getAttrank() {
        return attrank;
    }

    public void setAttrank(Integer attrank) {
        this.attrank = attrank;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}