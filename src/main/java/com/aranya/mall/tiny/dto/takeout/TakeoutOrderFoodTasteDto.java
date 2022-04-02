package com.aranya.mall.tiny.dto.takeout;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TakeoutOrderFoodTasteDto {
    private Long id;
    private Integer count;
    private BigDecimal tasteAmount;
    private String name;
}
