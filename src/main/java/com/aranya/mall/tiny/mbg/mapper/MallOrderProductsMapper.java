package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallOrderProducts;
import com.aranya.mall.tiny.mbg.model.MallOrderProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallOrderProductsMapper {
    long countByExample(MallOrderProductsExample example);

    int deleteByExample(MallOrderProductsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallOrderProducts record);

    int insertSelective(MallOrderProducts record);

    List<MallOrderProducts> selectByExample(MallOrderProductsExample example);

    MallOrderProducts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallOrderProducts record, @Param("example") MallOrderProductsExample example);

    int updateByExample(@Param("record") MallOrderProducts record, @Param("example") MallOrderProductsExample example);

    int updateByPrimaryKeySelective(MallOrderProducts record);

    int updateByPrimaryKey(MallOrderProducts record);
}