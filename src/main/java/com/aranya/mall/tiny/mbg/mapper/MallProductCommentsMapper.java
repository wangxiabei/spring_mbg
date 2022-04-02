package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallProductComments;
import com.aranya.mall.tiny.mbg.model.MallProductCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallProductCommentsMapper {
    long countByExample(MallProductCommentsExample example);

    int deleteByExample(MallProductCommentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallProductComments record);

    int insertSelective(MallProductComments record);

    List<MallProductComments> selectByExample(MallProductCommentsExample example);

    MallProductComments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallProductComments record, @Param("example") MallProductCommentsExample example);

    int updateByExample(@Param("record") MallProductComments record, @Param("example") MallProductCommentsExample example);

    int updateByPrimaryKeySelective(MallProductComments record);

    int updateByPrimaryKey(MallProductComments record);
}