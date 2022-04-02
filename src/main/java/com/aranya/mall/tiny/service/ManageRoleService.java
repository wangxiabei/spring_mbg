package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.dto.ManageRoleDto;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageRoles;

import java.util.List;

public interface ManageRoleService {
    List<ManageRoles> list(Integer pageNum, Integer pageSize, String name);
    int add(ManageRoleDto dto);
    int deleteRole(Integer id);
    List<ManageAuthorities> authList(Integer pageNum, Integer pageSize, Integer role_id);
    ManageRoles findById(Integer id);
 }
