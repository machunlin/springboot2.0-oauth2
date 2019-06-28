package com.auge.security.mapper;


import com.auge.security.model.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户权限关联表 Mapper 接口
 * </p>
 *
 * @author machunlin
 * @date 2019-06-12
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
}
