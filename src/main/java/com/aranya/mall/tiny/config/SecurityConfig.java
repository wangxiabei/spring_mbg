package com.aranya.mall.tiny.config;

import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.service.AdminService;
import com.aranya.mall.tiny.service.UserService;
import com.aranya.mall.tiny.service.impl.AdminUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
    @Autowired
    private AdminService adminService;
    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;
    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() //??????????????????JWT????????????????????????csrf
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //??????token,???????????????session
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/","/*.html","/favicon.ico","/**/*.html","/**/*.css","/**/*.js","/swagger-resources/**","/v2/api-docs/**") // ????????????????????????????????????????????????
                .permitAll()
                .antMatchers("/admins/login","/admins/register","/session/login") //????????????????????????????????????
                .permitAll()
                .antMatchers(HttpMethod.OPTIONS) //??????????????????????????????options??????
                .permitAll()
//                .antMatchers("/**")
//                .permitAll() //?????????????????????
                .anyRequest() // ???????????????????????????????????????????????????
                .authenticated(); //????????????????????????
        //????????????
        http.headers().cacheControl();
         //??????JWT filter
        http.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //????????????????????????????????????????????????
        http.exceptionHandling().accessDeniedHandler(restfulAccessDeniedHandler).authenticationEntryPoint(restAuthenticationEntryPoint);

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        logger.info(auth.toString());
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
           Admins admin = adminService.getByPhone(username);
            logger.info(admin.getPassword());
           if (admin != null){
               List<ManageAuthorities> manageAuthoritiesList = adminService.getAuthList(admin.getId());
               logger.info("?????????");
               return new AdminUserDetails(admin,manageAuthoritiesList);
           }
           throw new UsernameNotFoundException("?????????????????????");
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter(){
        return new JwtAuthenticationTokenFilter();
    }
}
