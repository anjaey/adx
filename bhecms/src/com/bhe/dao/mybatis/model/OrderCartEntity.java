package com.bhe.dao.mybatis.model;

import java.util.Date;

public class OrderCartEntity {
    private Long id;

    private String productid;

    private Integer count;

    private String createuser;

    private Date createtime;

    private String unit;

    private Integer isrent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getIsrent() {
        return isrent;
    }

    public void setIsrent(Integer isrent) {
        this.isrent = isrent;
    }
}