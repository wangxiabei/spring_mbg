package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutFoodTastes;
import com.aranya.mall.tiny.mbg.model.TakeoutFoodTastesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutFoodTastesMapper {
    long countByExample(TakeoutFoodTastesExample example);

    int deleteByExample(TakeoutFoodTastesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutFoodTastes record);

    int insertSelective(TakeoutFoodTastes record);

    List<TakeoutFoodTastes> selectByExample(TakeoutFoodTastesExample example);

    TakeoutFoodTastes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutFoodTastes record, @Param("example") TakeoutFoodTastesExample example);

    int updateByExample(@Param("record") TakeoutFoodTastes record, @Param("example") TakeoutFoodTastesExample example);

    int updateByPrimaryKeySelective(TakeoutFoodTastes record);

    int updateByPrimaryKey(TakeoutFoodTastes record);
}