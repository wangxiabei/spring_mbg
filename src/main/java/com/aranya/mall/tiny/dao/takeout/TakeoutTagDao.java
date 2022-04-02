package com.aranya.mall.tiny.dao.takeout;

import com.aranya.mall.tiny.mbg.model.TakeoutTags;

import java.util.List;

public interface TakeoutTagDao {
    List<TakeoutTags> selectByRestaurantId(long id);
}
