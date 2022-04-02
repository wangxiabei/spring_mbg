package com.aranya.mall.tiny.mapper.takeout;

import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDto;
import com.aranya.mall.tiny.mbg.model.TakeoutOrders;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-02T14:48:01+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public TakeoutOrderDto toDto(TakeoutOrders orders) {
        if ( orders == null ) {
            return null;
        }

        TakeoutOrderDto takeoutOrderDto = new TakeoutOrderDto();

        takeoutOrderDto.setRestaurant_name( orders.getRestaurantName() );
        takeoutOrderDto.setOrder_no( orders.getOrderNo() );
        takeoutOrderDto.setDelivery_type( orders.getDeliveryType() );
        takeoutOrderDto.setCreated_at( orders.getCreatedAt() );
        takeoutOrderDto.setDeliveryer_name( orders.getDeliveryerName() );
        takeoutOrderDto.setPackage_count( orders.getPackageCount() );
        takeoutOrderDto.setBook_time( orders.getBookingDeliveryAt() );
        takeoutOrderDto.setId( orders.getId() );
        takeoutOrderDto.setAmount( orders.getAmount() );
        takeoutOrderDto.setStatus( orders.getStatus() );
        takeoutOrderDto.setAddress( orders.getAddress() );

        return takeoutOrderDto;
    }

    @Override
    public List<TakeoutOrderDto> toListDto(List<TakeoutOrders> orders) {
        if ( orders == null ) {
            return null;
        }

        List<TakeoutOrderDto> list = new ArrayList<TakeoutOrderDto>( orders.size() );
        for ( TakeoutOrders takeoutOrders : orders ) {
            list.add( toDto( takeoutOrders ) );
        }

        return list;
    }

    @Override
    public TakeoutOrders toDo(TakeoutOrderDto dto) {
        if ( dto == null ) {
            return null;
        }

        TakeoutOrders takeoutOrders = new TakeoutOrders();

        takeoutOrders.setRestaurantName( dto.getRestaurant_name() );
        takeoutOrders.setOrderNo( dto.getOrder_no() );
        takeoutOrders.setDeliveryType( dto.getDelivery_type() );
        takeoutOrders.setCreatedAt( dto.getCreated_at() );
        takeoutOrders.setId( dto.getId() );
        takeoutOrders.setAmount( dto.getAmount() );
        takeoutOrders.setStatus( dto.getStatus() );
        takeoutOrders.setAddress( dto.getAddress() );

        return takeoutOrders;
    }
}
