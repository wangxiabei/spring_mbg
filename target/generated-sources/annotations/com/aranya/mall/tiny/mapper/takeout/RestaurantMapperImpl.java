package com.aranya.mall.tiny.mapper.takeout;

import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantDto;
import com.aranya.mall.tiny.mbg.model.TakeoutRestaurants;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-20T10:52:53+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public TakeoutRestaurantDto toDto(TakeoutRestaurants restaurants) {
        if ( restaurants == null ) {
            return null;
        }

        TakeoutRestaurantDto takeoutRestaurantDto = new TakeoutRestaurantDto();

        if ( restaurants.getId() != null ) {
            takeoutRestaurantDto.setId( restaurants.getId() );
        }
        takeoutRestaurantDto.setName( restaurants.getName() );
        takeoutRestaurantDto.setSort( restaurants.getSort() );
        takeoutRestaurantDto.setDepartmentId( restaurants.getDepartmentId() );
        takeoutRestaurantDto.setStatus( restaurants.getStatus() );
        takeoutRestaurantDto.setDeliveryFastestTime( restaurants.getDeliveryFastestTime() );
        takeoutRestaurantDto.setDeliverySlowestTime( restaurants.getDeliverySlowestTime() );
        takeoutRestaurantDto.setListImg( restaurants.getListImg() );
        takeoutRestaurantDto.setDetailImg( restaurants.getDetailImg() );

        return takeoutRestaurantDto;
    }

    @Override
    public TakeoutRestaurants toDo(TakeoutRestaurantDto dto) {
        if ( dto == null ) {
            return null;
        }

        TakeoutRestaurants takeoutRestaurants = new TakeoutRestaurants();

        takeoutRestaurants.setId( dto.getId() );
        takeoutRestaurants.setName( dto.getName() );
        takeoutRestaurants.setDepartmentId( dto.getDepartmentId() );
        takeoutRestaurants.setStatus( dto.getStatus() );
        takeoutRestaurants.setDeliveryFastestTime( dto.getDeliveryFastestTime() );
        takeoutRestaurants.setDeliverySlowestTime( dto.getDeliverySlowestTime() );
        takeoutRestaurants.setSort( dto.getSort() );
        takeoutRestaurants.setListImg( dto.getListImg() );
        takeoutRestaurants.setDetailImg( dto.getDetailImg() );

        return takeoutRestaurants;
    }
}
