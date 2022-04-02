package com.aranya.mall.tiny.dao.takeout;

import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoods;

import java.util.List;

public interface TakeoutOrderFoodDao {
    List<TakeoutOrderFoods> selectOrderFoodByOrderId(long orderId);
}
