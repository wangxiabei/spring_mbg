package com.aranya.mall.tiny.mapper.takeout;

import com.aranya.mall.tiny.dto.takeout.TakeoutFoodDto;
import com.aranya.mall.tiny.mbg.model.TakeoutFoods;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface FoodMapper {
    TakeoutFoods toDo(TakeoutFoodDto dto);
}
