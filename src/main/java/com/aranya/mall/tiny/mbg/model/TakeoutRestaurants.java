package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class TakeoutRestaurants implements Serializable {
    private Long id;

    @ApiModelProperty(value = "餐厅名称")
    private String name;

    @ApiModelProperty(value = "创建者AdminID")
    private Integer adminId;

    @ApiModelProperty(value = "后台管理员AdminID(餐厅所属商家)")
    private Integer bossId;

    @ApiModelProperty(value = "所属部门")
    private Integer departmentId;

    @ApiModelProperty(value = "状态：0=正常,1=下架")
    private Integer status;

    @ApiModelProperty(value = "最快送达时间（例如30分钟）")
    private Integer deliveryFastestTime;

    @ApiModelProperty(value = "最慢送达时间（例如60分钟）")
    private Integer deliverySlowestTime;

    @ApiModelProperty(value = "是否提供早餐 0=提供,1=不提供")
    private Integer isBreakfast;

    @ApiModelProperty(value = "是否提供午餐 0=提供,1=不提供")
    private Integer isLunch;

    @ApiModelProperty(value = "是否提供晚餐 0=提供,1=不提供")
    private Integer isDinner;

    @ApiModelProperty(value = "早餐营业开始时间")
    private Date breakfastStartAt;

    @ApiModelProperty(value = "早餐营业结束时间")
    private Date breakfastEndAt;

    @ApiModelProperty(value = "午餐营业开始时间")
    private Date lunchStartAt;

    @ApiModelProperty(value = "午餐营业结束时间")
    private Date lunchEndAt;

    @ApiModelProperty(value = "晚餐营业开始时间")
    private Date dinnerStartAt;

    @ApiModelProperty(value = "晚餐营业结束时间")
    private Date dinnerEndAt;

    @ApiModelProperty(value = "综合星级")
    private Integer overallStar;

    @ApiModelProperty(value = "评论总数")
    private Integer commentCount;

    @ApiModelProperty(value = "支付方式 1=支付宝,2=微信,3=业主卡主卡,4=业主卡副卡,5=反租卡主卡,6=反租卡副卡,7=vvip卡，8=员工卡")
    private String payType;

    @ApiModelProperty(value = "餐厅图片")
    private String bigImg;

    @ApiModelProperty(value = "餐具费")
    private BigDecimal tablewarePrice;

    @ApiModelProperty(value = "包装盒费用")
    private BigDecimal packagePrice;

    @ApiModelProperty(value = "送餐规则")
    private String takeoutRule;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "关注数量")
    private Integer likeCount;

    @ApiModelProperty(value = "外卖餐厅电话")
    private String phone;

    @ApiModelProperty(value = "餐厅编号")
    private String identifier;

    @ApiModelProperty(value = "早餐名称")
    private String breakfastName;

    @ApiModelProperty(value = "午餐名称")
    private String lunchName;

    @ApiModelProperty(value = "晚餐名称")
    private String dinnerName;

    @ApiModelProperty(value = "列表图")
    private String listImg;

    @ApiModelProperty(value = "详情图")
    private String detailImg;

    @ApiModelProperty(value = "餐厅的真实销量总和")
    private Integer salesNum;

    @ApiModelProperty(value = "餐点在线接单状态： 1=正常在线接单,2=停止在线接单")
    private Integer onlineStatus;

    @ApiModelProperty(value = "起送金额设置,订单满足起送金额才能下单")
    private BigDecimal orderMinPrice;

    @ApiModelProperty(value = "送餐类型;1=尽快,2=预定时间,3=打包自提")
    private Object deliveryType;

    @ApiModelProperty(value = "餐厅自提地点")
    private String pickPlace;

    @ApiModelProperty(value = "自提时间类型：当delivery_type为打包自提时改值才有效：1为系统默认按营业时间15分钟间隔，2=蛋糕店的自提时间")
    private Integer pickTimeType;

    @ApiModelProperty(value = "餐厅类型.aranya_app=阿那亚app.aranya_minsu=阿那亚民宿小程序")
    private String projectSource;

    @ApiModelProperty(value = "订单列表的正方形图片")
    private String orderListImg;

    @ApiModelProperty(value = "营业时间描述")
    private String businessTimesDesc;

    @ApiModelProperty(value = "餐点在线接单状态需要显示的文案")
    private String onlineStatusContent;

    @ApiModelProperty(value = "是否显示在首页 1显示2不显示")
    private Integer isShow;

    @ApiModelProperty(value = "外卖配送子类型   当delivery_type=1 外卖配送时：sub_out_type=1为系统默认立即送达，2=蛋糕店的配送时间(备注填写配送时间)，当delivery_type=3 外卖自提时：sub_out_type=1为系统默认自提时间，2=蛋糕店的自提时间")
    private Integer deliveryTimeType;

    @ApiModelProperty(value = "下单时备注的输入框的占位符文案")
    private String remarkPlaceholder;

    @ApiModelProperty(value = "下单时备注的输入框是否是必填选项 0非必填，1必填")
    private Integer remarkIsRequire;

    @ApiModelProperty(value = "阿那亚城市项目编码 1秦皇岛,2广州,3三亚,4金山岭")
    private String regionCode;

    @ApiModelProperty(value = "蛋糕店自提订单取餐时间")
    private String takeFoodDate;

    @ApiModelProperty(value = "用餐类型 1=外卖餐厅 2=堂食")
    private Integer dinnerType;

    @ApiModelProperty(value = "如果是堂食餐厅,则标识用餐支付的类型 1用餐前支付 2用餐后支付")
    private Integer dinnerPayType;


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

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getBossId() {
        return bossId;
    }

    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeliveryFastestTime() {
        return deliveryFastestTime;
    }

    public void setDeliveryFastestTime(Integer deliveryFastestTime) {
        this.deliveryFastestTime = deliveryFastestTime;
    }

    public Integer getDeliverySlowestTime() {
        return deliverySlowestTime;
    }

    public void setDeliverySlowestTime(Integer deliverySlowestTime) {
        this.deliverySlowestTime = deliverySlowestTime;
    }

    public Integer getIsBreakfast() {
        return isBreakfast;
    }

    public void setIsBreakfast(Integer isBreakfast) {
        this.isBreakfast = isBreakfast;
    }

    public Integer getIsLunch() {
        return isLunch;
    }

    public void setIsLunch(Integer isLunch) {
        this.isLunch = isLunch;
    }

    public Integer getIsDinner() {
        return isDinner;
    }

    public void setIsDinner(Integer isDinner) {
        this.isDinner = isDinner;
    }

    public Date getBreakfastStartAt() {
        return breakfastStartAt;
    }

    public void setBreakfastStartAt(Date breakfastStartAt) {
        this.breakfastStartAt = breakfastStartAt;
    }

    public Date getBreakfastEndAt() {
        return breakfastEndAt;
    }

    public void setBreakfastEndAt(Date breakfastEndAt) {
        this.breakfastEndAt = breakfastEndAt;
    }

    public Date getLunchStartAt() {
        return lunchStartAt;
    }

    public void setLunchStartAt(Date lunchStartAt) {
        this.lunchStartAt = lunchStartAt;
    }

    public Date getLunchEndAt() {
        return lunchEndAt;
    }

    public void setLunchEndAt(Date lunchEndAt) {
        this.lunchEndAt = lunchEndAt;
    }

    public Date getDinnerStartAt() {
        return dinnerStartAt;
    }

    public void setDinnerStartAt(Date dinnerStartAt) {
        this.dinnerStartAt = dinnerStartAt;
    }

    public Date getDinnerEndAt() {
        return dinnerEndAt;
    }

    public void setDinnerEndAt(Date dinnerEndAt) {
        this.dinnerEndAt = dinnerEndAt;
    }

    public Integer getOverallStar() {
        return overallStar;
    }

    public void setOverallStar(Integer overallStar) {
        this.overallStar = overallStar;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getBigImg() {
        return bigImg;
    }

    public void setBigImg(String bigImg) {
        this.bigImg = bigImg;
    }

    public BigDecimal getTablewarePrice() {
        return tablewarePrice;
    }

    public void setTablewarePrice(BigDecimal tablewarePrice) {
        this.tablewarePrice = tablewarePrice;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }

    public String getTakeoutRule() {
        return takeoutRule;
    }

    public void setTakeoutRule(String takeoutRule) {
        this.takeoutRule = takeoutRule;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getBreakfastName() {
        return breakfastName;
    }

    public void setBreakfastName(String breakfastName) {
        this.breakfastName = breakfastName;
    }

    public String getLunchName() {
        return lunchName;
    }

    public void setLunchName(String lunchName) {
        this.lunchName = lunchName;
    }

    public String getDinnerName() {
        return dinnerName;
    }

    public void setDinnerName(String dinnerName) {
        this.dinnerName = dinnerName;
    }

    public String getListImg() {
        return listImg;
    }

    public void setListImg(String listImg) {
        this.listImg = listImg;
    }

    public String getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(String detailImg) {
        this.detailImg = detailImg;
    }

    public Integer getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(Integer salesNum) {
        this.salesNum = salesNum;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public BigDecimal getOrderMinPrice() {
        return orderMinPrice;
    }

    public void setOrderMinPrice(BigDecimal orderMinPrice) {
        this.orderMinPrice = orderMinPrice;
    }

    public Object getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Object deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getPickPlace() {
        return pickPlace;
    }

    public void setPickPlace(String pickPlace) {
        this.pickPlace = pickPlace;
    }

    public Integer getPickTimeType() {
        return pickTimeType;
    }

    public void setPickTimeType(Integer pickTimeType) {
        this.pickTimeType = pickTimeType;
    }

    public String getProjectSource() {
        return projectSource;
    }

    public void setProjectSource(String projectSource) {
        this.projectSource = projectSource;
    }

    public String getOrderListImg() {
        return orderListImg;
    }

    public void setOrderListImg(String orderListImg) {
        this.orderListImg = orderListImg;
    }

    public String getBusinessTimesDesc() {
        return businessTimesDesc;
    }

    public void setBusinessTimesDesc(String businessTimesDesc) {
        this.businessTimesDesc = businessTimesDesc;
    }

    public String getOnlineStatusContent() {
        return onlineStatusContent;
    }

    public void setOnlineStatusContent(String onlineStatusContent) {
        this.onlineStatusContent = onlineStatusContent;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getDeliveryTimeType() {
        return deliveryTimeType;
    }

    public void setDeliveryTimeType(Integer deliveryTimeType) {
        this.deliveryTimeType = deliveryTimeType;
    }

    public String getRemarkPlaceholder() {
        return remarkPlaceholder;
    }

    public void setRemarkPlaceholder(String remarkPlaceholder) {
        this.remarkPlaceholder = remarkPlaceholder;
    }

    public Integer getRemarkIsRequire() {
        return remarkIsRequire;
    }

    public void setRemarkIsRequire(Integer remarkIsRequire) {
        this.remarkIsRequire = remarkIsRequire;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getTakeFoodDate() {
        return takeFoodDate;
    }

    public void setTakeFoodDate(String takeFoodDate) {
        this.takeFoodDate = takeFoodDate;
    }

    public Integer getDinnerType() {
        return dinnerType;
    }

    public void setDinnerType(Integer dinnerType) {
        this.dinnerType = dinnerType;
    }

    public Integer getDinnerPayType() {
        return dinnerPayType;
    }

    public void setDinnerPayType(Integer dinnerPayType) {
        this.dinnerPayType = dinnerPayType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", adminId=").append(adminId);
        sb.append(", bossId=").append(bossId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", status=").append(status);
        sb.append(", deliveryFastestTime=").append(deliveryFastestTime);
        sb.append(", deliverySlowestTime=").append(deliverySlowestTime);
        sb.append(", isBreakfast=").append(isBreakfast);
        sb.append(", isLunch=").append(isLunch);
        sb.append(", isDinner=").append(isDinner);
        sb.append(", breakfastStartAt=").append(breakfastStartAt);
        sb.append(", breakfastEndAt=").append(breakfastEndAt);
        sb.append(", lunchStartAt=").append(lunchStartAt);
        sb.append(", lunchEndAt=").append(lunchEndAt);
        sb.append(", dinnerStartAt=").append(dinnerStartAt);
        sb.append(", dinnerEndAt=").append(dinnerEndAt);
        sb.append(", overallStar=").append(overallStar);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", payType=").append(payType);
        sb.append(", bigImg=").append(bigImg);
        sb.append(", tablewarePrice=").append(tablewarePrice);
        sb.append(", packagePrice=").append(packagePrice);
        sb.append(", takeoutRule=").append(takeoutRule);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", sort=").append(sort);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", phone=").append(phone);
        sb.append(", identifier=").append(identifier);
        sb.append(", breakfastName=").append(breakfastName);
        sb.append(", lunchName=").append(lunchName);
        sb.append(", dinnerName=").append(dinnerName);
        sb.append(", listImg=").append(listImg);
        sb.append(", detailImg=").append(detailImg);
        sb.append(", salesNum=").append(salesNum);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", orderMinPrice=").append(orderMinPrice);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", pickPlace=").append(pickPlace);
        sb.append(", pickTimeType=").append(pickTimeType);
        sb.append(", projectSource=").append(projectSource);
        sb.append(", orderListImg=").append(orderListImg);
        sb.append(", businessTimesDesc=").append(businessTimesDesc);
        sb.append(", onlineStatusContent=").append(onlineStatusContent);
        sb.append(", isShow=").append(isShow);
        sb.append(", deliveryTimeType=").append(deliveryTimeType);
        sb.append(", remarkPlaceholder=").append(remarkPlaceholder);
        sb.append(", remarkIsRequire=").append(remarkIsRequire);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", takeFoodDate=").append(takeFoodDate);
        sb.append(", dinnerType=").append(dinnerType);
        sb.append(", dinnerPayType=").append(dinnerPayType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}