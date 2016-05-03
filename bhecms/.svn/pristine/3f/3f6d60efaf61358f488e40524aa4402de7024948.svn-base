package com.bhe.dao.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMessageEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UserMessageEntityCriteria() {
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

        public Criteria andFromuseridIsNull() {
            addCriterion("fromUserId is null");
            return (Criteria) this;
        }

        public Criteria andFromuseridIsNotNull() {
            addCriterion("fromUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFromuseridEqualTo(String value) {
            addCriterion("fromUserId =", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotEqualTo(String value) {
            addCriterion("fromUserId <>", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridGreaterThan(String value) {
            addCriterion("fromUserId >", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridGreaterThanOrEqualTo(String value) {
            addCriterion("fromUserId >=", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridLessThan(String value) {
            addCriterion("fromUserId <", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridLessThanOrEqualTo(String value) {
            addCriterion("fromUserId <=", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridLike(String value) {
            addCriterion("fromUserId like", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotLike(String value) {
            addCriterion("fromUserId not like", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridIn(List<String> values) {
            addCriterion("fromUserId in", values, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotIn(List<String> values) {
            addCriterion("fromUserId not in", values, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridBetween(String value1, String value2) {
            addCriterion("fromUserId between", value1, value2, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotBetween(String value1, String value2) {
            addCriterion("fromUserId not between", value1, value2, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andTouseridIsNull() {
            addCriterion("toUserId is null");
            return (Criteria) this;
        }

        public Criteria andTouseridIsNotNull() {
            addCriterion("toUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTouseridEqualTo(String value) {
            addCriterion("toUserId =", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotEqualTo(String value) {
            addCriterion("toUserId <>", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridGreaterThan(String value) {
            addCriterion("toUserId >", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridGreaterThanOrEqualTo(String value) {
            addCriterion("toUserId >=", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLessThan(String value) {
            addCriterion("toUserId <", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLessThanOrEqualTo(String value) {
            addCriterion("toUserId <=", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLike(String value) {
            addCriterion("toUserId like", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotLike(String value) {
            addCriterion("toUserId not like", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridIn(List<String> values) {
            addCriterion("toUserId in", values, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotIn(List<String> values) {
            addCriterion("toUserId not in", values, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridBetween(String value1, String value2) {
            addCriterion("toUserId between", value1, value2, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotBetween(String value1, String value2) {
            addCriterion("toUserId not between", value1, value2, "touserid");
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

        public Criteria andIsseeIsNull() {
            addCriterion("isSee is null");
            return (Criteria) this;
        }

        public Criteria andIsseeIsNotNull() {
            addCriterion("isSee is not null");
            return (Criteria) this;
        }

        public Criteria andIsseeEqualTo(Integer value) {
            addCriterion("isSee =", value, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeNotEqualTo(Integer value) {
            addCriterion("isSee <>", value, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeGreaterThan(Integer value) {
            addCriterion("isSee >", value, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSee >=", value, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeLessThan(Integer value) {
            addCriterion("isSee <", value, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeLessThanOrEqualTo(Integer value) {
            addCriterion("isSee <=", value, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeIn(List<Integer> values) {
            addCriterion("isSee in", values, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeNotIn(List<Integer> values) {
            addCriterion("isSee not in", values, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeBetween(Integer value1, Integer value2) {
            addCriterion("isSee between", value1, value2, "issee");
            return (Criteria) this;
        }

        public Criteria andIsseeNotBetween(Integer value1, Integer value2) {
            addCriterion("isSee not between", value1, value2, "issee");
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

        public Criteria andFromidIsNull() {
            addCriterion("fromId is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromId is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Long value) {
            addCriterion("fromId =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Long value) {
            addCriterion("fromId <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Long value) {
            addCriterion("fromId >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Long value) {
            addCriterion("fromId >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Long value) {
            addCriterion("fromId <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Long value) {
            addCriterion("fromId <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Long> values) {
            addCriterion("fromId in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Long> values) {
            addCriterion("fromId not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Long value1, Long value2) {
            addCriterion("fromId between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Long value1, Long value2) {
            addCriterion("fromId not between", value1, value2, "fromid");
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