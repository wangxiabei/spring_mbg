package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallProductSkuAttrs;
import com.aranya.mall.tiny.mbg.model.MallProductSkuAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProductSkuAttrsMapper {
    long countByExample(MallProductSkuAttrsExample example);

    int deleteByExample(MallProductSkuAttrsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallProductSkuAttrs record);

    int insertSelective(MallProductSkuAttrs record);

    List<MallProductSkuAttrs> selectByExample(MallProductSkuAttrsExample example);

    MallProductSkuAttrs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallProductSkuAttrs record, @Param("example") MallProductSkuAttrsExample example);

    int updateByExample(@Param("record") MallProductSkuAttrs record, @Param("example") MallProductSkuAttrsExample example);

    int updateByPrimaryKeySelective(MallProductSkuAttrs record);

    int updateByPrimaryKey(MallProductSkuAttrs record);
}