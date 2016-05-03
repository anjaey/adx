package com.bhe.dao.mybatis.model;

import java.util.Date;

public class SysMessageEntity {
    private Long id;

    private Integer type;

    private String content;

    private Date createtime;

    private Long userid;

    private String nickname;

    private String email;

    private String phone;

    private Integer status;

    private String returncontent;

    private String returnuserkey;

    private Date returntime;

    private Integer isshowreturn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReturncontent() {
        return returncontent;
    }

    public void setReturncontent(String returncontent) {
        this.returncontent = returncontent == null ? null : returncontent.trim();
    }

    public String getReturnuserkey() {
        return returnuserkey;
    }

    public void setReturnuserkey(String returnuserkey) {
        this.returnuserkey = returnuserkey == null ? null : returnuserkey.trim();
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public Integer getIsshowreturn() {
        return isshowreturn;
    }

    public void setIsshowreturn(Integer isshowreturn) {
        this.isshowreturn = isshowreturn;
    }
}