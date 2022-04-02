package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoodTastes;
import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoodTastesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutOrderFoodTastesMapper {
    long countByExample(TakeoutOrderFoodTastesExample example);

    int deleteByExample(TakeoutOrderFoodTastesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutOrderFoodTastes record);

    int insertSelective(TakeoutOrderFoodTastes record);

    List<TakeoutOrderFoodTastes> selectByExample(TakeoutOrderFoodTastesExample example);

    TakeoutOrderFoodTastes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutOrderFoodTastes record, @Param("example") TakeoutOrderFoodTastesExample example);

    int updateByExample(@Param("record") TakeoutOrderFoodTastes record, @Param("example") TakeoutOrderFoodTastesExample example);

    int updateByPrimaryKeySelective(TakeoutOrderFoodTastes record);

    int updateByPrimaryKey(TakeoutOrderFoodTastes record);
}