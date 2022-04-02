package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutRestaurantTags;
import com.aranya.mall.tiny.mbg.model.TakeoutRestaurantTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutRestaurantTagsMapper {
    long countByExample(TakeoutRestaurantTagsExample example);

    int deleteByExample(TakeoutRestaurantTagsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutRestaurantTags record);

    int insertSelective(TakeoutRestaurantTags record);

    List<TakeoutRestaurantTags> selectByExample(TakeoutRestaurantTagsExample example);

    TakeoutRestaurantTags selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutRestaurantTags record, @Param("example") TakeoutRestaurantTagsExample example);

    int updateByExample(@Param("record") TakeoutRestaurantTags record, @Param("example") TakeoutRestaurantTagsExample example);

    int updateByPrimaryKeySelective(TakeoutRestaurantTags record);

    int updateByPrimaryKey(TakeoutRestaurantTags record);
}