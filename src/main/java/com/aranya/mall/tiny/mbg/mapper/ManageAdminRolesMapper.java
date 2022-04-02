package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.ManageAdminRoles;
import com.aranya.mall.tiny.mbg.model.ManageAdminRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageAdminRolesMapper {
    long countByExample(ManageAdminRolesExample example);

    int deleteByExample(ManageAdminRolesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ManageAdminRoles record);

    int insertSelective(ManageAdminRoles record);

    List<ManageAdminRoles> selectByExample(ManageAdminRolesExample example);

    ManageAdminRoles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ManageAdminRoles record, @Param("example") ManageAdminRolesExample example);

    int updateByExample(@Param("record") ManageAdminRoles record, @Param("example") ManageAdminRolesExample example);

    int updateByPrimaryKeySelective(ManageAdminRoles record);

    int updateByPrimaryKey(ManageAdminRoles record);
}