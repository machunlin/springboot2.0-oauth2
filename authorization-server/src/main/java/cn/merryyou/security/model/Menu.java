package cn.merryyou.security.model;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author machunlin
 * @date 2019/6/12
 */
@TableName("sys_menu")
public class Menu extends BaseModel {

    private static final long serialVersionUID = 5514303186679861857L;

    //类型 0：菜单 1：功能")
    private Integer menuType;

    //功能模块名称")
    private String moduleName;

    //模块url")
    private String moduleUrl;

    //模块图标")
    private String moduleIcon;

    //模块排序")
    private Integer moduleOrder;

    //是否展示 0：展示1：不展示")
    private Integer isShow;

    //描述")
    private String description;

    //父级id")
    private Long pId;

    //权限等级 1：一级权限 依次类推")
    private Integer level;

    //类型 0平台 1 学校 2区域")
    private Integer type;

    //平台主键")
    private Long platformId;


    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuType=" + menuType +
                ", moduleName='" + moduleName + '\'' +
                ", moduleUrl='" + moduleUrl + '\'' +
                ", moduleIcon='" + moduleIcon + '\'' +
                ", moduleOrder=" + moduleOrder +
                ", isShow=" + isShow +
                ", description='" + description + '\'' +
                ", pId=" + pId +
                ", level=" + level +
                ", type=" + type +
                ", platformId=" + platformId +
                "} " + super.toString();
    }
}
