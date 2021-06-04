package com.zheng.pojo.m;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignProcedureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignProcedureExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNull() {
            addCriterion("DESIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDesignIdIsNotNull() {
            addCriterion("DESIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDesignIdEqualTo(String value) {
            addCriterion("DESIGN_ID =", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotEqualTo(String value) {
            addCriterion("DESIGN_ID <>", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThan(String value) {
            addCriterion("DESIGN_ID >", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_ID >=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThan(String value) {
            addCriterion("DESIGN_ID <", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_ID <=", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdLike(String value) {
            addCriterion("DESIGN_ID like", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotLike(String value) {
            addCriterion("DESIGN_ID not like", value, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdIn(List<String> values) {
            addCriterion("DESIGN_ID in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotIn(List<String> values) {
            addCriterion("DESIGN_ID not in", values, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdBetween(String value1, String value2) {
            addCriterion("DESIGN_ID between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andDesignIdNotBetween(String value1, String value2) {
            addCriterion("DESIGN_ID not between", value1, value2, "designId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNull() {
            addCriterion("FIRST_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNotNull() {
            addCriterion("FIRST_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdEqualTo(String value) {
            addCriterion("FIRST_KIND_ID =", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotEqualTo(String value) {
            addCriterion("FIRST_KIND_ID <>", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThan(String value) {
            addCriterion("FIRST_KIND_ID >", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_KIND_ID >=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThan(String value) {
            addCriterion("FIRST_KIND_ID <", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThanOrEqualTo(String value) {
            addCriterion("FIRST_KIND_ID <=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLike(String value) {
            addCriterion("FIRST_KIND_ID like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotLike(String value) {
            addCriterion("FIRST_KIND_ID not like", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIn(List<String> values) {
            addCriterion("FIRST_KIND_ID in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotIn(List<String> values) {
            addCriterion("FIRST_KIND_ID not in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdBetween(String value1, String value2) {
            addCriterion("FIRST_KIND_ID between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotBetween(String value1, String value2) {
            addCriterion("FIRST_KIND_ID not between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNull() {
            addCriterion("FIRST_KIND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNotNull() {
            addCriterion("FIRST_KIND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameEqualTo(String value) {
            addCriterion("FIRST_KIND_NAME =", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotEqualTo(String value) {
            addCriterion("FIRST_KIND_NAME <>", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThan(String value) {
            addCriterion("FIRST_KIND_NAME >", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_KIND_NAME >=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThan(String value) {
            addCriterion("FIRST_KIND_NAME <", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_KIND_NAME <=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLike(String value) {
            addCriterion("FIRST_KIND_NAME like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotLike(String value) {
            addCriterion("FIRST_KIND_NAME not like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIn(List<String> values) {
            addCriterion("FIRST_KIND_NAME in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotIn(List<String> values) {
            addCriterion("FIRST_KIND_NAME not in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameBetween(String value1, String value2) {
            addCriterion("FIRST_KIND_NAME between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_KIND_NAME not between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNull() {
            addCriterion("SECOND_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNotNull() {
            addCriterion("SECOND_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdEqualTo(String value) {
            addCriterion("SECOND_KIND_ID =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(String value) {
            addCriterion("SECOND_KIND_ID <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(String value) {
            addCriterion("SECOND_KIND_ID >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_KIND_ID >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(String value) {
            addCriterion("SECOND_KIND_ID <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("SECOND_KIND_ID <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLike(String value) {
            addCriterion("SECOND_KIND_ID like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotLike(String value) {
            addCriterion("SECOND_KIND_ID not like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<String> values) {
            addCriterion("SECOND_KIND_ID in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<String> values) {
            addCriterion("SECOND_KIND_ID not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(String value1, String value2) {
            addCriterion("SECOND_KIND_ID between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("SECOND_KIND_ID not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNull() {
            addCriterion("SECOND_KIND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNotNull() {
            addCriterion("SECOND_KIND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameEqualTo(String value) {
            addCriterion("SECOND_KIND_NAME =", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotEqualTo(String value) {
            addCriterion("SECOND_KIND_NAME <>", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThan(String value) {
            addCriterion("SECOND_KIND_NAME >", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_KIND_NAME >=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThan(String value) {
            addCriterion("SECOND_KIND_NAME <", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("SECOND_KIND_NAME <=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLike(String value) {
            addCriterion("SECOND_KIND_NAME like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotLike(String value) {
            addCriterion("SECOND_KIND_NAME not like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIn(List<String> values) {
            addCriterion("SECOND_KIND_NAME in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotIn(List<String> values) {
            addCriterion("SECOND_KIND_NAME not in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameBetween(String value1, String value2) {
            addCriterion("SECOND_KIND_NAME between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("SECOND_KIND_NAME not between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNull() {
            addCriterion("THIRD_KIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNotNull() {
            addCriterion("THIRD_KIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdEqualTo(String value) {
            addCriterion("THIRD_KIND_ID =", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotEqualTo(String value) {
            addCriterion("THIRD_KIND_ID <>", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThan(String value) {
            addCriterion("THIRD_KIND_ID >", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_KIND_ID >=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThan(String value) {
            addCriterion("THIRD_KIND_ID <", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThanOrEqualTo(String value) {
            addCriterion("THIRD_KIND_ID <=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLike(String value) {
            addCriterion("THIRD_KIND_ID like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotLike(String value) {
            addCriterion("THIRD_KIND_ID not like", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIn(List<String> values) {
            addCriterion("THIRD_KIND_ID in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotIn(List<String> values) {
            addCriterion("THIRD_KIND_ID not in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdBetween(String value1, String value2) {
            addCriterion("THIRD_KIND_ID between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotBetween(String value1, String value2) {
            addCriterion("THIRD_KIND_ID not between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNull() {
            addCriterion("THIRD_KIND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNotNull() {
            addCriterion("THIRD_KIND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameEqualTo(String value) {
            addCriterion("THIRD_KIND_NAME =", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotEqualTo(String value) {
            addCriterion("THIRD_KIND_NAME <>", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThan(String value) {
            addCriterion("THIRD_KIND_NAME >", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_KIND_NAME >=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThan(String value) {
            addCriterion("THIRD_KIND_NAME <", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThanOrEqualTo(String value) {
            addCriterion("THIRD_KIND_NAME <=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLike(String value) {
            addCriterion("THIRD_KIND_NAME like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotLike(String value) {
            addCriterion("THIRD_KIND_NAME not like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIn(List<String> values) {
            addCriterion("THIRD_KIND_NAME in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotIn(List<String> values) {
            addCriterion("THIRD_KIND_NAME not in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameBetween(String value1, String value2) {
            addCriterion("THIRD_KIND_NAME between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotBetween(String value1, String value2) {
            addCriterion("THIRD_KIND_NAME not between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeIsNull() {
            addCriterion("PROCEDURE_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeIsNotNull() {
            addCriterion("PROCEDURE_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeEqualTo(String value) {
            addCriterion("PROCEDURE_DESCRIBE =", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotEqualTo(String value) {
            addCriterion("PROCEDURE_DESCRIBE <>", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeGreaterThan(String value) {
            addCriterion("PROCEDURE_DESCRIBE >", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_DESCRIBE >=", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeLessThan(String value) {
            addCriterion("PROCEDURE_DESCRIBE <", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeLessThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_DESCRIBE <=", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeLike(String value) {
            addCriterion("PROCEDURE_DESCRIBE like", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotLike(String value) {
            addCriterion("PROCEDURE_DESCRIBE not like", value, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeIn(List<String> values) {
            addCriterion("PROCEDURE_DESCRIBE in", values, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotIn(List<String> values) {
            addCriterion("PROCEDURE_DESCRIBE not in", values, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeBetween(String value1, String value2) {
            addCriterion("PROCEDURE_DESCRIBE between", value1, value2, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andProcedureDescribeNotBetween(String value1, String value2) {
            addCriterion("PROCEDURE_DESCRIBE not between", value1, value2, "procedureDescribe");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIsNull() {
            addCriterion("COST_PRICE_SUM is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIsNotNull() {
            addCriterion("COST_PRICE_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE_SUM =", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE_SUM <>", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("COST_PRICE_SUM >", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE_SUM >=", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumLessThan(BigDecimal value) {
            addCriterion("COST_PRICE_SUM <", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE_SUM <=", value, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE_SUM in", values, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE_SUM not in", values, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE_SUM between", value1, value2, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE_SUM not between", value1, value2, "costPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumIsNull() {
            addCriterion("MODULE_COST_PRICE_SUM is null");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumIsNotNull() {
            addCriterion("MODULE_COST_PRICE_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumEqualTo(BigDecimal value) {
            addCriterion("MODULE_COST_PRICE_SUM =", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumNotEqualTo(BigDecimal value) {
            addCriterion("MODULE_COST_PRICE_SUM <>", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumGreaterThan(BigDecimal value) {
            addCriterion("MODULE_COST_PRICE_SUM >", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODULE_COST_PRICE_SUM >=", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumLessThan(BigDecimal value) {
            addCriterion("MODULE_COST_PRICE_SUM <", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODULE_COST_PRICE_SUM <=", value, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumIn(List<BigDecimal> values) {
            addCriterion("MODULE_COST_PRICE_SUM in", values, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumNotIn(List<BigDecimal> values) {
            addCriterion("MODULE_COST_PRICE_SUM not in", values, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODULE_COST_PRICE_SUM between", value1, value2, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andModuleCostPriceSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODULE_COST_PRICE_SUM not between", value1, value2, "moduleCostPriceSum");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNull() {
            addCriterion("DESIGNER is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNotNull() {
            addCriterion("DESIGNER is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerEqualTo(String value) {
            addCriterion("DESIGNER =", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotEqualTo(String value) {
            addCriterion("DESIGNER <>", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThan(String value) {
            addCriterion("DESIGNER >", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGNER >=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThan(String value) {
            addCriterion("DESIGNER <", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThanOrEqualTo(String value) {
            addCriterion("DESIGNER <=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLike(String value) {
            addCriterion("DESIGNER like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotLike(String value) {
            addCriterion("DESIGNER not like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIn(List<String> values) {
            addCriterion("DESIGNER in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotIn(List<String> values) {
            addCriterion("DESIGNER not in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerBetween(String value1, String value2) {
            addCriterion("DESIGNER between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotBetween(String value1, String value2) {
            addCriterion("DESIGNER not between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("REGISTER is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("REGISTER is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("REGISTER =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("REGISTER <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("REGISTER >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("REGISTER <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("REGISTER <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("REGISTER like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("REGISTER not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("REGISTER in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("REGISTER not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("REGISTER between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("REGISTER not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("CHECKER is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("CHECKER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("CHECKER =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("CHECKER <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("CHECKER >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKER >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("CHECKER <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("CHECKER <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("CHECKER like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("CHECKER not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("CHECKER in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("CHECKER not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("CHECKER between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("CHECKER not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionIsNull() {
            addCriterion("CHECK_SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionIsNotNull() {
            addCriterion("CHECK_SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionEqualTo(String value) {
            addCriterion("CHECK_SUGGESTION =", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotEqualTo(String value) {
            addCriterion("CHECK_SUGGESTION <>", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionGreaterThan(String value) {
            addCriterion("CHECK_SUGGESTION >", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_SUGGESTION >=", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionLessThan(String value) {
            addCriterion("CHECK_SUGGESTION <", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionLessThanOrEqualTo(String value) {
            addCriterion("CHECK_SUGGESTION <=", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionLike(String value) {
            addCriterion("CHECK_SUGGESTION like", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotLike(String value) {
            addCriterion("CHECK_SUGGESTION not like", value, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionIn(List<String> values) {
            addCriterion("CHECK_SUGGESTION in", values, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotIn(List<String> values) {
            addCriterion("CHECK_SUGGESTION not in", values, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionBetween(String value1, String value2) {
            addCriterion("CHECK_SUGGESTION between", value1, value2, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckSuggestionNotBetween(String value1, String value2) {
            addCriterion("CHECK_SUGGESTION not between", value1, value2, "checkSuggestion");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNull() {
            addCriterion("CHECK_TAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckTagIsNotNull() {
            addCriterion("CHECK_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTagEqualTo(String value) {
            addCriterion("CHECK_TAG =", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotEqualTo(String value) {
            addCriterion("CHECK_TAG <>", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThan(String value) {
            addCriterion("CHECK_TAG >", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_TAG >=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThan(String value) {
            addCriterion("CHECK_TAG <", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLessThanOrEqualTo(String value) {
            addCriterion("CHECK_TAG <=", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagLike(String value) {
            addCriterion("CHECK_TAG like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotLike(String value) {
            addCriterion("CHECK_TAG not like", value, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagIn(List<String> values) {
            addCriterion("CHECK_TAG in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotIn(List<String> values) {
            addCriterion("CHECK_TAG not in", values, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagBetween(String value1, String value2) {
            addCriterion("CHECK_TAG between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andCheckTagNotBetween(String value1, String value2) {
            addCriterion("CHECK_TAG not between", value1, value2, "checkTag");
            return (Criteria) this;
        }

        public Criteria andChangerIsNull() {
            addCriterion("CHANGER is null");
            return (Criteria) this;
        }

        public Criteria andChangerIsNotNull() {
            addCriterion("CHANGER is not null");
            return (Criteria) this;
        }

        public Criteria andChangerEqualTo(String value) {
            addCriterion("CHANGER =", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotEqualTo(String value) {
            addCriterion("CHANGER <>", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThan(String value) {
            addCriterion("CHANGER >", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGER >=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThan(String value) {
            addCriterion("CHANGER <", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThanOrEqualTo(String value) {
            addCriterion("CHANGER <=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLike(String value) {
            addCriterion("CHANGER like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotLike(String value) {
            addCriterion("CHANGER not like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerIn(List<String> values) {
            addCriterion("CHANGER in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotIn(List<String> values) {
            addCriterion("CHANGER not in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerBetween(String value1, String value2) {
            addCriterion("CHANGER between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotBetween(String value1, String value2) {
            addCriterion("CHANGER not between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("CHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("CHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterion("CHANGE_TIME =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterion("CHANGE_TIME <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterion("CHANGE_TIME >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGE_TIME >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterion("CHANGE_TIME <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHANGE_TIME <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterion("CHANGE_TIME in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterion("CHANGE_TIME not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterion("CHANGE_TIME between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHANGE_TIME not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNull() {
            addCriterion("CHANGE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andChangeTagIsNotNull() {
            addCriterion("CHANGE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTagEqualTo(String value) {
            addCriterion("CHANGE_TAG =", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotEqualTo(String value) {
            addCriterion("CHANGE_TAG <>", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThan(String value) {
            addCriterion("CHANGE_TAG >", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_TAG >=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThan(String value) {
            addCriterion("CHANGE_TAG <", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_TAG <=", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagLike(String value) {
            addCriterion("CHANGE_TAG like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotLike(String value) {
            addCriterion("CHANGE_TAG not like", value, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagIn(List<String> values) {
            addCriterion("CHANGE_TAG in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotIn(List<String> values) {
            addCriterion("CHANGE_TAG not in", values, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagBetween(String value1, String value2) {
            addCriterion("CHANGE_TAG between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andChangeTagNotBetween(String value1, String value2) {
            addCriterion("CHANGE_TAG not between", value1, value2, "changeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIsNull() {
            addCriterion("DESIGN_MODULE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIsNotNull() {
            addCriterion("DESIGN_MODULE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagEqualTo(String value) {
            addCriterion("DESIGN_MODULE_TAG =", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotEqualTo(String value) {
            addCriterion("DESIGN_MODULE_TAG <>", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagGreaterThan(String value) {
            addCriterion("DESIGN_MODULE_TAG >", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_MODULE_TAG >=", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLessThan(String value) {
            addCriterion("DESIGN_MODULE_TAG <", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_MODULE_TAG <=", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagLike(String value) {
            addCriterion("DESIGN_MODULE_TAG like", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotLike(String value) {
            addCriterion("DESIGN_MODULE_TAG not like", value, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagIn(List<String> values) {
            addCriterion("DESIGN_MODULE_TAG in", values, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotIn(List<String> values) {
            addCriterion("DESIGN_MODULE_TAG not in", values, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagBetween(String value1, String value2) {
            addCriterion("DESIGN_MODULE_TAG between", value1, value2, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleTagNotBetween(String value1, String value2) {
            addCriterion("DESIGN_MODULE_TAG not between", value1, value2, "designModuleTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIsNull() {
            addCriterion("DESIGN_MODULE_CHANGE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIsNotNull() {
            addCriterion("DESIGN_MODULE_CHANGE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagEqualTo(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG =", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotEqualTo(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG <>", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagGreaterThan(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG >", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG >=", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLessThan(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG <", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG <=", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagLike(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG like", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotLike(String value) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG not like", value, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagIn(List<String> values) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG in", values, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotIn(List<String> values) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG not in", values, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagBetween(String value1, String value2) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG between", value1, value2, "designModuleChangeTag");
            return (Criteria) this;
        }

        public Criteria andDesignModuleChangeTagNotBetween(String value1, String value2) {
            addCriterion("DESIGN_MODULE_CHANGE_TAG not between", value1, value2, "designModuleChangeTag");
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