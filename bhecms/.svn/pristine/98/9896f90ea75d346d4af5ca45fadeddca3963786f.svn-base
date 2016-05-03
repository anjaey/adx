package com.bhe.dao.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysResourceEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysResourceEntityCriteria() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNamecnIsNull() {
            addCriterion("nameCn is null");
            return (Criteria) this;
        }

        public Criteria andNamecnIsNotNull() {
            addCriterion("nameCn is not null");
            return (Criteria) this;
        }

        public Criteria andNamecnEqualTo(String value) {
            addCriterion("nameCn =", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotEqualTo(String value) {
            addCriterion("nameCn <>", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnGreaterThan(String value) {
            addCriterion("nameCn >", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnGreaterThanOrEqualTo(String value) {
            addCriterion("nameCn >=", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLessThan(String value) {
            addCriterion("nameCn <", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLessThanOrEqualTo(String value) {
            addCriterion("nameCn <=", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLike(String value) {
            addCriterion("nameCn like", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotLike(String value) {
            addCriterion("nameCn not like", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnIn(List<String> values) {
            addCriterion("nameCn in", values, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotIn(List<String> values) {
            addCriterion("nameCn not in", values, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnBetween(String value1, String value2) {
            addCriterion("nameCn between", value1, value2, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotBetween(String value1, String value2) {
            addCriterion("nameCn not between", value1, value2, "namecn");
            return (Criteria) this;
        }

        public Criteria andNameenIsNull() {
            addCriterion("nameEn is null");
            return (Criteria) this;
        }

        public Criteria andNameenIsNotNull() {
            addCriterion("nameEn is not null");
            return (Criteria) this;
        }

        public Criteria andNameenEqualTo(String value) {
            addCriterion("nameEn =", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotEqualTo(String value) {
            addCriterion("nameEn <>", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenGreaterThan(String value) {
            addCriterion("nameEn >", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenGreaterThanOrEqualTo(String value) {
            addCriterion("nameEn >=", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenLessThan(String value) {
            addCriterion("nameEn <", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenLessThanOrEqualTo(String value) {
            addCriterion("nameEn <=", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenLike(String value) {
            addCriterion("nameEn like", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotLike(String value) {
            addCriterion("nameEn not like", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenIn(List<String> values) {
            addCriterion("nameEn in", values, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotIn(List<String> values) {
            addCriterion("nameEn not in", values, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenBetween(String value1, String value2) {
            addCriterion("nameEn between", value1, value2, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotBetween(String value1, String value2) {
            addCriterion("nameEn not between", value1, value2, "nameen");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andTemplateidIsNull() {
            addCriterion("templateid is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("templateid is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(Long value) {
            addCriterion("templateid =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(Long value) {
            addCriterion("templateid <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(Long value) {
            addCriterion("templateid >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(Long value) {
            addCriterion("templateid >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(Long value) {
            addCriterion("templateid <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(Long value) {
            addCriterion("templateid <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<Long> values) {
            addCriterion("templateid in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<Long> values) {
            addCriterion("templateid not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(Long value1, Long value2) {
            addCriterion("templateid between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(Long value1, Long value2) {
            addCriterion("templateid not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andMetatitleIsNull() {
            addCriterion("metaTitle is null");
            return (Criteria) this;
        }

        public Criteria andMetatitleIsNotNull() {
            addCriterion("metaTitle is not null");
            return (Criteria) this;
        }

        public Criteria andMetatitleEqualTo(String value) {
            addCriterion("metaTitle =", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleNotEqualTo(String value) {
            addCriterion("metaTitle <>", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleGreaterThan(String value) {
            addCriterion("metaTitle >", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleGreaterThanOrEqualTo(String value) {
            addCriterion("metaTitle >=", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleLessThan(String value) {
            addCriterion("metaTitle <", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleLessThanOrEqualTo(String value) {
            addCriterion("metaTitle <=", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleLike(String value) {
            addCriterion("metaTitle like", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleNotLike(String value) {
            addCriterion("metaTitle not like", value, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleIn(List<String> values) {
            addCriterion("metaTitle in", values, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleNotIn(List<String> values) {
            addCriterion("metaTitle not in", values, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleBetween(String value1, String value2) {
            addCriterion("metaTitle between", value1, value2, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetatitleNotBetween(String value1, String value2) {
            addCriterion("metaTitle not between", value1, value2, "metatitle");
            return (Criteria) this;
        }

        public Criteria andMetakeywordIsNull() {
            addCriterion("metaKeyWord is null");
            return (Criteria) this;
        }

        public Criteria andMetakeywordIsNotNull() {
            addCriterion("metaKeyWord is not null");
            return (Criteria) this;
        }

        public Criteria andMetakeywordEqualTo(String value) {
            addCriterion("metaKeyWord =", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotEqualTo(String value) {
            addCriterion("metaKeyWord <>", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordGreaterThan(String value) {
            addCriterion("metaKeyWord >", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordGreaterThanOrEqualTo(String value) {
            addCriterion("metaKeyWord >=", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordLessThan(String value) {
            addCriterion("metaKeyWord <", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordLessThanOrEqualTo(String value) {
            addCriterion("metaKeyWord <=", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordLike(String value) {
            addCriterion("metaKeyWord like", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotLike(String value) {
            addCriterion("metaKeyWord not like", value, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordIn(List<String> values) {
            addCriterion("metaKeyWord in", values, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotIn(List<String> values) {
            addCriterion("metaKeyWord not in", values, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordBetween(String value1, String value2) {
            addCriterion("metaKeyWord between", value1, value2, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetakeywordNotBetween(String value1, String value2) {
            addCriterion("metaKeyWord not between", value1, value2, "metakeyword");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionIsNull() {
            addCriterion("metaDescrption is null");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionIsNotNull() {
            addCriterion("metaDescrption is not null");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionEqualTo(String value) {
            addCriterion("metaDescrption =", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionNotEqualTo(String value) {
            addCriterion("metaDescrption <>", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionGreaterThan(String value) {
            addCriterion("metaDescrption >", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionGreaterThanOrEqualTo(String value) {
            addCriterion("metaDescrption >=", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionLessThan(String value) {
            addCriterion("metaDescrption <", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionLessThanOrEqualTo(String value) {
            addCriterion("metaDescrption <=", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionLike(String value) {
            addCriterion("metaDescrption like", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionNotLike(String value) {
            addCriterion("metaDescrption not like", value, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionIn(List<String> values) {
            addCriterion("metaDescrption in", values, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionNotIn(List<String> values) {
            addCriterion("metaDescrption not in", values, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionBetween(String value1, String value2) {
            addCriterion("metaDescrption between", value1, value2, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andMetadescrptionNotBetween(String value1, String value2) {
            addCriterion("metaDescrption not between", value1, value2, "metadescrption");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenIsNull() {
            addCriterion("isNewWindowsOpen is null");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenIsNotNull() {
            addCriterion("isNewWindowsOpen is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenEqualTo(Integer value) {
            addCriterion("isNewWindowsOpen =", value, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenNotEqualTo(Integer value) {
            addCriterion("isNewWindowsOpen <>", value, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenGreaterThan(Integer value) {
            addCriterion("isNewWindowsOpen >", value, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenGreaterThanOrEqualTo(Integer value) {
            addCriterion("isNewWindowsOpen >=", value, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenLessThan(Integer value) {
            addCriterion("isNewWindowsOpen <", value, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenLessThanOrEqualTo(Integer value) {
            addCriterion("isNewWindowsOpen <=", value, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenIn(List<Integer> values) {
            addCriterion("isNewWindowsOpen in", values, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenNotIn(List<Integer> values) {
            addCriterion("isNewWindowsOpen not in", values, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenBetween(Integer value1, Integer value2) {
            addCriterion("isNewWindowsOpen between", value1, value2, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsnewwindowsopenNotBetween(Integer value1, Integer value2) {
            addCriterion("isNewWindowsOpen not between", value1, value2, "isnewwindowsopen");
            return (Criteria) this;
        }

        public Criteria andIsdiggIsNull() {
            addCriterion("isDigg is null");
            return (Criteria) this;
        }

        public Criteria andIsdiggIsNotNull() {
            addCriterion("isDigg is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiggEqualTo(Integer value) {
            addCriterion("isDigg =", value, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggNotEqualTo(Integer value) {
            addCriterion("isDigg <>", value, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggGreaterThan(Integer value) {
            addCriterion("isDigg >", value, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDigg >=", value, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggLessThan(Integer value) {
            addCriterion("isDigg <", value, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggLessThanOrEqualTo(Integer value) {
            addCriterion("isDigg <=", value, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggIn(List<Integer> values) {
            addCriterion("isDigg in", values, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggNotIn(List<Integer> values) {
            addCriterion("isDigg not in", values, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggBetween(Integer value1, Integer value2) {
            addCriterion("isDigg between", value1, value2, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsdiggNotBetween(Integer value1, Integer value2) {
            addCriterion("isDigg not between", value1, value2, "isdigg");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNull() {
            addCriterion("isShare is null");
            return (Criteria) this;
        }

        public Criteria andIsshareIsNotNull() {
            addCriterion("isShare is not null");
            return (Criteria) this;
        }

        public Criteria andIsshareEqualTo(Integer value) {
            addCriterion("isShare =", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotEqualTo(Integer value) {
            addCriterion("isShare <>", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThan(Integer value) {
            addCriterion("isShare >", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShare >=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThan(Integer value) {
            addCriterion("isShare <", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareLessThanOrEqualTo(Integer value) {
            addCriterion("isShare <=", value, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareIn(List<Integer> values) {
            addCriterion("isShare in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotIn(List<Integer> values) {
            addCriterion("isShare not in", values, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareBetween(Integer value1, Integer value2) {
            addCriterion("isShare between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andIsshareNotBetween(Integer value1, Integer value2) {
            addCriterion("isShare not between", value1, value2, "isshare");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNull() {
            addCriterion("isComment is null");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNotNull() {
            addCriterion("isComment is not null");
            return (Criteria) this;
        }

        public Criteria andIscommentEqualTo(Integer value) {
            addCriterion("isComment =", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotEqualTo(Integer value) {
            addCriterion("isComment <>", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThan(Integer value) {
            addCriterion("isComment >", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isComment >=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThan(Integer value) {
            addCriterion("isComment <", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThanOrEqualTo(Integer value) {
            addCriterion("isComment <=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentIn(List<Integer> values) {
            addCriterion("isComment in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotIn(List<Integer> values) {
            addCriterion("isComment not in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentBetween(Integer value1, Integer value2) {
            addCriterion("isComment between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotBetween(Integer value1, Integer value2) {
            addCriterion("isComment not between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionIsNull() {
            addCriterion("browerPermission is null");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionIsNotNull() {
            addCriterion("browerPermission is not null");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionEqualTo(Integer value) {
            addCriterion("browerPermission =", value, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionNotEqualTo(Integer value) {
            addCriterion("browerPermission <>", value, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionGreaterThan(Integer value) {
            addCriterion("browerPermission >", value, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("browerPermission >=", value, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionLessThan(Integer value) {
            addCriterion("browerPermission <", value, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionLessThanOrEqualTo(Integer value) {
            addCriterion("browerPermission <=", value, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionIn(List<Integer> values) {
            addCriterion("browerPermission in", values, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionNotIn(List<Integer> values) {
            addCriterion("browerPermission not in", values, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionBetween(Integer value1, Integer value2) {
            addCriterion("browerPermission between", value1, value2, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andBrowerpermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("browerPermission not between", value1, value2, "browerpermission");
            return (Criteria) this;
        }

        public Criteria andExtraurlIsNull() {
            addCriterion("extraUrl is null");
            return (Criteria) this;
        }

        public Criteria andExtraurlIsNotNull() {
            addCriterion("extraUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExtraurlEqualTo(String value) {
            addCriterion("extraUrl =", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlNotEqualTo(String value) {
            addCriterion("extraUrl <>", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlGreaterThan(String value) {
            addCriterion("extraUrl >", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlGreaterThanOrEqualTo(String value) {
            addCriterion("extraUrl >=", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlLessThan(String value) {
            addCriterion("extraUrl <", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlLessThanOrEqualTo(String value) {
            addCriterion("extraUrl <=", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlLike(String value) {
            addCriterion("extraUrl like", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlNotLike(String value) {
            addCriterion("extraUrl not like", value, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlIn(List<String> values) {
            addCriterion("extraUrl in", values, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlNotIn(List<String> values) {
            addCriterion("extraUrl not in", values, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlBetween(String value1, String value2) {
            addCriterion("extraUrl between", value1, value2, "extraurl");
            return (Criteria) this;
        }

        public Criteria andExtraurlNotBetween(String value1, String value2) {
            addCriterion("extraUrl not between", value1, value2, "extraurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("picUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("picUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("picUrl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("picUrl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("picUrl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("picUrl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("picUrl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("picUrl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("picUrl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("picUrl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("picUrl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("picUrl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("picUrl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("picUrl not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlIsNull() {
            addCriterion("pidHDUrl is null");
            return (Criteria) this;
        }

        public Criteria andPidhdurlIsNotNull() {
            addCriterion("pidHDUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPidhdurlEqualTo(String value) {
            addCriterion("pidHDUrl =", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlNotEqualTo(String value) {
            addCriterion("pidHDUrl <>", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlGreaterThan(String value) {
            addCriterion("pidHDUrl >", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlGreaterThanOrEqualTo(String value) {
            addCriterion("pidHDUrl >=", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlLessThan(String value) {
            addCriterion("pidHDUrl <", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlLessThanOrEqualTo(String value) {
            addCriterion("pidHDUrl <=", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlLike(String value) {
            addCriterion("pidHDUrl like", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlNotLike(String value) {
            addCriterion("pidHDUrl not like", value, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlIn(List<String> values) {
            addCriterion("pidHDUrl in", values, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlNotIn(List<String> values) {
            addCriterion("pidHDUrl not in", values, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlBetween(String value1, String value2) {
            addCriterion("pidHDUrl between", value1, value2, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andPidhdurlNotBetween(String value1, String value2) {
            addCriterion("pidHDUrl not between", value1, value2, "pidhdurl");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyIsNull() {
            addCriterion("operationAfterVerify is null");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyIsNotNull() {
            addCriterion("operationAfterVerify is not null");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyEqualTo(Integer value) {
            addCriterion("operationAfterVerify =", value, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyNotEqualTo(Integer value) {
            addCriterion("operationAfterVerify <>", value, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyGreaterThan(Integer value) {
            addCriterion("operationAfterVerify >", value, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("operationAfterVerify >=", value, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyLessThan(Integer value) {
            addCriterion("operationAfterVerify <", value, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyLessThanOrEqualTo(Integer value) {
            addCriterion("operationAfterVerify <=", value, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyIn(List<Integer> values) {
            addCriterion("operationAfterVerify in", values, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyNotIn(List<Integer> values) {
            addCriterion("operationAfterVerify not in", values, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyBetween(Integer value1, Integer value2) {
            addCriterion("operationAfterVerify between", value1, value2, "operationafterverify");
            return (Criteria) this;
        }

        public Criteria andOperationafterverifyNotBetween(Integer value1, Integer value2) {
            addCriterion("operationAfterVerify not between", value1, value2, "operationafterverify");
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