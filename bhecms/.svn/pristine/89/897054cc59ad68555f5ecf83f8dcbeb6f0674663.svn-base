package com.bhe.dao.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDetailEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UserDetailEntityCriteria() {
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

        public Criteria andUserkeyIsNull() {
            addCriterion("userkey is null");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNotNull() {
            addCriterion("userkey is not null");
            return (Criteria) this;
        }

        public Criteria andUserkeyEqualTo(String value) {
            addCriterion("userkey =", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotEqualTo(String value) {
            addCriterion("userkey <>", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThan(String value) {
            addCriterion("userkey >", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThanOrEqualTo(String value) {
            addCriterion("userkey >=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThan(String value) {
            addCriterion("userkey <", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThanOrEqualTo(String value) {
            addCriterion("userkey <=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLike(String value) {
            addCriterion("userkey like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotLike(String value) {
            addCriterion("userkey not like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyIn(List<String> values) {
            addCriterion("userkey in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotIn(List<String> values) {
            addCriterion("userkey not in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyBetween(String value1, String value2) {
            addCriterion("userkey between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotBetween(String value1, String value2) {
            addCriterion("userkey not between", value1, value2, "userkey");
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

        public Criteria andBithIsNull() {
            addCriterion("bith is null");
            return (Criteria) this;
        }

        public Criteria andBithIsNotNull() {
            addCriterion("bith is not null");
            return (Criteria) this;
        }

        public Criteria andBithEqualTo(Date value) {
            addCriterion("bith =", value, "bith");
            return (Criteria) this;
        }

        public Criteria andBithNotEqualTo(Date value) {
            addCriterion("bith <>", value, "bith");
            return (Criteria) this;
        }

        public Criteria andBithGreaterThan(Date value) {
            addCriterion("bith >", value, "bith");
            return (Criteria) this;
        }

        public Criteria andBithGreaterThanOrEqualTo(Date value) {
            addCriterion("bith >=", value, "bith");
            return (Criteria) this;
        }

        public Criteria andBithLessThan(Date value) {
            addCriterion("bith <", value, "bith");
            return (Criteria) this;
        }

        public Criteria andBithLessThanOrEqualTo(Date value) {
            addCriterion("bith <=", value, "bith");
            return (Criteria) this;
        }

        public Criteria andBithIn(List<Date> values) {
            addCriterion("bith in", values, "bith");
            return (Criteria) this;
        }

        public Criteria andBithNotIn(List<Date> values) {
            addCriterion("bith not in", values, "bith");
            return (Criteria) this;
        }

        public Criteria andBithBetween(Date value1, Date value2) {
            addCriterion("bith between", value1, value2, "bith");
            return (Criteria) this;
        }

        public Criteria andBithNotBetween(Date value1, Date value2) {
            addCriterion("bith not between", value1, value2, "bith");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
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

        public Criteria andCreateuserIsNull() {
            addCriterion("createUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createUser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createUser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createUser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createUser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createUser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createUser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createUser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createUser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createUser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createUser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createUser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createUser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIsNull() {
            addCriterion("usergroupid is null");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIsNotNull() {
            addCriterion("usergroupid is not null");
            return (Criteria) this;
        }

        public Criteria andUsergroupidEqualTo(Long value) {
            addCriterion("usergroupid =", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotEqualTo(Long value) {
            addCriterion("usergroupid <>", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidGreaterThan(Long value) {
            addCriterion("usergroupid >", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("usergroupid >=", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidLessThan(Long value) {
            addCriterion("usergroupid <", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidLessThanOrEqualTo(Long value) {
            addCriterion("usergroupid <=", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIn(List<Long> values) {
            addCriterion("usergroupid in", values, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotIn(List<Long> values) {
            addCriterion("usergroupid not in", values, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidBetween(Long value1, Long value2) {
            addCriterion("usergroupid between", value1, value2, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotBetween(Long value1, Long value2) {
            addCriterion("usergroupid not between", value1, value2, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(String value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(String value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(String value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(String value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(String value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(String value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLike(String value) {
            addCriterion("interest like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotLike(String value) {
            addCriterion("interest not like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<String> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<String> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(String value1, String value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(String value1, String value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andMainbusinessIsNull() {
            addCriterion("mainbusiness is null");
            return (Criteria) this;
        }

        public Criteria andMainbusinessIsNotNull() {
            addCriterion("mainbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andMainbusinessEqualTo(String value) {
            addCriterion("mainbusiness =", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotEqualTo(String value) {
            addCriterion("mainbusiness <>", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessGreaterThan(String value) {
            addCriterion("mainbusiness >", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("mainbusiness >=", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessLessThan(String value) {
            addCriterion("mainbusiness <", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessLessThanOrEqualTo(String value) {
            addCriterion("mainbusiness <=", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessLike(String value) {
            addCriterion("mainbusiness like", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotLike(String value) {
            addCriterion("mainbusiness not like", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessIn(List<String> values) {
            addCriterion("mainbusiness in", values, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotIn(List<String> values) {
            addCriterion("mainbusiness not in", values, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessBetween(String value1, String value2) {
            addCriterion("mainbusiness between", value1, value2, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotBetween(String value1, String value2) {
            addCriterion("mainbusiness not between", value1, value2, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andProvincesIsNull() {
            addCriterion("provinces is null");
            return (Criteria) this;
        }

        public Criteria andProvincesIsNotNull() {
            addCriterion("provinces is not null");
            return (Criteria) this;
        }

        public Criteria andProvincesEqualTo(String value) {
            addCriterion("provinces =", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesNotEqualTo(String value) {
            addCriterion("provinces <>", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesGreaterThan(String value) {
            addCriterion("provinces >", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesGreaterThanOrEqualTo(String value) {
            addCriterion("provinces >=", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesLessThan(String value) {
            addCriterion("provinces <", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesLessThanOrEqualTo(String value) {
            addCriterion("provinces <=", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesLike(String value) {
            addCriterion("provinces like", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesNotLike(String value) {
            addCriterion("provinces not like", value, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesIn(List<String> values) {
            addCriterion("provinces in", values, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesNotIn(List<String> values) {
            addCriterion("provinces not in", values, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesBetween(String value1, String value2) {
            addCriterion("provinces between", value1, value2, "provinces");
            return (Criteria) this;
        }

        public Criteria andProvincesNotBetween(String value1, String value2) {
            addCriterion("provinces not between", value1, value2, "provinces");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andContactinfoIsNull() {
            addCriterion("contactinfo is null");
            return (Criteria) this;
        }

        public Criteria andContactinfoIsNotNull() {
            addCriterion("contactinfo is not null");
            return (Criteria) this;
        }

        public Criteria andContactinfoEqualTo(Integer value) {
            addCriterion("contactinfo =", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotEqualTo(Integer value) {
            addCriterion("contactinfo <>", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThan(Integer value) {
            addCriterion("contactinfo >", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("contactinfo >=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThan(Integer value) {
            addCriterion("contactinfo <", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThanOrEqualTo(Integer value) {
            addCriterion("contactinfo <=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoIn(List<Integer> values) {
            addCriterion("contactinfo in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotIn(List<Integer> values) {
            addCriterion("contactinfo not in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoBetween(Integer value1, Integer value2) {
            addCriterion("contactinfo between", value1, value2, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotBetween(Integer value1, Integer value2) {
            addCriterion("contactinfo not between", value1, value2, "contactinfo");
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