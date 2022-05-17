package com.aranya.mall.tiny.dto.takeout;

import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoodTastes;
import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoods;
import com.aranya.mall.tiny.mbg.model.TakeoutOrders;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class TakeoutOrderDetail extends TakeoutOrders{
//    private Integer restaurantId;
//    private String orderNo;
//    private BigDecimal amount;
//    //订单信息
//    private TakeoutOrders takeoutOrders;
//
//    //订单食物
    private List<TakeoutOrderFoods> orderFoodsList;
//    //订单口味
    private List<TakeoutOrderFoodTastes> orderFoodTastesList;
}
