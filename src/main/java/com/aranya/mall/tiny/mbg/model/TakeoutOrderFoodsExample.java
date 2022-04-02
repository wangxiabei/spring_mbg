package com.aranya.mall.tiny.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakeoutOrderFoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TakeoutOrderFoodsExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
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

        public Criteria andSubnameIsNull() {
            addCriterion("subname is null");
            return (Criteria) this;
        }

        public Criteria andSubnameIsNotNull() {
            addCriterion("subname is not null");
            return (Criteria) this;
        }

        public Criteria andSubnameEqualTo(String value) {
            addCriterion("subname =", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotEqualTo(String value) {
            addCriterion("subname <>", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThan(String value) {
            addCriterion("subname >", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("subname >=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThan(String value) {
            addCriterion("subname <", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLessThanOrEqualTo(String value) {
            addCriterion("subname <=", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameLike(String value) {
            addCriterion("subname like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotLike(String value) {
            addCriterion("subname not like", value, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameIn(List<String> values) {
            addCriterion("subname in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotIn(List<String> values) {
            addCriterion("subname not in", values, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameBetween(String value1, String value2) {
            addCriterion("subname between", value1, value2, "subname");
            return (Criteria) this;
        }

        public Criteria andSubnameNotBetween(String value1, String value2) {
            addCriterion("subname not between", value1, value2, "subname");
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

        public Criteria andTypeeIsNull() {
            addCriterion("typee is null");
            return (Criteria) this;
        }

        public Criteria andTypeeIsNotNull() {
            addCriterion("typee is not null");
            return (Criteria) this;
        }

        public Criteria andTypeeEqualTo(Integer value) {
            addCriterion("typee =", value, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeNotEqualTo(Integer value) {
            addCriterion("typee <>", value, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeGreaterThan(Integer value) {
            addCriterion("typee >", value, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("typee >=", value, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeLessThan(Integer value) {
            addCriterion("typee <", value, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeLessThanOrEqualTo(Integer value) {
            addCriterion("typee <=", value, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeIn(List<Integer> values) {
            addCriterion("typee in", values, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeNotIn(List<Integer> values) {
            addCriterion("typee not in", values, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeBetween(Integer value1, Integer value2) {
            addCriterion("typee between", value1, value2, "typee");
            return (Criteria) this;
        }

        public Criteria andTypeeNotBetween(Integer value1, Integer value2) {
            addCriterion("typee not between", value1, value2, "typee");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("open_type is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("open_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(Integer value) {
            addCriterion("open_type =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(Integer value) {
            addCriterion("open_type <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(Integer value) {
            addCriterion("open_type >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_type >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(Integer value) {
            addCriterion("open_type <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(Integer value) {
            addCriterion("open_type <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<Integer> values) {
            addCriterion("open_type in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<Integer> values) {
            addCriterion("open_type not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(Integer value1, Integer value2) {
            addCriterion("open_type between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("open_type not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andStoryTitleIsNull() {
            addCriterion("story_title is null");
            return (Criteria) this;
        }

        public Criteria andStoryTitleIsNotNull() {
            addCriterion("story_title is not null");
            return (Criteria) this;
        }

        public Criteria andStoryTitleEqualTo(String value) {
            addCriterion("story_title =", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotEqualTo(String value) {
            addCriterion("story_title <>", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleGreaterThan(String value) {
            addCriterion("story_title >", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("story_title >=", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleLessThan(String value) {
            addCriterion("story_title <", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleLessThanOrEqualTo(String value) {
            addCriterion("story_title <=", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleLike(String value) {
            addCriterion("story_title like", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotLike(String value) {
            addCriterion("story_title not like", value, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleIn(List<String> values) {
            addCriterion("story_title in", values, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotIn(List<String> values) {
            addCriterion("story_title not in", values, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleBetween(String value1, String value2) {
            addCriterion("story_title between", value1, value2, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryTitleNotBetween(String value1, String value2) {
            addCriterion("story_title not between", value1, value2, "storyTitle");
            return (Criteria) this;
        }

        public Criteria andStoryContentIsNull() {
            addCriterion("story_content is null");
            return (Criteria) this;
        }

        public Criteria andStoryContentIsNotNull() {
            addCriterion("story_content is not null");
            return (Criteria) this;
        }

        public Criteria andStoryContentEqualTo(String value) {
            addCriterion("story_content =", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotEqualTo(String value) {
            addCriterion("story_content <>", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentGreaterThan(String value) {
            addCriterion("story_content >", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentGreaterThanOrEqualTo(String value) {
            addCriterion("story_content >=", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentLessThan(String value) {
            addCriterion("story_content <", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentLessThanOrEqualTo(String value) {
            addCriterion("story_content <=", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentLike(String value) {
            addCriterion("story_content like", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotLike(String value) {
            addCriterion("story_content not like", value, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentIn(List<String> values) {
            addCriterion("story_content in", values, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotIn(List<String> values) {
            addCriterion("story_content not in", values, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentBetween(String value1, String value2) {
            addCriterion("story_content between", value1, value2, "storyContent");
            return (Criteria) this;
        }

        public Criteria andStoryContentNotBetween(String value1, String value2) {
            addCriterion("story_content not between", value1, value2, "storyContent");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
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

        public Criteria andPingxxRefundIdIsNull() {
            addCriterion("pingxx_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdIsNotNull() {
            addCriterion("pingxx_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdEqualTo(String value) {
            addCriterion("pingxx_refund_id =", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdNotEqualTo(String value) {
            addCriterion("pingxx_refund_id <>", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdGreaterThan(String value) {
            addCriterion("pingxx_refund_id >", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdGreaterThanOrEqualTo(String value) {
            addCriterion("pingxx_refund_id >=", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdLessThan(String value) {
            addCriterion("pingxx_refund_id <", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdLessThanOrEqualTo(String value) {
            addCriterion("pingxx_refund_id <=", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdLike(String value) {
            addCriterion("pingxx_refund_id like", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdNotLike(String value) {
            addCriterion("pingxx_refund_id not like", value, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdIn(List<String> values) {
            addCriterion("pingxx_refund_id in", values, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdNotIn(List<String> values) {
            addCriterion("pingxx_refund_id not in", values, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdBetween(String value1, String value2) {
            addCriterion("pingxx_refund_id between", value1, value2, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andPingxxRefundIdNotBetween(String value1, String value2) {
            addCriterion("pingxx_refund_id not between", value1, value2, "pingxxRefundId");
            return (Criteria) this;
        }

        public Criteria andRefundNumIsNull() {
            addCriterion("refund_num is null");
            return (Criteria) this;
        }

        public Criteria andRefundNumIsNotNull() {
            addCriterion("refund_num is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNumEqualTo(Integer value) {
            addCriterion("refund_num =", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotEqualTo(Integer value) {
            addCriterion("refund_num <>", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumGreaterThan(Integer value) {
            addCriterion("refund_num >", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_num >=", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumLessThan(Integer value) {
            addCriterion("refund_num <", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumLessThanOrEqualTo(Integer value) {
            addCriterion("refund_num <=", value, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumIn(List<Integer> values) {
            addCriterion("refund_num in", values, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotIn(List<Integer> values) {
            addCriterion("refund_num not in", values, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumBetween(Integer value1, Integer value2) {
            addCriterion("refund_num between", value1, value2, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundNumNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_num not between", value1, value2, "refundNum");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsIsNull() {
            addCriterion("refund_records is null");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsIsNotNull() {
            addCriterion("refund_records is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsEqualTo(Object value) {
            addCriterion("refund_records =", value, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsNotEqualTo(Object value) {
            addCriterion("refund_records <>", value, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsGreaterThan(Object value) {
            addCriterion("refund_records >", value, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsGreaterThanOrEqualTo(Object value) {
            addCriterion("refund_records >=", value, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsLessThan(Object value) {
            addCriterion("refund_records <", value, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsLessThanOrEqualTo(Object value) {
            addCriterion("refund_records <=", value, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsIn(List<Object> values) {
            addCriterion("refund_records in", values, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsNotIn(List<Object> values) {
            addCriterion("refund_records not in", values, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsBetween(Object value1, Object value2) {
            addCriterion("refund_records between", value1, value2, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andRefundRecordsNotBetween(Object value1, Object value2) {
            addCriterion("refund_records not between", value1, value2, "refundRecords");
            return (Criteria) this;
        }

        public Criteria andCinvcodeIsNull() {
            addCriterion("cinvcode is null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeIsNotNull() {
            addCriterion("cinvcode is not null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeEqualTo(String value) {
            addCriterion("cinvcode =", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotEqualTo(String value) {
            addCriterion("cinvcode <>", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeGreaterThan(String value) {
            addCriterion("cinvcode >", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cinvcode >=", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeLessThan(String value) {
            addCriterion("cinvcode <", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeLessThanOrEqualTo(String value) {
            addCriterion("cinvcode <=", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeLike(String value) {
            addCriterion("cinvcode like", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotLike(String value) {
            addCriterion("cinvcode not like", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeIn(List<String> values) {
            addCriterion("cinvcode in", values, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotIn(List<String> values) {
            addCriterion("cinvcode not in", values, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeBetween(String value1, String value2) {
            addCriterion("cinvcode between", value1, value2, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotBetween(String value1, String value2) {
            addCriterion("cinvcode not between", value1, value2, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameIsNull() {
            addCriterion("cinvcode_name is null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameIsNotNull() {
            addCriterion("cinvcode_name is not null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameEqualTo(String value) {
            addCriterion("cinvcode_name =", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameNotEqualTo(String value) {
            addCriterion("cinvcode_name <>", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameGreaterThan(String value) {
            addCriterion("cinvcode_name >", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("cinvcode_name >=", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameLessThan(String value) {
            addCriterion("cinvcode_name <", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameLessThanOrEqualTo(String value) {
            addCriterion("cinvcode_name <=", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameLike(String value) {
            addCriterion("cinvcode_name like", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameNotLike(String value) {
            addCriterion("cinvcode_name not like", value, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameIn(List<String> values) {
            addCriterion("cinvcode_name in", values, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameNotIn(List<String> values) {
            addCriterion("cinvcode_name not in", values, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameBetween(String value1, String value2) {
            addCriterion("cinvcode_name between", value1, value2, "cinvcodeName");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNameNotBetween(String value1, String value2) {
            addCriterion("cinvcode_name not between", value1, value2, "cinvcodeName");
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