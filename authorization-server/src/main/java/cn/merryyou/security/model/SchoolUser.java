package cn.merryyou.security.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * <p>
 * 学校用户表
 * </p>
 *
 * @author machunlin
 * @date 2019/6/12
 */
@TableName("school_user")
public class SchoolUser extends BaseModel {

    private static final long serialVersionUID = 1665484233055184565L;

    //学校主键")
    private Long schoolId;

    //学校名称")
    private String schoolName;

    //学校编码")
    private String schoolCode;

    //用户编号")
    private String code;

    //登陆账号")
    private String account;

    //密码")
    private String password;

    //用户类型 1：学校  2：区域")
    private Integer type;

    //名称")
    private String name;

    //性别 1:男 2：女 0：未知")
    private Integer sex;

    //手机")
    private String phone;

    //邮箱")
    private String mail;

    //状态 -1:删除,0:停用，1-启用")
    private Integer status;

    //岗位状态 0：不在岗 1：在岗")
    private Integer jobsStatus;

    //生日")
    private String birthday;

    //地址")
    private String address;

    //最后一次登陆时间")
    private Date lastDate;

    //区域主键")
    private Long regionId;

    //工作简历是否存在0 否1是")
    private Integer jobResume;

    //学习简历是否存在0 否1是")
    private Integer studyResume;

    //入校方式 0 “其他” 1“直接分配”、2“考试聘用”、3“民师聘用”、4“民转公”、5“代课转公办”，6“军转安置”、7“退伍兵安置”、8“社会招收”、9“县内本系统调进”、10“县内外系统调进”、11“县外本系统调进”、12“县外外调进”")
    private Integer enrolledType;


    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getJobsStatus() {
        return jobsStatus;
    }

    public void setJobsStatus(Integer jobsStatus) {
        this.jobsStatus = jobsStatus;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getJobResume() {
        return jobResume;
    }

    public void setJobResume(Integer jobResume) {
        this.jobResume = jobResume;
    }

    public Integer getStudyResume() {
        return studyResume;
    }

    public void setStudyResume(Integer studyResume) {
        this.studyResume = studyResume;
    }

    public Integer getEnrolledType() {
        return enrolledType;
    }

    public void setEnrolledType(Integer enrolledType) {
        this.enrolledType = enrolledType;
    }

    @Override
    public String toString() {
        return "SchoolUser{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", code='" + code + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", status=" + status +
                ", jobsStatus=" + jobsStatus +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", lastDate=" + lastDate +
                ", regionId=" + regionId +
                ", jobResume=" + jobResume +
                ", studyResume=" + studyResume +
                ", enrolledType=" + enrolledType +
                "} " + super.toString();
    }
}
