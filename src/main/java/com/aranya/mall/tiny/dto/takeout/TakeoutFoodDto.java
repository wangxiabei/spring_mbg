package com.aranya.mall.tiny.dto.takeout;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TakeoutFoodDto {
    private Long id;

    private Integer restaurantId;

    private Integer status;

    private String name;

    private Integer openType;

    private BigDecimal price;

    private String img;

    private Integer adminId;

    private Date deletedAt;

    private Date createdAt;

    private Date updatedAt;

    private String smallImage;

    private Integer isRecommend;

    private Integer recommendSort;

    private Integer sort;
}
