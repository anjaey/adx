package com.bhe.dao.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OrderEntityCriteria() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPriceperIsNull() {
            addCriterion("pricePer is null");
            return (Criteria) this;
        }

        public Criteria andPriceperIsNotNull() {
            addCriterion("pricePer is not null");
            return (Criteria) this;
        }

        public Criteria andPriceperEqualTo(String value) {
            addCriterion("pricePer =", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperNotEqualTo(String value) {
            addCriterion("pricePer <>", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperGreaterThan(String value) {
            addCriterion("pricePer >", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperGreaterThanOrEqualTo(String value) {
            addCriterion("pricePer >=", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperLessThan(String value) {
            addCriterion("pricePer <", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperLessThanOrEqualTo(String value) {
            addCriterion("pricePer <=", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperLike(String value) {
            addCriterion("pricePer like", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperNotLike(String value) {
            addCriterion("pricePer not like", value, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperIn(List<String> values) {
            addCriterion("pricePer in", values, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperNotIn(List<String> values) {
            addCriterion("pricePer not in", values, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperBetween(String value1, String value2) {
            addCriterion("pricePer between", value1, value2, "priceper");
            return (Criteria) this;
        }

        public Criteria andPriceperNotBetween(String value1, String value2) {
            addCriterion("pricePer not between", value1, value2, "priceper");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(BigDecimal value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(BigDecimal value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<BigDecimal> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
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

        public Criteria andPreferentialpriceIsNull() {
            addCriterion("preferentialPrice is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceIsNotNull() {
            addCriterion("preferentialPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceEqualTo(BigDecimal value) {
            addCriterion("preferentialPrice =", value, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceNotEqualTo(BigDecimal value) {
            addCriterion("preferentialPrice <>", value, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceGreaterThan(BigDecimal value) {
            addCriterion("preferentialPrice >", value, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preferentialPrice >=", value, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceLessThan(BigDecimal value) {
            addCriterion("preferentialPrice <", value, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preferentialPrice <=", value, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceIn(List<BigDecimal> values) {
            addCriterion("preferentialPrice in", values, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceNotIn(List<BigDecimal> values) {
            addCriterion("preferentialPrice not in", values, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferentialPrice between", value1, value2, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferentialPrice not between", value1, value2, "preferentialprice");
            return (Criteria) this;
        }

        public Criteria andPreferentialidIsNull() {
            addCriterion("preferentialId is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialidIsNotNull() {
            addCriterion("preferentialId is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialidEqualTo(Integer value) {
            addCriterion("preferentialId =", value, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidNotEqualTo(Integer value) {
            addCriterion("preferentialId <>", value, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidGreaterThan(Integer value) {
            addCriterion("preferentialId >", value, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("preferentialId >=", value, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidLessThan(Integer value) {
            addCriterion("preferentialId <", value, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidLessThanOrEqualTo(Integer value) {
            addCriterion("preferentialId <=", value, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidIn(List<Integer> values) {
            addCriterion("preferentialId in", values, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidNotIn(List<Integer> values) {
            addCriterion("preferentialId not in", values, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidBetween(Integer value1, Integer value2) {
            addCriterion("preferentialId between", value1, value2, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPreferentialidNotBetween(Integer value1, Integer value2) {
            addCriterion("preferentialId not between", value1, value2, "preferentialid");
            return (Criteria) this;
        }

        public Criteria andPaypriceIsNull() {
            addCriterion("payPrice is null");
            return (Criteria) this;
        }

        public Criteria andPaypriceIsNotNull() {
            addCriterion("payPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPaypriceEqualTo(BigDecimal value) {
            addCriterion("payPrice =", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceNotEqualTo(BigDecimal value) {
            addCriterion("payPrice <>", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceGreaterThan(BigDecimal value) {
            addCriterion("payPrice >", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payPrice >=", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceLessThan(BigDecimal value) {
            addCriterion("payPrice <", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payPrice <=", value, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceIn(List<BigDecimal> values) {
            addCriterion("payPrice in", values, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceNotIn(List<BigDecimal> values) {
            addCriterion("payPrice not in", values, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payPrice between", value1, value2, "payprice");
            return (Criteria) this;
        }

        public Criteria andPaypriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payPrice not between", value1, value2, "payprice");
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

        public Criteria andPaystatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Integer value) {
            addCriterion("payStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Integer value) {
            addCriterion("payStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Integer value) {
            addCriterion("payStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Integer value) {
            addCriterion("payStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Integer value) {
            addCriterion("payStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Integer> values) {
            addCriterion("payStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Integer> values) {
            addCriterion("payStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Integer value1, Integer value2) {
            addCriterion("payStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNull() {
            addCriterion("cancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNotNull() {
            addCriterion("cancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeEqualTo(Date value) {
            addCriterion("cancelTime =", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotEqualTo(Date value) {
            addCriterion("cancelTime <>", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThan(Date value) {
            addCriterion("cancelTime >", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancelTime >=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThan(Date value) {
            addCriterion("cancelTime <", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("cancelTime <=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIn(List<Date> values) {
            addCriterion("cancelTime in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotIn(List<Date> values) {
            addCriterion("cancelTime not in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeBetween(Date value1, Date value2) {
            addCriterion("cancelTime between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("cancelTime not between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNull() {
            addCriterion("buyerName is null");
            return (Criteria) this;
        }

        public Criteria andBuyernameIsNotNull() {
            addCriterion("buyerName is not null");
            return (Criteria) this;
        }

        public Criteria andBuyernameEqualTo(String value) {
            addCriterion("buyerName =", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotEqualTo(String value) {
            addCriterion("buyerName <>", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThan(String value) {
            addCriterion("buyerName >", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameGreaterThanOrEqualTo(String value) {
            addCriterion("buyerName >=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThan(String value) {
            addCriterion("buyerName <", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLessThanOrEqualTo(String value) {
            addCriterion("buyerName <=", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameLike(String value) {
            addCriterion("buyerName like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotLike(String value) {
            addCriterion("buyerName not like", value, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameIn(List<String> values) {
            addCriterion("buyerName in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotIn(List<String> values) {
            addCriterion("buyerName not in", values, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameBetween(String value1, String value2) {
            addCriterion("buyerName between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyernameNotBetween(String value1, String value2) {
            addCriterion("buyerName not between", value1, value2, "buyername");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneIsNull() {
            addCriterion("buyerPhone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneIsNotNull() {
            addCriterion("buyerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneEqualTo(String value) {
            addCriterion("buyerPhone =", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotEqualTo(String value) {
            addCriterion("buyerPhone <>", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneGreaterThan(String value) {
            addCriterion("buyerPhone >", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyerPhone >=", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneLessThan(String value) {
            addCriterion("buyerPhone <", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneLessThanOrEqualTo(String value) {
            addCriterion("buyerPhone <=", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneLike(String value) {
            addCriterion("buyerPhone like", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotLike(String value) {
            addCriterion("buyerPhone not like", value, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneIn(List<String> values) {
            addCriterion("buyerPhone in", values, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotIn(List<String> values) {
            addCriterion("buyerPhone not in", values, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneBetween(String value1, String value2) {
            addCriterion("buyerPhone between", value1, value2, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyerphoneNotBetween(String value1, String value2) {
            addCriterion("buyerPhone not between", value1, value2, "buyerphone");
            return (Criteria) this;
        }

        public Criteria andBuyermobileIsNull() {
            addCriterion("buyerMobile is null");
            return (Criteria) this;
        }

        public Criteria andBuyermobileIsNotNull() {
            addCriterion("buyerMobile is not null");
            return (Criteria) this;
        }

        public Criteria andBuyermobileEqualTo(String value) {
            addCriterion("buyerMobile =", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileNotEqualTo(String value) {
            addCriterion("buyerMobile <>", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileGreaterThan(String value) {
            addCriterion("buyerMobile >", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileGreaterThanOrEqualTo(String value) {
            addCriterion("buyerMobile >=", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileLessThan(String value) {
            addCriterion("buyerMobile <", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileLessThanOrEqualTo(String value) {
            addCriterion("buyerMobile <=", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileLike(String value) {
            addCriterion("buyerMobile like", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileNotLike(String value) {
            addCriterion("buyerMobile not like", value, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileIn(List<String> values) {
            addCriterion("buyerMobile in", values, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileNotIn(List<String> values) {
            addCriterion("buyerMobile not in", values, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileBetween(String value1, String value2) {
            addCriterion("buyerMobile between", value1, value2, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andBuyermobileNotBetween(String value1, String value2) {
            addCriterion("buyerMobile not between", value1, value2, "buyermobile");
            return (Criteria) this;
        }

        public Criteria andLeavemsgIsNull() {
            addCriterion("leaveMsg is null");
            return (Criteria) this;
        }

        public Criteria andLeavemsgIsNotNull() {
            addCriterion("leaveMsg is not null");
            return (Criteria) this;
        }

        public Criteria andLeavemsgEqualTo(String value) {
            addCriterion("leaveMsg =", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgNotEqualTo(String value) {
            addCriterion("leaveMsg <>", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgGreaterThan(String value) {
            addCriterion("leaveMsg >", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgGreaterThanOrEqualTo(String value) {
            addCriterion("leaveMsg >=", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgLessThan(String value) {
            addCriterion("leaveMsg <", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgLessThanOrEqualTo(String value) {
            addCriterion("leaveMsg <=", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgLike(String value) {
            addCriterion("leaveMsg like", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgNotLike(String value) {
            addCriterion("leaveMsg not like", value, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgIn(List<String> values) {
            addCriterion("leaveMsg in", values, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgNotIn(List<String> values) {
            addCriterion("leaveMsg not in", values, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgBetween(String value1, String value2) {
            addCriterion("leaveMsg between", value1, value2, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andLeavemsgNotBetween(String value1, String value2) {
            addCriterion("leaveMsg not between", value1, value2, "leavemsg");
            return (Criteria) this;
        }

        public Criteria andConuntryIsNull() {
            addCriterion("conuntry is null");
            return (Criteria) this;
        }

        public Criteria andConuntryIsNotNull() {
            addCriterion("conuntry is not null");
            return (Criteria) this;
        }

        public Criteria andConuntryEqualTo(String value) {
            addCriterion("conuntry =", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryNotEqualTo(String value) {
            addCriterion("conuntry <>", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryGreaterThan(String value) {
            addCriterion("conuntry >", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryGreaterThanOrEqualTo(String value) {
            addCriterion("conuntry >=", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryLessThan(String value) {
            addCriterion("conuntry <", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryLessThanOrEqualTo(String value) {
            addCriterion("conuntry <=", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryLike(String value) {
            addCriterion("conuntry like", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryNotLike(String value) {
            addCriterion("conuntry not like", value, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryIn(List<String> values) {
            addCriterion("conuntry in", values, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryNotIn(List<String> values) {
            addCriterion("conuntry not in", values, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryBetween(String value1, String value2) {
            addCriterion("conuntry between", value1, value2, "conuntry");
            return (Criteria) this;
        }

        public Criteria andConuntryNotBetween(String value1, String value2) {
            addCriterion("conuntry not between", value1, value2, "conuntry");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictsIsNull() {
            addCriterion("districts is null");
            return (Criteria) this;
        }

        public Criteria andDistrictsIsNotNull() {
            addCriterion("districts is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictsEqualTo(String value) {
            addCriterion("districts =", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsNotEqualTo(String value) {
            addCriterion("districts <>", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsGreaterThan(String value) {
            addCriterion("districts >", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsGreaterThanOrEqualTo(String value) {
            addCriterion("districts >=", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsLessThan(String value) {
            addCriterion("districts <", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsLessThanOrEqualTo(String value) {
            addCriterion("districts <=", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsLike(String value) {
            addCriterion("districts like", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsNotLike(String value) {
            addCriterion("districts not like", value, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsIn(List<String> values) {
            addCriterion("districts in", values, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsNotIn(List<String> values) {
            addCriterion("districts not in", values, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsBetween(String value1, String value2) {
            addCriterion("districts between", value1, value2, "districts");
            return (Criteria) this;
        }

        public Criteria andDistrictsNotBetween(String value1, String value2) {
            addCriterion("districts not between", value1, value2, "districts");
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

        public Criteria andCitylevelIsNull() {
            addCriterion("cityLevel is null");
            return (Criteria) this;
        }

        public Criteria andCitylevelIsNotNull() {
            addCriterion("cityLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCitylevelEqualTo(String value) {
            addCriterion("cityLevel =", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotEqualTo(String value) {
            addCriterion("cityLevel <>", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelGreaterThan(String value) {
            addCriterion("cityLevel >", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelGreaterThanOrEqualTo(String value) {
            addCriterion("cityLevel >=", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLessThan(String value) {
            addCriterion("cityLevel <", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLessThanOrEqualTo(String value) {
            addCriterion("cityLevel <=", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLike(String value) {
            addCriterion("cityLevel like", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotLike(String value) {
            addCriterion("cityLevel not like", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelIn(List<String> values) {
            addCriterion("cityLevel in", values, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotIn(List<String> values) {
            addCriterion("cityLevel not in", values, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelBetween(String value1, String value2) {
            addCriterion("cityLevel between", value1, value2, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotBetween(String value1, String value2) {
            addCriterion("cityLevel not between", value1, value2, "citylevel");
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

        public Criteria andOrdertypeIsNull() {
            addCriterion("orderType is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("orderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(Integer value) {
            addCriterion("orderType =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(Integer value) {
            addCriterion("orderType <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(Integer value) {
            addCriterion("orderType >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderType >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(Integer value) {
            addCriterion("orderType <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(Integer value) {
            addCriterion("orderType <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<Integer> values) {
            addCriterion("orderType in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<Integer> values) {
            addCriterion("orderType not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(Integer value1, Integer value2) {
            addCriterion("orderType between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orderType not between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("auditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("auditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("auditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("auditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("auditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("auditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus not between", value1, value2, "auditstatus");
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