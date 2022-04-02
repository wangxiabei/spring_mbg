package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallOrders;
import com.aranya.mall.tiny.mbg.model.MallOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallOrdersMapper {
    long countByExample(MallOrdersExample example);

    int deleteByExample(MallOrdersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallOrders record);

    int insertSelective(MallOrders record);

    List<MallOrders> selectByExample(MallOrdersExample example);

    MallOrders selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallOrders record, @Param("example") MallOrdersExample example);

    int updateByExample(@Param("record") MallOrders record, @Param("example") MallOrdersExample example);

    int updateByPrimaryKeySelective(MallOrders record);

    int updateByPrimaryKey(MallOrders record);
}