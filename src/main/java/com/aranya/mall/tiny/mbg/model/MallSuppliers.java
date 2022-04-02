package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class MallSuppliers implements Serializable {
    private Long id;

    @ApiModelProperty(value = "供应商名字")
    private String name;

    @ApiModelProperty(value = "创建者id")
    private Integer adminId;

    @ApiModelProperty(value = "所属于部门id")
    private Integer departmentId;

    @ApiModelProperty(value = "状态：1=正常,2=禁用")
    private Integer status;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "软删")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "支付方式 1=支付宝,2=微信,3=业主卡主卡,4=业主卡副卡,5=反租卡主卡,6=反租卡副卡,7=vvip卡，8=员工卡")
    private String payType;

    @ApiModelProperty(value = "退货时联系人名称")
    private String realname;

    @ApiModelProperty(value = "退货时联系人电话")
    private String mobile;

    @ApiModelProperty(value = "退货时联系人地址")
    private String address;

    @ApiModelProperty(value = "退换货类型 0:可退，可换 ,1 只可退, 2 只可换, 3 不可退、不可换")
    private Integer isExchanged;

    @ApiModelProperty(value = "退换货政策")
    private String exchanged;

    @ApiModelProperty(value = "省份id")
    private Integer provinceId;

    @ApiModelProperty(value = "市id")
    private Integer cityId;

    @ApiModelProperty(value = "县id")
    private Integer countyId;

    @ApiModelProperty(value = "客服qq")
    private String serviceQq;

    @ApiModelProperty(value = "是否支持自提.1支持 2不支持")
    private Integer isExtract;

    @ApiModelProperty(value = "自提联系人")
    private String afterSalePhone;

    @ApiModelProperty(value = "自提联系人电话")
    private String afterSaleQq;

    @ApiModelProperty(value = "自提地点")
    private String extractSite;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
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

    public Integer getIsExchanged() {
        return isExchanged;
    }

    public void setIsExchanged(Integer isExchanged) {
        this.isExchanged = isExchanged;
    }

    public String getExchanged() {
        return exchanged;
    }

    public void setExchanged(String exchanged) {
        this.exchanged = exchanged;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getServiceQq() {
        return serviceQq;
    }

    public void setServiceQq(String serviceQq) {
        this.serviceQq = serviceQq;
    }

    public Integer getIsExtract() {
        return isExtract;
    }

    public void setIsExtract(Integer isExtract) {
        this.isExtract = isExtract;
    }

    public String getAfterSalePhone() {
        return afterSalePhone;
    }

    public void setAfterSalePhone(String afterSalePhone) {
        this.afterSalePhone = afterSalePhone;
    }

    public String getAfterSaleQq() {
        return afterSaleQq;
    }

    public void setAfterSaleQq(String afterSaleQq) {
        this.afterSaleQq = afterSaleQq;
    }

    public String getExtractSite() {
        return extractSite;
    }

    public void setExtractSite(String extractSite) {
        this.extractSite = extractSite;
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
        sb.append(", departmentId=").append(departmentId);
        sb.append(", status=").append(status);
        sb.append(", phone=").append(phone);
        sb.append(", remark=").append(remark);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", payType=").append(payType);
        sb.append(", realname=").append(realname);
        sb.append(", mobile=").append(mobile);
        sb.append(", address=").append(address);
        sb.append(", isExchanged=").append(isExchanged);
        sb.append(", exchanged=").append(exchanged);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", countyId=").append(countyId);
        sb.append(", serviceQq=").append(serviceQq);
        sb.append(", isExtract=").append(isExtract);
        sb.append(", afterSalePhone=").append(afterSalePhone);
        sb.append(", afterSaleQq=").append(afterSaleQq);
        sb.append(", extractSite=").append(extractSite);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}