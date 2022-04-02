package com.aranya.mall.tiny.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class ValidVO {
    @Length(min = 6,max = 12,message = "appID长度必须位于6到12之间")
    private String appID;

    @NotBlank(message = "名字为必填项")
    private String name;

    @Email(message = "请填写正确的邮箱地址")
    private String email;
    private String sex;

    @NotEmpty(message = "级别不能为空")
    private String level;
}
