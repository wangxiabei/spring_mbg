package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallProductSkus;
import com.aranya.mall.tiny.mbg.model.MallProductSkusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProductSkusMapper {
    long countByExample(MallProductSkusExample example);

    int deleteByExample(MallProductSkusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallProductSkus record);

    int insertSelective(MallProductSkus record);

    List<MallProductSkus> selectByExample(MallProductSkusExample example);

    MallProductSkus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallProductSkus record, @Param("example") MallProductSkusExample example);

    int updateByExample(@Param("record") MallProductSkus record, @Param("example") MallProductSkusExample example);

    int updateByPrimaryKeySelective(MallProductSkus record);

    int updateByPrimaryKey(MallProductSkus record);
}