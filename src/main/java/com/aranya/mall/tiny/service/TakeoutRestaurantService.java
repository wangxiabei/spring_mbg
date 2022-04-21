package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantQueryParam;
import com.aranya.mall.tiny.mbg.model.TakeoutRestaurants;

import java.util.Map;

public interface TakeoutRestaurantService {
    Map selectById(long id);

    CommonPage<TakeoutRestaurantDto> getList(TakeoutRestaurantQueryParam param, Integer pageSize, Integer pageNum);


    TakeoutRestaurantDto getById(long id);


    int updateRestaurant(TakeoutRestaurantDto dto);


    int addRestaurant(TakeoutRestaurantDto dto);

}
