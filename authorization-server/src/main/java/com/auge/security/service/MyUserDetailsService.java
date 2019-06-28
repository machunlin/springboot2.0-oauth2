package com.auge.security.service;

import com.auge.security.mapper.MenuMapper;
import com.auge.security.mapper.SchoolUserMapper;
import com.auge.security.model.Menu;
import com.auge.security.model.SchoolUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义获取登录用户信息。
 *
 * @author zlf
 * @since 1.0
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private SchoolUserMapper schoolUserMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(account)) {
            throw new UsernameNotFoundException("登录账号不能为空");
        }
        SchoolUser user = schoolUserMapper.getByAccount(account);
        validateSchoolUser(user);

        List<Menu> menus = menuMapper.queryByUserId(user.getId(), user.getType());
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Menu menu : menus) {
            if (null == menu.getId() || StringUtils.isEmpty(menu.getModuleUrl())) {
                continue;
            }
            authorities.add(new SimpleGrantedAuthority(menu.getModuleUrl()));
        }
        return new User(account, passwordEncoder.encode(user.getPassword()), authorities);
    }

    private void validateSchoolUser(SchoolUser user) {
        if (null == user) {
            throw new UsernameNotFoundException("登录账号不存在");
        }
        if (user.getStatus() == -1) {
            throw new UsernameNotFoundException("账号已删除");
        }
        if (user.getStatus() == 0) {
            throw new UsernameNotFoundException("账号已停用");
        }
    }
}
