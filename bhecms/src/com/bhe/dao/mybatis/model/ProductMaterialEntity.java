package com.bhe.dao.mybatis.model;

public class ProductMaterialEntity {
    private Long id;

    private String namecn;

    private String nameen;

    private String picurl;

    private String description;

    private String interfaceurl;

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

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getInterfaceurl() {
        return interfaceurl;
    }

    public void setInterfaceurl(String interfaceurl) {
        this.interfaceurl = interfaceurl == null ? null : interfaceurl.trim();
    }
}