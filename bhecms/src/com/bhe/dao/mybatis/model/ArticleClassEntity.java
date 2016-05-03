package com.bhe.dao.mybatis.model;

public class ArticleClassEntity {
    private Long id;

    private String namecn;

    private Integer showinnav;

    private Integer parentid;

    private Integer type;

    private Long resoureceid;

    private String description;

    private String nameen;

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

    public Integer getShowinnav() {
        return showinnav;
    }

    public void setShowinnav(Integer showinnav) {
        this.showinnav = showinnav;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getResoureceid() {
        return resoureceid;
    }

    public void setResoureceid(Long resoureceid) {
        this.resoureceid = resoureceid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }
}