package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageRoles;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

public interface AdminService {
    Admins getByPhone(String phone);
    String login(String username, String password);
    List<ManageAuthorities> getAuthList(Long adminId);
    Admins findByPhone(String phone);
    List<Admins> selectUserAndRole(String phone);

}
