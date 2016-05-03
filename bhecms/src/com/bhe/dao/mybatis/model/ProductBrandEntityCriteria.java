package com.bhe.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class ProductBrandEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ProductBrandEntityCriteria() {
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

        public Criteria andLogourlIsNull() {
            addCriterion("logoUrl is null");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNotNull() {
            addCriterion("logoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLogourlEqualTo(String value) {
            addCriterion("logoUrl =", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotEqualTo(String value) {
            addCriterion("logoUrl <>", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThan(String value) {
            addCriterion("logoUrl >", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("logoUrl >=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThan(String value) {
            addCriterion("logoUrl <", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThanOrEqualTo(String value) {
            addCriterion("logoUrl <=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLike(String value) {
            addCriterion("logoUrl like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotLike(String value) {
            addCriterion("logoUrl not like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlIn(List<String> values) {
            addCriterion("logoUrl in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotIn(List<String> values) {
            addCriterion("logoUrl not in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlBetween(String value1, String value2) {
            addCriterion("logoUrl between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotBetween(String value1, String value2) {
            addCriterion("logoUrl not between", value1, value2, "logourl");
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

        public Criteria andWeburlIsNull() {
            addCriterion("webUrl is null");
            return (Criteria) this;
        }

        public Criteria andWeburlIsNotNull() {
            addCriterion("webUrl is not null");
            return (Criteria) this;
        }

        public Criteria andWeburlEqualTo(String value) {
            addCriterion("webUrl =", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotEqualTo(String value) {
            addCriterion("webUrl <>", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlGreaterThan(String value) {
            addCriterion("webUrl >", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlGreaterThanOrEqualTo(String value) {
            addCriterion("webUrl >=", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLessThan(String value) {
            addCriterion("webUrl <", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLessThanOrEqualTo(String value) {
            addCriterion("webUrl <=", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLike(String value) {
            addCriterion("webUrl like", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotLike(String value) {
            addCriterion("webUrl not like", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlIn(List<String> values) {
            addCriterion("webUrl in", values, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotIn(List<String> values) {
            addCriterion("webUrl not in", values, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlBetween(String value1, String value2) {
            addCriterion("webUrl between", value1, value2, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotBetween(String value1, String value2) {
            addCriterion("webUrl not between", value1, value2, "weburl");
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

        public Criteria andRecommendlevelIsNull() {
            addCriterion("recommendLevel is null");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelIsNotNull() {
            addCriterion("recommendLevel is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelEqualTo(Integer value) {
            addCriterion("recommendLevel =", value, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelNotEqualTo(Integer value) {
            addCriterion("recommendLevel <>", value, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelGreaterThan(Integer value) {
            addCriterion("recommendLevel >", value, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendLevel >=", value, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelLessThan(Integer value) {
            addCriterion("recommendLevel <", value, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelLessThanOrEqualTo(Integer value) {
            addCriterion("recommendLevel <=", value, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelIn(List<Integer> values) {
            addCriterion("recommendLevel in", values, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelNotIn(List<Integer> values) {
            addCriterion("recommendLevel not in", values, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelBetween(Integer value1, Integer value2) {
            addCriterion("recommendLevel between", value1, value2, "recommendlevel");
            return (Criteria) this;
        }

        public Criteria andRecommendlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendLevel not between", value1, value2, "recommendlevel");
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