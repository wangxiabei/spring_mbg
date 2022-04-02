package com.aranya.mall.tiny.service.impl;

import com.aranya.mall.tiny.common.utils.JwtTokenUtil;
import com.aranya.mall.tiny.dao.UserDao;
import com.aranya.mall.tiny.mbg.mapper.UsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aranya.mall.tiny.mbg.model.Users;
import com.aranya.mall.tiny.mbg.model.UsersExample;
import com.aranya.mall.tiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Users getByPhone(String phone) {
        UsersExample example = new UsersExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<Users> usersList = usersMapper.selectByExample(example);
        if (usersList.size() > 0 && usersList != null){
            return usersList.get(0);
        }
        return null;
    }

    @Override
    public String login(String username, String password) {
        LOGGER.info(username);
        LOGGER.info(password);
        String token = null;
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        LOGGER.info(userDetails.getUsername());
        LOGGER.info(userDetails.getPassword());
        if (!passwordEncoder.matches(password, userDetails.getPassword())){
            throw new BadCredentialsException("密码不正确");
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @Override
    public Users findUserByPhone(String phone) {
        return userDao.findUserByPhone(phone);
    }
}
