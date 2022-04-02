package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TakeoutDeliveryRegionPrices implements Serializable {
    private Long id;

    @ApiModelProperty(value = "服务费")
    private BigDecimal price;

    @ApiModelProperty(value = "与订单金额比较，大于此值开始收费")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "与订单比较，小于此值开始收费")
    private BigDecimal maxPrice;

    @ApiModelProperty(value = "餐厅ID")
    private Integer restaurantId;

    @ApiModelProperty(value = "阿那亚城市项目编码 1秦皇岛,2广州,3三亚,4金山岭 5雾灵山")
    private String regionCode;

    @ApiModelProperty(value = "外送地址一级地址ID,takeout_delivery_addresses主键ID")
    private Integer addressParentId;

    @ApiModelProperty(value = "创建者ID")
    private Integer adminId;

    private String remark;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public Integer getAddressParentId() {
        return addressParentId;
    }

    public void setAddressParentId(Integer addressParentId) {
        this.addressParentId = addressParentId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", price=").append(price);
        sb.append(", minPrice=").append(minPrice);
        sb.append(", maxPrice=").append(maxPrice);
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", addressParentId=").append(addressParentId);
        sb.append(", adminId=").append(adminId);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}