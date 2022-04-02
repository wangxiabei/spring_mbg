package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutTags;
import com.aranya.mall.tiny.mbg.model.TakeoutTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutTagsMapper {
    long countByExample(TakeoutTagsExample example);

    int deleteByExample(TakeoutTagsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutTags record);

    int insertSelective(TakeoutTags record);

    List<TakeoutTags> selectByExample(TakeoutTagsExample example);

    TakeoutTags selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutTags record, @Param("example") TakeoutTagsExample example);

    int updateByExample(@Param("record") TakeoutTags record, @Param("example") TakeoutTagsExample example);

    int updateByPrimaryKeySelective(TakeoutTags record);

    int updateByPrimaryKey(TakeoutTags record);
}