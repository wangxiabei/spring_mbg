package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Companies implements Serializable {
    private Long id;

    @ApiModelProperty(value = "公司名称")
    private String name;

    @ApiModelProperty(value = "收款方应用ID,ping++ 里面配置APP_ID")
    private String receiptApp;

    @ApiModelProperty(value = "状态: 0=正常,1=禁用")
    private Integer status;

    @ApiModelProperty(value = "公司联系电话")
    private String phone;

    @ApiModelProperty(value = "创建者ID")
    private Integer adminId;

    @ApiModelProperty(value = "软删除")
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiptApp() {
        return receiptApp;
    }

    public void setReceiptApp(String receiptApp) {
        this.receiptApp = receiptApp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", receiptApp=").append(receiptApp);
        sb.append(", status=").append(status);
        sb.append(", phone=").append(phone);
        sb.append(", adminId=").append(adminId);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}