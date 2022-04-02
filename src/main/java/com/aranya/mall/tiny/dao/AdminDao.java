package com.aranya.mall.tiny.dao;

import com.aranya.mall.tiny.mbg.model.Admins;

public interface AdminDao {
    Admins findByPhone(String phone);
}
