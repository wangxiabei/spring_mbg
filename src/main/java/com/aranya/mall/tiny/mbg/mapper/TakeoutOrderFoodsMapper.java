package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoods;
import com.aranya.mall.tiny.mbg.model.TakeoutOrderFoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutOrderFoodsMapper {
    long countByExample(TakeoutOrderFoodsExample example);

    int deleteByExample(TakeoutOrderFoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutOrderFoods record);

    int insertSelective(TakeoutOrderFoods record);

    List<TakeoutOrderFoods> selectByExample(TakeoutOrderFoodsExample example);

    TakeoutOrderFoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutOrderFoods record, @Param("example") TakeoutOrderFoodsExample example);

    int updateByExample(@Param("record") TakeoutOrderFoods record, @Param("example") TakeoutOrderFoodsExample example);

    int updateByPrimaryKeySelective(TakeoutOrderFoods record);

    int updateByPrimaryKey(TakeoutOrderFoods record);
}