package com.lwyykj.core.bean.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DoctorQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public DoctorQuery() {
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

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPracticeIdIsNull() {
            addCriterion("practice_id is null");
            return (Criteria) this;
        }

        public Criteria andPracticeIdIsNotNull() {
            addCriterion("practice_id is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeIdEqualTo(String value) {
            addCriterion("practice_id =", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdNotEqualTo(String value) {
            addCriterion("practice_id <>", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdGreaterThan(String value) {
            addCriterion("practice_id >", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("practice_id >=", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdLessThan(String value) {
            addCriterion("practice_id <", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdLessThanOrEqualTo(String value) {
            addCriterion("practice_id <=", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdLike(String value) {
            addCriterion("practice_id like", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdNotLike(String value) {
            addCriterion("practice_id not like", value, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdIn(List<String> values) {
            addCriterion("practice_id in", values, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdNotIn(List<String> values) {
            addCriterion("practice_id not in", values, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdBetween(String value1, String value2) {
            addCriterion("practice_id between", value1, value2, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPracticeIdNotBetween(String value1, String value2) {
            addCriterion("practice_id not between", value1, value2, "practiceId");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andPositionXIsNull() {
            addCriterion("position_x is null");
            return (Criteria) this;
        }

        public Criteria andPositionXIsNotNull() {
            addCriterion("position_x is not null");
            return (Criteria) this;
        }

        public Criteria andPositionXEqualTo(BigDecimal value) {
            addCriterion("position_x =", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotEqualTo(BigDecimal value) {
            addCriterion("position_x <>", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXGreaterThan(BigDecimal value) {
            addCriterion("position_x >", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("position_x >=", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLessThan(BigDecimal value) {
            addCriterion("position_x <", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("position_x <=", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXIn(List<BigDecimal> values) {
            addCriterion("position_x in", values, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotIn(List<BigDecimal> values) {
            addCriterion("position_x not in", values, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("position_x between", value1, value2, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("position_x not between", value1, value2, "positionX");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBegoodatIsNull() {
            addCriterion("begoodat is null");
            return (Criteria) this;
        }

        public Criteria andBegoodatIsNotNull() {
            addCriterion("begoodat is not null");
            return (Criteria) this;
        }

        public Criteria andBegoodatEqualTo(String value) {
            addCriterion("begoodat =", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatNotEqualTo(String value) {
            addCriterion("begoodat <>", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatGreaterThan(String value) {
            addCriterion("begoodat >", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatGreaterThanOrEqualTo(String value) {
            addCriterion("begoodat >=", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatLessThan(String value) {
            addCriterion("begoodat <", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatLessThanOrEqualTo(String value) {
            addCriterion("begoodat <=", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatLike(String value) {
            addCriterion("begoodat like", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatNotLike(String value) {
            addCriterion("begoodat not like", value, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatIn(List<String> values) {
            addCriterion("begoodat in", values, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatNotIn(List<String> values) {
            addCriterion("begoodat not in", values, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatBetween(String value1, String value2) {
            addCriterion("begoodat between", value1, value2, "begoodat");
            return (Criteria) this;
        }

        public Criteria andBegoodatNotBetween(String value1, String value2) {
            addCriterion("begoodat not between", value1, value2, "begoodat");
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

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regtime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Integer value) {
            addCriterion("regtime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Integer value) {
            addCriterion("regtime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Integer value) {
            addCriterion("regtime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("regtime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Integer value) {
            addCriterion("regtime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Integer value) {
            addCriterion("regtime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Integer> values) {
            addCriterion("regtime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Integer> values) {
            addCriterion("regtime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Integer value1, Integer value2) {
            addCriterion("regtime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("regtime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andPositionYIsNull() {
            addCriterion("position_y is null");
            return (Criteria) this;
        }

        public Criteria andPositionYIsNotNull() {
            addCriterion("position_y is not null");
            return (Criteria) this;
        }

        public Criteria andPositionYEqualTo(BigDecimal value) {
            addCriterion("position_y =", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotEqualTo(BigDecimal value) {
            addCriterion("position_y <>", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYGreaterThan(BigDecimal value) {
            addCriterion("position_y >", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("position_y >=", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLessThan(BigDecimal value) {
            addCriterion("position_y <", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("position_y <=", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYIn(List<BigDecimal> values) {
            addCriterion("position_y in", values, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotIn(List<BigDecimal> values) {
            addCriterion("position_y not in", values, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("position_y between", value1, value2, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("position_y not between", value1, value2, "positionY");
            return (Criteria) this;
        }

        public Criteria andHosIdIsNull() {
            addCriterion("hos_id is null");
            return (Criteria) this;
        }

        public Criteria andHosIdIsNotNull() {
            addCriterion("hos_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosIdEqualTo(Integer value) {
            addCriterion("hos_id =", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotEqualTo(Integer value) {
            addCriterion("hos_id <>", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdGreaterThan(Integer value) {
            addCriterion("hos_id >", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_id >=", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdLessThan(Integer value) {
            addCriterion("hos_id <", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdLessThanOrEqualTo(Integer value) {
            addCriterion("hos_id <=", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdIn(List<Integer> values) {
            addCriterion("hos_id in", values, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotIn(List<Integer> values) {
            addCriterion("hos_id not in", values, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdBetween(Integer value1, Integer value2) {
            addCriterion("hos_id between", value1, value2, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_id not between", value1, value2, "hosId");
            return (Criteria) this;
        }

        public Criteria andPrice1IsNull() {
            addCriterion("price1 is null");
            return (Criteria) this;
        }

        public Criteria andPrice1IsNotNull() {
            addCriterion("price1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice1EqualTo(Float value) {
            addCriterion("price1 =", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotEqualTo(Float value) {
            addCriterion("price1 <>", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1GreaterThan(Float value) {
            addCriterion("price1 >", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1GreaterThanOrEqualTo(Float value) {
            addCriterion("price1 >=", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1LessThan(Float value) {
            addCriterion("price1 <", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1LessThanOrEqualTo(Float value) {
            addCriterion("price1 <=", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1In(List<Float> values) {
            addCriterion("price1 in", values, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotIn(List<Float> values) {
            addCriterion("price1 not in", values, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1Between(Float value1, Float value2) {
            addCriterion("price1 between", value1, value2, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotBetween(Float value1, Float value2) {
            addCriterion("price1 not between", value1, value2, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNull() {
            addCriterion("price2 is null");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNotNull() {
            addCriterion("price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice2EqualTo(Float value) {
            addCriterion("price2 =", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotEqualTo(Float value) {
            addCriterion("price2 <>", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThan(Float value) {
            addCriterion("price2 >", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThanOrEqualTo(Float value) {
            addCriterion("price2 >=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThan(Float value) {
            addCriterion("price2 <", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThanOrEqualTo(Float value) {
            addCriterion("price2 <=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2In(List<Float> values) {
            addCriterion("price2 in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotIn(List<Float> values) {
            addCriterion("price2 not in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2Between(Float value1, Float value2) {
            addCriterion("price2 between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotBetween(Float value1, Float value2) {
            addCriterion("price2 not between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice3IsNull() {
            addCriterion("price3 is null");
            return (Criteria) this;
        }

        public Criteria andPrice3IsNotNull() {
            addCriterion("price3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice3EqualTo(Float value) {
            addCriterion("price3 =", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3NotEqualTo(Float value) {
            addCriterion("price3 <>", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3GreaterThan(Float value) {
            addCriterion("price3 >", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3GreaterThanOrEqualTo(Float value) {
            addCriterion("price3 >=", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3LessThan(Float value) {
            addCriterion("price3 <", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3LessThanOrEqualTo(Float value) {
            addCriterion("price3 <=", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3In(List<Float> values) {
            addCriterion("price3 in", values, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3NotIn(List<Float> values) {
            addCriterion("price3 not in", values, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3Between(Float value1, Float value2) {
            addCriterion("price3 between", value1, value2, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3NotBetween(Float value1, Float value2) {
            addCriterion("price3 not between", value1, value2, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice4IsNull() {
            addCriterion("price4 is null");
            return (Criteria) this;
        }

        public Criteria andPrice4IsNotNull() {
            addCriterion("price4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice4EqualTo(Float value) {
            addCriterion("price4 =", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4NotEqualTo(Float value) {
            addCriterion("price4 <>", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4GreaterThan(Float value) {
            addCriterion("price4 >", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4GreaterThanOrEqualTo(Float value) {
            addCriterion("price4 >=", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4LessThan(Float value) {
            addCriterion("price4 <", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4LessThanOrEqualTo(Float value) {
            addCriterion("price4 <=", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4In(List<Float> values) {
            addCriterion("price4 in", values, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4NotIn(List<Float> values) {
            addCriterion("price4 not in", values, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4Between(Float value1, Float value2) {
            addCriterion("price4 between", value1, value2, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4NotBetween(Float value1, Float value2) {
            addCriterion("price4 not between", value1, value2, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice5IsNull() {
            addCriterion("price5 is null");
            return (Criteria) this;
        }

        public Criteria andPrice5IsNotNull() {
            addCriterion("price5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice5EqualTo(Float value) {
            addCriterion("price5 =", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5NotEqualTo(Float value) {
            addCriterion("price5 <>", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5GreaterThan(Float value) {
            addCriterion("price5 >", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5GreaterThanOrEqualTo(Float value) {
            addCriterion("price5 >=", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5LessThan(Float value) {
            addCriterion("price5 <", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5LessThanOrEqualTo(Float value) {
            addCriterion("price5 <=", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5In(List<Float> values) {
            addCriterion("price5 in", values, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5NotIn(List<Float> values) {
            addCriterion("price5 not in", values, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5Between(Float value1, Float value2) {
            addCriterion("price5 between", value1, value2, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5NotBetween(Float value1, Float value2) {
            addCriterion("price5 not between", value1, value2, "price5");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(String value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(String value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(String value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(String value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(String value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLike(String value) {
            addCriterion("service_time like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotLike(String value) {
            addCriterion("service_time not like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<String> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<String> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(String value1, String value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(String value1, String value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("isonline is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("isonline is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(Integer value) {
            addCriterion("isonline =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(Integer value) {
            addCriterion("isonline <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(Integer value) {
            addCriterion("isonline >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("isonline >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(Integer value) {
            addCriterion("isonline <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(Integer value) {
            addCriterion("isonline <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<Integer> values) {
            addCriterion("isonline in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<Integer> values) {
            addCriterion("isonline not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(Integer value1, Integer value2) {
            addCriterion("isonline between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(Integer value1, Integer value2) {
            addCriterion("isonline not between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isshow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isshow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("isshow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("isshow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("isshow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isshow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("isshow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("isshow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("isshow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("isshow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("isshow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("isshow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andFamousIsNull() {
            addCriterion("famous is null");
            return (Criteria) this;
        }

        public Criteria andFamousIsNotNull() {
            addCriterion("famous is not null");
            return (Criteria) this;
        }

        public Criteria andFamousEqualTo(Integer value) {
            addCriterion("famous =", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousNotEqualTo(Integer value) {
            addCriterion("famous <>", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousGreaterThan(Integer value) {
            addCriterion("famous >", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousGreaterThanOrEqualTo(Integer value) {
            addCriterion("famous >=", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousLessThan(Integer value) {
            addCriterion("famous <", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousLessThanOrEqualTo(Integer value) {
            addCriterion("famous <=", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousIn(List<Integer> values) {
            addCriterion("famous in", values, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousNotIn(List<Integer> values) {
            addCriterion("famous not in", values, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousBetween(Integer value1, Integer value2) {
            addCriterion("famous between", value1, value2, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousNotBetween(Integer value1, Integer value2) {
            addCriterion("famous not between", value1, value2, "famous");
            return (Criteria) this;
        }

        public Criteria andBeautifulIsNull() {
            addCriterion("beautiful is null");
            return (Criteria) this;
        }

        public Criteria andBeautifulIsNotNull() {
            addCriterion("beautiful is not null");
            return (Criteria) this;
        }

        public Criteria andBeautifulEqualTo(Integer value) {
            addCriterion("beautiful =", value, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulNotEqualTo(Integer value) {
            addCriterion("beautiful <>", value, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulGreaterThan(Integer value) {
            addCriterion("beautiful >", value, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulGreaterThanOrEqualTo(Integer value) {
            addCriterion("beautiful >=", value, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulLessThan(Integer value) {
            addCriterion("beautiful <", value, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulLessThanOrEqualTo(Integer value) {
            addCriterion("beautiful <=", value, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulIn(List<Integer> values) {
            addCriterion("beautiful in", values, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulNotIn(List<Integer> values) {
            addCriterion("beautiful not in", values, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulBetween(Integer value1, Integer value2) {
            addCriterion("beautiful between", value1, value2, "beautiful");
            return (Criteria) this;
        }

        public Criteria andBeautifulNotBetween(Integer value1, Integer value2) {
            addCriterion("beautiful not between", value1, value2, "beautiful");
            return (Criteria) this;
        }

        public Criteria andCondition2IsNull() {
            addCriterion("condition2 is null");
            return (Criteria) this;
        }

        public Criteria andCondition2IsNotNull() {
            addCriterion("condition2 is not null");
            return (Criteria) this;
        }

        public Criteria andCondition2EqualTo(Boolean value) {
            addCriterion("condition2 =", value, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2NotEqualTo(Boolean value) {
            addCriterion("condition2 <>", value, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2GreaterThan(Boolean value) {
            addCriterion("condition2 >", value, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("condition2 >=", value, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2LessThan(Boolean value) {
            addCriterion("condition2 <", value, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2LessThanOrEqualTo(Boolean value) {
            addCriterion("condition2 <=", value, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2In(List<Boolean> values) {
            addCriterion("condition2 in", values, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2NotIn(List<Boolean> values) {
            addCriterion("condition2 not in", values, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2Between(Boolean value1, Boolean value2) {
            addCriterion("condition2 between", value1, value2, "condition2");
            return (Criteria) this;
        }

        public Criteria andCondition2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("condition2 not between", value1, value2, "condition2");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andTkIsNull() {
            addCriterion("TK is null");
            return (Criteria) this;
        }

        public Criteria andTkIsNotNull() {
            addCriterion("TK is not null");
            return (Criteria) this;
        }

        public Criteria andTkEqualTo(String value) {
            addCriterion("TK =", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotEqualTo(String value) {
            addCriterion("TK <>", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkGreaterThan(String value) {
            addCriterion("TK >", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkGreaterThanOrEqualTo(String value) {
            addCriterion("TK >=", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLessThan(String value) {
            addCriterion("TK <", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLessThanOrEqualTo(String value) {
            addCriterion("TK <=", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkLike(String value) {
            addCriterion("TK like", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotLike(String value) {
            addCriterion("TK not like", value, "tk");
            return (Criteria) this;
        }

        public Criteria andTkIn(List<String> values) {
            addCriterion("TK in", values, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotIn(List<String> values) {
            addCriterion("TK not in", values, "tk");
            return (Criteria) this;
        }

        public Criteria andTkBetween(String value1, String value2) {
            addCriterion("TK between", value1, value2, "tk");
            return (Criteria) this;
        }

        public Criteria andTkNotBetween(String value1, String value2) {
            addCriterion("TK not between", value1, value2, "tk");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNull() {
            addCriterion("qrcode is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNotNull() {
            addCriterion("qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeEqualTo(String value) {
            addCriterion("qrcode =", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotEqualTo(String value) {
            addCriterion("qrcode <>", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThan(String value) {
            addCriterion("qrcode >", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode >=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThan(String value) {
            addCriterion("qrcode <", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThanOrEqualTo(String value) {
            addCriterion("qrcode <=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLike(String value) {
            addCriterion("qrcode like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotLike(String value) {
            addCriterion("qrcode not like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeIn(List<String> values) {
            addCriterion("qrcode in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotIn(List<String> values) {
            addCriterion("qrcode not in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeBetween(String value1, String value2) {
            addCriterion("qrcode between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotBetween(String value1, String value2) {
            addCriterion("qrcode not between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNull() {
            addCriterion("appraise is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNotNull() {
            addCriterion("appraise is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseEqualTo(Float value) {
            addCriterion("appraise =", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotEqualTo(Float value) {
            addCriterion("appraise <>", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThan(Float value) {
            addCriterion("appraise >", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThanOrEqualTo(Float value) {
            addCriterion("appraise >=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThan(Float value) {
            addCriterion("appraise <", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThanOrEqualTo(Float value) {
            addCriterion("appraise <=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseIn(List<Float> values) {
            addCriterion("appraise in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotIn(List<Float> values) {
            addCriterion("appraise not in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseBetween(Float value1, Float value2) {
            addCriterion("appraise between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotBetween(Float value1, Float value2) {
            addCriterion("appraise not between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("pcode is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("pcode is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("pcode =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("pcode <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("pcode >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pcode >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("pcode <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("pcode <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("pcode like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("pcode not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("pcode in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("pcode not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("pcode between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("pcode not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andCcodeIsNull() {
            addCriterion("ccode is null");
            return (Criteria) this;
        }

        public Criteria andCcodeIsNotNull() {
            addCriterion("ccode is not null");
            return (Criteria) this;
        }

        public Criteria andCcodeEqualTo(String value) {
            addCriterion("ccode =", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotEqualTo(String value) {
            addCriterion("ccode <>", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeGreaterThan(String value) {
            addCriterion("ccode >", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ccode >=", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLessThan(String value) {
            addCriterion("ccode <", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLessThanOrEqualTo(String value) {
            addCriterion("ccode <=", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLike(String value) {
            addCriterion("ccode like", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotLike(String value) {
            addCriterion("ccode not like", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeIn(List<String> values) {
            addCriterion("ccode in", values, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotIn(List<String> values) {
            addCriterion("ccode not in", values, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeBetween(String value1, String value2) {
            addCriterion("ccode between", value1, value2, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotBetween(String value1, String value2) {
            addCriterion("ccode not between", value1, value2, "ccode");
            return (Criteria) this;
        }

        public Criteria andAcodeIsNull() {
            addCriterion("acode is null");
            return (Criteria) this;
        }

        public Criteria andAcodeIsNotNull() {
            addCriterion("acode is not null");
            return (Criteria) this;
        }

        public Criteria andAcodeEqualTo(String value) {
            addCriterion("acode =", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeNotEqualTo(String value) {
            addCriterion("acode <>", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeGreaterThan(String value) {
            addCriterion("acode >", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeGreaterThanOrEqualTo(String value) {
            addCriterion("acode >=", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeLessThan(String value) {
            addCriterion("acode <", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeLessThanOrEqualTo(String value) {
            addCriterion("acode <=", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeLike(String value) {
            addCriterion("acode like", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeNotLike(String value) {
            addCriterion("acode not like", value, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeIn(List<String> values) {
            addCriterion("acode in", values, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeNotIn(List<String> values) {
            addCriterion("acode not in", values, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeBetween(String value1, String value2) {
            addCriterion("acode between", value1, value2, "acode");
            return (Criteria) this;
        }

        public Criteria andAcodeNotBetween(String value1, String value2) {
            addCriterion("acode not between", value1, value2, "acode");
            return (Criteria) this;
        }

        public Criteria andIdcardpicIsNull() {
            addCriterion("IDcardpic is null");
            return (Criteria) this;
        }

        public Criteria andIdcardpicIsNotNull() {
            addCriterion("IDcardpic is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardpicEqualTo(String value) {
            addCriterion("IDcardpic =", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotEqualTo(String value) {
            addCriterion("IDcardpic <>", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicGreaterThan(String value) {
            addCriterion("IDcardpic >", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicGreaterThanOrEqualTo(String value) {
            addCriterion("IDcardpic >=", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicLessThan(String value) {
            addCriterion("IDcardpic <", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicLessThanOrEqualTo(String value) {
            addCriterion("IDcardpic <=", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicLike(String value) {
            addCriterion("IDcardpic like", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotLike(String value) {
            addCriterion("IDcardpic not like", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicIn(List<String> values) {
            addCriterion("IDcardpic in", values, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotIn(List<String> values) {
            addCriterion("IDcardpic not in", values, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicBetween(String value1, String value2) {
            addCriterion("IDcardpic between", value1, value2, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotBetween(String value1, String value2) {
            addCriterion("IDcardpic not between", value1, value2, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicIsNull() {
            addCriterion("yishizigepic is null");
            return (Criteria) this;
        }

        public Criteria andYishizigepicIsNotNull() {
            addCriterion("yishizigepic is not null");
            return (Criteria) this;
        }

        public Criteria andYishizigepicEqualTo(String value) {
            addCriterion("yishizigepic =", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicNotEqualTo(String value) {
            addCriterion("yishizigepic <>", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicGreaterThan(String value) {
            addCriterion("yishizigepic >", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicGreaterThanOrEqualTo(String value) {
            addCriterion("yishizigepic >=", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicLessThan(String value) {
            addCriterion("yishizigepic <", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicLessThanOrEqualTo(String value) {
            addCriterion("yishizigepic <=", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicLike(String value) {
            addCriterion("yishizigepic like", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicNotLike(String value) {
            addCriterion("yishizigepic not like", value, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicIn(List<String> values) {
            addCriterion("yishizigepic in", values, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicNotIn(List<String> values) {
            addCriterion("yishizigepic not in", values, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicBetween(String value1, String value2) {
            addCriterion("yishizigepic between", value1, value2, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andYishizigepicNotBetween(String value1, String value2) {
            addCriterion("yishizigepic not between", value1, value2, "yishizigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicIsNull() {
            addCriterion("zhiyezigepic is null");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicIsNotNull() {
            addCriterion("zhiyezigepic is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicEqualTo(String value) {
            addCriterion("zhiyezigepic =", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicNotEqualTo(String value) {
            addCriterion("zhiyezigepic <>", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicGreaterThan(String value) {
            addCriterion("zhiyezigepic >", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicGreaterThanOrEqualTo(String value) {
            addCriterion("zhiyezigepic >=", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicLessThan(String value) {
            addCriterion("zhiyezigepic <", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicLessThanOrEqualTo(String value) {
            addCriterion("zhiyezigepic <=", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicLike(String value) {
            addCriterion("zhiyezigepic like", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicNotLike(String value) {
            addCriterion("zhiyezigepic not like", value, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicIn(List<String> values) {
            addCriterion("zhiyezigepic in", values, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicNotIn(List<String> values) {
            addCriterion("zhiyezigepic not in", values, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicBetween(String value1, String value2) {
            addCriterion("zhiyezigepic between", value1, value2, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andZhiyezigepicNotBetween(String value1, String value2) {
            addCriterion("zhiyezigepic not between", value1, value2, "zhiyezigepic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicIsNull() {
            addCriterion("workcardpic is null");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicIsNotNull() {
            addCriterion("workcardpic is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicEqualTo(String value) {
            addCriterion("workcardpic =", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicNotEqualTo(String value) {
            addCriterion("workcardpic <>", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicGreaterThan(String value) {
            addCriterion("workcardpic >", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicGreaterThanOrEqualTo(String value) {
            addCriterion("workcardpic >=", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicLessThan(String value) {
            addCriterion("workcardpic <", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicLessThanOrEqualTo(String value) {
            addCriterion("workcardpic <=", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicLike(String value) {
            addCriterion("workcardpic like", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicNotLike(String value) {
            addCriterion("workcardpic not like", value, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicIn(List<String> values) {
            addCriterion("workcardpic in", values, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicNotIn(List<String> values) {
            addCriterion("workcardpic not in", values, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicBetween(String value1, String value2) {
            addCriterion("workcardpic between", value1, value2, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andWorkcardpicNotBetween(String value1, String value2) {
            addCriterion("workcardpic not between", value1, value2, "workcardpic");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHxLoginIsNull() {
            addCriterion("hx_login is null");
            return (Criteria) this;
        }

        public Criteria andHxLoginIsNotNull() {
            addCriterion("hx_login is not null");
            return (Criteria) this;
        }

        public Criteria andHxLoginEqualTo(String value) {
            addCriterion("hx_login =", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginNotEqualTo(String value) {
            addCriterion("hx_login <>", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginGreaterThan(String value) {
            addCriterion("hx_login >", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginGreaterThanOrEqualTo(String value) {
            addCriterion("hx_login >=", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginLessThan(String value) {
            addCriterion("hx_login <", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginLessThanOrEqualTo(String value) {
            addCriterion("hx_login <=", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginLike(String value) {
            addCriterion("hx_login like", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginNotLike(String value) {
            addCriterion("hx_login not like", value, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginIn(List<String> values) {
            addCriterion("hx_login in", values, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginNotIn(List<String> values) {
            addCriterion("hx_login not in", values, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginBetween(String value1, String value2) {
            addCriterion("hx_login between", value1, value2, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andHxLoginNotBetween(String value1, String value2) {
            addCriterion("hx_login not between", value1, value2, "hxLogin");
            return (Criteria) this;
        }

        public Criteria andMark1IsNull() {
            addCriterion("mark1 is null");
            return (Criteria) this;
        }

        public Criteria andMark1IsNotNull() {
            addCriterion("mark1 is not null");
            return (Criteria) this;
        }

        public Criteria andMark1EqualTo(Integer value) {
            addCriterion("mark1 =", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotEqualTo(Integer value) {
            addCriterion("mark1 <>", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThan(Integer value) {
            addCriterion("mark1 >", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThanOrEqualTo(Integer value) {
            addCriterion("mark1 >=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThan(Integer value) {
            addCriterion("mark1 <", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThanOrEqualTo(Integer value) {
            addCriterion("mark1 <=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1In(List<Integer> values) {
            addCriterion("mark1 in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotIn(List<Integer> values) {
            addCriterion("mark1 not in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1Between(Integer value1, Integer value2) {
            addCriterion("mark1 between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotBetween(Integer value1, Integer value2) {
            addCriterion("mark1 not between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andTestUserIsNull() {
            addCriterion("test_user is null");
            return (Criteria) this;
        }

        public Criteria andTestUserIsNotNull() {
            addCriterion("test_user is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserEqualTo(Integer value) {
            addCriterion("test_user =", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotEqualTo(Integer value) {
            addCriterion("test_user <>", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThan(Integer value) {
            addCriterion("test_user >", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_user >=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThan(Integer value) {
            addCriterion("test_user <", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThanOrEqualTo(Integer value) {
            addCriterion("test_user <=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserIn(List<Integer> values) {
            addCriterion("test_user in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotIn(List<Integer> values) {
            addCriterion("test_user not in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserBetween(Integer value1, Integer value2) {
            addCriterion("test_user between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotBetween(Integer value1, Integer value2) {
            addCriterion("test_user not between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andCodeTimeIsNull() {
            addCriterion("code_time is null");
            return (Criteria) this;
        }

        public Criteria andCodeTimeIsNotNull() {
            addCriterion("code_time is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTimeEqualTo(String value) {
            addCriterion("code_time =", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotEqualTo(String value) {
            addCriterion("code_time <>", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeGreaterThan(String value) {
            addCriterion("code_time >", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("code_time >=", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeLessThan(String value) {
            addCriterion("code_time <", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeLessThanOrEqualTo(String value) {
            addCriterion("code_time <=", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeLike(String value) {
            addCriterion("code_time like", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotLike(String value) {
            addCriterion("code_time not like", value, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeIn(List<String> values) {
            addCriterion("code_time in", values, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotIn(List<String> values) {
            addCriterion("code_time not in", values, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeBetween(String value1, String value2) {
            addCriterion("code_time between", value1, value2, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeTimeNotBetween(String value1, String value2) {
            addCriterion("code_time not between", value1, value2, "codeTime");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
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