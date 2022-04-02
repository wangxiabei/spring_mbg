package com.aranya.mall.tiny.service.impl;

import com.aranya.mall.tiny.mbg.mapper.ManageAuthoritiesMapper;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageAuthoritiesExample;
import com.aranya.mall.tiny.service.ManageAuthService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageAuthServiceImpl implements ManageAuthService {
    @Autowired
    private ManageAuthoritiesMapper manageAuthoritiesMapper;


    @Override
    public List<ManageAuthorities> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        ManageAuthoritiesExample example = new ManageAuthoritiesExample();
        return manageAuthoritiesMapper.selectByExample(example);
    }

    @Override
    public int addAuth(ManageAuthorities manageAuthorities) {
        return manageAuthoritiesMapper.insertSelective(manageAuthorities);
    }
}
