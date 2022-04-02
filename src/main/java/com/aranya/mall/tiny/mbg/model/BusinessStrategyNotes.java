package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class BusinessStrategyNotes implements Serializable {
    private Long id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "子标题")
    private String subTitle;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "排序")
    private Integer position;

    @ApiModelProperty(value = "admin")
    private Integer adminId;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    @ApiModelProperty(value = "上下架1上架2下架")
    private Integer status;

    @ApiModelProperty(value = "图片url")
    private String image;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "收藏总数")
    private Integer collectCount;

    @ApiModelProperty(value = "文章分享类型.0小程序,1是H5")
    private Integer shareType;

    @ApiModelProperty(value = "分享出去的H5,是否要展示返回App的按钮.0不展示.1展示")
    private Integer showGoback;

    @ApiModelProperty(value = "后台管理员填写的虚假收藏数")
    private Integer forgeCollectCount;

    @ApiModelProperty(value = "阿那亚城市项目编码 1秦皇岛,2广州,3三亚,4金山岭 5雾灵山")
    private String regionCode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getShareType() {
        return shareType;
    }

    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    public Integer getShowGoback() {
        return showGoback;
    }

    public void setShowGoback(Integer showGoback) {
        this.showGoback = showGoback;
    }

    public Integer getForgeCollectCount() {
        return forgeCollectCount;
    }

    public void setForgeCollectCount(Integer forgeCollectCount) {
        this.forgeCollectCount = forgeCollectCount;
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
        sb.append(", title=").append(title);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", content=").append(content);
        sb.append(", position=").append(position);
        sb.append(", adminId=").append(adminId);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", status=").append(status);
        sb.append(", image=").append(image);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", shareType=").append(shareType);
        sb.append(", showGoback=").append(showGoback);
        sb.append(", forgeCollectCount=").append(forgeCollectCount);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}