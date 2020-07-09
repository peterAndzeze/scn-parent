package com.sw.study.scn.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="r_resume")
public class Resume {

    @Id
    private Long id; // 主键
    private String sex; // 性别
    private String birthday; // 生日
    private String work_year; // 工作年限
    private String phone; // 手机号
    private String email; // 邮箱
    private String status; // 目前状态
    private String resumeName; // 简历名称
    private String name; // 姓名
    private String createTime; // 创建时间
    private String headPic; // 头像
    private Integer isDel; //是否删除 默认值0-未删除 1-已删除
    private String updateTime; // 简历更新时间
    private Long userId; // 用户ID
    private Integer isDefault; // 是否为默认简历 0-默认 1-非默认
    private String highestEducation; // 最高学历
    private Integer deliverNearByConfirm; // 投递附件简历确认 0-需要确认 1-不需要确认
    private Integer refuseCount; // 简历被拒绝次数
    private Integer markCanInterviewCount; //被标记为可面试次数
    private Integer haveNoticeInterCount; //已通知面试次数
    private String oneWord; // 一句话介绍自己
    private String liveCity; // 居住城市
    private Integer resumeScore; // 简历得分
    private Integer userIdentity; // 用户身份1-学生 2-工人
    private Integer isOpenResume; // 人才搜索-开放简历 0-关闭，1-打开，2-简历未达到投放标准被动关闭 3-从未设置过开放简历

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWork_year() {
        return work_year;
    }

    public void setWork_year(String work_year) {
        this.work_year = work_year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public Integer getDeliverNearByConfirm() {
        return deliverNearByConfirm;
    }

    public void setDeliverNearByConfirm(Integer deliverNearByConfirm) {
        this.deliverNearByConfirm = deliverNearByConfirm;
    }

    public Integer getRefuseCount() {
        return refuseCount;
    }

    public void setRefuseCount(Integer refuseCount) {
        this.refuseCount = refuseCount;
    }

    public Integer getMarkCanInterviewCount() {
        return markCanInterviewCount;
    }

    public void setMarkCanInterviewCount(Integer markCanInterviewCount) {
        this.markCanInterviewCount = markCanInterviewCount;
    }

    public Integer getHaveNoticeInterCount() {
        return haveNoticeInterCount;
    }

    public void setHaveNoticeInterCount(Integer haveNoticeInterCount) {
        this.haveNoticeInterCount = haveNoticeInterCount;
    }

    public String getOneWord() {
        return oneWord;
    }

    public void setOneWord(String oneWord) {
        this.oneWord = oneWord;
    }

    public String getLiveCity() {
        return liveCity;
    }

    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity;
    }

    public Integer getResumeScore() {
        return resumeScore;
    }

    public void setResumeScore(Integer resumeScore) {
        this.resumeScore = resumeScore;
    }

    public Integer getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Integer getIsOpenResume() {
        return isOpenResume;
    }

    public void setIsOpenResume(Integer isOpenResume) {
        this.isOpenResume = isOpenResume;
    }
}
