package com.zheng.pojo.m;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcedureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcedureExample() {
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

        public Criteria andRealLabourHourAmountIsNull() {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountIsNotNull() {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountEqualTo(BigDecimal value) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT =", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountNotEqualTo(BigDecimal value) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT <>", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountGreaterThan(BigDecimal value) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT >", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT >=", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountLessThan(BigDecimal value) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT <", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT <=", value, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountIn(List<BigDecimal> values) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT in", values, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountNotIn(List<BigDecimal> values) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT not in", values, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT between", value1, value2, "realLabourHourAmount");
            return (Criteria) this;
        }

        public Criteria andRealLabourHourAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_LABOUR_HOUR_AMOUNT not between", value1, value2, "realLabourHourAmount");
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

        public Criteria andRealSubtotalIsNull() {
            addCriterion("REAL_SUBTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalIsNotNull() {
            addCriterion("REAL_SUBTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalEqualTo(BigDecimal value) {
            addCriterion("REAL_SUBTOTAL =", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("REAL_SUBTOTAL <>", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalGreaterThan(BigDecimal value) {
            addCriterion("REAL_SUBTOTAL >", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_SUBTOTAL >=", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalLessThan(BigDecimal value) {
            addCriterion("REAL_SUBTOTAL <", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_SUBTOTAL <=", value, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalIn(List<BigDecimal> values) {
            addCriterion("REAL_SUBTOTAL in", values, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("REAL_SUBTOTAL not in", values, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_SUBTOTAL between", value1, value2, "realSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_SUBTOTAL not between", value1, value2, "realSubtotal");
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

        public Criteria andRealModuleSubtotalIsNull() {
            addCriterion("REAL_MODULE_SUBTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalIsNotNull() {
            addCriterion("REAL_MODULE_SUBTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalEqualTo(BigDecimal value) {
            addCriterion("REAL_MODULE_SUBTOTAL =", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalNotEqualTo(BigDecimal value) {
            addCriterion("REAL_MODULE_SUBTOTAL <>", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalGreaterThan(BigDecimal value) {
            addCriterion("REAL_MODULE_SUBTOTAL >", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_MODULE_SUBTOTAL >=", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalLessThan(BigDecimal value) {
            addCriterion("REAL_MODULE_SUBTOTAL <", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_MODULE_SUBTOTAL <=", value, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalIn(List<BigDecimal> values) {
            addCriterion("REAL_MODULE_SUBTOTAL in", values, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalNotIn(List<BigDecimal> values) {
            addCriterion("REAL_MODULE_SUBTOTAL not in", values, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_MODULE_SUBTOTAL between", value1, value2, "realModuleSubtotal");
            return (Criteria) this;
        }

        public Criteria andRealModuleSubtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_MODULE_SUBTOTAL not between", value1, value2, "realModuleSubtotal");
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

        public Criteria andDemandAmountIsNull() {
            addCriterion("DEMAND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIsNotNull() {
            addCriterion("DEMAND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAmountEqualTo(BigDecimal value) {
            addCriterion("DEMAND_AMOUNT =", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEMAND_AMOUNT <>", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThan(BigDecimal value) {
            addCriterion("DEMAND_AMOUNT >", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEMAND_AMOUNT >=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThan(BigDecimal value) {
            addCriterion("DEMAND_AMOUNT <", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEMAND_AMOUNT <=", value, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountIn(List<BigDecimal> values) {
            addCriterion("DEMAND_AMOUNT in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEMAND_AMOUNT not in", values, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEMAND_AMOUNT between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andDemandAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEMAND_AMOUNT not between", value1, value2, "demandAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("REAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("REAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("REAL_AMOUNT >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("REAL_AMOUNT <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_AMOUNT <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("REAL_AMOUNT in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("REAL_AMOUNT not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_AMOUNT between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_AMOUNT not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagIsNull() {
            addCriterion("PROCEDURE_FINISH_TAG is null");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagIsNotNull() {
            addCriterion("PROCEDURE_FINISH_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagEqualTo(String value) {
            addCriterion("PROCEDURE_FINISH_TAG =", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotEqualTo(String value) {
            addCriterion("PROCEDURE_FINISH_TAG <>", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagGreaterThan(String value) {
            addCriterion("PROCEDURE_FINISH_TAG >", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagGreaterThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_FINISH_TAG >=", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagLessThan(String value) {
            addCriterion("PROCEDURE_FINISH_TAG <", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagLessThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_FINISH_TAG <=", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagLike(String value) {
            addCriterion("PROCEDURE_FINISH_TAG like", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotLike(String value) {
            addCriterion("PROCEDURE_FINISH_TAG not like", value, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagIn(List<String> values) {
            addCriterion("PROCEDURE_FINISH_TAG in", values, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotIn(List<String> values) {
            addCriterion("PROCEDURE_FINISH_TAG not in", values, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagBetween(String value1, String value2) {
            addCriterion("PROCEDURE_FINISH_TAG between", value1, value2, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureFinishTagNotBetween(String value1, String value2) {
            addCriterion("PROCEDURE_FINISH_TAG not between", value1, value2, "procedureFinishTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagIsNull() {
            addCriterion("PROCEDURE_TRANSFER_TAG is null");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagIsNotNull() {
            addCriterion("PROCEDURE_TRANSFER_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagEqualTo(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG =", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotEqualTo(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG <>", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagGreaterThan(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG >", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagGreaterThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG >=", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagLessThan(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG <", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagLessThanOrEqualTo(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG <=", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagLike(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG like", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotLike(String value) {
            addCriterion("PROCEDURE_TRANSFER_TAG not like", value, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagIn(List<String> values) {
            addCriterion("PROCEDURE_TRANSFER_TAG in", values, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotIn(List<String> values) {
            addCriterion("PROCEDURE_TRANSFER_TAG not in", values, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagBetween(String value1, String value2) {
            addCriterion("PROCEDURE_TRANSFER_TAG between", value1, value2, "procedureTransferTag");
            return (Criteria) this;
        }

        public Criteria andProcedureTransferTagNotBetween(String value1, String value2) {
            addCriterion("PROCEDURE_TRANSFER_TAG not between", value1, value2, "procedureTransferTag");
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