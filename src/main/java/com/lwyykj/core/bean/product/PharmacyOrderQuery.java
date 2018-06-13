package com.lwyykj.core.bean.product;

import java.util.ArrayList;
import java.util.List;

public class PharmacyOrderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public PharmacyOrderQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andKdnumIsNull() {
            addCriterion("kdnum is null");
            return (Criteria) this;
        }

        public Criteria andKdnumIsNotNull() {
            addCriterion("kdnum is not null");
            return (Criteria) this;
        }

        public Criteria andKdnumEqualTo(String value) {
            addCriterion("kdnum =", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumNotEqualTo(String value) {
            addCriterion("kdnum <>", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumGreaterThan(String value) {
            addCriterion("kdnum >", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumGreaterThanOrEqualTo(String value) {
            addCriterion("kdnum >=", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumLessThan(String value) {
            addCriterion("kdnum <", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumLessThanOrEqualTo(String value) {
            addCriterion("kdnum <=", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumLike(String value) {
            addCriterion("kdnum like", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumNotLike(String value) {
            addCriterion("kdnum not like", value, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumIn(List<String> values) {
            addCriterion("kdnum in", values, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumNotIn(List<String> values) {
            addCriterion("kdnum not in", values, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumBetween(String value1, String value2) {
            addCriterion("kdnum between", value1, value2, "kdnum");
            return (Criteria) this;
        }

        public Criteria andKdnumNotBetween(String value1, String value2) {
            addCriterion("kdnum not between", value1, value2, "kdnum");
            return (Criteria) this;
        }

        public Criteria andOpstyleIsNull() {
            addCriterion("opstyle is null");
            return (Criteria) this;
        }

        public Criteria andOpstyleIsNotNull() {
            addCriterion("opstyle is not null");
            return (Criteria) this;
        }

        public Criteria andOpstyleEqualTo(Integer value) {
            addCriterion("opstyle =", value, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleNotEqualTo(Integer value) {
            addCriterion("opstyle <>", value, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleGreaterThan(Integer value) {
            addCriterion("opstyle >", value, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("opstyle >=", value, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleLessThan(Integer value) {
            addCriterion("opstyle <", value, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleLessThanOrEqualTo(Integer value) {
            addCriterion("opstyle <=", value, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleIn(List<Integer> values) {
            addCriterion("opstyle in", values, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleNotIn(List<Integer> values) {
            addCriterion("opstyle not in", values, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleBetween(Integer value1, Integer value2) {
            addCriterion("opstyle between", value1, value2, "opstyle");
            return (Criteria) this;
        }

        public Criteria andOpstyleNotBetween(Integer value1, Integer value2) {
            addCriterion("opstyle not between", value1, value2, "opstyle");
            return (Criteria) this;
        }

        public Criteria andPushDocIdIsNull() {
            addCriterion("push_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andPushDocIdIsNotNull() {
            addCriterion("push_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushDocIdEqualTo(Integer value) {
            addCriterion("push_doc_id =", value, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdNotEqualTo(Integer value) {
            addCriterion("push_doc_id <>", value, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdGreaterThan(Integer value) {
            addCriterion("push_doc_id >", value, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_doc_id >=", value, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdLessThan(Integer value) {
            addCriterion("push_doc_id <", value, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdLessThanOrEqualTo(Integer value) {
            addCriterion("push_doc_id <=", value, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdIn(List<Integer> values) {
            addCriterion("push_doc_id in", values, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdNotIn(List<Integer> values) {
            addCriterion("push_doc_id not in", values, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdBetween(Integer value1, Integer value2) {
            addCriterion("push_doc_id between", value1, value2, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andPushDocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("push_doc_id not between", value1, value2, "pushDocId");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Integer value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Integer value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Integer value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Integer value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Integer> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Integer> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Integer value1, Integer value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andUcodeIsNull() {
            addCriterion("ucode is null");
            return (Criteria) this;
        }

        public Criteria andUcodeIsNotNull() {
            addCriterion("ucode is not null");
            return (Criteria) this;
        }

        public Criteria andUcodeEqualTo(String value) {
            addCriterion("ucode =", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotEqualTo(String value) {
            addCriterion("ucode <>", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeGreaterThan(String value) {
            addCriterion("ucode >", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ucode >=", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeLessThan(String value) {
            addCriterion("ucode <", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeLessThanOrEqualTo(String value) {
            addCriterion("ucode <=", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeLike(String value) {
            addCriterion("ucode like", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotLike(String value) {
            addCriterion("ucode not like", value, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeIn(List<String> values) {
            addCriterion("ucode in", values, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotIn(List<String> values) {
            addCriterion("ucode not in", values, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeBetween(String value1, String value2) {
            addCriterion("ucode between", value1, value2, "ucode");
            return (Criteria) this;
        }

        public Criteria andUcodeNotBetween(String value1, String value2) {
            addCriterion("ucode not between", value1, value2, "ucode");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNull() {
            addCriterion("refund_state is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(Integer value) {
            addCriterion("refund_state =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(Integer value) {
            addCriterion("refund_state <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(Integer value) {
            addCriterion("refund_state >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_state >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(Integer value) {
            addCriterion("refund_state <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(Integer value) {
            addCriterion("refund_state <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<Integer> values) {
            addCriterion("refund_state in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<Integer> values) {
            addCriterion("refund_state not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(Integer value1, Integer value2) {
            addCriterion("refund_state between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_state not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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