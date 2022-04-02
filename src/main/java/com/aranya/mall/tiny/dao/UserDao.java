package com.aranya.mall.tiny.dao;

import com.aranya.mall.tiny.mbg.model.Users;

public interface UserDao {
    Users findUserByPhone(String phone);
    Users findUserById(long id);
}
