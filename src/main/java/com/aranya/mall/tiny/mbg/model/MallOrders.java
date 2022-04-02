package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallOrders implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "商品id")
    private Integer productId;

    @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

    @ApiModelProperty(value = "部门id")
    private Integer departmentId;

    @ApiModelProperty(value = "订单编号")
    private String orderNo;

    @ApiModelProperty(value = "订单状态1=待支付, 2=待发货,3=待收货,4=待评价,5=已完成,6=取消订单,7=退款中,8=审核通过,9=退款完成,10=审核失败")
    private Integer status;

    @ApiModelProperty(value = "订单总价(优惠后)")
    private BigDecimal amount;

    @ApiModelProperty(value = "订单原价(优惠前)")
    private BigDecimal originalAmount;

    @ApiModelProperty(value = "运费")
    private BigDecimal postage;

    @ApiModelProperty(value = "支付方式;1=支付宝,2=微信,3=业主卡主卡,4=业主卡副卡,5=反租卡主卡,6=反租卡副卡,7=vvip卡，8=员工卡")
    private Integer payType;

    @ApiModelProperty(value = "支付会员卡号")
    private String payAccount;

    @ApiModelProperty(value = "Ping++ 生成的支付对象ID")
    private String chargeId;

    @ApiModelProperty(value = "快递服务商")
    private String deliveryService;

    @ApiModelProperty(value = "快递单号")
    private String deliveryNo;

    @ApiModelProperty(value = "发货时间")
    private Date shipAt;

    @ApiModelProperty(value = "收货人姓名")
    private String realname;

    @ApiModelProperty(value = "收货人电话")
    private String mobile;

    @ApiModelProperty(value = "收货地址")
    private String address;

    @ApiModelProperty(value = "用户地址ID")
    private Integer addressId;

    @ApiModelProperty(value = "退款理由")
    private String refundReason;

    @ApiModelProperty(value = "退款总价")
    private BigDecimal refundPrice;

    @ApiModelProperty(value = "退款申请时间")
    private Date refundApplyAt;

    @ApiModelProperty(value = "退款完成时间")
    private Date refundSuccessAt;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "Ping++ 生成的订单ID")
    private String pingxxOrderId;

    @ApiModelProperty(value = "支付时间")
    private Date payAt;

    @ApiModelProperty(value = "省")
    private String provinceName;

    @ApiModelProperty(value = "市")
    private String cityName;

    private String countyName;

    @ApiModelProperty(value = "物流单号来源 1=手动录入;2=自动录入")
    private Integer deliveryNoSource;

    @ApiModelProperty(value = "城市区号")
    private String cityCode;

    @ApiModelProperty(value = "1退款 2退货")
    private Integer returnStatus;

    @ApiModelProperty(value = "收款方应用ID,ping++ 里面配置APP_ID")
    private String receiptApp;

    @ApiModelProperty(value = "确认收货时间")
    private Date receiveAt;

    @ApiModelProperty(value = "下单传的终端IP")
    private String clientIp;

    @ApiModelProperty(value = "渠道类型: android、ios、wx_lite")
    private String channelType;

    @ApiModelProperty(value = "订单类型 1邮寄 2自提")
    private Integer orderType;

    @ApiModelProperty(value = "后台订单列表使用的订单备注")
    private String orderRemark;

    @ApiModelProperty(value = "管理员ID")
    private Integer remarkAdminId;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public String getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public Date getShipAt() {
        return shipAt;
    }

    public void setShipAt(Date shipAt) {
        this.shipAt = shipAt;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
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

    public String getPingxxOrderId() {
        return pingxxOrderId;
    }

    public void setPingxxOrderId(String pingxxOrderId) {
        this.pingxxOrderId = pingxxOrderId;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public Integer getDeliveryNoSource() {
        return deliveryNoSource;
    }

    public void setDeliveryNoSource(Integer deliveryNoSource) {
        this.deliveryNoSource = deliveryNoSource;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Integer returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReceiptApp() {
        return receiptApp;
    }

    public void setReceiptApp(String receiptApp) {
        this.receiptApp = receiptApp;
    }

    public Date getReceiveAt() {
        return receiveAt;
    }

    public void setReceiveAt(Date receiveAt) {
        this.receiveAt = receiveAt;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Integer getRemarkAdminId() {
        return remarkAdminId;
    }

    public void setRemarkAdminId(Integer remarkAdminId) {
        this.remarkAdminId = remarkAdminId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", status=").append(status);
        sb.append(", amount=").append(amount);
        sb.append(", originalAmount=").append(originalAmount);
        sb.append(", postage=").append(postage);
        sb.append(", payType=").append(payType);
        sb.append(", payAccount=").append(payAccount);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", deliveryService=").append(deliveryService);
        sb.append(", deliveryNo=").append(deliveryNo);
        sb.append(", shipAt=").append(shipAt);
        sb.append(", realname=").append(realname);
        sb.append(", mobile=").append(mobile);
        sb.append(", address=").append(address);
        sb.append(", addressId=").append(addressId);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", refundPrice=").append(refundPrice);
        sb.append(", refundApplyAt=").append(refundApplyAt);
        sb.append(", refundSuccessAt=").append(refundSuccessAt);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", pingxxOrderId=").append(pingxxOrderId);
        sb.append(", payAt=").append(payAt);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityName=").append(cityName);
        sb.append(", countyName=").append(countyName);
        sb.append(", deliveryNoSource=").append(deliveryNoSource);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", returnStatus=").append(returnStatus);
        sb.append(", receiptApp=").append(receiptApp);
        sb.append(", receiveAt=").append(receiveAt);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", channelType=").append(channelType);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderRemark=").append(orderRemark);
        sb.append(", remarkAdminId=").append(remarkAdminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}