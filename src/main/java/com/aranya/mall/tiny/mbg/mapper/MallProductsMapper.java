package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallProducts;
import com.aranya.mall.tiny.mbg.model.MallProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProductsMapper {
    long countByExample(MallProductsExample example);

    int deleteByExample(MallProductsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallProducts record);

    int insertSelective(MallProducts record);

    List<MallProducts> selectByExample(MallProductsExample example);

    MallProducts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallProducts record, @Param("example") MallProductsExample example);

    int updateByExample(@Param("record") MallProducts record, @Param("example") MallProductsExample example);

    int updateByPrimaryKeySelective(MallProducts record);

    int updateByPrimaryKey(MallProducts record);
}