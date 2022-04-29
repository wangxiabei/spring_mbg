package com.aranya.mall.tiny.service;

import cn.hutool.core.date.DateTime;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodStockParam;

public interface TakeoutFoodService {
    CommonPage<TakeoutFoodDto> foodList(Integer pageSize, Integer pageNum, long restaurantId);

    int updatePosition(TakeoutFoodDto dto);

    int updateRecommend(long id);

    int cancelRecommend(long id);

    int setStockDate(TakeoutFoodStockParam param);
}
