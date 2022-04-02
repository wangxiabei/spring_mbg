package com.aranya.mall.tiny.mapper.takeout;

import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDto;
import com.aranya.mall.tiny.mbg.model.TakeoutOrders;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface OrderMapper {

    @Mappings({
            @Mapping(source = "restaurantName", target = "restaurant_name"),
            @Mapping(source = "orderNo", target = "order_no"),
            @Mapping(source = "deliveryType", target = "delivery_type"),
            @Mapping(source = "createdAt", target = "created_at",dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "deliveryerName", target = "deliveryer_name"),
            @Mapping(source = "packageCount", target = "package_count"),
            @Mapping(source = "bookingDeliveryAt", target = "book_time"),
    })
    TakeoutOrderDto toDto(TakeoutOrders orders);

    List<TakeoutOrderDto> toListDto(List<TakeoutOrders> orders);

    @Mappings({
            @Mapping(source = "restaurant_name", target  = "restaurantName"),
            @Mapping(source = "order_no", target = "orderNo"),
            @Mapping(source = "delivery_type", target = "deliveryType"),
            @Mapping(source = "created_at", target = "createdAt"),
    })
    TakeoutOrders toDo(TakeoutOrderDto dto);

}
