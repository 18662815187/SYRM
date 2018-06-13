package com.lwyykj.core.bean.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SkuQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SkuQuery() {
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

        public Criteria andPhIdIsNull() {
            addCriterion("ph_id is null");
            return (Criteria) this;
        }

        public Criteria andPhIdIsNotNull() {
            addCriterion("ph_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhIdEqualTo(Integer value) {
            addCriterion("ph_id =", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdNotEqualTo(Integer value) {
            addCriterion("ph_id <>", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdGreaterThan(Integer value) {
            addCriterion("ph_id >", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ph_id >=", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdLessThan(Integer value) {
            addCriterion("ph_id <", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdLessThanOrEqualTo(Integer value) {
            addCriterion("ph_id <=", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdIn(List<Integer> values) {
            addCriterion("ph_id in", values, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdNotIn(List<Integer> values) {
            addCriterion("ph_id not in", values, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdBetween(Integer value1, Integer value2) {
            addCriterion("ph_id between", value1, value2, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ph_id not between", value1, value2, "phId");
            return (Criteria) this;
        }

        public Criteria andProStandIdIsNull() {
            addCriterion("pro_stand_id is null");
            return (Criteria) this;
        }

        public Criteria andProStandIdIsNotNull() {
            addCriterion("pro_stand_id is not null");
            return (Criteria) this;
        }

        public Criteria andProStandIdEqualTo(Integer value) {
            addCriterion("pro_stand_id =", value, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdNotEqualTo(Integer value) {
            addCriterion("pro_stand_id <>", value, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdGreaterThan(Integer value) {
            addCriterion("pro_stand_id >", value, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_stand_id >=", value, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdLessThan(Integer value) {
            addCriterion("pro_stand_id <", value, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_stand_id <=", value, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdIn(List<Integer> values) {
            addCriterion("pro_stand_id in", values, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdNotIn(List<Integer> values) {
            addCriterion("pro_stand_id not in", values, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_stand_id between", value1, value2, "proStandId");
            return (Criteria) this;
        }

        public Criteria andProStandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_stand_id not between", value1, value2, "proStandId");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIsNull() {
            addCriterion("buy_limit is null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIsNotNull() {
            addCriterion("buy_limit is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLimitEqualTo(Integer value) {
            addCriterion("buy_limit =", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotEqualTo(Integer value) {
            addCriterion("buy_limit <>", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitGreaterThan(Integer value) {
            addCriterion("buy_limit >", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_limit >=", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitLessThan(Integer value) {
            addCriterion("buy_limit <", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitLessThanOrEqualTo(Integer value) {
            addCriterion("buy_limit <=", value, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitIn(List<Integer> values) {
            addCriterion("buy_limit in", values, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotIn(List<Integer> values) {
            addCriterion("buy_limit not in", values, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitBetween(Integer value1, Integer value2) {
            addCriterion("buy_limit between", value1, value2, "buyLimit");
            return (Criteria) this;
        }

        public Criteria andBuyLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_limit not between", value1, value2, "buyLimit");
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

        public Criteria andActivityPriceIsNull() {
            addCriterion("activity_price is null");
            return (Criteria) this;
        }

        public Criteria andActivityPriceIsNotNull() {
            addCriterion("activity_price is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPriceEqualTo(BigDecimal value) {
            addCriterion("activity_price =", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceNotEqualTo(BigDecimal value) {
            addCriterion("activity_price <>", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceGreaterThan(BigDecimal value) {
            addCriterion("activity_price >", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_price >=", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceLessThan(BigDecimal value) {
            addCriterion("activity_price <", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_price <=", value, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceIn(List<BigDecimal> values) {
            addCriterion("activity_price in", values, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceNotIn(List<BigDecimal> values) {
            addCriterion("activity_price not in", values, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_price between", value1, value2, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andActivityPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_price not between", value1, value2, "activityPrice");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Boolean value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Boolean value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Boolean value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Boolean value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Boolean value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Boolean> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Boolean> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
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

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
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