package com.zheng.pojo.s;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GatherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GatherExample() {
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

        public Criteria andGatherIdIsNull() {
            addCriterion("GATHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andGatherIdIsNotNull() {
            addCriterion("GATHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGatherIdEqualTo(String value) {
            addCriterion("GATHER_ID =", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotEqualTo(String value) {
            addCriterion("GATHER_ID <>", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdGreaterThan(String value) {
            addCriterion("GATHER_ID >", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdGreaterThanOrEqualTo(String value) {
            addCriterion("GATHER_ID >=", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdLessThan(String value) {
            addCriterion("GATHER_ID <", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdLessThanOrEqualTo(String value) {
            addCriterion("GATHER_ID <=", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdLike(String value) {
            addCriterion("GATHER_ID like", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotLike(String value) {
            addCriterion("GATHER_ID not like", value, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdIn(List<String> values) {
            addCriterion("GATHER_ID in", values, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotIn(List<String> values) {
            addCriterion("GATHER_ID not in", values, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdBetween(String value1, String value2) {
            addCriterion("GATHER_ID between", value1, value2, "gatherId");
            return (Criteria) this;
        }

        public Criteria andGatherIdNotBetween(String value1, String value2) {
            addCriterion("GATHER_ID not between", value1, value2, "gatherId");
            return (Criteria) this;
        }

        public Criteria andStorerIsNull() {
            addCriterion("STORER is null");
            return (Criteria) this;
        }

        public Criteria andStorerIsNotNull() {
            addCriterion("STORER is not null");
            return (Criteria) this;
        }

        public Criteria andStorerEqualTo(String value) {
            addCriterion("STORER =", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotEqualTo(String value) {
            addCriterion("STORER <>", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerGreaterThan(String value) {
            addCriterion("STORER >", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerGreaterThanOrEqualTo(String value) {
            addCriterion("STORER >=", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerLessThan(String value) {
            addCriterion("STORER <", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerLessThanOrEqualTo(String value) {
            addCriterion("STORER <=", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerLike(String value) {
            addCriterion("STORER like", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotLike(String value) {
            addCriterion("STORER not like", value, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerIn(List<String> values) {
            addCriterion("STORER in", values, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotIn(List<String> values) {
            addCriterion("STORER not in", values, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerBetween(String value1, String value2) {
            addCriterion("STORER between", value1, value2, "storer");
            return (Criteria) this;
        }

        public Criteria andStorerNotBetween(String value1, String value2) {
            addCriterion("STORER not between", value1, value2, "storer");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonexactIsNull() {
            addCriterion("REASONEXACT is null");
            return (Criteria) this;
        }

        public Criteria andReasonexactIsNotNull() {
            addCriterion("REASONEXACT is not null");
            return (Criteria) this;
        }

        public Criteria andReasonexactEqualTo(String value) {
            addCriterion("REASONEXACT =", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotEqualTo(String value) {
            addCriterion("REASONEXACT <>", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactGreaterThan(String value) {
            addCriterion("REASONEXACT >", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactGreaterThanOrEqualTo(String value) {
            addCriterion("REASONEXACT >=", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactLessThan(String value) {
            addCriterion("REASONEXACT <", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactLessThanOrEqualTo(String value) {
            addCriterion("REASONEXACT <=", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactLike(String value) {
            addCriterion("REASONEXACT like", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotLike(String value) {
            addCriterion("REASONEXACT not like", value, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactIn(List<String> values) {
            addCriterion("REASONEXACT in", values, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotIn(List<String> values) {
            addCriterion("REASONEXACT not in", values, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactBetween(String value1, String value2) {
            addCriterion("REASONEXACT between", value1, value2, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andReasonexactNotBetween(String value1, String value2) {
            addCriterion("REASONEXACT not between", value1, value2, "reasonexact");
            return (Criteria) this;
        }

        public Criteria andAmountSumIsNull() {
            addCriterion("AMOUNT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andAmountSumIsNotNull() {
            addCriterion("AMOUNT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andAmountSumEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_SUM =", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_SUM <>", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT_SUM >", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_SUM >=", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumLessThan(BigDecimal value) {
            addCriterion("AMOUNT_SUM <", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_SUM <=", value, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_SUM in", values, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_SUM not in", values, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_SUM between", value1, value2, "amountSum");
            return (Criteria) this;
        }

        public Criteria andAmountSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_SUM not between", value1, value2, "amountSum");
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

        public Criteria andGatheredAmountSumIsNull() {
            addCriterion("GATHERED_AMOUNT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumIsNotNull() {
            addCriterion("GATHERED_AMOUNT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumEqualTo(BigDecimal value) {
            addCriterion("GATHERED_AMOUNT_SUM =", value, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumNotEqualTo(BigDecimal value) {
            addCriterion("GATHERED_AMOUNT_SUM <>", value, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumGreaterThan(BigDecimal value) {
            addCriterion("GATHERED_AMOUNT_SUM >", value, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GATHERED_AMOUNT_SUM >=", value, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumLessThan(BigDecimal value) {
            addCriterion("GATHERED_AMOUNT_SUM <", value, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GATHERED_AMOUNT_SUM <=", value, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumIn(List<BigDecimal> values) {
            addCriterion("GATHERED_AMOUNT_SUM in", values, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumNotIn(List<BigDecimal> values) {
            addCriterion("GATHERED_AMOUNT_SUM not in", values, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GATHERED_AMOUNT_SUM between", value1, value2, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andGatheredAmountSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GATHERED_AMOUNT_SUM not between", value1, value2, "gatheredAmountSum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andAttemperIsNull() {
            addCriterion("ATTEMPER is null");
            return (Criteria) this;
        }

        public Criteria andAttemperIsNotNull() {
            addCriterion("ATTEMPER is not null");
            return (Criteria) this;
        }

        public Criteria andAttemperEqualTo(String value) {
            addCriterion("ATTEMPER =", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotEqualTo(String value) {
            addCriterion("ATTEMPER <>", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperGreaterThan(String value) {
            addCriterion("ATTEMPER >", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperGreaterThanOrEqualTo(String value) {
            addCriterion("ATTEMPER >=", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperLessThan(String value) {
            addCriterion("ATTEMPER <", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperLessThanOrEqualTo(String value) {
            addCriterion("ATTEMPER <=", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperLike(String value) {
            addCriterion("ATTEMPER like", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotLike(String value) {
            addCriterion("ATTEMPER not like", value, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperIn(List<String> values) {
            addCriterion("ATTEMPER in", values, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotIn(List<String> values) {
            addCriterion("ATTEMPER not in", values, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperBetween(String value1, String value2) {
            addCriterion("ATTEMPER between", value1, value2, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperNotBetween(String value1, String value2) {
            addCriterion("ATTEMPER not between", value1, value2, "attemper");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeIsNull() {
            addCriterion("ATTEMPER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeIsNotNull() {
            addCriterion("ATTEMPER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeEqualTo(Date value) {
            addCriterion("ATTEMPER_TIME =", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeNotEqualTo(Date value) {
            addCriterion("ATTEMPER_TIME <>", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeGreaterThan(Date value) {
            addCriterion("ATTEMPER_TIME >", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ATTEMPER_TIME >=", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeLessThan(Date value) {
            addCriterion("ATTEMPER_TIME <", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeLessThanOrEqualTo(Date value) {
            addCriterion("ATTEMPER_TIME <=", value, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeIn(List<Date> values) {
            addCriterion("ATTEMPER_TIME in", values, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeNotIn(List<Date> values) {
            addCriterion("ATTEMPER_TIME not in", values, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeBetween(Date value1, Date value2) {
            addCriterion("ATTEMPER_TIME between", value1, value2, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andAttemperTimeNotBetween(Date value1, Date value2) {
            addCriterion("ATTEMPER_TIME not between", value1, value2, "attemperTime");
            return (Criteria) this;
        }

        public Criteria andGatherTagIsNull() {
            addCriterion("GATHER_TAG is null");
            return (Criteria) this;
        }

        public Criteria andGatherTagIsNotNull() {
            addCriterion("GATHER_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andGatherTagEqualTo(String value) {
            addCriterion("GATHER_TAG =", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagNotEqualTo(String value) {
            addCriterion("GATHER_TAG <>", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagGreaterThan(String value) {
            addCriterion("GATHER_TAG >", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagGreaterThanOrEqualTo(String value) {
            addCriterion("GATHER_TAG >=", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagLessThan(String value) {
            addCriterion("GATHER_TAG <", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagLessThanOrEqualTo(String value) {
            addCriterion("GATHER_TAG <=", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagLike(String value) {
            addCriterion("GATHER_TAG like", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagNotLike(String value) {
            addCriterion("GATHER_TAG not like", value, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagIn(List<String> values) {
            addCriterion("GATHER_TAG in", values, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagNotIn(List<String> values) {
            addCriterion("GATHER_TAG not in", values, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagBetween(String value1, String value2) {
            addCriterion("GATHER_TAG between", value1, value2, "gatherTag");
            return (Criteria) this;
        }

        public Criteria andGatherTagNotBetween(String value1, String value2) {
            addCriterion("GATHER_TAG not between", value1, value2, "gatherTag");
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