package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.ManageRoles;
import com.aranya.mall.tiny.mbg.model.ManageRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageRolesMapper {
    long countByExample(ManageRolesExample example);

    int deleteByExample(ManageRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ManageRoles record);

    int insertSelective(ManageRoles record);

    List<ManageRoles> selectByExample(ManageRolesExample example);

    ManageRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ManageRoles record, @Param("example") ManageRolesExample example);

    int updateByExample(@Param("record") ManageRoles record, @Param("example") ManageRolesExample example);

    int updateByPrimaryKeySelective(ManageRoles record);

    int updateByPrimaryKey(ManageRoles record);
}