package com.bhe.dao.mybatis.model;

public class ProductSolutionsEntity {
    private String uuid;

    private String title;

    private String appliesment;

    private String procategoryid;

    private String prochampion;

    private String customer;

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

    public String getAppliesment() {
        return appliesment;
    }

    public void setAppliesment(String appliesment) {
        this.appliesment = appliesment == null ? null : appliesment.trim();
    }

    public String getProcategoryid() {
        return procategoryid;
    }

    public void setProcategoryid(String procategoryid) {
        this.procategoryid = procategoryid == null ? null : procategoryid.trim();
    }

    public String getProchampion() {
        return prochampion;
    }

    public void setProchampion(String prochampion) {
        this.prochampion = prochampion == null ? null : prochampion.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }
}