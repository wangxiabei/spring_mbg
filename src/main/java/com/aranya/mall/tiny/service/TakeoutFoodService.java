package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodDto;

public interface TakeoutFoodService {
    CommonPage<TakeoutFoodDto> foodList(Integer pageSize, Integer pageNum, long restaurantId);

    int updatePosition(TakeoutFoodDto dto);

    int updateRecommend(long id);

    int cancelRecommend(long id);
}
