package cn.merryyou.security.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * @author machunlin
 * @date 2019/6/9
 */
public class BaseModel implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    protected Long id;

    //创建时间
    protected Date createTime;

    //更新时间
    protected Date updateTime;


    //状态 -1:删除,0:停用，1-启用
    protected Integer status;

    //创建用户主键
    protected Long createUserId;

    //更新用户主键
    protected Long updateUserId;

    public Long getId() {
        return id;
    }

    public BaseModel setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", createUserId=" + createUserId +
                ", updateUserId=" + updateUserId +
                '}';
    }
}
