package com.aranya.mall.tiny.mapper.takeout;

import com.aranya.mall.tiny.dto.takeout.TakeoutFoodDto;
import com.aranya.mall.tiny.mbg.model.TakeoutFoods;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-17T14:29:03+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class FoodMapperImpl implements FoodMapper {

    @Override
    public TakeoutFoods toDo(TakeoutFoodDto dto) {
        if ( dto == null ) {
            return null;
        }

        TakeoutFoods takeoutFoods = new TakeoutFoods();

        takeoutFoods.setId( dto.getId() );
        takeoutFoods.setRestaurantId( dto.getRestaurantId() );
        takeoutFoods.setStatus( dto.getStatus() );
        takeoutFoods.setName( dto.getName() );
        takeoutFoods.setOpenType( dto.getOpenType() );
        takeoutFoods.setPrice( dto.getPrice() );
        takeoutFoods.setImg( dto.getImg() );
        takeoutFoods.setSort( dto.getSort() );
        takeoutFoods.setAdminId( dto.getAdminId() );
        takeoutFoods.setDeletedAt( dto.getDeletedAt() );
        takeoutFoods.setCreatedAt( dto.getCreatedAt() );
        takeoutFoods.setUpdatedAt( dto.getUpdatedAt() );
        takeoutFoods.setSmallImage( dto.getSmallImage() );
        takeoutFoods.setIsRecommend( dto.getIsRecommend() );
        takeoutFoods.setRecommendSort( dto.getRecommendSort() );

        return takeoutFoods;
    }
}
