package com.auge.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018/5/3 0003.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@SpringBootApplication
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启注解
public class ResourceApplication extends ResourceServerConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }

    @RequestMapping(value = "/api")
//    @PreAuthorize("hasRole('ROLE_USER')")
    @PreAuthorize("hasAnyAuthority('student','/student/list','/student/add')")
    public String success() {
        return "SUCCESS";
    }
}
