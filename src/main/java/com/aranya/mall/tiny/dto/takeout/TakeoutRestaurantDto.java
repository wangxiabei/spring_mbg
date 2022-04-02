package com.aranya.mall.tiny.dto.takeout;
import lombok.Data;
@Data
public class TakeoutRestaurantDto {

    private long id;
    private String name;
    private Integer sort;
    private Integer departmentId;
    private Integer status;
    private Integer deliveryFastestTime;
    private Integer deliverySlowestTime;
    private String listImg;
    private String detailImg;

}
