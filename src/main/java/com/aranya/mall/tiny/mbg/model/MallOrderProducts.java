package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallOrderProducts implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Integer orderId;

    @ApiModelProperty(value = "skuid")
    private Integer skuId;

    @ApiModelProperty(value = "商品id")
    private Integer productId;

    @ApiModelProperty(value = "购买数量")
    private Integer num;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "成交单价(优惠后)")
    private BigDecimal price;

    @ApiModelProperty(value = "原价(优惠前)")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "总价(优惠后)")
    private BigDecimal amount;

    @ApiModelProperty(value = "原价(优惠前)")
    private BigDecimal originalAmount;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "订单状态0:正常 1:申请退货 2:买家待发货 3:商家待收货 4=商家待退款 5= 退款中 6=退款完成 7=拒绝退货 8=取消")
    private Integer status;

    @ApiModelProperty(value = "退货的物流运单号")
    private String mailno;

    @ApiModelProperty(value = "退款金额")
    private BigDecimal refundAmount;

    @ApiModelProperty(value = "退款审请时间")
    private Date refundApplyAt;

    @ApiModelProperty(value = "退款审核通过时间")
    private Date refundAuditAt;

    @ApiModelProperty(value = "退款完成时间")
    private Date refundSuccessAt;

    @ApiModelProperty(value = "退货时候的照片")
    private String refundImage;

    @ApiModelProperty(value = "退货时候的理由")
    private String refundReason;

    @ApiModelProperty(value = "ping++ 生成的退款ID")
    private String pingxxRefundId;

    @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

    private String skuName;

    @ApiModelProperty(value = "商品列表小图快照")
    private String smallImg;

    @ApiModelProperty(value = "是否已经被评论过 0没有评价 1评价过")
    private Integer isComment;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMailno() {
        return mailno;
    }

    public void setMailno(String mailno) {
        this.mailno = mailno;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getRefundApplyAt() {
        return refundApplyAt;
    }

    public void setRefundApplyAt(Date refundApplyAt) {
        this.refundApplyAt = refundApplyAt;
    }

    public Date getRefundAuditAt() {
        return refundAuditAt;
    }

    public void setRefundAuditAt(Date refundAuditAt) {
        this.refundAuditAt = refundAuditAt;
    }

    public Date getRefundSuccessAt() {
        return refundSuccessAt;
    }

    public void setRefundSuccessAt(Date refundSuccessAt) {
        this.refundSuccessAt = refundSuccessAt;
    }

    public String getRefundImage() {
        return refundImage;
    }

    public void setRefundImage(String refundImage) {
        this.refundImage = refundImage;
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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", skuId=").append(skuId);
        sb.append(", productId=").append(productId);
        sb.append(", num=").append(num);
        sb.append(", productName=").append(productName);
        sb.append(", price=").append(price);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", amount=").append(amount);
        sb.append(", originalAmount=").append(originalAmount);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", mailno=").append(mailno);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", refundApplyAt=").append(refundApplyAt);
        sb.append(", refundAuditAt=").append(refundAuditAt);
        sb.append(", refundSuccessAt=").append(refundSuccessAt);
        sb.append(", refundImage=").append(refundImage);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", pingxxRefundId=").append(pingxxRefundId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", skuName=").append(skuName);
        sb.append(", smallImg=").append(smallImg);
        sb.append(", isComment=").append(isComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}