package com.zheng.pojo.m;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignProcedureDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignProcedureDetailsExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberIsNull() {
            addCriterion("DETAILS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberIsNotNull() {
            addCriterion("DETAILS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberEqualTo(Integer value) {
            addCriterion("DETAILS_NUMBER =", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberNotEqualTo(Integer value) {
            addCriterion("DETAILS_NUMBER <>", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberGreaterThan(Integer value) {
            addCriterion("DETAILS_NUMBER >", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("DETAILS_NUMBER >=", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberLessThan(Integer value) {
            addCriterion("DETAILS_NUMBER <", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("DETAILS_NUMBER <=", value, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberIn(List<Integer> values) {
            addCriterion("DETAILS_NUMBER in", values, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberNotIn(List<Integer> values) {
            addCriterion("DETAILS_NUMBER not in", values, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberBetween(Integer value1, Integer value2) {
            addCriterion("DETAILS_NUMBER between", value1, value2, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andDetailsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("DETAILS_NUMBER not between", value1, value2, "detailsNumber");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNull() {
            addCriterion("PROCEDURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNotNull() {
            addCriterion("PROCEDURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdEqualTo(String value) {
            addCriterion("PROCEDURE_ID =", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotEqualTo(String value) {
            addCriterion("PROCEDURE_ID <>", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThan(String value) {
            addCriterion("PROCEDURE_ID >", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_ID >=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThan(String value) {
            addCriterion("PROCEDURE_ID <", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_ID <=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLike(String value) {
            addCriterion("PROCEDURE_ID like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotLike(String value) {
            addCriterion("PROCEDURE_ID not like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIn(List<String> values) {
            addCriterion("PROCEDURE_ID in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotIn(List<String> values) {
            addCriterion("PROCEDURE_ID not in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdBetween(String value1, String value2) {
            addCriterion("PROCEDURE_ID between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotBetween(String value1, String value2) {
            addCriterion("PROCEDURE_ID not between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIsNull() {
            addCriterion("PROCEDURE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIsNotNull() {
            addCriterion("PROCEDURE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureNameEqualTo(String value) {
            addCriterion("PROCEDURE_NAME =", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotEqualTo(String value) {
            addCriterion("PROCEDURE_NAME <>", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameGreaterThan(String value) {
            addCriterion("PROCEDURE_NAME >", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_NAME >=", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLessThan(String value) {
            addCriterion("PROCEDURE_NAME <", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLessThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_NAME <=", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameLike(String value) {
            addCriterion("PROCEDURE_NAME like", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotLike(String value) {
            addCriterion("PROCEDURE_NAME not like", value, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameIn(List<String> values) {
            addCriterion("PROCEDURE_NAME in", values, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotIn(List<String> values) {
            addCriterion("PROCEDURE_NAME not in", values, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameBetween(String value1, String value2) {
            addCriterion("PROCEDURE_NAME between", value1, value2, "procedureName");
            return (Criteria) this;
        }

        public Criteria andProcedureNameNotBetween(String value1, String value2) {
            addCriterion("PROCEDURE_NAME not between", value1, value2, "procedureName");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIsNull() {
            addCriterion("LABOUR_HOUR_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIsNotNull() {
            addCriterion("LABOUR_HOUR_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountEqualTo(BigDecimal value) {
            addCriterion("LABOUR_HOUR_AMOUNT =", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotEqualTo(BigDecimal value) {
            addCriterion("LABOUR_HOUR_AMOUNT <>", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountGreaterThan(BigDecimal value) {
            addCriterion("LABOUR_HOUR_AMOUNT >", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LABOUR_HOUR_AMOUNT >=", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountLessThan(BigDecimal value) {
            addCriterion("LABOUR_HOUR_AMOUNT <", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LABOUR_HOUR_AMOUNT <=", value, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountIn(List<BigDecimal> values) {
            addCriterion("LABOUR_HOUR_AMOUNT in", values, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotIn(List<BigDecimal> values) {
            addCriterion("LABOUR_HOUR_AMOUNT not in", values, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LABOUR_HOUR_AMOUNT between", value1, value2, "labourHourAmount");
            return (Criteria) this;
        }

        public Criteria andLabourHourAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LABOUR_HOUR_AMOUNT not between", value1, value2, "labourHourAmount");
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

        public Criteria andAmountUnitIsNull() {
            addCriterion("AMOUNT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIsNotNull() {
            addCriterion("AMOUNT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUnitEqualTo(String value) {
            addCriterion("AMOUNT_UNIT =", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotEqualTo(String value) {
            addCriterion("AMOUNT_UNIT <>", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitGreaterThan(String value) {
            addCriterion("AMOUNT_UNIT >", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNT_UNIT >=", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLessThan(String value) {
            addCriterion("AMOUNT_UNIT <", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLessThanOrEqualTo(String value) {
            addCriterion("AMOUNT_UNIT <=", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLike(String value) {
            addCriterion("AMOUNT_UNIT like", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotLike(String value) {
            addCriterion("AMOUNT_UNIT not like", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIn(List<String> values) {
            addCriterion("AMOUNT_UNIT in", values, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotIn(List<String> values) {
            addCriterion("AMOUNT_UNIT not in", values, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitBetween(String value1, String value2) {
            addCriterion("AMOUNT_UNIT between", value1, value2, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotBetween(String value1, String value2) {
            addCriterion("AMOUNT_UNIT not between", value1, value2, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("COST_PRICE >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("COST_PRICE <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("SUBTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("SUBTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(BigDecimal value) {
            addCriterion("SUBTOTAL =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("SUBTOTAL <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(BigDecimal value) {
            addCriterion("SUBTOTAL >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBTOTAL >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(BigDecimal value) {
            addCriterion("SUBTOTAL <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBTOTAL <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<BigDecimal> values) {
            addCriterion("SUBTOTAL in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("SUBTOTAL not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBTOTAL between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBTOTAL not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIsNull() {
            addCriterion("MODULE_SUBTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIsNotNull() {
            addCriterion("MODULE_SUBTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalEqualTo(BigDecimal value) {
            addCriterion("MODULE_SUBTOTAL =", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("MODULE_SUBTOTAL <>", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalGreaterThan(BigDecimal value) {
            addCriterion("MODULE_SUBTOTAL >", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODULE_SUBTOTAL >=", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalLessThan(BigDecimal value) {
            addCriterion("MODULE_SUBTOTAL <", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODULE_SUBTOTAL <=", value, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalIn(List<BigDecimal> values) {
            addCriterion("MODULE_SUBTOTAL in", values, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("MODULE_SUBTOTAL not in", values, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODULE_SUBTOTAL between", value1, value2, "moduleSubtotal");
            return (Criteria) this;
        }

        public Criteria andModuleSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODULE_SUBTOTAL not between", value1, value2, "moduleSubtotal");
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