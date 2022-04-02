package com.aranya.mall.tiny.service.impl;

import com.aranya.mall.tiny.common.utils.JwtTokenUtil;
import com.aranya.mall.tiny.config.JwtAuthenticationTokenFilter;
import com.aranya.mall.tiny.dao.AdminDao;
import com.aranya.mall.tiny.dao.AdminRoleDao;
import com.aranya.mall.tiny.mbg.mapper.AdminsMapper;
import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.mbg.model.AdminsExample;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.mbg.model.ManageRoles;
import com.aranya.mall.tiny.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Autowired
    private AdminsMapper mapper;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AdminRoleDao adminRoleDao;
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admins getByPhone(String phone) {
        AdminsExample example = new AdminsExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<Admins> adminsList = mapper.selectByExample(example);
        if (adminsList.size() > 0 && adminsList != null){
            return adminsList.get(0);
        }
        return null;
    }

    @Override
    public String login(String username, String password) {
        LOGGER.info(username);
        LOGGER.info(password);
        String token = null;
//        try{
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            LOGGER.info(userDetails.getUsername());
            LOGGER.info(userDetails.getPassword());
            if (!passwordEncoder.matches(password, userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token = jwtTokenUtil.generateToken(userDetails);
//        }catch (AuthenticationException e){
//
//        }
        return token;
    }

    @Override
    public List<ManageAuthorities> getAuthList(Long adminId) {
        return adminRoleDao.getAuthList(adminId);
    }

    @Override
    public Admins findByPhone(String phone) {
        return adminDao.findByPhone(phone);
    }

    @Override
    public List<Admins> selectUserAndRole(String phone) {
        return mapper.selectUserAndRole(phone);
    }


}
