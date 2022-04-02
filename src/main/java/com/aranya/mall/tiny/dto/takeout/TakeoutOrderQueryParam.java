package com.aranya.mall.tiny.dto.takeout;

import lombok.Data;

@Data
public class TakeoutOrderQueryParam {
    private String orderNo;
    private Integer status;
}
