package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TakeoutRestaurantDeliveryAreas implements Serializable {
    private Long id;

    @ApiModelProperty(value = "餐厅ID")
    private Integer restaurantId;

    @ApiModelProperty(value = "外送地址一级地址ID,takeout_delivery_addresses主键ID")
    private Integer addressParentId;

    @ApiModelProperty(value = "阿那亚城市项目编码 1秦皇岛,2广州,3三亚,4金山岭 5雾灵山")
    private String regionCode;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    @ApiModelProperty(value = "管理员ID")
    private Integer adminId;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getAddressParentId() {
        return addressParentId;
    }

    public void setAddressParentId(Integer addressParentId) {
        this.addressParentId = addressParentId;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", addressParentId=").append(addressParentId);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", adminId=").append(adminId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}