package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutRestaurantDeliveryAreas;
import com.aranya.mall.tiny.mbg.model.TakeoutRestaurantDeliveryAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutRestaurantDeliveryAreasMapper {
    long countByExample(TakeoutRestaurantDeliveryAreasExample example);

    int deleteByExample(TakeoutRestaurantDeliveryAreasExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutRestaurantDeliveryAreas record);

    int insertSelective(TakeoutRestaurantDeliveryAreas record);

    List<TakeoutRestaurantDeliveryAreas> selectByExample(TakeoutRestaurantDeliveryAreasExample example);

    TakeoutRestaurantDeliveryAreas selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutRestaurantDeliveryAreas record, @Param("example") TakeoutRestaurantDeliveryAreasExample example);

    int updateByExample(@Param("record") TakeoutRestaurantDeliveryAreas record, @Param("example") TakeoutRestaurantDeliveryAreasExample example);

    int updateByPrimaryKeySelective(TakeoutRestaurantDeliveryAreas record);

    int updateByPrimaryKey(TakeoutRestaurantDeliveryAreas record);
}