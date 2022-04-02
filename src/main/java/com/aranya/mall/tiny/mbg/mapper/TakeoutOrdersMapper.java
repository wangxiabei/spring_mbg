package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutOrders;
import com.aranya.mall.tiny.mbg.model.TakeoutOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutOrdersMapper {
    long countByExample(TakeoutOrdersExample example);

    int deleteByExample(TakeoutOrdersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutOrders record);

    int insertSelective(TakeoutOrders record);

    List<TakeoutOrders> selectByExample(TakeoutOrdersExample example);

    TakeoutOrders selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutOrders record, @Param("example") TakeoutOrdersExample example);

    int updateByExample(@Param("record") TakeoutOrders record, @Param("example") TakeoutOrdersExample example);

    int updateByPrimaryKeySelective(TakeoutOrders record);

    int updateByPrimaryKey(TakeoutOrders record);
}