package com.auge.security.model;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 用户权限关联表
 * </p>
 *
 * @author machunlin
 * @date 2019/6/12
 */
@TableName("sys_user_role")
public class UserRole extends BaseModel {

    private static final long serialVersionUID = -6342724433895522552L;

    //用户id")
    private Long userId;

    //角色id")
    private Long roleId;

    //学校id")
    private Long schoolId;

    //学校编码")
    private String schoolCode;

    //年级id")
    private Long gradeId;

    //年级编码")
    private String gradeCode;

    //年级名称")
    private String gradeName;

    //行政班 班级id")
    private Long classId;

    //行政班 班级编码")
    private String classCode;

    //行政班 班级名称")
    private String className;

    //科目ID")
    private Long subjectId;

    //科目编码")
    private String subjectCode;

    //科目名称")
    private String subjectName;

    //年级段id")
    private Long stageId;

    //年级段编号")
    private String stageCode;

    //年级段名称")
    private String stageName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public String getStageCode() {
        return stageCode;
    }

    public void setStageCode(String stageCode) {
        this.stageCode = stageCode;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                ", schoolId=" + schoolId +
                ", schoolCode='" + schoolCode + '\'' +
                ", gradeId=" + gradeId +
                ", gradeCode='" + gradeCode + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", classId=" + classId +
                ", classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                ", subjectId=" + subjectId +
                ", subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", stageId=" + stageId +
                ", stageCode='" + stageCode + '\'' +
                ", stageName='" + stageName + '\'' +
                "} " + super.toString();
    }
}
