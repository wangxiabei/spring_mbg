package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TakeoutFoods implements Serializable {
    private Long id;

    @ApiModelProperty(value = "餐厅ID")
    private Integer restaurantId;

    @ApiModelProperty(value = "状态:1=下架,2=上架")
    private Integer status;

    @ApiModelProperty(value = "菜名")
    private String name;

    @ApiModelProperty(value = "子标题")
    private String subname;

    @ApiModelProperty(value = "类型 1=套餐，2=单品")
    private Integer typee;

    @ApiModelProperty(value = "营业类型：1=早餐,2=午餐，3=晚餐")
    private Integer openType;

    @ApiModelProperty(value = "原价")
    private BigDecimal price;

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

    @ApiModelProperty(value = "排序,数值越大越靠前")
    private Integer sort;

    @ApiModelProperty(value = "创建者ID")
    private Integer adminId;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "需要的餐盒数量")
    private Integer packageCount;

    @ApiModelProperty(value = "折扣：0..1，例如打9折=0.9")
    private BigDecimal discount;

    @ApiModelProperty(value = "餐点小图")
    private String smallImage;

    @ApiModelProperty(value = "真实销量")
    private Integer salesNum;

    @ApiModelProperty(value = "虚假销量")
    private Integer shamNum;

    @ApiModelProperty(value = "是否推荐 0否 1推荐")
    private Integer isRecommend;

    @ApiModelProperty(value = "推荐的排序")
    private Integer recommendSort;

    @ApiModelProperty(value = "口味选择类型 1=多选,2=单选")
    private Integer tasteSelectType;

    @ApiModelProperty(value = "口味选项标题名称，默认值(口味(选填))")
    private String tasteSelectName;

    @ApiModelProperty(value = "存货编码")
    private String cinvcode;

    @ApiModelProperty(value = "存货编码名称")
    private String cinvcodeName;

    @ApiModelProperty(value = "页签名称")
    private String labelName;

    @ApiModelProperty(value = "是否热销： 1:不是,2:是热销")
    private Integer isHot;

    @ApiModelProperty(value = "餐点起购份数")
    private Integer orderMinCount;

    @ApiModelProperty(value = "是否有必选品,0没有,1有")
    private Integer isNecessary;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public Integer getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(Integer salesNum) {
        this.salesNum = salesNum;
    }

    public Integer getShamNum() {
        return shamNum;
    }

    public void setShamNum(Integer shamNum) {
        this.shamNum = shamNum;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getRecommendSort() {
        return recommendSort;
    }

    public void setRecommendSort(Integer recommendSort) {
        this.recommendSort = recommendSort;
    }

    public Integer getTasteSelectType() {
        return tasteSelectType;
    }

    public void setTasteSelectType(Integer tasteSelectType) {
        this.tasteSelectType = tasteSelectType;
    }

    public String getTasteSelectName() {
        return tasteSelectName;
    }

    public void setTasteSelectName(String tasteSelectName) {
        this.tasteSelectName = tasteSelectName;
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

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getOrderMinCount() {
        return orderMinCount;
    }

    public void setOrderMinCount(Integer orderMinCount) {
        this.orderMinCount = orderMinCount;
    }

    public Integer getIsNecessary() {
        return isNecessary;
    }

    public void setIsNecessary(Integer isNecessary) {
        this.isNecessary = isNecessary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", restaurantId=").append(restaurantId);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", subname=").append(subname);
        sb.append(", typee=").append(typee);
        sb.append(", openType=").append(openType);
        sb.append(", price=").append(price);
        sb.append(", img=").append(img);
        sb.append(", storyTitle=").append(storyTitle);
        sb.append(", storyContent=").append(storyContent);
        sb.append(", detail=").append(detail);
        sb.append(", remark=").append(remark);
        sb.append(", sort=").append(sort);
        sb.append(", adminId=").append(adminId);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", packageCount=").append(packageCount);
        sb.append(", discount=").append(discount);
        sb.append(", smallImage=").append(smallImage);
        sb.append(", salesNum=").append(salesNum);
        sb.append(", shamNum=").append(shamNum);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", recommendSort=").append(recommendSort);
        sb.append(", tasteSelectType=").append(tasteSelectType);
        sb.append(", tasteSelectName=").append(tasteSelectName);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", cinvcodeName=").append(cinvcodeName);
        sb.append(", labelName=").append(labelName);
        sb.append(", isHot=").append(isHot);
        sb.append(", orderMinCount=").append(orderMinCount);
        sb.append(", isNecessary=").append(isNecessary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}