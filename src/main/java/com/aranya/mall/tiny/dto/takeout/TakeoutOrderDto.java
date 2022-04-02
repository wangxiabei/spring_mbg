package com.aranya.mall.tiny.dto.takeout;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TakeoutOrderDto {
    private Long id;
    private String order_no;
    private BigDecimal amount;
    private Integer status;
    private String address;
    private Integer delivery_type;
    private Date created_at;
    private String restaurant_name;
    private String deliveryer_name;
    private String book_time;
    private Integer package_count;
    private String status_name;
    private String delivery_type_name;
}
