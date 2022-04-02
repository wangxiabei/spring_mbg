package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TakeoutOrderFoods implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "订单ID")
    private Integer orderId;

    @ApiModelProperty(value = "餐厅ID")
    private Integer restaurantId;

    @ApiModelProperty(value = "餐点ID")
    private Integer foodId;

    @ApiModelProperty(value = "餐点名称")
    private String name;

    @ApiModelProperty(value = "子标题")
    private String subname;

    @ApiModelProperty(value = "餐点单价")
    private BigDecimal price;

    @ApiModelProperty(value = "餐点数量")
    private Integer count;

    @ApiModelProperty(value = "总额")
    private BigDecimal amount;

    @ApiModelProperty(value = "打包总额")
    private BigDecimal packageAmount;

    @ApiModelProperty(value = "口味总额")
    private BigDecimal tasteAmount;

    @ApiModelProperty(value = "打包盒数量")
    private Integer packageCount;

    @ApiModelProperty(value = "打包盒单价")
    private BigDecimal packagePrice;

    @ApiModelProperty(value = "类型 1=套餐，2=单品")
    private Integer typee;

    @ApiModelProperty(value = "营业类型：1=早餐,2=午餐，3=晚餐")
    private Integer openType;

    @ApiModelProperty(value = "餐点图片")
    private String img;

    @ApiModelProperty(value = "故事标题")
    private String storyTitle;

    @ApiModelProperty(value = "故事内容")
    private String storyContent;

    @ApiModelProperty(value = "餐点详情")
    private String detail;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "折扣：0..1，例如打9折=0.9")
    private BigDecimal discount;

    @ApiModelProperty(value = "原总价")
    private BigDecimal originalAmount;

    @ApiModelProperty(value = "状态: 0=正常,1=申请退款,2=退款中,3=退款完成")
    private Integer status;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal refundPrice;

    @ApiModelProperty(value = "退款申请时间")
    private Date refundApplyAt;

    @ApiModelProperty(value = "退款完成时间")
    private Date refundSuccessAt;

    @ApiModelProperty(value = "退货时候的理由")
    private String refundReason;

    @ApiModelProperty(value = "ping++ 生成的退款ID")
    private String pingxxRefundId;

    @ApiModelProperty(value = "退的餐点数量")
    private Integer refundNum;

    @ApiModelProperty(value = "退款记录")
    private Object refundRecords;

    @ApiModelProperty(value = "存货编码")
    private String cinvcode;

    @ApiModelProperty(value = "存货编码名称")
    private String cinvcodeName;

    //订单食物对应的口味
    private List<TakeoutOrderFoodTastes> orderFoodTastesList;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPackageAmount() {
        return packageAmount;
    }

    public void setPackageAmount(BigDecimal packageAmount) {
        this.packageAmount = packageAmount;
    }

    public BigDecimal getTasteAmount() {
        return tasteAmount;
    }

    public void setTasteAmount(BigDecimal tasteAmount) {
        this.tasteAmount = tasteAmount;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Integer getTypee() {
        return typee;
    }

    public void setTypee(Integer typee) {
        this.typee = typee;
    }

    public Integer getOpenType() {
        return openType;
    }

    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getStoryContent() {
        return storyContent;
    }

    public void setStoryContent(String storyContent) {
        this.storyContent = storyContent;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(BigDecimal refundPrice) {
        this.refundPrice = refundPrice;
    }

    public Date getRefundApplyAt() {
        return refundApplyAt;
    }

    public void setRefundApplyAt(Date refundApplyAt) {
        this.refundApplyAt = refundApplyAt;
    }

    public Date getRefundSuccessAt() {
        return refundSuccessAt;
    }

    public void setRefundSuccessAt(Date refundSuccessAt) {
        this.refundSuccessAt = refundSuccessAt;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getPingxxRefundId() {
        return pingxxRefundId;
    }

    public void setPingxxRefundId(String pingxxRefundId) {
        this.pingxxRefundId = pingxxRefundId;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public Object getRefundRecords() {
        return refundRecords;
    }

    public void setRefundRecords(Object refundRecords) {
        this.refundRecords = refundRecords;
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode;
    }

    public String getCinvcodeName() {
        return cinvcodeName;
    }

    public void setCinvcodeName(String cinvcodeName) {
        this.cinvcodeName = cinvcodeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", foodId=").append(foodId);
        sb.append(", name=").append(name);
        sb.append(", subname=").append(subname);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", amount=").append(amount);
        sb.append(", packageAmount=").append(packageAmount);
        sb.append(", tasteAmount=").append(tasteAmount);
        sb.append(", packageCount=").append(packageCount);
        sb.append(", packagePrice=").append(packagePrice);
        sb.append(", typee=").append(typee);
        sb.append(", openType=").append(openType);
        sb.append(", img=").append(img);
        sb.append(", storyTitle=").append(storyTitle);
        sb.append(", storyContent=").append(storyContent);
        sb.append(", detail=").append(detail);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", discount=").append(discount);
        sb.append(", originalAmount=").append(originalAmount);
        sb.append(", status=").append(status);
        sb.append(", refundPrice=").append(refundPrice);
        sb.append(", refundApplyAt=").append(refundApplyAt);
        sb.append(", refundSuccessAt=").append(refundSuccessAt);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", pingxxRefundId=").append(pingxxRefundId);
        sb.append(", refundNum=").append(refundNum);
        sb.append(", refundRecords=").append(refundRecords);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", cinvcodeName=").append(cinvcodeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}