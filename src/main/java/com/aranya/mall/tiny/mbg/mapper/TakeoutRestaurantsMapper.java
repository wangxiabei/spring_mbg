package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutRestaurants;
import com.aranya.mall.tiny.mbg.model.TakeoutRestaurantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutRestaurantsMapper {
    long countByExample(TakeoutRestaurantsExample example);

    int deleteByExample(TakeoutRestaurantsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutRestaurants record);

    int insertSelective(TakeoutRestaurants record);

    List<TakeoutRestaurants> selectByExample(TakeoutRestaurantsExample example);

    TakeoutRestaurants selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutRestaurants record, @Param("example") TakeoutRestaurantsExample example);

    int updateByExample(@Param("record") TakeoutRestaurants record, @Param("example") TakeoutRestaurantsExample example);

    int updateByPrimaryKeySelective(TakeoutRestaurants record);

    int updateByPrimaryKey(TakeoutRestaurants record);
}