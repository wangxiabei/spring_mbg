package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TakeoutOrderFoodTastes implements Serializable {
    private Long id;

    @ApiModelProperty(value = "口味名称")
    private String name;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "订单ID")
    private Integer orderId;

    @ApiModelProperty(value = "餐点ID")
    private Integer foodId;

    @ApiModelProperty(value = "餐厅ID")
    private Integer restaurantId;

    @ApiModelProperty(value = "订单餐点关联表ID")
    private Integer orderFoodId;

    @ApiModelProperty(value = "口味ID")
    private Integer tasteId;

    @ApiModelProperty(value = "口味单价")
    private BigDecimal price;

    @ApiModelProperty(value = "口味数量")
    private Integer count;

    @ApiModelProperty(value = "口味总额")
    private BigDecimal tasteAmount;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "口味分组ID")
    private Integer foodTasteGroupId;

    @ApiModelProperty(value = "口味分组名称")
    private String foodTasteGroupName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getOrderFoodId() {
        return orderFoodId;
    }

    public void setOrderFoodId(Integer orderFoodId) {
        this.orderFoodId = orderFoodId;
    }

    public Integer getTasteId() {
        return tasteId;
    }

    public void setTasteId(Integer tasteId) {
        this.tasteId = tasteId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getTasteAmount() {
        return tasteAmount;
    }

    public void setTasteAmount(BigDecimal tasteAmount) {
        this.tasteAmount = tasteAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getFoodTasteGroupId() {
        return foodTasteGroupId;
    }

    public void setFoodTasteGroupId(Integer foodTasteGroupId) {
        this.foodTasteGroupId = foodTasteGroupId;
    }

    public String getFoodTasteGroupName() {
        return foodTasteGroupName;
    }

    public void setFoodTasteGroupName(String foodTasteGroupName) {
        this.foodTasteGroupName = foodTasteGroupName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", foodId=").append(foodId);
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", orderFoodId=").append(orderFoodId);
        sb.append(", tasteId=").append(tasteId);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", tasteAmount=").append(tasteAmount);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", foodTasteGroupId=").append(foodTasteGroupId);
        sb.append(", foodTasteGroupName=").append(foodTasteGroupName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}