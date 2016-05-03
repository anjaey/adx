package com.bhe.dao.mybatis.model;

public class ArticleAttachmentEntity {
    private Long id;

    private Long articleid;

    private Long attachmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleid() {
        return articleid;
    }

    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    public Long getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(Long attachmentid) {
        this.attachmentid = attachmentid;
    }
}