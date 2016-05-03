package com.bhe.dao.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ArticleEntityCriteria() {
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

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Long value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Long value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Long value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Long value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Long value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Long value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Long> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Long> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Long value1, Long value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Long value1, Long value2) {
            addCriterion("classId not between", value1, value2, "classid");
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

        public Criteria andSubtitleIsNull() {
            addCriterion("subTitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subTitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subTitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subTitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subTitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subTitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subTitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subTitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subTitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subTitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subTitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subTitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subTitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("isShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("isShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("isShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("isShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("isShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("isShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("isShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("isShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("isShow not between", value1, value2, "isshow");
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

        public Criteria andIsextraurlIsNull() {
            addCriterion("isExtraUrl is null");
            return (Criteria) this;
        }

        public Criteria andIsextraurlIsNotNull() {
            addCriterion("isExtraUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIsextraurlEqualTo(Integer value) {
            addCriterion("isExtraUrl =", value, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlNotEqualTo(Integer value) {
            addCriterion("isExtraUrl <>", value, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlGreaterThan(Integer value) {
            addCriterion("isExtraUrl >", value, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlGreaterThanOrEqualTo(Integer value) {
            addCriterion("isExtraUrl >=", value, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlLessThan(Integer value) {
            addCriterion("isExtraUrl <", value, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlLessThanOrEqualTo(Integer value) {
            addCriterion("isExtraUrl <=", value, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlIn(List<Integer> values) {
            addCriterion("isExtraUrl in", values, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlNotIn(List<Integer> values) {
            addCriterion("isExtraUrl not in", values, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlBetween(Integer value1, Integer value2) {
            addCriterion("isExtraUrl between", value1, value2, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andIsextraurlNotBetween(Integer value1, Integer value2) {
            addCriterion("isExtraUrl not between", value1, value2, "isextraurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlIsNull() {
            addCriterion("extralUrl is null");
            return (Criteria) this;
        }

        public Criteria andExtralurlIsNotNull() {
            addCriterion("extralUrl is not null");
            return (Criteria) this;
        }

        public Criteria andExtralurlEqualTo(String value) {
            addCriterion("extralUrl =", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlNotEqualTo(String value) {
            addCriterion("extralUrl <>", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlGreaterThan(String value) {
            addCriterion("extralUrl >", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlGreaterThanOrEqualTo(String value) {
            addCriterion("extralUrl >=", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlLessThan(String value) {
            addCriterion("extralUrl <", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlLessThanOrEqualTo(String value) {
            addCriterion("extralUrl <=", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlLike(String value) {
            addCriterion("extralUrl like", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlNotLike(String value) {
            addCriterion("extralUrl not like", value, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlIn(List<String> values) {
            addCriterion("extralUrl in", values, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlNotIn(List<String> values) {
            addCriterion("extralUrl not in", values, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlBetween(String value1, String value2) {
            addCriterion("extralUrl between", value1, value2, "extralurl");
            return (Criteria) this;
        }

        public Criteria andExtralurlNotBetween(String value1, String value2) {
            addCriterion("extralUrl not between", value1, value2, "extralurl");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIsNull() {
            addCriterion("titleColor is null");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIsNotNull() {
            addCriterion("titleColor is not null");
            return (Criteria) this;
        }

        public Criteria andTitlecolorEqualTo(String value) {
            addCriterion("titleColor =", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotEqualTo(String value) {
            addCriterion("titleColor <>", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorGreaterThan(String value) {
            addCriterion("titleColor >", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorGreaterThanOrEqualTo(String value) {
            addCriterion("titleColor >=", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLessThan(String value) {
            addCriterion("titleColor <", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLessThanOrEqualTo(String value) {
            addCriterion("titleColor <=", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorLike(String value) {
            addCriterion("titleColor like", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotLike(String value) {
            addCriterion("titleColor not like", value, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorIn(List<String> values) {
            addCriterion("titleColor in", values, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotIn(List<String> values) {
            addCriterion("titleColor not in", values, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorBetween(String value1, String value2) {
            addCriterion("titleColor between", value1, value2, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andTitlecolorNotBetween(String value1, String value2) {
            addCriterion("titleColor not between", value1, value2, "titlecolor");
            return (Criteria) this;
        }

        public Criteria andIsboldIsNull() {
            addCriterion("isBold is null");
            return (Criteria) this;
        }

        public Criteria andIsboldIsNotNull() {
            addCriterion("isBold is not null");
            return (Criteria) this;
        }

        public Criteria andIsboldEqualTo(Integer value) {
            addCriterion("isBold =", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldNotEqualTo(Integer value) {
            addCriterion("isBold <>", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldGreaterThan(Integer value) {
            addCriterion("isBold >", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBold >=", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldLessThan(Integer value) {
            addCriterion("isBold <", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldLessThanOrEqualTo(Integer value) {
            addCriterion("isBold <=", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldIn(List<Integer> values) {
            addCriterion("isBold in", values, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldNotIn(List<Integer> values) {
            addCriterion("isBold not in", values, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldBetween(Integer value1, Integer value2) {
            addCriterion("isBold between", value1, value2, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldNotBetween(Integer value1, Integer value2) {
            addCriterion("isBold not between", value1, value2, "isbold");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryIsNull() {
            addCriterion("isAutoCreateSummary is null");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryIsNotNull() {
            addCriterion("isAutoCreateSummary is not null");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryEqualTo(Integer value) {
            addCriterion("isAutoCreateSummary =", value, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryNotEqualTo(Integer value) {
            addCriterion("isAutoCreateSummary <>", value, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryGreaterThan(Integer value) {
            addCriterion("isAutoCreateSummary >", value, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("isAutoCreateSummary >=", value, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryLessThan(Integer value) {
            addCriterion("isAutoCreateSummary <", value, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryLessThanOrEqualTo(Integer value) {
            addCriterion("isAutoCreateSummary <=", value, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryIn(List<Integer> values) {
            addCriterion("isAutoCreateSummary in", values, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryNotIn(List<Integer> values) {
            addCriterion("isAutoCreateSummary not in", values, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryBetween(Integer value1, Integer value2) {
            addCriterion("isAutoCreateSummary between", value1, value2, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andIsautocreatesummaryNotBetween(Integer value1, Integer value2) {
            addCriterion("isAutoCreateSummary not between", value1, value2, "isautocreatesummary");
            return (Criteria) this;
        }

        public Criteria andFromwhereIsNull() {
            addCriterion("fromWhere is null");
            return (Criteria) this;
        }

        public Criteria andFromwhereIsNotNull() {
            addCriterion("fromWhere is not null");
            return (Criteria) this;
        }

        public Criteria andFromwhereEqualTo(String value) {
            addCriterion("fromWhere =", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotEqualTo(String value) {
            addCriterion("fromWhere <>", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereGreaterThan(String value) {
            addCriterion("fromWhere >", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereGreaterThanOrEqualTo(String value) {
            addCriterion("fromWhere >=", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereLessThan(String value) {
            addCriterion("fromWhere <", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereLessThanOrEqualTo(String value) {
            addCriterion("fromWhere <=", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereLike(String value) {
            addCriterion("fromWhere like", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotLike(String value) {
            addCriterion("fromWhere not like", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereIn(List<String> values) {
            addCriterion("fromWhere in", values, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotIn(List<String> values) {
            addCriterion("fromWhere not in", values, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereBetween(String value1, String value2) {
            addCriterion("fromWhere between", value1, value2, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotBetween(String value1, String value2) {
            addCriterion("fromWhere not between", value1, value2, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andReadpermissionIsNull() {
            addCriterion("readPermission is null");
            return (Criteria) this;
        }

        public Criteria andReadpermissionIsNotNull() {
            addCriterion("readPermission is not null");
            return (Criteria) this;
        }

        public Criteria andReadpermissionEqualTo(Integer value) {
            addCriterion("readPermission =", value, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionNotEqualTo(Integer value) {
            addCriterion("readPermission <>", value, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionGreaterThan(Integer value) {
            addCriterion("readPermission >", value, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("readPermission >=", value, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionLessThan(Integer value) {
            addCriterion("readPermission <", value, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionLessThanOrEqualTo(Integer value) {
            addCriterion("readPermission <=", value, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionIn(List<Integer> values) {
            addCriterion("readPermission in", values, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionNotIn(List<Integer> values) {
            addCriterion("readPermission not in", values, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionBetween(Integer value1, Integer value2) {
            addCriterion("readPermission between", value1, value2, "readpermission");
            return (Criteria) this;
        }

        public Criteria andReadpermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("readPermission not between", value1, value2, "readpermission");
            return (Criteria) this;
        }

        public Criteria andToplevelIsNull() {
            addCriterion("topLevel is null");
            return (Criteria) this;
        }

        public Criteria andToplevelIsNotNull() {
            addCriterion("topLevel is not null");
            return (Criteria) this;
        }

        public Criteria andToplevelEqualTo(Integer value) {
            addCriterion("topLevel =", value, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelNotEqualTo(Integer value) {
            addCriterion("topLevel <>", value, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelGreaterThan(Integer value) {
            addCriterion("topLevel >", value, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("topLevel >=", value, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelLessThan(Integer value) {
            addCriterion("topLevel <", value, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelLessThanOrEqualTo(Integer value) {
            addCriterion("topLevel <=", value, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelIn(List<Integer> values) {
            addCriterion("topLevel in", values, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelNotIn(List<Integer> values) {
            addCriterion("topLevel not in", values, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelBetween(Integer value1, Integer value2) {
            addCriterion("topLevel between", value1, value2, "toplevel");
            return (Criteria) this;
        }

        public Criteria andToplevelNotBetween(Integer value1, Integer value2) {
            addCriterion("topLevel not between", value1, value2, "toplevel");
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

        public Criteria andArticletypeIsNull() {
            addCriterion("articleType is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNotNull() {
            addCriterion("articleType is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeEqualTo(String value) {
            addCriterion("articleType =", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotEqualTo(String value) {
            addCriterion("articleType <>", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThan(String value) {
            addCriterion("articleType >", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThanOrEqualTo(String value) {
            addCriterion("articleType >=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThan(String value) {
            addCriterion("articleType <", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThanOrEqualTo(String value) {
            addCriterion("articleType <=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLike(String value) {
            addCriterion("articleType like", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotLike(String value) {
            addCriterion("articleType not like", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeIn(List<String> values) {
            addCriterion("articleType in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotIn(List<String> values) {
            addCriterion("articleType not in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeBetween(String value1, String value2) {
            addCriterion("articleType between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotBetween(String value1, String value2) {
            addCriterion("articleType not between", value1, value2, "articletype");
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

        public Criteria andHasatachmentIsNull() {
            addCriterion("hasAtachment is null");
            return (Criteria) this;
        }

        public Criteria andHasatachmentIsNotNull() {
            addCriterion("hasAtachment is not null");
            return (Criteria) this;
        }

        public Criteria andHasatachmentEqualTo(Integer value) {
            addCriterion("hasAtachment =", value, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentNotEqualTo(Integer value) {
            addCriterion("hasAtachment <>", value, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentGreaterThan(Integer value) {
            addCriterion("hasAtachment >", value, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasAtachment >=", value, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentLessThan(Integer value) {
            addCriterion("hasAtachment <", value, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentLessThanOrEqualTo(Integer value) {
            addCriterion("hasAtachment <=", value, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentIn(List<Integer> values) {
            addCriterion("hasAtachment in", values, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentNotIn(List<Integer> values) {
            addCriterion("hasAtachment not in", values, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentBetween(Integer value1, Integer value2) {
            addCriterion("hasAtachment between", value1, value2, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasatachmentNotBetween(Integer value1, Integer value2) {
            addCriterion("hasAtachment not between", value1, value2, "hasatachment");
            return (Criteria) this;
        }

        public Criteria andHasmediaIsNull() {
            addCriterion("hasMedia is null");
            return (Criteria) this;
        }

        public Criteria andHasmediaIsNotNull() {
            addCriterion("hasMedia is not null");
            return (Criteria) this;
        }

        public Criteria andHasmediaEqualTo(Integer value) {
            addCriterion("hasMedia =", value, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaNotEqualTo(Integer value) {
            addCriterion("hasMedia <>", value, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaGreaterThan(Integer value) {
            addCriterion("hasMedia >", value, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasMedia >=", value, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaLessThan(Integer value) {
            addCriterion("hasMedia <", value, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaLessThanOrEqualTo(Integer value) {
            addCriterion("hasMedia <=", value, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaIn(List<Integer> values) {
            addCriterion("hasMedia in", values, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaNotIn(List<Integer> values) {
            addCriterion("hasMedia not in", values, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaBetween(Integer value1, Integer value2) {
            addCriterion("hasMedia between", value1, value2, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andHasmediaNotBetween(Integer value1, Integer value2) {
            addCriterion("hasMedia not between", value1, value2, "hasmedia");
            return (Criteria) this;
        }

        public Criteria andIsdownpicIsNull() {
            addCriterion("isDownPic is null");
            return (Criteria) this;
        }

        public Criteria andIsdownpicIsNotNull() {
            addCriterion("isDownPic is not null");
            return (Criteria) this;
        }

        public Criteria andIsdownpicEqualTo(Integer value) {
            addCriterion("isDownPic =", value, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicNotEqualTo(Integer value) {
            addCriterion("isDownPic <>", value, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicGreaterThan(Integer value) {
            addCriterion("isDownPic >", value, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDownPic >=", value, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicLessThan(Integer value) {
            addCriterion("isDownPic <", value, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicLessThanOrEqualTo(Integer value) {
            addCriterion("isDownPic <=", value, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicIn(List<Integer> values) {
            addCriterion("isDownPic in", values, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicNotIn(List<Integer> values) {
            addCriterion("isDownPic not in", values, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicBetween(Integer value1, Integer value2) {
            addCriterion("isDownPic between", value1, value2, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andIsdownpicNotBetween(Integer value1, Integer value2) {
            addCriterion("isDownPic not between", value1, value2, "isdownpic");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
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