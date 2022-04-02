package com.aranya.mall.tiny.service.impl;

import cn.hutool.core.date.DateTime;
import com.alibaba.druid.util.StringUtils;
import com.aranya.mall.tiny.dao.AdminRoleDao;
import com.aranya.mall.tiny.dto.ManageRoleDto;
import com.aranya.mall.tiny.mbg.mapper.ManageRolesMapper;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageRoles;
import com.aranya.mall.tiny.mbg.model.ManageRolesExample;
import com.aranya.mall.tiny.service.ManageRoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageRoleServiceImpl implements ManageRoleService {
    @Autowired
    private ManageRolesMapper mapper;
    @Autowired
    private AdminRoleDao roleDao;

    @Override
    public List<ManageRoles> list(Integer pageNum, Integer pageSize, String name) {
        PageHelper.startPage(pageNum,pageSize);
        ManageRolesExample example = new ManageRolesExample();
        if (!StringUtils.isEmpty(name)){
            example.createCriteria().andNameLike(name);
        }
        return mapper.selectByExample(example);
    }

    @Override
    public int add(ManageRoleDto dto) {
        ManageRoles roles = new ManageRoles();
        BeanUtils.copyProperties(dto,roles);
        return mapper.insertSelective(roles);
    }

    @Override
    public int deleteRole(Integer id) {
        ManageRoles role = new ManageRoles();
        role.setDeletedAt(DateTime.now());
        ManageRolesExample example = new ManageRolesExample();
        example.createCriteria().andIdEqualTo(id.longValue());
        return mapper.updateByExampleSelective(role, example);
    }

    @Override
    public List<ManageAuthorities> authList(Integer pageNum, Integer pageSize, Integer role_id) {
        PageHelper.startPage(pageNum,pageSize);
        return roleDao.getAuthListByRoleId(role_id);
    }

    @Override
    public ManageRoles findById(Integer id) {
        return mapper.selectByPrimaryKey(id.longValue());
    }
}
