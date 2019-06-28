package com.auge.security.config;//package cn.merryyou.security.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created on 2018/1/19.
 *
 * @author zlf
 * @since 1.0
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        AuthenticationManager manager = super.authenticationManagerBean();
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 必须配置，不然OAuth2的http配置不生效----不明觉厉
                .requestMatchers()
                .antMatchers("/oauth/**", "/login", "/login-error")
                .and()
                .authorizeRequests()
                //放行页面
                // .antMatchers("/test/**").permitAll()
                .antMatchers("/oauth/**").authenticated()
                .and()
                // 表单登录
                .formLogin().loginPage("/login").failureUrl("/login-error");

//        http
//                .authorizeRequests()                    //定义权限配置
//                .anyRequest().authenticated()           //任何请求都必须经过认证才能访问
//                .and()
//                .formLogin()                            //定制登录表单
//                .loginPage("/login")                    //设置登录url-定制登录页面
//                .defaultSuccessUrl("/home")             //设置登录成功默认跳转url
//                .permitAll()                            //允许任何人访问登录url
//                .and()
//                .logout().permitAll();
    }
}
