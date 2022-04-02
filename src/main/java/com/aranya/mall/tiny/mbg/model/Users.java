package com.aranya.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "真实名称")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "密码随机数")
    private String salt;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "微信头像")
    private String wechatAvatar;

    @ApiModelProperty(value = "住址")
    private String address;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @ApiModelProperty(value = "状态 0=正常, 1=禁用")
    private Integer status;

    @ApiModelProperty(value = "用户类型,0=非会员,1=会员")
    private Integer typee;

    @ApiModelProperty(value = "登陆token")
    private String token;

    @ApiModelProperty(value = "token过期时间")
    private Date tokenExpireTime;

    @ApiModelProperty(value = "微信验证单服务区唯一码")
    private String openid;

    @ApiModelProperty(value = "微信验证全服务区唯一码")
    private String unionid;

    @ApiModelProperty(value = "删除时间")
    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    @ApiModelProperty(value = "个人简介")
    private String desc;

    @ApiModelProperty(value = "用户来源: android、ios、wx_lite")
    private String userSource;

    @ApiModelProperty(value = "民宿小程序openid")
    private String minsuWxLiteOpenid;

    @ApiModelProperty(value = "民宿微信App对应的openid")
    private String minsuWxOpenid;

    @ApiModelProperty(value = "是否房东 0不是，1是房东")
    private Integer isLandlord;

    @ApiModelProperty(value = "项目注册来源 aranya_app=阿那亚app注册,aranya_minsu=阿那亚民宿注册")
    private String projectSource;

    @ApiModelProperty(value = "冻结房东0正常 1冻结 2解冻")
    private Integer isFreeze;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWechatAvatar() {
        return wechatAvatar;
    }

    public void setWechatAvatar(String wechatAvatar) {
        this.wechatAvatar = wechatAvatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTypee() {
        return typee;
    }

    public void setTypee(Integer typee) {
        this.typee = typee;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenExpireTime() {
        return tokenExpireTime;
    }

    public void setTokenExpireTime(Date tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public String getMinsuWxLiteOpenid() {
        return minsuWxLiteOpenid;
    }

    public void setMinsuWxLiteOpenid(String minsuWxLiteOpenid) {
        this.minsuWxLiteOpenid = minsuWxLiteOpenid;
    }

    public String getMinsuWxOpenid() {
        return minsuWxOpenid;
    }

    public void setMinsuWxOpenid(String minsuWxOpenid) {
        this.minsuWxOpenid = minsuWxOpenid;
    }

    public Integer getIsLandlord() {
        return isLandlord;
    }

    public void setIsLandlord(Integer isLandlord) {
        this.isLandlord = isLandlord;
    }

    public String getProjectSource() {
        return projectSource;
    }

    public void setProjectSource(String projectSource) {
        this.projectSource = projectSource;
    }

    public Integer getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nickname=").append(nickname);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", avatar=").append(avatar);
        sb.append(", wechatAvatar=").append(wechatAvatar);
        sb.append(", address=").append(address);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", status=").append(status);
        sb.append(", typee=").append(typee);
        sb.append(", token=").append(token);
        sb.append(", tokenExpireTime=").append(tokenExpireTime);
        sb.append(", openid=").append(openid);
        sb.append(", unionid=").append(unionid);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", desc=").append(desc);
        sb.append(", userSource=").append(userSource);
        sb.append(", minsuWxLiteOpenid=").append(minsuWxLiteOpenid);
        sb.append(", minsuWxOpenid=").append(minsuWxOpenid);
        sb.append(", isLandlord=").append(isLandlord);
        sb.append(", projectSource=").append(projectSource);
        sb.append(", isFreeze=").append(isFreeze);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}