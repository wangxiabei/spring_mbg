package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallProductAttrs;
import com.aranya.mall.tiny.mbg.model.MallProductAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProductAttrsMapper {
    long countByExample(MallProductAttrsExample example);

    int deleteByExample(MallProductAttrsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallProductAttrs record);

    int insertSelective(MallProductAttrs record);

    List<MallProductAttrs> selectByExample(MallProductAttrsExample example);

    MallProductAttrs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallProductAttrs record, @Param("example") MallProductAttrsExample example);

    int updateByExample(@Param("record") MallProductAttrs record, @Param("example") MallProductAttrsExample example);

    int updateByPrimaryKeySelective(MallProductAttrs record);

    int updateByPrimaryKey(MallProductAttrs record);
}