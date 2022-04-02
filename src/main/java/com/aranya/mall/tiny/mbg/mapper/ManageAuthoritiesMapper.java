package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageAuthoritiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageAuthoritiesMapper {
    long countByExample(ManageAuthoritiesExample example);

    int deleteByExample(ManageAuthoritiesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ManageAuthorities record);

    int insertSelective(ManageAuthorities record);

    List<ManageAuthorities> selectByExample(ManageAuthoritiesExample example);

    ManageAuthorities selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ManageAuthorities record, @Param("example") ManageAuthoritiesExample example);

    int updateByExample(@Param("record") ManageAuthorities record, @Param("example") ManageAuthoritiesExample example);

    int updateByPrimaryKeySelective(ManageAuthorities record);

    int updateByPrimaryKey(ManageAuthorities record);
}