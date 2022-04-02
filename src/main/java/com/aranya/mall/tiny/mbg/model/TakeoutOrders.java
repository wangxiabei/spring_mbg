package com.aranya.mall.tiny.mbg.model;

import com.aranya.mall.tiny.emun.OrderType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TakeoutOrders implements Serializable {
    private Long id;
    private OrderType orderType;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "餐厅ID")
    private Integer restaurantId;

    @ApiModelProperty(value = "所属部门")
    private Integer departmentId;

    @ApiModelProperty(value = "订单编号")
    private String orderNo;

    @ApiModelProperty(value = "订单总价")
    private BigDecimal amount;

    @ApiModelProperty(value = "订单状态;1待支付, 2等待接单, 3已接单, 4备餐中, 5打包中, 13待取餐,6配送中, 7待评价, 8已完成, 9手动取消, 10自动取消,11=退款中..., 12退款成功")
    private Integer status;

    @ApiModelProperty(value = "用户预留姓名")
    private String realname;

    @ApiModelProperty(value = "用户预留电话")
    private String phone;

    @ApiModelProperty(value = "送餐地址")
    private String address;

    @ApiModelProperty(value = "Ping++ 生成的支付对象ID")
    private String chargeId;

    @ApiModelProperty(value = "支付方式;1=支付宝,2=微信,3=业主卡主卡,4=业主卡副卡,5=反租卡主卡,6=反租卡副卡,7=vvip卡，8=员工卡")
    private Integer payType;

    @ApiModelProperty(value = "支付时间")
    private Date payAt;

    @ApiModelProperty(value = "送餐类型;1=尽快,2=预定时间")
    private Integer deliveryType;

    @ApiModelProperty(value = "预定送餐日期")
    private String bookingDeliveryAt;

    @ApiModelProperty(value = "是否按时送到0=未知,1=准时,2=未准时")
    private Integer isOntime;

    @ApiModelProperty(value = "餐具数量")
    private Integer tablewareCount;

    @ApiModelProperty(value = "餐具单价")
    private BigDecimal tablewarePrice;

    @ApiModelProperty(value = "打包盒数量")
    private Integer packageCount;

    @ApiModelProperty(value = "打包盒单价")
    private BigDecimal packagePrice;

    @ApiModelProperty(value = "餐具总额")
    private BigDecimal tablewareAmount;

    @ApiModelProperty(value = "打包总额")
    private BigDecimal packageAmount;

    @ApiModelProperty(value = "送餐服务费")
    private BigDecimal deliveryAmount;

    @ApiModelProperty(value = "口味总额")
    private BigDecimal tasteAmount;

    @ApiModelProperty(value = "退款原因")
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

    @ApiModelProperty(value = "支付卡号")
    private String payAccount;

    @ApiModelProperty(value = "打印小票次数")
    private Integer printNum;

    @ApiModelProperty(value = "送餐员ID")
    private Integer deliveryerId;

    @ApiModelProperty(value = "送餐员送达时间;时间='1970-01-01 00:00:00'为未送达，反之则为送达时间")
    private Date deliveryerAt;

    @ApiModelProperty(value = "原总价")
    private BigDecimal originalAmount;

    @ApiModelProperty(value = "餐厅每日订单有序编号,每天从1递增")
    private String sequenceNo;

    @ApiModelProperty(value = "预定送餐时间ID")
    private Integer deliveryTimeId;

    @ApiModelProperty(value = "预定送餐开始时间 时+分")
    private String deliveryStartAt;

    @ApiModelProperty(value = "预定送餐结束时间 时+分")
    private String deliveryEndAt;

    @ApiModelProperty(value = "送餐地址ids")
    private String addressIds;

    @ApiModelProperty(value = "订单分配送餐员的时间")
    private Date arrangeDeliveryerAt;

    @ApiModelProperty(value = "收款方应用ID,ping++ 里面配置APP_ID")
    private String receiptApp;

    @ApiModelProperty(value = "Ping++ 生成的订单ID")
    private String pingxxOrderId;

    @ApiModelProperty(value = "下单传的终端IP")
    private String clientIp;

    @ApiModelProperty(value = "0=暂无分配,送餐员类型：1=园区送餐员,2=餐厅送餐员")
    private Integer deliveryerTypee;

    @ApiModelProperty(value = "渠道类型: android、ios、wx_lite")
    private String channelType;

    @ApiModelProperty(value = "餐厅名称")
    private String restaurantName;

    @ApiModelProperty(value = "送餐员姓名")
    private String deliveryerName;

    @ApiModelProperty(value = "送餐员手机号")
    private String deliveryerPhone;

    @ApiModelProperty(value = "外卖小哥取餐时间")
    private Date deliveryerReceivedOrderAt;

    @ApiModelProperty(value = "后台订单列表使用的订单备注")
    private String orderRemark;

    @ApiModelProperty(value = "管理员ID")
    private Integer remarkAdminId;

    @ApiModelProperty(value = "备餐完成时间")
    private Date mealFinishedAt;

    @ApiModelProperty(value = "外卖配送子类型   当delivery_type=1 外卖配送时：sub_out_type=1为系统默认立即送达，2=蛋糕店的配送时间(备注填写配送时间)，当delivery_type=3 外卖自提时：sub_out_type=1为系统默认自提时间，2=蛋糕店的自提时间")
    private Integer deliveryTimeType;

    @ApiModelProperty(value = "阿那亚城市项目编码 1秦皇岛,2广州,3三亚,4金山岭")
    private String regionCode;
