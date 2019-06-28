package com.auge.security.mapper;


import com.auge.security.model.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author machunlin
 * @date 2019-06-12
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
