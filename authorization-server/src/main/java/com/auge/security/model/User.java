package com.auge.security.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 平台用户
 * </p>
 *
 * @author machunlin
 * @date 2019/6/12
 */
@TableName("sys_user")
public class User extends BaseModel {

    private static final long serialVersionUID = -5896788767318437755L;

    //编号
    private String code;

    //用户名
    private String account;

    //密码
    private String password;

    //部门ID
    private Long departId;

    //部门编码
    private String departCode;

    //部门名称
    private String departName;

    //昵称
    private String name;

    //性别 0:未知 1:男 2：女
    private Integer sex;

    //手机
    private String phone;

    //邮箱
    private String mail;

    //出生年月
    private Date birthday;

    //地址
    private String address;

    //最后一次登陆时间
    private Date lastTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "code='" + code + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", departId=" + departId +
                ", departCode='" + departCode + '\'' +
                ", departName='" + departName + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", lastTime=" + lastTime +
                "} " + super.toString();
    }
}
