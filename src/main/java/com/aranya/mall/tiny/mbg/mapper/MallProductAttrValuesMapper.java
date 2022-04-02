package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallProductAttrValues;
import com.aranya.mall.tiny.mbg.model.MallProductAttrValuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProductAttrValuesMapper {
    long countByExample(MallProductAttrValuesExample example);

    int deleteByExample(MallProductAttrValuesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallProductAttrValues record);

    int insertSelective(MallProductAttrValues record);

    List<MallProductAttrValues> selectByExample(MallProductAttrValuesExample example);

    MallProductAttrValues selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallProductAttrValues record, @Param("example") MallProductAttrValuesExample example);

    int updateByExample(@Param("record") MallProductAttrValues record, @Param("example") MallProductAttrValuesExample example);

    int updateByPrimaryKeySelective(MallProductAttrValues record);

    int updateByPrimaryKey(MallProductAttrValues record);
}