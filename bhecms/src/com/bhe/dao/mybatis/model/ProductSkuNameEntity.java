package com.bhe.dao.mybatis.model;

public class ProductSkuNameEntity {
    private Long id;

    private Long categoryid;

    private String name;

    private Integer inputtype;

    private String valuelist;

    private Integer rank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getInputtype() {
        return inputtype;
    }

    public void setInputtype(Integer inputtype) {
        this.inputtype = inputtype;
    }

    public String getValuelist() {
        return valuelist;
    }

    public void setValuelist(String valuelist) {
        this.valuelist = valuelist == null ? null : valuelist.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}