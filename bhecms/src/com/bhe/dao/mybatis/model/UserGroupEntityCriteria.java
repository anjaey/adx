package com.bhe.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class UserGroupEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UserGroupEntityCriteria() {
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

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentIsNull() {
            addCriterion("maxAttachment is null");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentIsNotNull() {
            addCriterion("maxAttachment is not null");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentEqualTo(Integer value) {
            addCriterion("maxAttachment =", value, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentNotEqualTo(Integer value) {
            addCriterion("maxAttachment <>", value, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentGreaterThan(Integer value) {
            addCriterion("maxAttachment >", value, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxAttachment >=", value, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentLessThan(Integer value) {
            addCriterion("maxAttachment <", value, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentLessThanOrEqualTo(Integer value) {
            addCriterion("maxAttachment <=", value, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentIn(List<Integer> values) {
            addCriterion("maxAttachment in", values, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentNotIn(List<Integer> values) {
            addCriterion("maxAttachment not in", values, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentBetween(Integer value1, Integer value2) {
            addCriterion("maxAttachment between", value1, value2, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentNotBetween(Integer value1, Integer value2) {
            addCriterion("maxAttachment not between", value1, value2, "maxattachment");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallIsNull() {
            addCriterion("maxAttachmentAll is null");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallIsNotNull() {
            addCriterion("maxAttachmentAll is not null");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallEqualTo(Integer value) {
            addCriterion("maxAttachmentAll =", value, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallNotEqualTo(Integer value) {
            addCriterion("maxAttachmentAll <>", value, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallGreaterThan(Integer value) {
            addCriterion("maxAttachmentAll >", value, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxAttachmentAll >=", value, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallLessThan(Integer value) {
            addCriterion("maxAttachmentAll <", value, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallLessThanOrEqualTo(Integer value) {
            addCriterion("maxAttachmentAll <=", value, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallIn(List<Integer> values) {
            addCriterion("maxAttachmentAll in", values, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallNotIn(List<Integer> values) {
            addCriterion("maxAttachmentAll not in", values, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallBetween(Integer value1, Integer value2) {
            addCriterion("maxAttachmentAll between", value1, value2, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andMaxattachmentallNotBetween(Integer value1, Integer value2) {
            addCriterion("maxAttachmentAll not between", value1, value2, "maxattachmentall");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixIsNull() {
            addCriterion("allowSuffix is null");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixIsNotNull() {
            addCriterion("allowSuffix is not null");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixEqualTo(String value) {
            addCriterion("allowSuffix =", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixNotEqualTo(String value) {
            addCriterion("allowSuffix <>", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixGreaterThan(String value) {
            addCriterion("allowSuffix >", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixGreaterThanOrEqualTo(String value) {
            addCriterion("allowSuffix >=", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixLessThan(String value) {
            addCriterion("allowSuffix <", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixLessThanOrEqualTo(String value) {
            addCriterion("allowSuffix <=", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixLike(String value) {
            addCriterion("allowSuffix like", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixNotLike(String value) {
            addCriterion("allowSuffix not like", value, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixIn(List<String> values) {
            addCriterion("allowSuffix in", values, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixNotIn(List<String> values) {
            addCriterion("allowSuffix not in", values, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixBetween(String value1, String value2) {
            addCriterion("allowSuffix between", value1, value2, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andAllowsuffixNotBetween(String value1, String value2) {
            addCriterion("allowSuffix not between", value1, value2, "allowsuffix");
            return (Criteria) this;
        }

        public Criteria andCancommentIsNull() {
            addCriterion("canComment is null");
            return (Criteria) this;
        }

        public Criteria andCancommentIsNotNull() {
            addCriterion("canComment is not null");
            return (Criteria) this;
        }

        public Criteria andCancommentEqualTo(Integer value) {
            addCriterion("canComment =", value, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentNotEqualTo(Integer value) {
            addCriterion("canComment <>", value, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentGreaterThan(Integer value) {
            addCriterion("canComment >", value, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("canComment >=", value, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentLessThan(Integer value) {
            addCriterion("canComment <", value, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentLessThanOrEqualTo(Integer value) {
            addCriterion("canComment <=", value, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentIn(List<Integer> values) {
            addCriterion("canComment in", values, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentNotIn(List<Integer> values) {
            addCriterion("canComment not in", values, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentBetween(Integer value1, Integer value2) {
            addCriterion("canComment between", value1, value2, "cancomment");
            return (Criteria) this;
        }

        public Criteria andCancommentNotBetween(Integer value1, Integer value2) {
            addCriterion("canComment not between", value1, value2, "cancomment");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyIsNull() {
            addCriterion("isShowCommentVerify is null");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyIsNotNull() {
            addCriterion("isShowCommentVerify is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyEqualTo(Integer value) {
            addCriterion("isShowCommentVerify =", value, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyNotEqualTo(Integer value) {
            addCriterion("isShowCommentVerify <>", value, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyGreaterThan(Integer value) {
            addCriterion("isShowCommentVerify >", value, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShowCommentVerify >=", value, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyLessThan(Integer value) {
            addCriterion("isShowCommentVerify <", value, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyLessThanOrEqualTo(Integer value) {
            addCriterion("isShowCommentVerify <=", value, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyIn(List<Integer> values) {
            addCriterion("isShowCommentVerify in", values, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyNotIn(List<Integer> values) {
            addCriterion("isShowCommentVerify not in", values, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyBetween(Integer value1, Integer value2) {
            addCriterion("isShowCommentVerify between", value1, value2, "isshowcommentverify");
            return (Criteria) this;
        }

        public Criteria andIsshowcommentverifyNotBetween(Integer value1, Integer value2) {
            addCriterion("isShowCommentVerify not between", value1, value2, "isshowcommentverify");
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