package com.aranya.mall.tiny.service;
import com.aranya.mall.tiny.mbg.model.Users;

public interface UserService {
    Users getByPhone(String phone);
    String login(String username, String password);
    Users findUserByPhone(String phone);

}