//    //用户信息
//    private Users user;
//    //订单食物信息
//    private List<TakeoutOrderFoods> orderFoodsList;
//    //订单食物口味信息
//    private List<TakeoutOrderFoodTastes> orderFoodTastesList;

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

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getBookingDeliveryAt() {
        return bookingDeliveryAt;
    }

    public void setBookingDeliveryAt(String bookingDeliveryAt) {
        this.bookingDeliveryAt = bookingDeliveryAt;
    }

    public Integer getIsOntime() {
        return isOntime;
    }

    public void setIsOntime(Integer isOntime) {
        this.isOntime = isOntime;
    }

    public Integer getTablewareCount() {
        return tablewareCount;
    }

    public void setTablewareCount(Integer tablewareCount) {
        this.tablewareCount = tablewareCount;
    }

    public BigDecimal getTablewarePrice() {
        return tablewarePrice;
    }

    public void setTablewarePrice(BigDecimal tablewarePrice) {
        this.tablewarePrice = tablewarePrice;
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

    public BigDecimal getTablewareAmount() {
        return tablewareAmount;
    }

    public void setTablewareAmount(BigDecimal tablewareAmount) {
        this.tablewareAmount = tablewareAmount;
    }

    public BigDecimal getPackageAmount() {
        return packageAmount;
    }

    public void setPackageAmount(BigDecimal packageAmount) {
        this.packageAmount = packageAmount;
    }

    public BigDecimal getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(BigDecimal deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public BigDecimal getTasteAmount() {
        return tasteAmount;
    }

    public void setTasteAmount(BigDecimal tasteAmount) {
        this.tasteAmount = tasteAmount;
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

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Integer getPrintNum() {
        return printNum;
    }

    public void setPrintNum(Integer printNum) {
        this.printNum = printNum;
    }

    public Integer getDeliveryerId() {
        return deliveryerId;
    }

    public void setDeliveryerId(Integer deliveryerId) {
        this.deliveryerId = deliveryerId;
    }

    public Date getDeliveryerAt() {
        return deliveryerAt;
    }

    public void setDeliveryerAt(Date deliveryerAt) {
        this.deliveryerAt = deliveryerAt;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public Integer getDeliveryTimeId() {
        return deliveryTimeId;
    }

    public void setDeliveryTimeId(Integer deliveryTimeId) {
        this.deliveryTimeId = deliveryTimeId;
    }

    public String getDeliveryStartAt() {
        return deliveryStartAt;
    }

    public void setDeliveryStartAt(String deliveryStartAt) {
        this.deliveryStartAt = deliveryStartAt;
    }

    public String getDeliveryEndAt() {
        return deliveryEndAt;
    }

    public void setDeliveryEndAt(String deliveryEndAt) {
        this.deliveryEndAt = deliveryEndAt;
    }

    public String getAddressIds() {
        return addressIds;
    }

    public void setAddressIds(String addressIds) {
        this.addressIds = addressIds;
    }

    public Date getArrangeDeliveryerAt() {
        return arrangeDeliveryerAt;
    }

    public void setArrangeDeliveryerAt(Date arrangeDeliveryerAt) {
        this.arrangeDeliveryerAt = arrangeDeliveryerAt;
    }

    public String getReceiptApp() {
        return receiptApp;
    }

    public void setReceiptApp(String receiptApp) {
        this.receiptApp = receiptApp;
    }

    public String getPingxxOrderId() {
        return pingxxOrderId;
    }

    public void setPingxxOrderId(String pingxxOrderId) {
        this.pingxxOrderId = pingxxOrderId;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getDeliveryerTypee() {
        return deliveryerTypee;
    }

    public void setDeliveryerTypee(Integer deliveryerTypee) {
        this.deliveryerTypee = deliveryerTypee;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDeliveryerName() {
        return deliveryerName;
    }

    public void setDeliveryerName(String deliveryerName) {
        this.deliveryerName = deliveryerName;
    }

    public String getDeliveryerPhone() {
        return deliveryerPhone;
    }

    public void setDeliveryerPhone(String deliveryerPhone) {
        this.deliveryerPhone = deliveryerPhone;
    }

    public Date getDeliveryerReceivedOrderAt() {
        return deliveryerReceivedOrderAt;
    }

    public void setDeliveryerReceivedOrderAt(Date deliveryerReceivedOrderAt) {
        this.deliveryerReceivedOrderAt = deliveryerReceivedOrderAt;
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

    public Date getMealFinishedAt() {
        return mealFinishedAt;
    }

    public void setMealFinishedAt(Date mealFinishedAt) {
        this.mealFinishedAt = mealFinishedAt;
    }

    public Integer getDeliveryTimeType() {
        return deliveryTimeType;
    }

    public void setDeliveryTimeType(Integer deliveryTimeType) {
        this.deliveryTimeType = deliveryTimeType;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", realname=").append(realname);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", payType=").append(payType);
        sb.append(", payAt=").append(payAt);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", bookingDeliveryAt=").append(bookingDeliveryAt);
        sb.append(", isOntime=").append(isOntime);
        sb.append(", tablewareCount=").append(tablewareCount);
        sb.append(", tablewarePrice=").append(tablewarePrice);
        sb.append(", packageCount=").append(packageCount);
        sb.append(", packagePrice=").append(packagePrice);
        sb.append(", tablewareAmount=").append(tablewareAmount);
        sb.append(", packageAmount=").append(packageAmount);
        sb.append(", deliveryAmount=").append(deliveryAmount);
        sb.append(", tasteAmount=").append(tasteAmount);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", refundPrice=").append(refundPrice);
        sb.append(", refundApplyAt=").append(refundApplyAt);
        sb.append(", refundSuccessAt=").append(refundSuccessAt);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", payAccount=").append(payAccount);
        sb.append(", printNum=").append(printNum);
        sb.append(", deliveryerId=").append(deliveryerId);
        sb.append(", deliveryerAt=").append(deliveryerAt);
        sb.append(", originalAmount=").append(originalAmount);
        sb.append(", sequenceNo=").append(sequenceNo);
        sb.append(", deliveryTimeId=").append(deliveryTimeId);
        sb.append(", deliveryStartAt=").append(deliveryStartAt);
        sb.append(", deliveryEndAt=").append(deliveryEndAt);
        sb.append(", addressIds=").append(addressIds);
        sb.append(", arrangeDeliveryerAt=").append(arrangeDeliveryerAt);
        sb.append(", receiptApp=").append(receiptApp);
        sb.append(", pingxxOrderId=").append(pingxxOrderId);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", deliveryerTypee=").append(deliveryerTypee);
        sb.append(", channelType=").append(channelType);
        sb.append(", restaurantName=").append(restaurantName);
        sb.append(", deliveryerName=").append(deliveryerName);
        sb.append(", deliveryerPhone=").append(deliveryerPhone);
        sb.append(", deliveryerReceivedOrderAt=").append(deliveryerReceivedOrderAt);
        sb.append(", orderRemark=").append(orderRemark);
        sb.append(", remarkAdminId=").append(remarkAdminId);
        sb.append(", mealFinishedAt=").append(mealFinishedAt);
        sb.append(", deliveryTimeType=").append(deliveryTimeType);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}