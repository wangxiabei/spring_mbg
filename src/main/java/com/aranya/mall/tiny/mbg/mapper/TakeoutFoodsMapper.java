package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutFoods;
import com.aranya.mall.tiny.mbg.model.TakeoutFoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutFoodsMapper {
    long countByExample(TakeoutFoodsExample example);

    int deleteByExample(TakeoutFoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutFoods record);

    int insertSelective(TakeoutFoods record);

    List<TakeoutFoods> selectByExample(TakeoutFoodsExample example);

    TakeoutFoods selectByPrimaryKey(long id);

    int updateByExampleSelective(@Param("record") TakeoutFoods record, @Param("example") TakeoutFoodsExample example);

    int updateByExample(@Param("record") TakeoutFoods record, @Param("example") TakeoutFoodsExample example);

    int updateByPrimaryKeySelective(TakeoutFoods record);

    int updateByPrimaryKey(TakeoutFoods record);
}