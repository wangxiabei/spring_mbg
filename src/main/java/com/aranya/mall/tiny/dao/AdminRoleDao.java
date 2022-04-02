package com.aranya.mall.tiny.dao;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import java.util.List;

public interface AdminRoleDao {
    List<ManageAuthorities> getAuthList(long adminID);

    List<ManageAuthorities> getAuthListByRoleId(Integer roleId);
}
