package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallMenus;
import com.aranya.mall.tiny.mbg.model.MallMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallMenusMapper {
    long countByExample(MallMenusExample example);

    int deleteByExample(MallMenusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallMenus record);

    int insertSelective(MallMenus record);

    List<MallMenus> selectByExample(MallMenusExample example);

    MallMenus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallMenus record, @Param("example") MallMenusExample example);

    int updateByExample(@Param("record") MallMenus record, @Param("example") MallMenusExample example);

    int updateByPrimaryKeySelective(long record);

    int updateByPrimaryKey(MallMenus record);
}