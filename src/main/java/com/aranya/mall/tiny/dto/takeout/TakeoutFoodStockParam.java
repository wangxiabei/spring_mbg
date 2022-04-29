package com.aranya.mall.tiny.dto.takeout;

import lombok.Data;

import java.util.Date;

@Data
public class TakeoutFoodStockParam {

    private Long id;

    private Date dateTime;

    private Integer stock;
}
