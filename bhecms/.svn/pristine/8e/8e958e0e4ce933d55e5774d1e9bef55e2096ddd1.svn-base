package com.bhe.dao.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ProductEntityCriteria() {
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

        public Criteria andProductnoIsNull() {
            addCriterion("productNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("productNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("productNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("productNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("productNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("productNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("productNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("productNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("productNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("productNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("productNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("productNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("productNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("productNo not between", value1, value2, "productno");
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

        public Criteria andModelnameIsNull() {
            addCriterion("modelName is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("modelName is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("modelName =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("modelName <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("modelName >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("modelName >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("modelName <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("modelName <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("modelName like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("modelName not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("modelName in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("modelName not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("modelName between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("modelName not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
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

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
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

        public Criteria andWarnnumIsNull() {
            addCriterion("warnNum is null");
            return (Criteria) this;
        }

        public Criteria andWarnnumIsNotNull() {
            addCriterion("warnNum is not null");
            return (Criteria) this;
        }

        public Criteria andWarnnumEqualTo(Integer value) {
            addCriterion("warnNum =", value, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumNotEqualTo(Integer value) {
            addCriterion("warnNum <>", value, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumGreaterThan(Integer value) {
            addCriterion("warnNum >", value, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("warnNum >=", value, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumLessThan(Integer value) {
            addCriterion("warnNum <", value, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumLessThanOrEqualTo(Integer value) {
            addCriterion("warnNum <=", value, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumIn(List<Integer> values) {
            addCriterion("warnNum in", values, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumNotIn(List<Integer> values) {
            addCriterion("warnNum not in", values, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumBetween(Integer value1, Integer value2) {
            addCriterion("warnNum between", value1, value2, "warnnum");
            return (Criteria) this;
        }

        public Criteria andWarnnumNotBetween(Integer value1, Integer value2) {
            addCriterion("warnNum not between", value1, value2, "warnnum");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Long value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Long value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Long value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Long value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Long value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Long> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Long> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Long value1, Long value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Long value1, Long value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andShowtypeIsNull() {
            addCriterion("showType is null");
            return (Criteria) this;
        }

        public Criteria andShowtypeIsNotNull() {
            addCriterion("showType is not null");
            return (Criteria) this;
        }

        public Criteria andShowtypeEqualTo(Integer value) {
            addCriterion("showType =", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeNotEqualTo(Integer value) {
            addCriterion("showType <>", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeGreaterThan(Integer value) {
            addCriterion("showType >", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("showType >=", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeLessThan(Integer value) {
            addCriterion("showType <", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeLessThanOrEqualTo(Integer value) {
            addCriterion("showType <=", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeIn(List<Integer> values) {
            addCriterion("showType in", values, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeNotIn(List<Integer> values) {
            addCriterion("showType not in", values, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeBetween(Integer value1, Integer value2) {
            addCriterion("showType between", value1, value2, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("showType not between", value1, value2, "showtype");
            return (Criteria) this;
        }

        public Criteria andClazzidIsNull() {
            addCriterion("clazzid is null");
            return (Criteria) this;
        }

        public Criteria andClazzidIsNotNull() {
            addCriterion("clazzid is not null");
            return (Criteria) this;
        }

        public Criteria andClazzidEqualTo(Long value) {
            addCriterion("clazzid =", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidNotEqualTo(Long value) {
            addCriterion("clazzid <>", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidGreaterThan(Long value) {
            addCriterion("clazzid >", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidGreaterThanOrEqualTo(Long value) {
            addCriterion("clazzid >=", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidLessThan(Long value) {
            addCriterion("clazzid <", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidLessThanOrEqualTo(Long value) {
            addCriterion("clazzid <=", value, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidIn(List<Long> values) {
            addCriterion("clazzid in", values, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidNotIn(List<Long> values) {
            addCriterion("clazzid not in", values, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidBetween(Long value1, Long value2) {
            addCriterion("clazzid between", value1, value2, "clazzid");
            return (Criteria) this;
        }

        public Criteria andClazzidNotBetween(Long value1, Long value2) {
            addCriterion("clazzid not between", value1, value2, "clazzid");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Long value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Long value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Long value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Long value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Long value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Long value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Long> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Long> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Long value1, Long value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Long value1, Long value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andProvideridIsNull() {
            addCriterion("providerid is null");
            return (Criteria) this;
        }

        public Criteria andProvideridIsNotNull() {
            addCriterion("providerid is not null");
            return (Criteria) this;
        }

        public Criteria andProvideridEqualTo(Long value) {
            addCriterion("providerid =", value, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridNotEqualTo(Long value) {
            addCriterion("providerid <>", value, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridGreaterThan(Long value) {
            addCriterion("providerid >", value, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridGreaterThanOrEqualTo(Long value) {
            addCriterion("providerid >=", value, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridLessThan(Long value) {
            addCriterion("providerid <", value, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridLessThanOrEqualTo(Long value) {
            addCriterion("providerid <=", value, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridIn(List<Long> values) {
            addCriterion("providerid in", values, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridNotIn(List<Long> values) {
            addCriterion("providerid not in", values, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridBetween(Long value1, Long value2) {
            addCriterion("providerid between", value1, value2, "providerid");
            return (Criteria) this;
        }

        public Criteria andProvideridNotBetween(Long value1, Long value2) {
            addCriterion("providerid not between", value1, value2, "providerid");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andValidityIsNull() {
            addCriterion("validity is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("validity is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(Integer value) {
            addCriterion("validity =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(Integer value) {
            addCriterion("validity <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(Integer value) {
            addCriterion("validity >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("validity >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(Integer value) {
            addCriterion("validity <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(Integer value) {
            addCriterion("validity <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<Integer> values) {
            addCriterion("validity in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<Integer> values) {
            addCriterion("validity not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(Integer value1, Integer value2) {
            addCriterion("validity between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("validity not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andCansaleIsNull() {
            addCriterion("canSale is null");
            return (Criteria) this;
        }

        public Criteria andCansaleIsNotNull() {
            addCriterion("canSale is not null");
            return (Criteria) this;
        }

        public Criteria andCansaleEqualTo(Integer value) {
            addCriterion("canSale =", value, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleNotEqualTo(Integer value) {
            addCriterion("canSale <>", value, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleGreaterThan(Integer value) {
            addCriterion("canSale >", value, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("canSale >=", value, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleLessThan(Integer value) {
            addCriterion("canSale <", value, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleLessThanOrEqualTo(Integer value) {
            addCriterion("canSale <=", value, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleIn(List<Integer> values) {
            addCriterion("canSale in", values, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleNotIn(List<Integer> values) {
            addCriterion("canSale not in", values, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleBetween(Integer value1, Integer value2) {
            addCriterion("canSale between", value1, value2, "cansale");
            return (Criteria) this;
        }

        public Criteria andCansaleNotBetween(Integer value1, Integer value2) {
            addCriterion("canSale not between", value1, value2, "cansale");
            return (Criteria) this;
        }

        public Criteria andHasfreightIsNull() {
            addCriterion("hasFreight is null");
            return (Criteria) this;
        }

        public Criteria andHasfreightIsNotNull() {
            addCriterion("hasFreight is not null");
            return (Criteria) this;
        }

        public Criteria andHasfreightEqualTo(Integer value) {
            addCriterion("hasFreight =", value, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightNotEqualTo(Integer value) {
            addCriterion("hasFreight <>", value, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightGreaterThan(Integer value) {
            addCriterion("hasFreight >", value, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasFreight >=", value, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightLessThan(Integer value) {
            addCriterion("hasFreight <", value, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightLessThanOrEqualTo(Integer value) {
            addCriterion("hasFreight <=", value, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightIn(List<Integer> values) {
            addCriterion("hasFreight in", values, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightNotIn(List<Integer> values) {
            addCriterion("hasFreight not in", values, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightBetween(Integer value1, Integer value2) {
            addCriterion("hasFreight between", value1, value2, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andHasfreightNotBetween(Integer value1, Integer value2) {
            addCriterion("hasFreight not between", value1, value2, "hasfreight");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBulkIsNull() {
            addCriterion("bulk is null");
            return (Criteria) this;
        }

        public Criteria andBulkIsNotNull() {
            addCriterion("bulk is not null");
            return (Criteria) this;
        }

        public Criteria andBulkEqualTo(BigDecimal value) {
            addCriterion("bulk =", value, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkNotEqualTo(BigDecimal value) {
            addCriterion("bulk <>", value, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkGreaterThan(BigDecimal value) {
            addCriterion("bulk >", value, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bulk >=", value, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkLessThan(BigDecimal value) {
            addCriterion("bulk <", value, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bulk <=", value, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkIn(List<BigDecimal> values) {
            addCriterion("bulk in", values, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkNotIn(List<BigDecimal> values) {
            addCriterion("bulk not in", values, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bulk between", value1, value2, "bulk");
            return (Criteria) this;
        }

        public Criteria andBulkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bulk not between", value1, value2, "bulk");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNull() {
            addCriterion("saleType is null");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNotNull() {
            addCriterion("saleType is not null");
            return (Criteria) this;
        }

        public Criteria andSaletypeEqualTo(String value) {
            addCriterion("saleType =", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotEqualTo(String value) {
            addCriterion("saleType <>", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThan(String value) {
            addCriterion("saleType >", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThanOrEqualTo(String value) {
            addCriterion("saleType >=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThan(String value) {
            addCriterion("saleType <", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThanOrEqualTo(String value) {
            addCriterion("saleType <=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLike(String value) {
            addCriterion("saleType like", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotLike(String value) {
            addCriterion("saleType not like", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeIn(List<String> values) {
            addCriterion("saleType in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotIn(List<String> values) {
            addCriterion("saleType not in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeBetween(String value1, String value2) {
            addCriterion("saleType between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotBetween(String value1, String value2) {
            addCriterion("saleType not between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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

        public Criteria andSaycountIsNull() {
            addCriterion("sayCount is null");
            return (Criteria) this;
        }

        public Criteria andSaycountIsNotNull() {
            addCriterion("sayCount is not null");
            return (Criteria) this;
        }

        public Criteria andSaycountEqualTo(Integer value) {
            addCriterion("sayCount =", value, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountNotEqualTo(Integer value) {
            addCriterion("sayCount <>", value, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountGreaterThan(Integer value) {
            addCriterion("sayCount >", value, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sayCount >=", value, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountLessThan(Integer value) {
            addCriterion("sayCount <", value, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountLessThanOrEqualTo(Integer value) {
            addCriterion("sayCount <=", value, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountIn(List<Integer> values) {
            addCriterion("sayCount in", values, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountNotIn(List<Integer> values) {
            addCriterion("sayCount not in", values, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountBetween(Integer value1, Integer value2) {
            addCriterion("sayCount between", value1, value2, "saycount");
            return (Criteria) this;
        }

        public Criteria andSaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("sayCount not between", value1, value2, "saycount");
            return (Criteria) this;
        }

        public Criteria andCommonsortIsNull() {
            addCriterion("commonSort is null");
            return (Criteria) this;
        }

        public Criteria andCommonsortIsNotNull() {
            addCriterion("commonSort is not null");
            return (Criteria) this;
        }

        public Criteria andCommonsortEqualTo(String value) {
            addCriterion("commonSort =", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortNotEqualTo(String value) {
            addCriterion("commonSort <>", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortGreaterThan(String value) {
            addCriterion("commonSort >", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortGreaterThanOrEqualTo(String value) {
            addCriterion("commonSort >=", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortLessThan(String value) {
            addCriterion("commonSort <", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortLessThanOrEqualTo(String value) {
            addCriterion("commonSort <=", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortLike(String value) {
            addCriterion("commonSort like", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortNotLike(String value) {
            addCriterion("commonSort not like", value, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortIn(List<String> values) {
            addCriterion("commonSort in", values, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortNotIn(List<String> values) {
            addCriterion("commonSort not in", values, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortBetween(String value1, String value2) {
            addCriterion("commonSort between", value1, value2, "commonsort");
            return (Criteria) this;
        }

        public Criteria andCommonsortNotBetween(String value1, String value2) {
            addCriterion("commonSort not between", value1, value2, "commonsort");
            return (Criteria) this;
        }

        public Criteria andProductivityIsNull() {
            addCriterion("productivity is null");
            return (Criteria) this;
        }

        public Criteria andProductivityIsNotNull() {
            addCriterion("productivity is not null");
            return (Criteria) this;
        }

        public Criteria andProductivityEqualTo(String value) {
            addCriterion("productivity =", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityNotEqualTo(String value) {
            addCriterion("productivity <>", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityGreaterThan(String value) {
            addCriterion("productivity >", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityGreaterThanOrEqualTo(String value) {
            addCriterion("productivity >=", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityLessThan(String value) {
            addCriterion("productivity <", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityLessThanOrEqualTo(String value) {
            addCriterion("productivity <=", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityLike(String value) {
            addCriterion("productivity like", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityNotLike(String value) {
            addCriterion("productivity not like", value, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityIn(List<String> values) {
            addCriterion("productivity in", values, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityNotIn(List<String> values) {
            addCriterion("productivity not in", values, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityBetween(String value1, String value2) {
            addCriterion("productivity between", value1, value2, "productivity");
            return (Criteria) this;
        }

        public Criteria andProductivityNotBetween(String value1, String value2) {
            addCriterion("productivity not between", value1, value2, "productivity");
            return (Criteria) this;
        }

        public Criteria andIsrentIsNull() {
            addCriterion("isrent is null");
            return (Criteria) this;
        }

        public Criteria andIsrentIsNotNull() {
            addCriterion("isrent is not null");
            return (Criteria) this;
        }

        public Criteria andIsrentEqualTo(Integer value) {
            addCriterion("isrent =", value, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentNotEqualTo(Integer value) {
            addCriterion("isrent <>", value, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentGreaterThan(Integer value) {
            addCriterion("isrent >", value, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isrent >=", value, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentLessThan(Integer value) {
            addCriterion("isrent <", value, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentLessThanOrEqualTo(Integer value) {
            addCriterion("isrent <=", value, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentIn(List<Integer> values) {
            addCriterion("isrent in", values, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentNotIn(List<Integer> values) {
            addCriterion("isrent not in", values, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentBetween(Integer value1, Integer value2) {
            addCriterion("isrent between", value1, value2, "isrent");
            return (Criteria) this;
        }

        public Criteria andIsrentNotBetween(Integer value1, Integer value2) {
            addCriterion("isrent not between", value1, value2, "isrent");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldIsNull() {
            addCriterion("appliesField is null");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldIsNotNull() {
            addCriterion("appliesField is not null");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldEqualTo(String value) {
            addCriterion("appliesField =", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldNotEqualTo(String value) {
            addCriterion("appliesField <>", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldGreaterThan(String value) {
            addCriterion("appliesField >", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldGreaterThanOrEqualTo(String value) {
            addCriterion("appliesField >=", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldLessThan(String value) {
            addCriterion("appliesField <", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldLessThanOrEqualTo(String value) {
            addCriterion("appliesField <=", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldLike(String value) {
            addCriterion("appliesField like", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldNotLike(String value) {
            addCriterion("appliesField not like", value, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldIn(List<String> values) {
            addCriterion("appliesField in", values, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldNotIn(List<String> values) {
            addCriterion("appliesField not in", values, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldBetween(String value1, String value2) {
            addCriterion("appliesField between", value1, value2, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andAppliesfieldNotBetween(String value1, String value2) {
            addCriterion("appliesField not between", value1, value2, "appliesfield");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPressureIsNull() {
            addCriterion("pressure is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("pressure is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(String value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(String value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(String value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(String value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(String value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(String value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLike(String value) {
            addCriterion("pressure like", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotLike(String value) {
            addCriterion("pressure not like", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<String> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<String> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(String value1, String value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(String value1, String value2) {
            addCriterion("pressure not between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedIsNull() {
            addCriterion("rotatingSpeed is null");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedIsNotNull() {
            addCriterion("rotatingSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedEqualTo(String value) {
            addCriterion("rotatingSpeed =", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedNotEqualTo(String value) {
            addCriterion("rotatingSpeed <>", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedGreaterThan(String value) {
            addCriterion("rotatingSpeed >", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedGreaterThanOrEqualTo(String value) {
            addCriterion("rotatingSpeed >=", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedLessThan(String value) {
            addCriterion("rotatingSpeed <", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedLessThanOrEqualTo(String value) {
            addCriterion("rotatingSpeed <=", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedLike(String value) {
            addCriterion("rotatingSpeed like", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedNotLike(String value) {
            addCriterion("rotatingSpeed not like", value, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedIn(List<String> values) {
            addCriterion("rotatingSpeed in", values, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedNotIn(List<String> values) {
            addCriterion("rotatingSpeed not in", values, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedBetween(String value1, String value2) {
            addCriterion("rotatingSpeed between", value1, value2, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andRotatingspeedNotBetween(String value1, String value2) {
            addCriterion("rotatingSpeed not between", value1, value2, "rotatingspeed");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(String value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(String value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(String value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(String value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(String value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLike(String value) {
            addCriterion("capacity like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotLike(String value) {
            addCriterion("capacity not like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<String> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<String> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(String value1, String value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(String value1, String value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andDryingtimeIsNull() {
            addCriterion("dryingTime is null");
            return (Criteria) this;
        }

        public Criteria andDryingtimeIsNotNull() {
            addCriterion("dryingTime is not null");
            return (Criteria) this;
        }

        public Criteria andDryingtimeEqualTo(String value) {
            addCriterion("dryingTime =", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeNotEqualTo(String value) {
            addCriterion("dryingTime <>", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeGreaterThan(String value) {
            addCriterion("dryingTime >", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("dryingTime >=", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeLessThan(String value) {
            addCriterion("dryingTime <", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeLessThanOrEqualTo(String value) {
            addCriterion("dryingTime <=", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeLike(String value) {
            addCriterion("dryingTime like", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeNotLike(String value) {
            addCriterion("dryingTime not like", value, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeIn(List<String> values) {
            addCriterion("dryingTime in", values, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeNotIn(List<String> values) {
            addCriterion("dryingTime not in", values, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeBetween(String value1, String value2) {
            addCriterion("dryingTime between", value1, value2, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andDryingtimeNotBetween(String value1, String value2) {
            addCriterion("dryingTime not between", value1, value2, "dryingtime");
            return (Criteria) this;
        }

        public Criteria andWorkwidthIsNull() {
            addCriterion("workWidth is null");
            return (Criteria) this;
        }

        public Criteria andWorkwidthIsNotNull() {
            addCriterion("workWidth is not null");
            return (Criteria) this;
        }

        public Criteria andWorkwidthEqualTo(String value) {
            addCriterion("workWidth =", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthNotEqualTo(String value) {
            addCriterion("workWidth <>", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthGreaterThan(String value) {
            addCriterion("workWidth >", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthGreaterThanOrEqualTo(String value) {
            addCriterion("workWidth >=", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthLessThan(String value) {
            addCriterion("workWidth <", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthLessThanOrEqualTo(String value) {
            addCriterion("workWidth <=", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthLike(String value) {
            addCriterion("workWidth like", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthNotLike(String value) {
            addCriterion("workWidth not like", value, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthIn(List<String> values) {
            addCriterion("workWidth in", values, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthNotIn(List<String> values) {
            addCriterion("workWidth not in", values, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthBetween(String value1, String value2) {
            addCriterion("workWidth between", value1, value2, "workwidth");
            return (Criteria) this;
        }

        public Criteria andWorkwidthNotBetween(String value1, String value2) {
            addCriterion("workWidth not between", value1, value2, "workwidth");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNull() {
            addCriterion("noise is null");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNotNull() {
            addCriterion("noise is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseEqualTo(String value) {
            addCriterion("noise =", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotEqualTo(String value) {
            addCriterion("noise <>", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThan(String value) {
            addCriterion("noise >", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThanOrEqualTo(String value) {
            addCriterion("noise >=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThan(String value) {
            addCriterion("noise <", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThanOrEqualTo(String value) {
            addCriterion("noise <=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLike(String value) {
            addCriterion("noise like", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotLike(String value) {
            addCriterion("noise not like", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseIn(List<String> values) {
            addCriterion("noise in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotIn(List<String> values) {
            addCriterion("noise not in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseBetween(String value1, String value2) {
            addCriterion("noise between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotBetween(String value1, String value2) {
            addCriterion("noise not between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andMotivationIsNull() {
            addCriterion("motivation is null");
            return (Criteria) this;
        }

        public Criteria andMotivationIsNotNull() {
            addCriterion("motivation is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationEqualTo(String value) {
            addCriterion("motivation =", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationNotEqualTo(String value) {
            addCriterion("motivation <>", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationGreaterThan(String value) {
            addCriterion("motivation >", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationGreaterThanOrEqualTo(String value) {
            addCriterion("motivation >=", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationLessThan(String value) {
            addCriterion("motivation <", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationLessThanOrEqualTo(String value) {
            addCriterion("motivation <=", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationLike(String value) {
            addCriterion("motivation like", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationNotLike(String value) {
            addCriterion("motivation not like", value, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationIn(List<String> values) {
            addCriterion("motivation in", values, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationNotIn(List<String> values) {
            addCriterion("motivation not in", values, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationBetween(String value1, String value2) {
            addCriterion("motivation between", value1, value2, "motivation");
            return (Criteria) this;
        }

        public Criteria andMotivationNotBetween(String value1, String value2) {
            addCriterion("motivation not between", value1, value2, "motivation");
            return (Criteria) this;
        }

        public Criteria andToshowproductIsNull() {
            addCriterion("toShowProduct is null");
            return (Criteria) this;
        }

        public Criteria andToshowproductIsNotNull() {
            addCriterion("toShowProduct is not null");
            return (Criteria) this;
        }

        public Criteria andToshowproductEqualTo(Integer value) {
            addCriterion("toShowProduct =", value, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductNotEqualTo(Integer value) {
            addCriterion("toShowProduct <>", value, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductGreaterThan(Integer value) {
            addCriterion("toShowProduct >", value, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductGreaterThanOrEqualTo(Integer value) {
            addCriterion("toShowProduct >=", value, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductLessThan(Integer value) {
            addCriterion("toShowProduct <", value, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductLessThanOrEqualTo(Integer value) {
            addCriterion("toShowProduct <=", value, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductIn(List<Integer> values) {
            addCriterion("toShowProduct in", values, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductNotIn(List<Integer> values) {
            addCriterion("toShowProduct not in", values, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductBetween(Integer value1, Integer value2) {
            addCriterion("toShowProduct between", value1, value2, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andToshowproductNotBetween(Integer value1, Integer value2) {
            addCriterion("toShowProduct not between", value1, value2, "toshowproduct");
            return (Criteria) this;
        }

        public Criteria andTopopularIsNull() {
            addCriterion("toPopular is null");
            return (Criteria) this;
        }

        public Criteria andTopopularIsNotNull() {
            addCriterion("toPopular is not null");
            return (Criteria) this;
        }

        public Criteria andTopopularEqualTo(Integer value) {
            addCriterion("toPopular =", value, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularNotEqualTo(Integer value) {
            addCriterion("toPopular <>", value, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularGreaterThan(Integer value) {
            addCriterion("toPopular >", value, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularGreaterThanOrEqualTo(Integer value) {
            addCriterion("toPopular >=", value, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularLessThan(Integer value) {
            addCriterion("toPopular <", value, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularLessThanOrEqualTo(Integer value) {
            addCriterion("toPopular <=", value, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularIn(List<Integer> values) {
            addCriterion("toPopular in", values, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularNotIn(List<Integer> values) {
            addCriterion("toPopular not in", values, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularBetween(Integer value1, Integer value2) {
            addCriterion("toPopular between", value1, value2, "topopular");
            return (Criteria) this;
        }

        public Criteria andTopopularNotBetween(Integer value1, Integer value2) {
            addCriterion("toPopular not between", value1, value2, "topopular");
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