package cn.merryyou.security.model;


import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author machunlin
 * @date 2019/6/14
 */
@TableName("sys_role")
public class Role extends BaseModel {

    private static final long serialVersionUID = 2341334603483056622L;

    //编号
    private String code;

    //名称
    private String name;

    //类型 0平台 1 学校 2区域
    private Integer type;

    //学校id或区域id，平台默认 0
    private Long organizationId;

    //是否默认 0 否1是
    private Integer isDefault;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "Role{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", organizationId=" + organizationId +
                ", isDefault=" + isDefault +
                "} " + super.toString();
    }
}
