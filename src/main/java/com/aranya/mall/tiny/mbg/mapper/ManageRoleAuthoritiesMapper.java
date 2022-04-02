package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.ManageRoleAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageRoleAuthoritiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageRoleAuthoritiesMapper {
    long countByExample(ManageRoleAuthoritiesExample example);

    int deleteByExample(ManageRoleAuthoritiesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ManageRoleAuthorities record);

    int insertSelective(ManageRoleAuthorities record);

    List<ManageRoleAuthorities> selectByExample(ManageRoleAuthoritiesExample example);

    ManageRoleAuthorities selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ManageRoleAuthorities record, @Param("example") ManageRoleAuthoritiesExample example);

    int updateByExample(@Param("record") ManageRoleAuthorities record, @Param("example") ManageRoleAuthoritiesExample example);

    int updateByPrimaryKeySelective(ManageRoleAuthorities record);

    int updateByPrimaryKey(ManageRoleAuthorities record);
}