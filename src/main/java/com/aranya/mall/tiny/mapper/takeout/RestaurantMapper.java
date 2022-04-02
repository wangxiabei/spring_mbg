package com.aranya.mall.tiny.mapper.takeout;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantDto;
import com.aranya.mall.tiny.mbg.model.TakeoutRestaurants;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring") //符合spring编程规范。依赖注入。使用 @Autowired获取mapper
public interface RestaurantMapper {
    TakeoutRestaurantDto toDto(TakeoutRestaurants restaurants);

    TakeoutRestaurants toDo(TakeoutRestaurantDto dto);

}
