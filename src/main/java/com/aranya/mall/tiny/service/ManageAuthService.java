package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.mbg.model.ManageAuthorities;

import java.util.List;

public interface ManageAuthService {
    List<ManageAuthorities> list(Integer pageNum, Integer pageSize);
    int addAuth(ManageAuthorities manageAuthorities);
}
