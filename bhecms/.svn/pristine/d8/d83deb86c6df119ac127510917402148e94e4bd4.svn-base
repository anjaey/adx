package com.bhe.dao.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAttachmentEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ProductAttachmentEntityCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andHdurlIsNull() {
            addCriterion("hdUrl is null");
            return (Criteria) this;
        }

        public Criteria andHdurlIsNotNull() {
            addCriterion("hdUrl is not null");
            return (Criteria) this;
        }

        public Criteria andHdurlEqualTo(String value) {
            addCriterion("hdUrl =", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlNotEqualTo(String value) {
            addCriterion("hdUrl <>", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlGreaterThan(String value) {
            addCriterion("hdUrl >", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlGreaterThanOrEqualTo(String value) {
            addCriterion("hdUrl >=", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlLessThan(String value) {
            addCriterion("hdUrl <", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlLessThanOrEqualTo(String value) {
            addCriterion("hdUrl <=", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlLike(String value) {
            addCriterion("hdUrl like", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlNotLike(String value) {
            addCriterion("hdUrl not like", value, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlIn(List<String> values) {
            addCriterion("hdUrl in", values, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlNotIn(List<String> values) {
            addCriterion("hdUrl not in", values, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlBetween(String value1, String value2) {
            addCriterion("hdUrl between", value1, value2, "hdurl");
            return (Criteria) this;
        }

        public Criteria andHdurlNotBetween(String value1, String value2) {
            addCriterion("hdUrl not between", value1, value2, "hdurl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeIsNull() {
            addCriterion("attachmentType is null");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeIsNotNull() {
            addCriterion("attachmentType is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeEqualTo(Integer value) {
            addCriterion("attachmentType =", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotEqualTo(Integer value) {
            addCriterion("attachmentType <>", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeGreaterThan(Integer value) {
            addCriterion("attachmentType >", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attachmentType >=", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeLessThan(Integer value) {
            addCriterion("attachmentType <", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeLessThanOrEqualTo(Integer value) {
            addCriterion("attachmentType <=", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeIn(List<Integer> values) {
            addCriterion("attachmentType in", values, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotIn(List<Integer> values) {
            addCriterion("attachmentType not in", values, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeBetween(Integer value1, Integer value2) {
            addCriterion("attachmentType between", value1, value2, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("attachmentType not between", value1, value2, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("keyid is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyid is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("keyid =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("keyid <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("keyid >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("keyid >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("keyid <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("keyid <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("keyid like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("keyid not like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("keyid in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("keyid not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("keyid between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("keyid not between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNull() {
            addCriterion("ismain is null");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNotNull() {
            addCriterion("ismain is not null");
            return (Criteria) this;
        }

        public Criteria andIsmainEqualTo(Integer value) {
            addCriterion("ismain =", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotEqualTo(Integer value) {
            addCriterion("ismain <>", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThan(Integer value) {
            addCriterion("ismain >", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismain >=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThan(Integer value) {
            addCriterion("ismain <", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThanOrEqualTo(Integer value) {
            addCriterion("ismain <=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainIn(List<Integer> values) {
            addCriterion("ismain in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotIn(List<Integer> values) {
            addCriterion("ismain not in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainBetween(Integer value1, Integer value2) {
            addCriterion("ismain between", value1, value2, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotBetween(Integer value1, Integer value2) {
            addCriterion("ismain not between", value1, value2, "ismain");
            return (Criteria) this;
        }

        public Criteria andFilemoduleIsNull() {
            addCriterion("fileModule is null");
            return (Criteria) this;
        }

        public Criteria andFilemoduleIsNotNull() {
            addCriterion("fileModule is not null");
            return (Criteria) this;
        }

        public Criteria andFilemoduleEqualTo(String value) {
            addCriterion("fileModule =", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotEqualTo(String value) {
            addCriterion("fileModule <>", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleGreaterThan(String value) {
            addCriterion("fileModule >", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleGreaterThanOrEqualTo(String value) {
            addCriterion("fileModule >=", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleLessThan(String value) {
            addCriterion("fileModule <", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleLessThanOrEqualTo(String value) {
            addCriterion("fileModule <=", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleLike(String value) {
            addCriterion("fileModule like", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotLike(String value) {
            addCriterion("fileModule not like", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleIn(List<String> values) {
            addCriterion("fileModule in", values, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotIn(List<String> values) {
            addCriterion("fileModule not in", values, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleBetween(String value1, String value2) {
            addCriterion("fileModule between", value1, value2, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotBetween(String value1, String value2) {
            addCriterion("fileModule not between", value1, value2, "filemodule");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}