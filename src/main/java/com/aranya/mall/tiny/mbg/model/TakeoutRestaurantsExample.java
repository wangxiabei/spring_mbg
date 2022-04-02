package com.aranya.mall.tiny.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TakeoutRestaurantsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeoutRestaurantsExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andBossIdIsNull() {
            addCriterion("boss_id is null");
            return (Criteria) this;
        }

        public Criteria andBossIdIsNotNull() {
            addCriterion("boss_id is not null");
            return (Criteria) this;
        }

        public Criteria andBossIdEqualTo(Integer value) {
            addCriterion("boss_id =", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdNotEqualTo(Integer value) {
            addCriterion("boss_id <>", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdGreaterThan(Integer value) {
            addCriterion("boss_id >", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("boss_id >=", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdLessThan(Integer value) {
            addCriterion("boss_id <", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdLessThanOrEqualTo(Integer value) {
            addCriterion("boss_id <=", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdIn(List<Integer> values) {
            addCriterion("boss_id in", values, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdNotIn(List<Integer> values) {
            addCriterion("boss_id not in", values, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdBetween(Integer value1, Integer value2) {
            addCriterion("boss_id between", value1, value2, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdNotBetween(Integer value1, Integer value2) {
            addCriterion("boss_id not between", value1, value2, "bossId");
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

        public Criteria andDeliveryFastestTimeIsNull() {
            addCriterion("delivery_fastest_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeIsNotNull() {
            addCriterion("delivery_fastest_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeEqualTo(Integer value) {
            addCriterion("delivery_fastest_time =", value, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeNotEqualTo(Integer value) {
            addCriterion("delivery_fastest_time <>", value, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeGreaterThan(Integer value) {
            addCriterion("delivery_fastest_time >", value, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_fastest_time >=", value, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeLessThan(Integer value) {
            addCriterion("delivery_fastest_time <", value, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_fastest_time <=", value, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeIn(List<Integer> values) {
            addCriterion("delivery_fastest_time in", values, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeNotIn(List<Integer> values) {
            addCriterion("delivery_fastest_time not in", values, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_fastest_time between", value1, value2, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryFastestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_fastest_time not between", value1, value2, "deliveryFastestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeIsNull() {
            addCriterion("delivery_slowest_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeIsNotNull() {
            addCriterion("delivery_slowest_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeEqualTo(Integer value) {
            addCriterion("delivery_slowest_time =", value, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeNotEqualTo(Integer value) {
            addCriterion("delivery_slowest_time <>", value, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeGreaterThan(Integer value) {
            addCriterion("delivery_slowest_time >", value, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_slowest_time >=", value, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeLessThan(Integer value) {
            addCriterion("delivery_slowest_time <", value, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_slowest_time <=", value, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeIn(List<Integer> values) {
            addCriterion("delivery_slowest_time in", values, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeNotIn(List<Integer> values) {
            addCriterion("delivery_slowest_time not in", values, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeBetween(Integer value1, Integer value2) {
            addCriterion("delivery_slowest_time between", value1, value2, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andDeliverySlowestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_slowest_time not between", value1, value2, "deliverySlowestTime");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastIsNull() {
            addCriterion("is_breakfast is null");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastIsNotNull() {
            addCriterion("is_breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastEqualTo(Integer value) {
            addCriterion("is_breakfast =", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotEqualTo(Integer value) {
            addCriterion("is_breakfast <>", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastGreaterThan(Integer value) {
            addCriterion("is_breakfast >", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_breakfast >=", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastLessThan(Integer value) {
            addCriterion("is_breakfast <", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastLessThanOrEqualTo(Integer value) {
            addCriterion("is_breakfast <=", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastIn(List<Integer> values) {
            addCriterion("is_breakfast in", values, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotIn(List<Integer> values) {
            addCriterion("is_breakfast not in", values, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastBetween(Integer value1, Integer value2) {
            addCriterion("is_breakfast between", value1, value2, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotBetween(Integer value1, Integer value2) {
            addCriterion("is_breakfast not between", value1, value2, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsLunchIsNull() {
            addCriterion("is_lunch is null");
            return (Criteria) this;
        }

        public Criteria andIsLunchIsNotNull() {
            addCriterion("is_lunch is not null");
            return (Criteria) this;
        }

        public Criteria andIsLunchEqualTo(Integer value) {
            addCriterion("is_lunch =", value, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchNotEqualTo(Integer value) {
            addCriterion("is_lunch <>", value, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchGreaterThan(Integer value) {
            addCriterion("is_lunch >", value, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_lunch >=", value, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchLessThan(Integer value) {
            addCriterion("is_lunch <", value, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchLessThanOrEqualTo(Integer value) {
            addCriterion("is_lunch <=", value, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchIn(List<Integer> values) {
            addCriterion("is_lunch in", values, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchNotIn(List<Integer> values) {
            addCriterion("is_lunch not in", values, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchBetween(Integer value1, Integer value2) {
            addCriterion("is_lunch between", value1, value2, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsLunchNotBetween(Integer value1, Integer value2) {
            addCriterion("is_lunch not between", value1, value2, "isLunch");
            return (Criteria) this;
        }

        public Criteria andIsDinnerIsNull() {
            addCriterion("is_dinner is null");
            return (Criteria) this;
        }

        public Criteria andIsDinnerIsNotNull() {
            addCriterion("is_dinner is not null");
            return (Criteria) this;
        }

        public Criteria andIsDinnerEqualTo(Integer value) {
            addCriterion("is_dinner =", value, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerNotEqualTo(Integer value) {
            addCriterion("is_dinner <>", value, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerGreaterThan(Integer value) {
            addCriterion("is_dinner >", value, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_dinner >=", value, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerLessThan(Integer value) {
            addCriterion("is_dinner <", value, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerLessThanOrEqualTo(Integer value) {
            addCriterion("is_dinner <=", value, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerIn(List<Integer> values) {
            addCriterion("is_dinner in", values, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerNotIn(List<Integer> values) {
            addCriterion("is_dinner not in", values, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerBetween(Integer value1, Integer value2) {
            addCriterion("is_dinner between", value1, value2, "isDinner");
            return (Criteria) this;
        }

        public Criteria andIsDinnerNotBetween(Integer value1, Integer value2) {
            addCriterion("is_dinner not between", value1, value2, "isDinner");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtIsNull() {
            addCriterion("breakfast_start_at is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtIsNotNull() {
            addCriterion("breakfast_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_start_at =", value, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtNotEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_start_at <>", value, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtGreaterThan(Date value) {
            addCriterionForJDBCTime("breakfast_start_at >", value, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_start_at >=", value, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtLessThan(Date value) {
            addCriterionForJDBCTime("breakfast_start_at <", value, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_start_at <=", value, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtIn(List<Date> values) {
            addCriterionForJDBCTime("breakfast_start_at in", values, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtNotIn(List<Date> values) {
            addCriterionForJDBCTime("breakfast_start_at not in", values, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("breakfast_start_at between", value1, value2, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastStartAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("breakfast_start_at not between", value1, value2, "breakfastStartAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtIsNull() {
            addCriterion("breakfast_end_at is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtIsNotNull() {
            addCriterion("breakfast_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_end_at =", value, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtNotEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_end_at <>", value, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtGreaterThan(Date value) {
            addCriterionForJDBCTime("breakfast_end_at >", value, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_end_at >=", value, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtLessThan(Date value) {
            addCriterionForJDBCTime("breakfast_end_at <", value, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("breakfast_end_at <=", value, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtIn(List<Date> values) {
            addCriterionForJDBCTime("breakfast_end_at in", values, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtNotIn(List<Date> values) {
            addCriterionForJDBCTime("breakfast_end_at not in", values, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("breakfast_end_at between", value1, value2, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andBreakfastEndAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("breakfast_end_at not between", value1, value2, "breakfastEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtIsNull() {
            addCriterion("lunch_start_at is null");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtIsNotNull() {
            addCriterion("lunch_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_start_at =", value, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtNotEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_start_at <>", value, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtGreaterThan(Date value) {
            addCriterionForJDBCTime("lunch_start_at >", value, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_start_at >=", value, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtLessThan(Date value) {
            addCriterionForJDBCTime("lunch_start_at <", value, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_start_at <=", value, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtIn(List<Date> values) {
            addCriterionForJDBCTime("lunch_start_at in", values, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtNotIn(List<Date> values) {
            addCriterionForJDBCTime("lunch_start_at not in", values, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lunch_start_at between", value1, value2, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchStartAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lunch_start_at not between", value1, value2, "lunchStartAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtIsNull() {
            addCriterion("lunch_end_at is null");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtIsNotNull() {
            addCriterion("lunch_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_end_at =", value, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtNotEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_end_at <>", value, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtGreaterThan(Date value) {
            addCriterionForJDBCTime("lunch_end_at >", value, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_end_at >=", value, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtLessThan(Date value) {
            addCriterionForJDBCTime("lunch_end_at <", value, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lunch_end_at <=", value, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtIn(List<Date> values) {
            addCriterionForJDBCTime("lunch_end_at in", values, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtNotIn(List<Date> values) {
            addCriterionForJDBCTime("lunch_end_at not in", values, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lunch_end_at between", value1, value2, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andLunchEndAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lunch_end_at not between", value1, value2, "lunchEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtIsNull() {
            addCriterion("dinner_start_at is null");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtIsNotNull() {
            addCriterion("dinner_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_start_at =", value, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtNotEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_start_at <>", value, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtGreaterThan(Date value) {
            addCriterionForJDBCTime("dinner_start_at >", value, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_start_at >=", value, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtLessThan(Date value) {
            addCriterionForJDBCTime("dinner_start_at <", value, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_start_at <=", value, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtIn(List<Date> values) {
            addCriterionForJDBCTime("dinner_start_at in", values, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtNotIn(List<Date> values) {
            addCriterionForJDBCTime("dinner_start_at not in", values, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("dinner_start_at between", value1, value2, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerStartAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("dinner_start_at not between", value1, value2, "dinnerStartAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtIsNull() {
            addCriterion("dinner_end_at is null");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtIsNotNull() {
            addCriterion("dinner_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_end_at =", value, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtNotEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_end_at <>", value, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtGreaterThan(Date value) {
            addCriterionForJDBCTime("dinner_end_at >", value, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_end_at >=", value, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtLessThan(Date value) {
            addCriterionForJDBCTime("dinner_end_at <", value, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("dinner_end_at <=", value, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtIn(List<Date> values) {
            addCriterionForJDBCTime("dinner_end_at in", values, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtNotIn(List<Date> values) {
            addCriterionForJDBCTime("dinner_end_at not in", values, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("dinner_end_at between", value1, value2, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andDinnerEndAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("dinner_end_at not between", value1, value2, "dinnerEndAt");
            return (Criteria) this;
        }

        public Criteria andOverallStarIsNull() {
            addCriterion("overall_star is null");
            return (Criteria) this;
        }

        public Criteria andOverallStarIsNotNull() {
            addCriterion("overall_star is not null");
            return (Criteria) this;
        }

        public Criteria andOverallStarEqualTo(Integer value) {
            addCriterion("overall_star =", value, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarNotEqualTo(Integer value) {
            addCriterion("overall_star <>", value, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarGreaterThan(Integer value) {
            addCriterion("overall_star >", value, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("overall_star >=", value, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarLessThan(Integer value) {
            addCriterion("overall_star <", value, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarLessThanOrEqualTo(Integer value) {
            addCriterion("overall_star <=", value, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarIn(List<Integer> values) {
            addCriterion("overall_star in", values, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarNotIn(List<Integer> values) {
            addCriterion("overall_star not in", values, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarBetween(Integer value1, Integer value2) {
            addCriterion("overall_star between", value1, value2, "overallStar");
            return (Criteria) this;
        }

        public Criteria andOverallStarNotBetween(Integer value1, Integer value2) {
            addCriterion("overall_star not between", value1, value2, "overallStar");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
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

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNull() {
            addCriterion("big_img is null");
            return (Criteria) this;
        }

        public Criteria andBigImgIsNotNull() {
            addCriterion("big_img is not null");
            return (Criteria) this;
        }

        public Criteria andBigImgEqualTo(String value) {
            addCriterion("big_img =", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotEqualTo(String value) {
            addCriterion("big_img <>", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThan(String value) {
            addCriterion("big_img >", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgGreaterThanOrEqualTo(String value) {
            addCriterion("big_img >=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThan(String value) {
            addCriterion("big_img <", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLessThanOrEqualTo(String value) {
            addCriterion("big_img <=", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgLike(String value) {
            addCriterion("big_img like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotLike(String value) {
            addCriterion("big_img not like", value, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgIn(List<String> values) {
            addCriterion("big_img in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotIn(List<String> values) {
            addCriterion("big_img not in", values, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgBetween(String value1, String value2) {
            addCriterion("big_img between", value1, value2, "bigImg");
            return (Criteria) this;
        }

        public Criteria andBigImgNotBetween(String value1, String value2) {
            addCriterion("big_img not between", value1, value2, "bigImg");
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

        public Criteria andTakeoutRuleIsNull() {
            addCriterion("takeout_rule is null");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleIsNotNull() {
            addCriterion("takeout_rule is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleEqualTo(String value) {
            addCriterion("takeout_rule =", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleNotEqualTo(String value) {
            addCriterion("takeout_rule <>", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleGreaterThan(String value) {
            addCriterion("takeout_rule >", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleGreaterThanOrEqualTo(String value) {
            addCriterion("takeout_rule >=", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleLessThan(String value) {
            addCriterion("takeout_rule <", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleLessThanOrEqualTo(String value) {
            addCriterion("takeout_rule <=", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleLike(String value) {
            addCriterion("takeout_rule like", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleNotLike(String value) {
            addCriterion("takeout_rule not like", value, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleIn(List<String> values) {
            addCriterion("takeout_rule in", values, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleNotIn(List<String> values) {
            addCriterion("takeout_rule not in", values, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleBetween(String value1, String value2) {
            addCriterion("takeout_rule between", value1, value2, "takeoutRule");
            return (Criteria) this;
        }

        public Criteria andTakeoutRuleNotBetween(String value1, String value2) {
            addCriterion("takeout_rule not between", value1, value2, "takeoutRule");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Integer value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Integer value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Integer value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Integer value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Integer> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Integer> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
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

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameIsNull() {
            addCriterion("breakfast_name is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameIsNotNull() {
            addCriterion("breakfast_name is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameEqualTo(String value) {
            addCriterion("breakfast_name =", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameNotEqualTo(String value) {
            addCriterion("breakfast_name <>", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameGreaterThan(String value) {
            addCriterion("breakfast_name >", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameGreaterThanOrEqualTo(String value) {
            addCriterion("breakfast_name >=", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameLessThan(String value) {
            addCriterion("breakfast_name <", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameLessThanOrEqualTo(String value) {
            addCriterion("breakfast_name <=", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameLike(String value) {
            addCriterion("breakfast_name like", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameNotLike(String value) {
            addCriterion("breakfast_name not like", value, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameIn(List<String> values) {
            addCriterion("breakfast_name in", values, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameNotIn(List<String> values) {
            addCriterion("breakfast_name not in", values, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameBetween(String value1, String value2) {
            addCriterion("breakfast_name between", value1, value2, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andBreakfastNameNotBetween(String value1, String value2) {
            addCriterion("breakfast_name not between", value1, value2, "breakfastName");
            return (Criteria) this;
        }

        public Criteria andLunchNameIsNull() {
            addCriterion("lunch_name is null");
            return (Criteria) this;
        }

        public Criteria andLunchNameIsNotNull() {
            addCriterion("lunch_name is not null");
            return (Criteria) this;
        }

        public Criteria andLunchNameEqualTo(String value) {
            addCriterion("lunch_name =", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameNotEqualTo(String value) {
            addCriterion("lunch_name <>", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameGreaterThan(String value) {
            addCriterion("lunch_name >", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameGreaterThanOrEqualTo(String value) {
            addCriterion("lunch_name >=", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameLessThan(String value) {
            addCriterion("lunch_name <", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameLessThanOrEqualTo(String value) {
            addCriterion("lunch_name <=", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameLike(String value) {
            addCriterion("lunch_name like", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameNotLike(String value) {
            addCriterion("lunch_name not like", value, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameIn(List<String> values) {
            addCriterion("lunch_name in", values, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameNotIn(List<String> values) {
            addCriterion("lunch_name not in", values, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameBetween(String value1, String value2) {
            addCriterion("lunch_name between", value1, value2, "lunchName");
            return (Criteria) this;
        }

        public Criteria andLunchNameNotBetween(String value1, String value2) {
            addCriterion("lunch_name not between", value1, value2, "lunchName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameIsNull() {
            addCriterion("dinner_name is null");
            return (Criteria) this;
        }

        public Criteria andDinnerNameIsNotNull() {
            addCriterion("dinner_name is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerNameEqualTo(String value) {
            addCriterion("dinner_name =", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameNotEqualTo(String value) {
            addCriterion("dinner_name <>", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameGreaterThan(String value) {
            addCriterion("dinner_name >", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dinner_name >=", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameLessThan(String value) {
            addCriterion("dinner_name <", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameLessThanOrEqualTo(String value) {
            addCriterion("dinner_name <=", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameLike(String value) {
            addCriterion("dinner_name like", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameNotLike(String value) {
            addCriterion("dinner_name not like", value, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameIn(List<String> values) {
            addCriterion("dinner_name in", values, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameNotIn(List<String> values) {
            addCriterion("dinner_name not in", values, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameBetween(String value1, String value2) {
            addCriterion("dinner_name between", value1, value2, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andDinnerNameNotBetween(String value1, String value2) {
            addCriterion("dinner_name not between", value1, value2, "dinnerName");
            return (Criteria) this;
        }

        public Criteria andListImgIsNull() {
            addCriterion("list_img is null");
            return (Criteria) this;
        }

        public Criteria andListImgIsNotNull() {
            addCriterion("list_img is not null");
            return (Criteria) this;
        }

        public Criteria andListImgEqualTo(String value) {
            addCriterion("list_img =", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotEqualTo(String value) {
            addCriterion("list_img <>", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgGreaterThan(String value) {
            addCriterion("list_img >", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgGreaterThanOrEqualTo(String value) {
            addCriterion("list_img >=", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgLessThan(String value) {
            addCriterion("list_img <", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgLessThanOrEqualTo(String value) {
            addCriterion("list_img <=", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgLike(String value) {
            addCriterion("list_img like", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotLike(String value) {
            addCriterion("list_img not like", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgIn(List<String> values) {
            addCriterion("list_img in", values, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotIn(List<String> values) {
            addCriterion("list_img not in", values, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgBetween(String value1, String value2) {
            addCriterion("list_img between", value1, value2, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotBetween(String value1, String value2) {
            addCriterion("list_img not between", value1, value2, "listImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgIsNull() {
            addCriterion("detail_img is null");
            return (Criteria) this;
        }

        public Criteria andDetailImgIsNotNull() {
            addCriterion("detail_img is not null");
            return (Criteria) this;
        }

        public Criteria andDetailImgEqualTo(String value) {
            addCriterion("detail_img =", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgNotEqualTo(String value) {
            addCriterion("detail_img <>", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgGreaterThan(String value) {
            addCriterion("detail_img >", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgGreaterThanOrEqualTo(String value) {
            addCriterion("detail_img >=", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgLessThan(String value) {
            addCriterion("detail_img <", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgLessThanOrEqualTo(String value) {
            addCriterion("detail_img <=", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgLike(String value) {
            addCriterion("detail_img like", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgNotLike(String value) {
            addCriterion("detail_img not like", value, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgIn(List<String> values) {
            addCriterion("detail_img in", values, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgNotIn(List<String> values) {
            addCriterion("detail_img not in", values, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgBetween(String value1, String value2) {
            addCriterion("detail_img between", value1, value2, "detailImg");
            return (Criteria) this;
        }

        public Criteria andDetailImgNotBetween(String value1, String value2) {
            addCriterion("detail_img not between", value1, value2, "detailImg");
            return (Criteria) this;
        }

        public Criteria andSalesNumIsNull() {
            addCriterion("sales_num is null");
            return (Criteria) this;
        }

        public Criteria andSalesNumIsNotNull() {
            addCriterion("sales_num is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNumEqualTo(Integer value) {
            addCriterion("sales_num =", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotEqualTo(Integer value) {
            addCriterion("sales_num <>", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumGreaterThan(Integer value) {
            addCriterion("sales_num >", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_num >=", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLessThan(Integer value) {
            addCriterion("sales_num <", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumLessThanOrEqualTo(Integer value) {
            addCriterion("sales_num <=", value, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumIn(List<Integer> values) {
            addCriterion("sales_num in", values, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotIn(List<Integer> values) {
            addCriterion("sales_num not in", values, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumBetween(Integer value1, Integer value2) {
            addCriterion("sales_num between", value1, value2, "salesNum");
            return (Criteria) this;
        }

        public Criteria andSalesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_num not between", value1, value2, "salesNum");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(Integer value) {
            addCriterion("online_status =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(Integer value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(Integer value) {
            addCriterion("online_status >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(Integer value) {
            addCriterion("online_status <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<Integer> values) {
            addCriterion("online_status in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<Integer> values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(Integer value1, Integer value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceIsNull() {
            addCriterion("order_min_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceIsNotNull() {
            addCriterion("order_min_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceEqualTo(BigDecimal value) {
            addCriterion("order_min_price =", value, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_min_price <>", value, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceGreaterThan(BigDecimal value) {
            addCriterion("order_min_price >", value, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_min_price >=", value, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceLessThan(BigDecimal value) {
            addCriterion("order_min_price <", value, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_min_price <=", value, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceIn(List<BigDecimal> values) {
            addCriterion("order_min_price in", values, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_min_price not in", values, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_min_price between", value1, value2, "orderMinPrice");
            return (Criteria) this;
        }

        public Criteria andOrderMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_min_price not between", value1, value2, "orderMinPrice");
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

        public Criteria andDeliveryTypeEqualTo(Object value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Object value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Object value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Object value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Object value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Object> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Object> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Object value1, Object value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Object value1, Object value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andPickPlaceIsNull() {
            addCriterion("pick_place is null");
            return (Criteria) this;
        }

        public Criteria andPickPlaceIsNotNull() {
            addCriterion("pick_place is not null");
            return (Criteria) this;
        }

        public Criteria andPickPlaceEqualTo(String value) {
            addCriterion("pick_place =", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotEqualTo(String value) {
            addCriterion("pick_place <>", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceGreaterThan(String value) {
            addCriterion("pick_place >", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("pick_place >=", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceLessThan(String value) {
            addCriterion("pick_place <", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceLessThanOrEqualTo(String value) {
            addCriterion("pick_place <=", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceLike(String value) {
            addCriterion("pick_place like", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotLike(String value) {
            addCriterion("pick_place not like", value, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceIn(List<String> values) {
            addCriterion("pick_place in", values, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotIn(List<String> values) {
            addCriterion("pick_place not in", values, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceBetween(String value1, String value2) {
            addCriterion("pick_place between", value1, value2, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickPlaceNotBetween(String value1, String value2) {
            addCriterion("pick_place not between", value1, value2, "pickPlace");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeIsNull() {
            addCriterion("pick_time_type is null");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeIsNotNull() {
            addCriterion("pick_time_type is not null");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeEqualTo(Integer value) {
            addCriterion("pick_time_type =", value, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeNotEqualTo(Integer value) {
            addCriterion("pick_time_type <>", value, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeGreaterThan(Integer value) {
            addCriterion("pick_time_type >", value, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pick_time_type >=", value, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeLessThan(Integer value) {
            addCriterion("pick_time_type <", value, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pick_time_type <=", value, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeIn(List<Integer> values) {
            addCriterion("pick_time_type in", values, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeNotIn(List<Integer> values) {
            addCriterion("pick_time_type not in", values, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("pick_time_type between", value1, value2, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andPickTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pick_time_type not between", value1, value2, "pickTimeType");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIsNull() {
            addCriterion("project_source is null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIsNotNull() {
            addCriterion("project_source is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSourceEqualTo(String value) {
            addCriterion("project_source =", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotEqualTo(String value) {
            addCriterion("project_source <>", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceGreaterThan(String value) {
            addCriterion("project_source >", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceGreaterThanOrEqualTo(String value) {
            addCriterion("project_source >=", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLessThan(String value) {
            addCriterion("project_source <", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLessThanOrEqualTo(String value) {
            addCriterion("project_source <=", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceLike(String value) {
            addCriterion("project_source like", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotLike(String value) {
            addCriterion("project_source not like", value, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceIn(List<String> values) {
            addCriterion("project_source in", values, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotIn(List<String> values) {
            addCriterion("project_source not in", values, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceBetween(String value1, String value2) {
            addCriterion("project_source between", value1, value2, "projectSource");
            return (Criteria) this;
        }

        public Criteria andProjectSourceNotBetween(String value1, String value2) {
            addCriterion("project_source not between", value1, value2, "projectSource");
            return (Criteria) this;
        }

        public Criteria andOrderListImgIsNull() {
            addCriterion("order_list_img is null");
            return (Criteria) this;
        }

        public Criteria andOrderListImgIsNotNull() {
            addCriterion("order_list_img is not null");
            return (Criteria) this;
        }

        public Criteria andOrderListImgEqualTo(String value) {
            addCriterion("order_list_img =", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgNotEqualTo(String value) {
            addCriterion("order_list_img <>", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgGreaterThan(String value) {
            addCriterion("order_list_img >", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgGreaterThanOrEqualTo(String value) {
            addCriterion("order_list_img >=", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgLessThan(String value) {
            addCriterion("order_list_img <", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgLessThanOrEqualTo(String value) {
            addCriterion("order_list_img <=", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgLike(String value) {
            addCriterion("order_list_img like", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgNotLike(String value) {
            addCriterion("order_list_img not like", value, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgIn(List<String> values) {
            addCriterion("order_list_img in", values, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgNotIn(List<String> values) {
            addCriterion("order_list_img not in", values, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgBetween(String value1, String value2) {
            addCriterion("order_list_img between", value1, value2, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andOrderListImgNotBetween(String value1, String value2) {
            addCriterion("order_list_img not between", value1, value2, "orderListImg");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescIsNull() {
            addCriterion("business_times_desc is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescIsNotNull() {
            addCriterion("business_times_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescEqualTo(String value) {
            addCriterion("business_times_desc =", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescNotEqualTo(String value) {
            addCriterion("business_times_desc <>", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescGreaterThan(String value) {
            addCriterion("business_times_desc >", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescGreaterThanOrEqualTo(String value) {
            addCriterion("business_times_desc >=", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescLessThan(String value) {
            addCriterion("business_times_desc <", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescLessThanOrEqualTo(String value) {
            addCriterion("business_times_desc <=", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescLike(String value) {
            addCriterion("business_times_desc like", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescNotLike(String value) {
            addCriterion("business_times_desc not like", value, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescIn(List<String> values) {
            addCriterion("business_times_desc in", values, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescNotIn(List<String> values) {
            addCriterion("business_times_desc not in", values, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescBetween(String value1, String value2) {
            addCriterion("business_times_desc between", value1, value2, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessTimesDescNotBetween(String value1, String value2) {
            addCriterion("business_times_desc not between", value1, value2, "businessTimesDesc");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentIsNull() {
            addCriterion("online_status_content is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentIsNotNull() {
            addCriterion("online_status_content is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentEqualTo(String value) {
            addCriterion("online_status_content =", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentNotEqualTo(String value) {
            addCriterion("online_status_content <>", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentGreaterThan(String value) {
            addCriterion("online_status_content >", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentGreaterThanOrEqualTo(String value) {
            addCriterion("online_status_content >=", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentLessThan(String value) {
            addCriterion("online_status_content <", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentLessThanOrEqualTo(String value) {
            addCriterion("online_status_content <=", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentLike(String value) {
            addCriterion("online_status_content like", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentNotLike(String value) {
            addCriterion("online_status_content not like", value, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentIn(List<String> values) {
            addCriterion("online_status_content in", values, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentNotIn(List<String> values) {
            addCriterion("online_status_content not in", values, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentBetween(String value1, String value2) {
            addCriterion("online_status_content between", value1, value2, "onlineStatusContent");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusContentNotBetween(String value1, String value2) {
            addCriterion("online_status_content not between", value1, value2, "onlineStatusContent");
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

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
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

        public Criteria andRemarkPlaceholderIsNull() {
            addCriterion("remark_placeholder is null");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderIsNotNull() {
            addCriterion("remark_placeholder is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderEqualTo(String value) {
            addCriterion("remark_placeholder =", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderNotEqualTo(String value) {
            addCriterion("remark_placeholder <>", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderGreaterThan(String value) {
            addCriterion("remark_placeholder >", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderGreaterThanOrEqualTo(String value) {
            addCriterion("remark_placeholder >=", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderLessThan(String value) {
            addCriterion("remark_placeholder <", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderLessThanOrEqualTo(String value) {
            addCriterion("remark_placeholder <=", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderLike(String value) {
            addCriterion("remark_placeholder like", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderNotLike(String value) {
            addCriterion("remark_placeholder not like", value, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderIn(List<String> values) {
            addCriterion("remark_placeholder in", values, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderNotIn(List<String> values) {
            addCriterion("remark_placeholder not in", values, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderBetween(String value1, String value2) {
            addCriterion("remark_placeholder between", value1, value2, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkPlaceholderNotBetween(String value1, String value2) {
            addCriterion("remark_placeholder not between", value1, value2, "remarkPlaceholder");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireIsNull() {
            addCriterion("remark_is_require is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireIsNotNull() {
            addCriterion("remark_is_require is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireEqualTo(Integer value) {
            addCriterion("remark_is_require =", value, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireNotEqualTo(Integer value) {
            addCriterion("remark_is_require <>", value, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireGreaterThan(Integer value) {
            addCriterion("remark_is_require >", value, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark_is_require >=", value, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireLessThan(Integer value) {
            addCriterion("remark_is_require <", value, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireLessThanOrEqualTo(Integer value) {
            addCriterion("remark_is_require <=", value, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireIn(List<Integer> values) {
            addCriterion("remark_is_require in", values, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireNotIn(List<Integer> values) {
            addCriterion("remark_is_require not in", values, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireBetween(Integer value1, Integer value2) {
            addCriterion("remark_is_require between", value1, value2, "remarkIsRequire");
            return (Criteria) this;
        }

        public Criteria andRemarkIsRequireNotBetween(Integer value1, Integer value2) {
            addCriterion("remark_is_require not between", value1, value2, "remarkIsRequire");
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

        public Criteria andTakeFoodDateIsNull() {
            addCriterion("take_food_date is null");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateIsNotNull() {
            addCriterion("take_food_date is not null");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateEqualTo(String value) {
            addCriterion("take_food_date =", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateNotEqualTo(String value) {
            addCriterion("take_food_date <>", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateGreaterThan(String value) {
            addCriterion("take_food_date >", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateGreaterThanOrEqualTo(String value) {
            addCriterion("take_food_date >=", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateLessThan(String value) {
            addCriterion("take_food_date <", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateLessThanOrEqualTo(String value) {
            addCriterion("take_food_date <=", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateLike(String value) {
            addCriterion("take_food_date like", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateNotLike(String value) {
            addCriterion("take_food_date not like", value, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateIn(List<String> values) {
            addCriterion("take_food_date in", values, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateNotIn(List<String> values) {
            addCriterion("take_food_date not in", values, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateBetween(String value1, String value2) {
            addCriterion("take_food_date between", value1, value2, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andTakeFoodDateNotBetween(String value1, String value2) {
            addCriterion("take_food_date not between", value1, value2, "takeFoodDate");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeIsNull() {
            addCriterion("dinner_type is null");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeIsNotNull() {
            addCriterion("dinner_type is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeEqualTo(Integer value) {
            addCriterion("dinner_type =", value, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeNotEqualTo(Integer value) {
            addCriterion("dinner_type <>", value, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeGreaterThan(Integer value) {
            addCriterion("dinner_type >", value, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinner_type >=", value, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeLessThan(Integer value) {
            addCriterion("dinner_type <", value, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dinner_type <=", value, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeIn(List<Integer> values) {
            addCriterion("dinner_type in", values, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeNotIn(List<Integer> values) {
            addCriterion("dinner_type not in", values, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeBetween(Integer value1, Integer value2) {
            addCriterion("dinner_type between", value1, value2, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dinner_type not between", value1, value2, "dinnerType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeIsNull() {
            addCriterion("dinner_pay_type is null");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeIsNotNull() {
            addCriterion("dinner_pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeEqualTo(Integer value) {
            addCriterion("dinner_pay_type =", value, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeNotEqualTo(Integer value) {
            addCriterion("dinner_pay_type <>", value, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeGreaterThan(Integer value) {
            addCriterion("dinner_pay_type >", value, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinner_pay_type >=", value, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeLessThan(Integer value) {
            addCriterion("dinner_pay_type <", value, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dinner_pay_type <=", value, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeIn(List<Integer> values) {
            addCriterion("dinner_pay_type in", values, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeNotIn(List<Integer> values) {
            addCriterion("dinner_pay_type not in", values, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("dinner_pay_type between", value1, value2, "dinnerPayType");
            return (Criteria) this;
        }

        public Criteria andDinnerPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dinner_pay_type not between", value1, value2, "dinnerPayType");
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