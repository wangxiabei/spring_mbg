package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MallProducts implements Serializable {
    private Long id;

    @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

    @ApiModelProperty(value = "菜单id")
    private Integer menuId;

    @ApiModelProperty(value = "创建者id")
    private Integer adminId;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "原价")
    private BigDecimal price;

    @ApiModelProperty(value = "折扣价")
    private BigDecimal discountPrice;

    @ApiModelProperty(value = "列表小图")
    private String smallImg;

    @ApiModelProperty(value = "详情小图")
    private String bigImg;

    @ApiModelProperty(value = "库存")
    private Integer num;

    @ApiModelProperty(value = "剩余库存")
    private Integer leftNum;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "销售总数量")
    private Integer salesNum;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "是否推荐 0正常 1推荐")
    private Integer isRecommend;

    @ApiModelProperty(value = "商品重量(kg)")
    private BigDecimal weight;

    @ApiModelProperty(value = "商品的文字描述,不包含图片")
    private String description;

    @ApiModelProperty(value = "评论数量")
    private Integer commentCount;

    @ApiModelProperty(value = "商品上下架 0:下架 1:上架")
    private Integer isOnshelf;

    @ApiModelProperty(value = "商品是否有sku 0没有 1有")
    private Integer isSku;

    @ApiModelProperty(value = "商品排序")
    private Integer position;

    @ApiModelProperty(value = "畅销商品排序")
    private Integer salesPosition;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public String getBigImg() {
        return bigImg;
    }

    public void setBigImg(String bigImg) {
        this.bigImg = bigImg;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(Integer leftNum) {
        this.leftNum = leftNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(Integer salesNum) {
        this.salesNum = salesNum;
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

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getIsOnshelf() {
        return isOnshelf;
    }

    public void setIsOnshelf(Integer isOnshelf) {
        this.isOnshelf = isOnshelf;
    }

    public Integer getIsSku() {
        return isSku;
    }

    public void setIsSku(Integer isSku) {
        this.isSku = isSku;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getSalesPosition() {
        return salesPosition;
    }

    public void setSalesPosition(Integer salesPosition) {
        this.salesPosition = salesPosition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", menuId=").append(menuId);
        sb.append(", adminId=").append(adminId);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", smallImg=").append(smallImg);
        sb.append(", bigImg=").append(bigImg);
        sb.append(", num=").append(num);
        sb.append(", leftNum=").append(leftNum);
        sb.append(", remark=").append(remark);
        sb.append(", salesNum=").append(salesNum);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", weight=").append(weight);
        sb.append(", description=").append(description);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", isOnshelf=").append(isOnshelf);
        sb.append(", isSku=").append(isSku);
        sb.append(", position=").append(position);
        sb.append(", salesPosition=").append(salesPosition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}