package com.aranya.mall.tiny.dao.takeout;

import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoodTastes;

import java.util.List;

public interface TakeoutOrderFoodTasteDao {
    List<TakeoutOrderFoodTastes> selectFoodTasteByOrderId(long id);
    List<TakeoutOrderFoodTastes> selectFoodTasteByOrderFoodId(long id);
}
