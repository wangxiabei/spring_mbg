package com.aranya.mall.tiny.service.impl;
import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户信息
 */
public class AdminUserDetails implements UserDetails {
    private Admins admins;
    private List<ManageAuthorities> manageAuthoritiesList;
    public AdminUserDetails(Admins admins, List<ManageAuthorities> manageAuthoritiesList){
        this.admins = admins;
        this.manageAuthoritiesList = manageAuthoritiesList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return manageAuthoritiesList.stream()
                .filter(manageAuthorities -> manageAuthorities.getAction() != null)
                .map(manageAuthorities -> new SimpleGrantedAuthority(manageAuthorities.getAction()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return admins.getPassword();
    }

    @Override
    public String getUsername() {
        return admins.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return admins.getStatus().equals(0);
    }
}
