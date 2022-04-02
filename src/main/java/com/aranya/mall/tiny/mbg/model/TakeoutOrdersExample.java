package com.aranya.mall.tiny.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakeoutOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeoutOrdersExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIsNull() {
            addCriterion("restaurant_id is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIsNotNull() {
            addCriterion("restaurant_id is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdEqualTo(Integer value) {
            addCriterion("restaurant_id =", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotEqualTo(Integer value) {
            addCriterion("restaurant_id <>", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThan(Integer value) {
            addCriterion("restaurant_id >", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id >=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThan(Integer value) {
            addCriterion("restaurant_id <", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id <=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIn(List<Integer> values) {
            addCriterion("restaurant_id in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotIn(List<Integer> values) {
            addCriterion("restaurant_id not in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id not between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
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

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(String value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(String value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(String value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(String value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(String value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLike(String value) {
            addCriterion("charge_id like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotLike(String value) {
            addCriterion("charge_id not like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<String> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<String> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(String value1, String value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(String value1, String value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayAtIsNull() {
            addCriterion("pay_at is null");
            return (Criteria) this;
        }

        public Criteria andPayAtIsNotNull() {
            addCriterion("pay_at is not null");
            return (Criteria) this;
        }

        public Criteria andPayAtEqualTo(Date value) {
            addCriterion("pay_at =", value, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtNotEqualTo(Date value) {
            addCriterion("pay_at <>", value, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtGreaterThan(Date value) {
            addCriterion("pay_at >", value, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_at >=", value, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtLessThan(Date value) {
            addCriterion("pay_at <", value, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtLessThanOrEqualTo(Date value) {
            addCriterion("pay_at <=", value, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtIn(List<Date> values) {
            addCriterion("pay_at in", values, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtNotIn(List<Date> values) {
            addCriterion("pay_at not in", values, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtBetween(Date value1, Date value2) {
            addCriterion("pay_at between", value1, value2, "payAt");
            return (Criteria) this;
        }

        public Criteria andPayAtNotBetween(Date value1, Date value2) {
            addCriterion("pay_at not between", value1, value2, "payAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Integer value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Integer value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Integer value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Integer value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Integer> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Integer> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtIsNull() {
            addCriterion("booking_delivery_at is null");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtIsNotNull() {
            addCriterion("booking_delivery_at is not null");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtEqualTo(String value) {
            addCriterion("booking_delivery_at =", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtNotEqualTo(String value) {
            addCriterion("booking_delivery_at <>", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtGreaterThan(String value) {
            addCriterion("booking_delivery_at >", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtGreaterThanOrEqualTo(String value) {
            addCriterion("booking_delivery_at >=", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtLessThan(String value) {
            addCriterion("booking_delivery_at <", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtLessThanOrEqualTo(String value) {
            addCriterion("booking_delivery_at <=", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtLike(String value) {
            addCriterion("booking_delivery_at like", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtNotLike(String value) {
            addCriterion("booking_delivery_at not like", value, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtIn(List<String> values) {
            addCriterion("booking_delivery_at in", values, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtNotIn(List<String> values) {
            addCriterion("booking_delivery_at not in", values, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtBetween(String value1, String value2) {
            addCriterion("booking_delivery_at between", value1, value2, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andBookingDeliveryAtNotBetween(String value1, String value2) {
            addCriterion("booking_delivery_at not between", value1, value2, "bookingDeliveryAt");
            return (Criteria) this;
        }

        public Criteria andIsOntimeIsNull() {
            addCriterion("is_ontime is null");
            return (Criteria) this;
        }

        public Criteria andIsOntimeIsNotNull() {
            addCriterion("is_ontime is not null");
            return (Criteria) this;
        }

        public Criteria andIsOntimeEqualTo(Integer value) {
            addCriterion("is_ontime =", value, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeNotEqualTo(Integer value) {
            addCriterion("is_ontime <>", value, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeGreaterThan(Integer value) {
            addCriterion("is_ontime >", value, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ontime >=", value, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeLessThan(Integer value) {
            addCriterion("is_ontime <", value, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeLessThanOrEqualTo(Integer value) {
            addCriterion("is_ontime <=", value, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeIn(List<Integer> values) {
            addCriterion("is_ontime in", values, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeNotIn(List<Integer> values) {
            addCriterion("is_ontime not in", values, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeBetween(Integer value1, Integer value2) {
            addCriterion("is_ontime between", value1, value2, "isOntime");
            return (Criteria) this;
        }

        public Criteria andIsOntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ontime not between", value1, value2, "isOntime");
            return (Criteria) this;
        }

        public Criteria andTablewareCountIsNull() {
            addCriterion("tableware_count is null");
            return (Criteria) this;
        }

        public Criteria andTablewareCountIsNotNull() {
            addCriterion("tableware_count is not null");
            return (Criteria) this;
        }

        public Criteria andTablewareCountEqualTo(Integer value) {
            addCriterion("tableware_count =", value, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountNotEqualTo(Integer value) {
            addCriterion("tableware_count <>", value, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountGreaterThan(Integer value) {
            addCriterion("tableware_count >", value, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tableware_count >=", value, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountLessThan(Integer value) {
            addCriterion("tableware_count <", value, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountLessThanOrEqualTo(Integer value) {
            addCriterion("tableware_count <=", value, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountIn(List<Integer> values) {
            addCriterion("tableware_count in", values, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountNotIn(List<Integer> values) {
            addCriterion("tableware_count not in", values, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountBetween(Integer value1, Integer value2) {
            addCriterion("tableware_count between", value1, value2, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tableware_count not between", value1, value2, "tablewareCount");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceIsNull() {
            addCriterion("tableware_price is null");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceIsNotNull() {
            addCriterion("tableware_price is not null");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceEqualTo(BigDecimal value) {
            addCriterion("tableware_price =", value, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceNotEqualTo(BigDecimal value) {
            addCriterion("tableware_price <>", value, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceGreaterThan(BigDecimal value) {
            addCriterion("tableware_price >", value, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tableware_price >=", value, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceLessThan(BigDecimal value) {
            addCriterion("tableware_price <", value, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tableware_price <=", value, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceIn(List<BigDecimal> values) {
            addCriterion("tableware_price in", values, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceNotIn(List<BigDecimal> values) {
            addCriterion("tableware_price not in", values, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tableware_price between", value1, value2, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andTablewarePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tableware_price not between", value1, value2, "tablewarePrice");
            return (Criteria) this;
        }

        public Criteria andPackageCountIsNull() {
            addCriterion("package_count is null");
            return (Criteria) this;
        }

        public Criteria andPackageCountIsNotNull() {
            addCriterion("package_count is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCountEqualTo(Integer value) {
            addCriterion("package_count =", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountNotEqualTo(Integer value) {
            addCriterion("package_count <>", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountGreaterThan(Integer value) {
            addCriterion("package_count >", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_count >=", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountLessThan(Integer value) {
            addCriterion("package_count <", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountLessThanOrEqualTo(Integer value) {
            addCriterion("package_count <=", value, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountIn(List<Integer> values) {
            addCriterion("package_count in", values, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountNotIn(List<Integer> values) {
            addCriterion("package_count not in", values, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountBetween(Integer value1, Integer value2) {
            addCriterion("package_count between", value1, value2, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("package_count not between", value1, value2, "packageCount");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNull() {
            addCriterion("package_price is null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNotNull() {
            addCriterion("package_price is not null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceEqualTo(BigDecimal value) {
            addCriterion("package_price =", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotEqualTo(BigDecimal value) {
            addCriterion("package_price <>", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThan(BigDecimal value) {
            addCriterion("package_price >", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_price >=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThan(BigDecimal value) {
            addCriterion("package_price <", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_price <=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIn(List<BigDecimal> values) {
            addCriterion("package_price in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotIn(List<BigDecimal> values) {
            addCriterion("package_price not in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_price between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_price not between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountIsNull() {
            addCriterion("tableware_amount is null");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountIsNotNull() {
            addCriterion("tableware_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountEqualTo(BigDecimal value) {
            addCriterion("tableware_amount =", value, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountNotEqualTo(BigDecimal value) {
            addCriterion("tableware_amount <>", value, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountGreaterThan(BigDecimal value) {
            addCriterion("tableware_amount >", value, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tableware_amount >=", value, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountLessThan(BigDecimal value) {
            addCriterion("tableware_amount <", value, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tableware_amount <=", value, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountIn(List<BigDecimal> values) {
            addCriterion("tableware_amount in", values, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountNotIn(List<BigDecimal> values) {
            addCriterion("tableware_amount not in", values, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tableware_amount between", value1, value2, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andTablewareAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tableware_amount not between", value1, value2, "tablewareAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountIsNull() {
            addCriterion("package_amount is null");
            return (Criteria) this;
        }

        public Criteria andPackageAmountIsNotNull() {
            addCriterion("package_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPackageAmountEqualTo(BigDecimal value) {
            addCriterion("package_amount =", value, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountNotEqualTo(BigDecimal value) {
            addCriterion("package_amount <>", value, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountGreaterThan(BigDecimal value) {
            addCriterion("package_amount >", value, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_amount >=", value, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountLessThan(BigDecimal value) {
            addCriterion("package_amount <", value, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_amount <=", value, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountIn(List<BigDecimal> values) {
            addCriterion("package_amount in", values, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountNotIn(List<BigDecimal> values) {
            addCriterion("package_amount not in", values, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_amount between", value1, value2, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andPackageAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_amount not between", value1, value2, "packageAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountIsNull() {
            addCriterion("delivery_amount is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountIsNotNull() {
            addCriterion("delivery_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountEqualTo(BigDecimal value) {
            addCriterion("delivery_amount =", value, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountNotEqualTo(BigDecimal value) {
            addCriterion("delivery_amount <>", value, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountGreaterThan(BigDecimal value) {
            addCriterion("delivery_amount >", value, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_amount >=", value, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountLessThan(BigDecimal value) {
            addCriterion("delivery_amount <", value, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_amount <=", value, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountIn(List<BigDecimal> values) {
            addCriterion("delivery_amount in", values, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountNotIn(List<BigDecimal> values) {
            addCriterion("delivery_amount not in", values, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_amount between", value1, value2, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_amount not between", value1, value2, "deliveryAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountIsNull() {
            addCriterion("taste_amount is null");
            return (Criteria) this;
        }

        public Criteria andTasteAmountIsNotNull() {
            addCriterion("taste_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTasteAmountEqualTo(BigDecimal value) {
            addCriterion("taste_amount =", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotEqualTo(BigDecimal value) {
            addCriterion("taste_amount <>", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountGreaterThan(BigDecimal value) {
            addCriterion("taste_amount >", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taste_amount >=", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountLessThan(BigDecimal value) {
            addCriterion("taste_amount <", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taste_amount <=", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountIn(List<BigDecimal> values) {
            addCriterion("taste_amount in", values, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotIn(List<BigDecimal> values) {
            addCriterion("taste_amount not in", values, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taste_amount between", value1, value2, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taste_amount not between", value1, value2, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNull() {
            addCriterion("refund_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNotNull() {
            addCriterion("refund_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualTo(String value) {
            addCriterion("refund_reason =", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualTo(String value) {
            addCriterion("refund_reason <>", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThan(String value) {
            addCriterion("refund_reason >", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refund_reason >=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThan(String value) {
            addCriterion("refund_reason <", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualTo(String value) {
            addCriterion("refund_reason <=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLike(String value) {
            addCriterion("refund_reason like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotLike(String value) {
            addCriterion("refund_reason not like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIn(List<String> values) {
            addCriterion("refund_reason in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotIn(List<String> values) {
            addCriterion("refund_reason not in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonBetween(String value1, String value2) {
            addCriterion("refund_reason between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotBetween(String value1, String value2) {
            addCriterion("refund_reason not between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIsNull() {
            addCriterion("refund_price is null");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIsNotNull() {
            addCriterion("refund_price is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPriceEqualTo(BigDecimal value) {
            addCriterion("refund_price =", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotEqualTo(BigDecimal value) {
            addCriterion("refund_price <>", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceGreaterThan(BigDecimal value) {
            addCriterion("refund_price >", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_price >=", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceLessThan(BigDecimal value) {
            addCriterion("refund_price <", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_price <=", value, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceIn(List<BigDecimal> values) {
            addCriterion("refund_price in", values, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotIn(List<BigDecimal> values) {
            addCriterion("refund_price not in", values, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_price between", value1, value2, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_price not between", value1, value2, "refundPrice");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtIsNull() {
            addCriterion("refund_apply_at is null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtIsNotNull() {
            addCriterion("refund_apply_at is not null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtEqualTo(Date value) {
            addCriterion("refund_apply_at =", value, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtNotEqualTo(Date value) {
            addCriterion("refund_apply_at <>", value, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtGreaterThan(Date value) {
            addCriterion("refund_apply_at >", value, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_apply_at >=", value, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtLessThan(Date value) {
            addCriterion("refund_apply_at <", value, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtLessThanOrEqualTo(Date value) {
            addCriterion("refund_apply_at <=", value, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtIn(List<Date> values) {
            addCriterion("refund_apply_at in", values, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtNotIn(List<Date> values) {
            addCriterion("refund_apply_at not in", values, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtBetween(Date value1, Date value2) {
            addCriterion("refund_apply_at between", value1, value2, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundApplyAtNotBetween(Date value1, Date value2) {
            addCriterion("refund_apply_at not between", value1, value2, "refundApplyAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtIsNull() {
            addCriterion("refund_success_at is null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtIsNotNull() {
            addCriterion("refund_success_at is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtEqualTo(Date value) {
            addCriterion("refund_success_at =", value, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtNotEqualTo(Date value) {
            addCriterion("refund_success_at <>", value, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtGreaterThan(Date value) {
            addCriterion("refund_success_at >", value, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_success_at >=", value, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtLessThan(Date value) {
            addCriterion("refund_success_at <", value, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtLessThanOrEqualTo(Date value) {
            addCriterion("refund_success_at <=", value, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtIn(List<Date> values) {
            addCriterion("refund_success_at in", values, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtNotIn(List<Date> values) {
            addCriterion("refund_success_at not in", values, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtBetween(Date value1, Date value2) {
            addCriterion("refund_success_at between", value1, value2, "refundSuccessAt");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessAtNotBetween(Date value1, Date value2) {
            addCriterion("refund_success_at not between", value1, value2, "refundSuccessAt");
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

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Date value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNull() {
            addCriterion("pay_account is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountIsNotNull() {
            addCriterion("pay_account is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountEqualTo(String value) {
            addCriterion("pay_account =", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotEqualTo(String value) {
            addCriterion("pay_account <>", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThan(String value) {
            addCriterion("pay_account >", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("pay_account >=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThan(String value) {
            addCriterion("pay_account <", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLessThanOrEqualTo(String value) {
            addCriterion("pay_account <=", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountLike(String value) {
            addCriterion("pay_account like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotLike(String value) {
            addCriterion("pay_account not like", value, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountIn(List<String> values) {
            addCriterion("pay_account in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotIn(List<String> values) {
            addCriterion("pay_account not in", values, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountBetween(String value1, String value2) {
            addCriterion("pay_account between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPayAccountNotBetween(String value1, String value2) {
            addCriterion("pay_account not between", value1, value2, "payAccount");
            return (Criteria) this;
        }

        public Criteria andPrintNumIsNull() {
            addCriterion("print_num is null");
            return (Criteria) this;
        }

        public Criteria andPrintNumIsNotNull() {
            addCriterion("print_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrintNumEqualTo(Integer value) {
            addCriterion("print_num =", value, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumNotEqualTo(Integer value) {
            addCriterion("print_num <>", value, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumGreaterThan(Integer value) {
            addCriterion("print_num >", value, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("print_num >=", value, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumLessThan(Integer value) {
            addCriterion("print_num <", value, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumLessThanOrEqualTo(Integer value) {
            addCriterion("print_num <=", value, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumIn(List<Integer> values) {
            addCriterion("print_num in", values, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumNotIn(List<Integer> values) {
            addCriterion("print_num not in", values, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumBetween(Integer value1, Integer value2) {
            addCriterion("print_num between", value1, value2, "printNum");
            return (Criteria) this;
        }

        public Criteria andPrintNumNotBetween(Integer value1, Integer value2) {
            addCriterion("print_num not between", value1, value2, "printNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdIsNull() {
            addCriterion("deliveryer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdIsNotNull() {
            addCriterion("deliveryer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdEqualTo(Integer value) {
            addCriterion("deliveryer_id =", value, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdNotEqualTo(Integer value) {
            addCriterion("deliveryer_id <>", value, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdGreaterThan(Integer value) {
            addCriterion("deliveryer_id >", value, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryer_id >=", value, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdLessThan(Integer value) {
            addCriterion("deliveryer_id <", value, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryer_id <=", value, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdIn(List<Integer> values) {
            addCriterion("deliveryer_id in", values, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdNotIn(List<Integer> values) {
            addCriterion("deliveryer_id not in", values, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdBetween(Integer value1, Integer value2) {
            addCriterion("deliveryer_id between", value1, value2, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryer_id not between", value1, value2, "deliveryerId");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtIsNull() {
            addCriterion("deliveryer_at is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtIsNotNull() {
            addCriterion("deliveryer_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtEqualTo(Date value) {
            addCriterion("deliveryer_at =", value, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtNotEqualTo(Date value) {
            addCriterion("deliveryer_at <>", value, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtGreaterThan(Date value) {
            addCriterion("deliveryer_at >", value, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryer_at >=", value, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtLessThan(Date value) {
            addCriterion("deliveryer_at <", value, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtLessThanOrEqualTo(Date value) {
            addCriterion("deliveryer_at <=", value, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtIn(List<Date> values) {
            addCriterion("deliveryer_at in", values, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtNotIn(List<Date> values) {
            addCriterion("deliveryer_at not in", values, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtBetween(Date value1, Date value2) {
            addCriterion("deliveryer_at between", value1, value2, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerAtNotBetween(Date value1, Date value2) {
            addCriterion("deliveryer_at not between", value1, value2, "deliveryerAt");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNull() {
            addCriterion("original_amount is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNotNull() {
            addCriterion("original_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountEqualTo(BigDecimal value) {
            addCriterion("original_amount =", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotEqualTo(BigDecimal value) {
            addCriterion("original_amount <>", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThan(BigDecimal value) {
            addCriterion("original_amount >", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_amount >=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThan(BigDecimal value) {
            addCriterion("original_amount <", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_amount <=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIn(List<BigDecimal> values) {
            addCriterion("original_amount in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotIn(List<BigDecimal> values) {
            addCriterion("original_amount not in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_amount between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_amount not between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNull() {
            addCriterion("sequence_no is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNotNull() {
            addCriterion("sequence_no is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoEqualTo(String value) {
            addCriterion("sequence_no =", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotEqualTo(String value) {
            addCriterion("sequence_no <>", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThan(String value) {
            addCriterion("sequence_no >", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("sequence_no >=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThan(String value) {
            addCriterion("sequence_no <", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThanOrEqualTo(String value) {
            addCriterion("sequence_no <=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLike(String value) {
            addCriterion("sequence_no like", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotLike(String value) {
            addCriterion("sequence_no not like", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIn(List<String> values) {
            addCriterion("sequence_no in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotIn(List<String> values) {
            addCriterion("sequence_no not in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoBetween(String value1, String value2) {
            addCriterion("sequence_no between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotBetween(String value1, String value2) {
            addCriterion("sequence_no not between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdIsNull() {
            addCriterion("delivery_time_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdIsNotNull() {
            addCriterion("delivery_time_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdEqualTo(Integer value) {
            addCriterion("delivery_time_id =", value, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdNotEqualTo(Integer value) {
            addCriterion("delivery_time_id <>", value, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdGreaterThan(Integer value) {
            addCriterion("delivery_time_id >", value, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_id >=", value, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdLessThan(Integer value) {
            addCriterion("delivery_time_id <", value, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_id <=", value, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdIn(List<Integer> values) {
            addCriterion("delivery_time_id in", values, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdNotIn(List<Integer> values) {
            addCriterion("delivery_time_id not in", values, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_id between", value1, value2, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_id not between", value1, value2, "deliveryTimeId");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtIsNull() {
            addCriterion("delivery_start_at is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtIsNotNull() {
            addCriterion("delivery_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtEqualTo(String value) {
            addCriterion("delivery_start_at =", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtNotEqualTo(String value) {
            addCriterion("delivery_start_at <>", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtGreaterThan(String value) {
            addCriterion("delivery_start_at >", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_start_at >=", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtLessThan(String value) {
            addCriterion("delivery_start_at <", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtLessThanOrEqualTo(String value) {
            addCriterion("delivery_start_at <=", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtLike(String value) {
            addCriterion("delivery_start_at like", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtNotLike(String value) {
            addCriterion("delivery_start_at not like", value, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtIn(List<String> values) {
            addCriterion("delivery_start_at in", values, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtNotIn(List<String> values) {
            addCriterion("delivery_start_at not in", values, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtBetween(String value1, String value2) {
            addCriterion("delivery_start_at between", value1, value2, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryStartAtNotBetween(String value1, String value2) {
            addCriterion("delivery_start_at not between", value1, value2, "deliveryStartAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtIsNull() {
            addCriterion("delivery_end_at is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtIsNotNull() {
            addCriterion("delivery_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtEqualTo(String value) {
            addCriterion("delivery_end_at =", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtNotEqualTo(String value) {
            addCriterion("delivery_end_at <>", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtGreaterThan(String value) {
            addCriterion("delivery_end_at >", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_end_at >=", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtLessThan(String value) {
            addCriterion("delivery_end_at <", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtLessThanOrEqualTo(String value) {
            addCriterion("delivery_end_at <=", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtLike(String value) {
            addCriterion("delivery_end_at like", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtNotLike(String value) {
            addCriterion("delivery_end_at not like", value, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtIn(List<String> values) {
            addCriterion("delivery_end_at in", values, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtNotIn(List<String> values) {
            addCriterion("delivery_end_at not in", values, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtBetween(String value1, String value2) {
            addCriterion("delivery_end_at between", value1, value2, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryEndAtNotBetween(String value1, String value2) {
            addCriterion("delivery_end_at not between", value1, value2, "deliveryEndAt");
            return (Criteria) this;
        }

        public Criteria andAddressIdsIsNull() {
            addCriterion("address_ids is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdsIsNotNull() {
            addCriterion("address_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdsEqualTo(String value) {
            addCriterion("address_ids =", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsNotEqualTo(String value) {
            addCriterion("address_ids <>", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsGreaterThan(String value) {
            addCriterion("address_ids >", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsGreaterThanOrEqualTo(String value) {
            addCriterion("address_ids >=", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsLessThan(String value) {
            addCriterion("address_ids <", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsLessThanOrEqualTo(String value) {
            addCriterion("address_ids <=", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsLike(String value) {
            addCriterion("address_ids like", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsNotLike(String value) {
            addCriterion("address_ids not like", value, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsIn(List<String> values) {
            addCriterion("address_ids in", values, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsNotIn(List<String> values) {
            addCriterion("address_ids not in", values, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsBetween(String value1, String value2) {
            addCriterion("address_ids between", value1, value2, "addressIds");
            return (Criteria) this;
        }

        public Criteria andAddressIdsNotBetween(String value1, String value2) {
            addCriterion("address_ids not between", value1, value2, "addressIds");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtIsNull() {
            addCriterion("arrange_deliveryer_at is null");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtIsNotNull() {
            addCriterion("arrange_deliveryer_at is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtEqualTo(Date value) {
            addCriterion("arrange_deliveryer_at =", value, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtNotEqualTo(Date value) {
            addCriterion("arrange_deliveryer_at <>", value, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtGreaterThan(Date value) {
            addCriterion("arrange_deliveryer_at >", value, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtGreaterThanOrEqualTo(Date value) {
            addCriterion("arrange_deliveryer_at >=", value, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtLessThan(Date value) {
            addCriterion("arrange_deliveryer_at <", value, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtLessThanOrEqualTo(Date value) {
            addCriterion("arrange_deliveryer_at <=", value, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtIn(List<Date> values) {
            addCriterion("arrange_deliveryer_at in", values, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtNotIn(List<Date> values) {
            addCriterion("arrange_deliveryer_at not in", values, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtBetween(Date value1, Date value2) {
            addCriterion("arrange_deliveryer_at between", value1, value2, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andArrangeDeliveryerAtNotBetween(Date value1, Date value2) {
            addCriterion("arrange_deliveryer_at not between", value1, value2, "arrangeDeliveryerAt");
            return (Criteria) this;
        }

        public Criteria andReceiptAppIsNull() {
            addCriterion("receipt_app is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAppIsNotNull() {
            addCriterion("receipt_app is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAppEqualTo(String value) {
            addCriterion("receipt_app =", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppNotEqualTo(String value) {
            addCriterion("receipt_app <>", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppGreaterThan(String value) {
            addCriterion("receipt_app >", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_app >=", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppLessThan(String value) {
            addCriterion("receipt_app <", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppLessThanOrEqualTo(String value) {
            addCriterion("receipt_app <=", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppLike(String value) {
            addCriterion("receipt_app like", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppNotLike(String value) {
            addCriterion("receipt_app not like", value, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppIn(List<String> values) {
            addCriterion("receipt_app in", values, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppNotIn(List<String> values) {
            addCriterion("receipt_app not in", values, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppBetween(String value1, String value2) {
            addCriterion("receipt_app between", value1, value2, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andReceiptAppNotBetween(String value1, String value2) {
            addCriterion("receipt_app not between", value1, value2, "receiptApp");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdIsNull() {
            addCriterion("pingxx_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdIsNotNull() {
            addCriterion("pingxx_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdEqualTo(String value) {
            addCriterion("pingxx_order_id =", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdNotEqualTo(String value) {
            addCriterion("pingxx_order_id <>", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdGreaterThan(String value) {
            addCriterion("pingxx_order_id >", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pingxx_order_id >=", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdLessThan(String value) {
            addCriterion("pingxx_order_id <", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pingxx_order_id <=", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdLike(String value) {
            addCriterion("pingxx_order_id like", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdNotLike(String value) {
            addCriterion("pingxx_order_id not like", value, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdIn(List<String> values) {
            addCriterion("pingxx_order_id in", values, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdNotIn(List<String> values) {
            addCriterion("pingxx_order_id not in", values, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdBetween(String value1, String value2) {
            addCriterion("pingxx_order_id between", value1, value2, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andPingxxOrderIdNotBetween(String value1, String value2) {
            addCriterion("pingxx_order_id not between", value1, value2, "pingxxOrderId");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("client_ip is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("client_ip is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("client_ip =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("client_ip <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("client_ip >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("client_ip <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("client_ip <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("client_ip like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("client_ip not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("client_ip in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("client_ip not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("client_ip between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("client_ip not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeIsNull() {
            addCriterion("deliveryer_typee is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeIsNotNull() {
            addCriterion("deliveryer_typee is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeEqualTo(Integer value) {
            addCriterion("deliveryer_typee =", value, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeNotEqualTo(Integer value) {
            addCriterion("deliveryer_typee <>", value, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeGreaterThan(Integer value) {
            addCriterion("deliveryer_typee >", value, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryer_typee >=", value, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeLessThan(Integer value) {
            addCriterion("deliveryer_typee <", value, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryer_typee <=", value, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeIn(List<Integer> values) {
            addCriterion("deliveryer_typee in", values, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeNotIn(List<Integer> values) {
            addCriterion("deliveryer_typee not in", values, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeBetween(Integer value1, Integer value2) {
            addCriterion("deliveryer_typee between", value1, value2, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andDeliveryerTypeeNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryer_typee not between", value1, value2, "deliveryerTypee");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("channel_type is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("channel_type is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(String value) {
            addCriterion("channel_type =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(String value) {
            addCriterion("channel_type <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(String value) {
            addCriterion("channel_type >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_type >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(String value) {
            addCriterion("channel_type <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(String value) {
            addCriterion("channel_type <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLike(String value) {
            addCriterion("channel_type like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotLike(String value) {
            addCriterion("channel_type not like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<String> values) {
            addCriterion("channel_type in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<String> values) {
            addCriterion("channel_type not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(String value1, String value2) {
            addCriterion("channel_type between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(String value1, String value2) {
            addCriterion("channel_type not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNull() {
            addCriterion("restaurant_name is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNotNull() {
            addCriterion("restaurant_name is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameEqualTo(String value) {
            addCriterion("restaurant_name =", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotEqualTo(String value) {
            addCriterion("restaurant_name <>", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThan(String value) {
            addCriterion("restaurant_name >", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_name >=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThan(String value) {
            addCriterion("restaurant_name <", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThanOrEqualTo(String value) {
            addCriterion("restaurant_name <=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLike(String value) {
            addCriterion("restaurant_name like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotLike(String value) {
            addCriterion("restaurant_name not like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIn(List<String> values) {
            addCriterion("restaurant_name in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotIn(List<String> values) {
            addCriterion("restaurant_name not in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameBetween(String value1, String value2) {
            addCriterion("restaurant_name between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotBetween(String value1, String value2) {
            addCriterion("restaurant_name not between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameIsNull() {
            addCriterion("deliveryer_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameIsNotNull() {
            addCriterion("deliveryer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameEqualTo(String value) {
            addCriterion("deliveryer_name =", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameNotEqualTo(String value) {
            addCriterion("deliveryer_name <>", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameGreaterThan(String value) {
            addCriterion("deliveryer_name >", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryer_name >=", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameLessThan(String value) {
            addCriterion("deliveryer_name <", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameLessThanOrEqualTo(String value) {
            addCriterion("deliveryer_name <=", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameLike(String value) {
            addCriterion("deliveryer_name like", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameNotLike(String value) {
            addCriterion("deliveryer_name not like", value, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameIn(List<String> values) {
            addCriterion("deliveryer_name in", values, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameNotIn(List<String> values) {
            addCriterion("deliveryer_name not in", values, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameBetween(String value1, String value2) {
            addCriterion("deliveryer_name between", value1, value2, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerNameNotBetween(String value1, String value2) {
            addCriterion("deliveryer_name not between", value1, value2, "deliveryerName");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneIsNull() {
            addCriterion("deliveryer_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneIsNotNull() {
            addCriterion("deliveryer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneEqualTo(String value) {
            addCriterion("deliveryer_phone =", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneNotEqualTo(String value) {
            addCriterion("deliveryer_phone <>", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneGreaterThan(String value) {
            addCriterion("deliveryer_phone >", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryer_phone >=", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneLessThan(String value) {
            addCriterion("deliveryer_phone <", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneLessThanOrEqualTo(String value) {
            addCriterion("deliveryer_phone <=", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneLike(String value) {
            addCriterion("deliveryer_phone like", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneNotLike(String value) {
            addCriterion("deliveryer_phone not like", value, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneIn(List<String> values) {
            addCriterion("deliveryer_phone in", values, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneNotIn(List<String> values) {
            addCriterion("deliveryer_phone not in", values, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneBetween(String value1, String value2) {
            addCriterion("deliveryer_phone between", value1, value2, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerPhoneNotBetween(String value1, String value2) {
            addCriterion("deliveryer_phone not between", value1, value2, "deliveryerPhone");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtIsNull() {
            addCriterion("deliveryer_received_order_at is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtIsNotNull() {
            addCriterion("deliveryer_received_order_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtEqualTo(Date value) {
            addCriterion("deliveryer_received_order_at =", value, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtNotEqualTo(Date value) {
            addCriterion("deliveryer_received_order_at <>", value, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtGreaterThan(Date value) {
            addCriterion("deliveryer_received_order_at >", value, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryer_received_order_at >=", value, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtLessThan(Date value) {
            addCriterion("deliveryer_received_order_at <", value, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtLessThanOrEqualTo(Date value) {
            addCriterion("deliveryer_received_order_at <=", value, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtIn(List<Date> values) {
            addCriterion("deliveryer_received_order_at in", values, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtNotIn(List<Date> values) {
            addCriterion("deliveryer_received_order_at not in", values, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtBetween(Date value1, Date value2) {
            addCriterion("deliveryer_received_order_at between", value1, value2, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryerReceivedOrderAtNotBetween(Date value1, Date value2) {
            addCriterion("deliveryer_received_order_at not between", value1, value2, "deliveryerReceivedOrderAt");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNull() {
            addCriterion("order_remark is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNotNull() {
            addCriterion("order_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkEqualTo(String value) {
            addCriterion("order_remark =", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotEqualTo(String value) {
            addCriterion("order_remark <>", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThan(String value) {
            addCriterion("order_remark >", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("order_remark >=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThan(String value) {
            addCriterion("order_remark <", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("order_remark <=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLike(String value) {
            addCriterion("order_remark like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotLike(String value) {
            addCriterion("order_remark not like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIn(List<String> values) {
            addCriterion("order_remark in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotIn(List<String> values) {
            addCriterion("order_remark not in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkBetween(String value1, String value2) {
            addCriterion("order_remark between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("order_remark not between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdIsNull() {
            addCriterion("remark_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdIsNotNull() {
            addCriterion("remark_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdEqualTo(Integer value) {
            addCriterion("remark_admin_id =", value, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdNotEqualTo(Integer value) {
            addCriterion("remark_admin_id <>", value, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdGreaterThan(Integer value) {
            addCriterion("remark_admin_id >", value, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark_admin_id >=", value, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdLessThan(Integer value) {
            addCriterion("remark_admin_id <", value, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("remark_admin_id <=", value, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdIn(List<Integer> values) {
            addCriterion("remark_admin_id in", values, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdNotIn(List<Integer> values) {
            addCriterion("remark_admin_id not in", values, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("remark_admin_id between", value1, value2, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andRemarkAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("remark_admin_id not between", value1, value2, "remarkAdminId");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtIsNull() {
            addCriterion("meal_finished_at is null");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtIsNotNull() {
            addCriterion("meal_finished_at is not null");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtEqualTo(Date value) {
            addCriterion("meal_finished_at =", value, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtNotEqualTo(Date value) {
            addCriterion("meal_finished_at <>", value, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtGreaterThan(Date value) {
            addCriterion("meal_finished_at >", value, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("meal_finished_at >=", value, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtLessThan(Date value) {
            addCriterion("meal_finished_at <", value, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtLessThanOrEqualTo(Date value) {
            addCriterion("meal_finished_at <=", value, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtIn(List<Date> values) {
            addCriterion("meal_finished_at in", values, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtNotIn(List<Date> values) {
            addCriterion("meal_finished_at not in", values, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtBetween(Date value1, Date value2) {
            addCriterion("meal_finished_at between", value1, value2, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andMealFinishedAtNotBetween(Date value1, Date value2) {
            addCriterion("meal_finished_at not between", value1, value2, "mealFinishedAt");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeIsNull() {
            addCriterion("delivery_time_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeIsNotNull() {
            addCriterion("delivery_time_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeEqualTo(Integer value) {
            addCriterion("delivery_time_type =", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotEqualTo(Integer value) {
            addCriterion("delivery_time_type <>", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeGreaterThan(Integer value) {
            addCriterion("delivery_time_type >", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_type >=", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeLessThan(Integer value) {
            addCriterion("delivery_time_type <", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_time_type <=", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeIn(List<Integer> values) {
            addCriterion("delivery_time_type in", values, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotIn(List<Integer> values) {
            addCriterion("delivery_time_type not in", values, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_type between", value1, value2, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_time_type not between", value1, value2, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
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