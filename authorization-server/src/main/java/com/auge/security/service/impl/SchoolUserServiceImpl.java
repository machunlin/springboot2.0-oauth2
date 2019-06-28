package com.auge.security.service.impl;


import com.auge.security.mapper.SchoolUserMapper;
import com.auge.security.model.SchoolUser;
import com.auge.security.service.SchoolUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学校用户表 服务实现类
 * </p>
 *
 * @author machunlin
 * @date 2019-06-12
 */
@Service
public class SchoolUserServiceImpl extends ServiceImpl<SchoolUserMapper, SchoolUser> implements SchoolUserService {

}