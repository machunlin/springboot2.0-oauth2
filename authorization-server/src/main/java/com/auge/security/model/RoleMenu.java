package com.auge.security.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 角色菜单权限表
 * </p>
 *
 * @author machunlin
 * @date 2019/6/12
 */
@TableName("sys_role_menu")
public class RoleMenu extends BaseModel {

    private static final long serialVersionUID = 5676027446487141456L;

    //角色主键")
    private Long roleId;

    //菜单主键")
    private Long permId;

    //创建时间")
    private Date createTime;

    //更新时间")
    private Date updateTime;

    //状态 -1:删除,0:停用，1-启用")
    private Integer status;

    //创建用户主键")
    private Long createUserId;

    //更新用户主键")
    private Long updateUserId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermId() {
        return permId;
    }

    public void setPermId(Long permId) {
        this.permId = permId;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "roleId=" + roleId +
                ", permId=" + permId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", createUserId=" + createUserId +
                ", updateUserId=" + updateUserId +
                "} " + super.toString();
    }
}
