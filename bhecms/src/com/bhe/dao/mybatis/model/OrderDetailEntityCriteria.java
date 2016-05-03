package com.bhe.dao.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OrderDetailEntityCriteria() {
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

        public Criteria andOrdercodeIsNull() {
            addCriterion("orderCode is null");
            return (Criteria) this;
        }

        public Criteria andOrdercodeIsNotNull() {
            addCriterion("orderCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercodeEqualTo(String value) {
            addCriterion("orderCode =", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotEqualTo(String value) {
            addCriterion("orderCode <>", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeGreaterThan(String value) {
            addCriterion("orderCode >", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeGreaterThanOrEqualTo(String value) {
            addCriterion("orderCode >=", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeLessThan(String value) {
            addCriterion("orderCode <", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeLessThanOrEqualTo(String value) {
            addCriterion("orderCode <=", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeLike(String value) {
            addCriterion("orderCode like", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotLike(String value) {
            addCriterion("orderCode not like", value, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeIn(List<String> values) {
            addCriterion("orderCode in", values, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotIn(List<String> values) {
            addCriterion("orderCode not in", values, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeBetween(String value1, String value2) {
            addCriterion("orderCode between", value1, value2, "ordercode");
            return (Criteria) this;
        }

        public Criteria andOrdercodeNotBetween(String value1, String value2) {
            addCriterion("orderCode not between", value1, value2, "ordercode");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Long value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Long value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Long value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Long value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Long value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Long value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Long> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Long> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Long value1, Long value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Long value1, Long value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andSkucodeIsNull() {
            addCriterion("skuCode is null");
            return (Criteria) this;
        }

        public Criteria andSkucodeIsNotNull() {
            addCriterion("skuCode is not null");
            return (Criteria) this;
        }

        public Criteria andSkucodeEqualTo(String value) {
            addCriterion("skuCode =", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotEqualTo(String value) {
            addCriterion("skuCode <>", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeGreaterThan(String value) {
            addCriterion("skuCode >", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeGreaterThanOrEqualTo(String value) {
            addCriterion("skuCode >=", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLessThan(String value) {
            addCriterion("skuCode <", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLessThanOrEqualTo(String value) {
            addCriterion("skuCode <=", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeLike(String value) {
            addCriterion("skuCode like", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotLike(String value) {
            addCriterion("skuCode not like", value, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeIn(List<String> values) {
            addCriterion("skuCode in", values, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotIn(List<String> values) {
            addCriterion("skuCode not in", values, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeBetween(String value1, String value2) {
            addCriterion("skuCode between", value1, value2, "skucode");
            return (Criteria) this;
        }

        public Criteria andSkucodeNotBetween(String value1, String value2) {
            addCriterion("skuCode not between", value1, value2, "skucode");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
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

        public Criteria andRenttimeIsNull() {
            addCriterion("rentTime is null");
            return (Criteria) this;
        }

        public Criteria andRenttimeIsNotNull() {
            addCriterion("rentTime is not null");
            return (Criteria) this;
        }

        public Criteria andRenttimeEqualTo(Integer value) {
            addCriterion("rentTime =", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeNotEqualTo(Integer value) {
            addCriterion("rentTime <>", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeGreaterThan(Integer value) {
            addCriterion("rentTime >", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rentTime >=", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeLessThan(Integer value) {
            addCriterion("rentTime <", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeLessThanOrEqualTo(Integer value) {
            addCriterion("rentTime <=", value, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeIn(List<Integer> values) {
            addCriterion("rentTime in", values, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeNotIn(List<Integer> values) {
            addCriterion("rentTime not in", values, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeBetween(Integer value1, Integer value2) {
            addCriterion("rentTime between", value1, value2, "renttime");
            return (Criteria) this;
        }

        public Criteria andRenttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("rentTime not between", value1, value2, "renttime");
            return (Criteria) this;
        }

        public Criteria andRentunitIsNull() {
            addCriterion("rentUnit is null");
            return (Criteria) this;
        }

        public Criteria andRentunitIsNotNull() {
            addCriterion("rentUnit is not null");
            return (Criteria) this;
        }

        public Criteria andRentunitEqualTo(String value) {
            addCriterion("rentUnit =", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitNotEqualTo(String value) {
            addCriterion("rentUnit <>", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitGreaterThan(String value) {
            addCriterion("rentUnit >", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitGreaterThanOrEqualTo(String value) {
            addCriterion("rentUnit >=", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitLessThan(String value) {
            addCriterion("rentUnit <", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitLessThanOrEqualTo(String value) {
            addCriterion("rentUnit <=", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitLike(String value) {
            addCriterion("rentUnit like", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitNotLike(String value) {
            addCriterion("rentUnit not like", value, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitIn(List<String> values) {
            addCriterion("rentUnit in", values, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitNotIn(List<String> values) {
            addCriterion("rentUnit not in", values, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitBetween(String value1, String value2) {
            addCriterion("rentUnit between", value1, value2, "rentunit");
            return (Criteria) this;
        }

        public Criteria andRentunitNotBetween(String value1, String value2) {
            addCriterion("rentUnit not between", value1, value2, "rentunit");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFixedpriceIsNull() {
            addCriterion("fixedPrice is null");
            return (Criteria) this;
        }

        public Criteria andFixedpriceIsNotNull() {
            addCriterion("fixedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFixedpriceEqualTo(BigDecimal value) {
            addCriterion("fixedPrice =", value, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceNotEqualTo(BigDecimal value) {
            addCriterion("fixedPrice <>", value, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceGreaterThan(BigDecimal value) {
            addCriterion("fixedPrice >", value, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fixedPrice >=", value, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceLessThan(BigDecimal value) {
            addCriterion("fixedPrice <", value, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fixedPrice <=", value, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceIn(List<BigDecimal> values) {
            addCriterion("fixedPrice in", values, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceNotIn(List<BigDecimal> values) {
            addCriterion("fixedPrice not in", values, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixedPrice between", value1, value2, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andFixedpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixedPrice not between", value1, value2, "fixedprice");
            return (Criteria) this;
        }

        public Criteria andSalespromotionIsNull() {
            addCriterion("salesPromotion is null");
            return (Criteria) this;
        }

        public Criteria andSalespromotionIsNotNull() {
            addCriterion("salesPromotion is not null");
            return (Criteria) this;
        }

        public Criteria andSalespromotionEqualTo(Integer value) {
            addCriterion("salesPromotion =", value, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionNotEqualTo(Integer value) {
            addCriterion("salesPromotion <>", value, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionGreaterThan(Integer value) {
            addCriterion("salesPromotion >", value, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesPromotion >=", value, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionLessThan(Integer value) {
            addCriterion("salesPromotion <", value, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionLessThanOrEqualTo(Integer value) {
            addCriterion("salesPromotion <=", value, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionIn(List<Integer> values) {
            addCriterion("salesPromotion in", values, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionNotIn(List<Integer> values) {
            addCriterion("salesPromotion not in", values, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionBetween(Integer value1, Integer value2) {
            addCriterion("salesPromotion between", value1, value2, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andSalespromotionNotBetween(Integer value1, Integer value2) {
            addCriterion("salesPromotion not between", value1, value2, "salespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionIsNull() {
            addCriterion("isSalesPromotion is null");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionIsNotNull() {
            addCriterion("isSalesPromotion is not null");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionEqualTo(Integer value) {
            addCriterion("isSalesPromotion =", value, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionNotEqualTo(Integer value) {
            addCriterion("isSalesPromotion <>", value, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionGreaterThan(Integer value) {
            addCriterion("isSalesPromotion >", value, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSalesPromotion >=", value, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionLessThan(Integer value) {
            addCriterion("isSalesPromotion <", value, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionLessThanOrEqualTo(Integer value) {
            addCriterion("isSalesPromotion <=", value, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionIn(List<Integer> values) {
            addCriterion("isSalesPromotion in", values, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionNotIn(List<Integer> values) {
            addCriterion("isSalesPromotion not in", values, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionBetween(Integer value1, Integer value2) {
            addCriterion("isSalesPromotion between", value1, value2, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andIssalespromotionNotBetween(Integer value1, Integer value2) {
            addCriterion("isSalesPromotion not between", value1, value2, "issalespromotion");
            return (Criteria) this;
        }

        public Criteria andPayastrictIsNull() {
            addCriterion("payAstrict is null");
            return (Criteria) this;
        }

        public Criteria andPayastrictIsNotNull() {
            addCriterion("payAstrict is not null");
            return (Criteria) this;
        }

        public Criteria andPayastrictEqualTo(Integer value) {
            addCriterion("payAstrict =", value, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictNotEqualTo(Integer value) {
            addCriterion("payAstrict <>", value, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictGreaterThan(Integer value) {
            addCriterion("payAstrict >", value, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("payAstrict >=", value, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictLessThan(Integer value) {
            addCriterion("payAstrict <", value, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictLessThanOrEqualTo(Integer value) {
            addCriterion("payAstrict <=", value, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictIn(List<Integer> values) {
            addCriterion("payAstrict in", values, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictNotIn(List<Integer> values) {
            addCriterion("payAstrict not in", values, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictBetween(Integer value1, Integer value2) {
            addCriterion("payAstrict between", value1, value2, "payastrict");
            return (Criteria) this;
        }

        public Criteria andPayastrictNotBetween(Integer value1, Integer value2) {
            addCriterion("payAstrict not between", value1, value2, "payastrict");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountIsNull() {
            addCriterion("collectionAccount is null");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountIsNotNull() {
            addCriterion("collectionAccount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountEqualTo(String value) {
            addCriterion("collectionAccount =", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountNotEqualTo(String value) {
            addCriterion("collectionAccount <>", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountGreaterThan(String value) {
            addCriterion("collectionAccount >", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountGreaterThanOrEqualTo(String value) {
            addCriterion("collectionAccount >=", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountLessThan(String value) {
            addCriterion("collectionAccount <", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountLessThanOrEqualTo(String value) {
            addCriterion("collectionAccount <=", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountLike(String value) {
            addCriterion("collectionAccount like", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountNotLike(String value) {
            addCriterion("collectionAccount not like", value, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountIn(List<String> values) {
            addCriterion("collectionAccount in", values, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountNotIn(List<String> values) {
            addCriterion("collectionAccount not in", values, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountBetween(String value1, String value2) {
            addCriterion("collectionAccount between", value1, value2, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andCollectionaccountNotBetween(String value1, String value2) {
            addCriterion("collectionAccount not between", value1, value2, "collectionaccount");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueIsNull() {
            addCriterion("isIncludeRevenue is null");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueIsNotNull() {
            addCriterion("isIncludeRevenue is not null");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueEqualTo(Integer value) {
            addCriterion("isIncludeRevenue =", value, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueNotEqualTo(Integer value) {
            addCriterion("isIncludeRevenue <>", value, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueGreaterThan(Integer value) {
            addCriterion("isIncludeRevenue >", value, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueGreaterThanOrEqualTo(Integer value) {
            addCriterion("isIncludeRevenue >=", value, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueLessThan(Integer value) {
            addCriterion("isIncludeRevenue <", value, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueLessThanOrEqualTo(Integer value) {
            addCriterion("isIncludeRevenue <=", value, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueIn(List<Integer> values) {
            addCriterion("isIncludeRevenue in", values, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueNotIn(List<Integer> values) {
            addCriterion("isIncludeRevenue not in", values, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueBetween(Integer value1, Integer value2) {
            addCriterion("isIncludeRevenue between", value1, value2, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andIsincluderevenueNotBetween(Integer value1, Integer value2) {
            addCriterion("isIncludeRevenue not between", value1, value2, "isincluderevenue");
            return (Criteria) this;
        }

        public Criteria andStorecountIsNull() {
            addCriterion("storeCount is null");
            return (Criteria) this;
        }

        public Criteria andStorecountIsNotNull() {
            addCriterion("storeCount is not null");
            return (Criteria) this;
        }

        public Criteria andStorecountEqualTo(Integer value) {
            addCriterion("storeCount =", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotEqualTo(Integer value) {
            addCriterion("storeCount <>", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountGreaterThan(Integer value) {
            addCriterion("storeCount >", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeCount >=", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLessThan(Integer value) {
            addCriterion("storeCount <", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLessThanOrEqualTo(Integer value) {
            addCriterion("storeCount <=", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountIn(List<Integer> values) {
            addCriterion("storeCount in", values, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotIn(List<Integer> values) {
            addCriterion("storeCount not in", values, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountBetween(Integer value1, Integer value2) {
            addCriterion("storeCount between", value1, value2, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotBetween(Integer value1, Integer value2) {
            addCriterion("storeCount not between", value1, value2, "storecount");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeIsNull() {
            addCriterion("isSubscribeCode is null");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeIsNotNull() {
            addCriterion("isSubscribeCode is not null");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeEqualTo(Integer value) {
            addCriterion("isSubscribeCode =", value, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeNotEqualTo(Integer value) {
            addCriterion("isSubscribeCode <>", value, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeGreaterThan(Integer value) {
            addCriterion("isSubscribeCode >", value, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSubscribeCode >=", value, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeLessThan(Integer value) {
            addCriterion("isSubscribeCode <", value, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeLessThanOrEqualTo(Integer value) {
            addCriterion("isSubscribeCode <=", value, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeIn(List<Integer> values) {
            addCriterion("isSubscribeCode in", values, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeNotIn(List<Integer> values) {
            addCriterion("isSubscribeCode not in", values, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeBetween(Integer value1, Integer value2) {
            addCriterion("isSubscribeCode between", value1, value2, "issubscribecode");
            return (Criteria) this;
        }

        public Criteria andIssubscribecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("isSubscribeCode not between", value1, value2, "issubscribecode");
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

        public Criteria andMinsalenumIsNull() {
            addCriterion("minSaleNum is null");
            return (Criteria) this;
        }

        public Criteria andMinsalenumIsNotNull() {
            addCriterion("minSaleNum is not null");
            return (Criteria) this;
        }

        public Criteria andMinsalenumEqualTo(Integer value) {
            addCriterion("minSaleNum =", value, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumNotEqualTo(Integer value) {
            addCriterion("minSaleNum <>", value, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumGreaterThan(Integer value) {
            addCriterion("minSaleNum >", value, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("minSaleNum >=", value, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumLessThan(Integer value) {
            addCriterion("minSaleNum <", value, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumLessThanOrEqualTo(Integer value) {
            addCriterion("minSaleNum <=", value, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumIn(List<Integer> values) {
            addCriterion("minSaleNum in", values, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumNotIn(List<Integer> values) {
            addCriterion("minSaleNum not in", values, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumBetween(Integer value1, Integer value2) {
            addCriterion("minSaleNum between", value1, value2, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMinsalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("minSaleNum not between", value1, value2, "minsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumIsNull() {
            addCriterion("maxSaleNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumIsNotNull() {
            addCriterion("maxSaleNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumEqualTo(Integer value) {
            addCriterion("maxSaleNum =", value, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumNotEqualTo(Integer value) {
            addCriterion("maxSaleNum <>", value, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumGreaterThan(Integer value) {
            addCriterion("maxSaleNum >", value, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxSaleNum >=", value, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumLessThan(Integer value) {
            addCriterion("maxSaleNum <", value, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumLessThanOrEqualTo(Integer value) {
            addCriterion("maxSaleNum <=", value, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumIn(List<Integer> values) {
            addCriterion("maxSaleNum in", values, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumNotIn(List<Integer> values) {
            addCriterion("maxSaleNum not in", values, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumBetween(Integer value1, Integer value2) {
            addCriterion("maxSaleNum between", value1, value2, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andMaxsalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxSaleNum not between", value1, value2, "maxsalenum");
            return (Criteria) this;
        }

        public Criteria andPresentexpIsNull() {
            addCriterion("presentExp is null");
            return (Criteria) this;
        }

        public Criteria andPresentexpIsNotNull() {
            addCriterion("presentExp is not null");
            return (Criteria) this;
        }

        public Criteria andPresentexpEqualTo(Integer value) {
            addCriterion("presentExp =", value, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpNotEqualTo(Integer value) {
            addCriterion("presentExp <>", value, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpGreaterThan(Integer value) {
            addCriterion("presentExp >", value, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpGreaterThanOrEqualTo(Integer value) {
            addCriterion("presentExp >=", value, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpLessThan(Integer value) {
            addCriterion("presentExp <", value, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpLessThanOrEqualTo(Integer value) {
            addCriterion("presentExp <=", value, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpIn(List<Integer> values) {
            addCriterion("presentExp in", values, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpNotIn(List<Integer> values) {
            addCriterion("presentExp not in", values, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpBetween(Integer value1, Integer value2) {
            addCriterion("presentExp between", value1, value2, "presentexp");
            return (Criteria) this;
        }

        public Criteria andPresentexpNotBetween(Integer value1, Integer value2) {
            addCriterion("presentExp not between", value1, value2, "presentexp");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeIsNull() {
            addCriterion("isMoreSize is null");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeIsNotNull() {
            addCriterion("isMoreSize is not null");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeEqualTo(Integer value) {
            addCriterion("isMoreSize =", value, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeNotEqualTo(Integer value) {
            addCriterion("isMoreSize <>", value, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeGreaterThan(Integer value) {
            addCriterion("isMoreSize >", value, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isMoreSize >=", value, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeLessThan(Integer value) {
            addCriterion("isMoreSize <", value, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeLessThanOrEqualTo(Integer value) {
            addCriterion("isMoreSize <=", value, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeIn(List<Integer> values) {
            addCriterion("isMoreSize in", values, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeNotIn(List<Integer> values) {
            addCriterion("isMoreSize not in", values, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeBetween(Integer value1, Integer value2) {
            addCriterion("isMoreSize between", value1, value2, "ismoresize");
            return (Criteria) this;
        }

        public Criteria andIsmoresizeNotBetween(Integer value1, Integer value2) {
            addCriterion("isMoreSize not between", value1, value2, "ismoresize");
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