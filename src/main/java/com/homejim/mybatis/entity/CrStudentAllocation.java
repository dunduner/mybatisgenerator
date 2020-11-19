package com.homejim.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class CrStudentAllocation implements Serializable {
    /**
     * 此表里的学生若有班主任Id，该学生显示在该班主任的学生列表，一个学生可能会有多条记录
     */
    private Integer id;

    /**
     * 学生用户号
     */
    private String studentUserNumber;

    /**
     * 学生userid
     */
    private Long studentUserId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生手机号
     */
    private String studentPhone;

    /**
     * 年级
     */
    private String grade;

    /**
     * 位运算：学科 1语文  2数学  3英语 4物理 5化学 6生物
     */
    private Long subject;

    /**
     * 位运算：名单入库方式：1、新增学生  2.老名单怼库，3.市场投放，4、购课  5、转介绍  6系统分配
     */
    private Long putInType;

    /**
     * CR_ID:会是营销CR，服务CR，推荐人ID
     */
    private Long crUserId;

    /**
     * 是否拦截分配给cr  0-是  1-否    (逻辑：新增学生-是，老名单怼库-否，市场投放-是)
     */
    private Byte isInterceptToCr;

    /**
     * 拦截原因
     */
    private String isInterceptToCrReason;

    /**
     * 第一次负责时间
     */
    private Date belongTimeFirst;

    /**
     * 销售负责时间-我负责时间
     */
    private Date belongTime;

    /**
     * CR最近联系时间-第一次联系的时间
     */
    private Date recentContactTimeFirst;

    /**
     * 最近联系时间
     */
    private Date recentContactTime;

    /**
     * 下次回访时间---第一次回访时间
     */
    private Date returnVisitTimeFirst;

    /**
     * 下次回访时间
     */
    private Date returnVisitTime;

    /**
     * 标记优先跟进 0-不优先  1优先跟进
     */
    private Byte pendingFollowAt;

    /**
     * 已经跟进次数
     */
    private Byte contactNumber;

    /**
     * 备注
     */
    private String remake;

    /**
     * 学生所在地-省
     */
    private String studentProvince;

    /**
     * 学生所在地-市
     */
    private String studentCity;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除。0-否，1-是
     */
    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentUserNumber() {
        return studentUserNumber;
    }

    public void setStudentUserNumber(String studentUserNumber) {
        this.studentUserNumber = studentUserNumber == null ? null : studentUserNumber.trim();
    }

    public Long getStudentUserId() {
        return studentUserId;
    }

    public void setStudentUserId(Long studentUserId) {
        this.studentUserId = studentUserId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Long getSubject() {
        return subject;
    }

    public void setSubject(Long subject) {
        this.subject = subject;
    }

    public Long getPutInType() {
        return putInType;
    }

    public void setPutInType(Long putInType) {
        this.putInType = putInType;
    }

    public Long getCrUserId() {
        return crUserId;
    }

    public void setCrUserId(Long crUserId) {
        this.crUserId = crUserId;
    }

    public Byte getIsInterceptToCr() {
        return isInterceptToCr;
    }

    public void setIsInterceptToCr(Byte isInterceptToCr) {
        this.isInterceptToCr = isInterceptToCr;
    }

    public String getIsInterceptToCrReason() {
        return isInterceptToCrReason;
    }

    public void setIsInterceptToCrReason(String isInterceptToCrReason) {
        this.isInterceptToCrReason = isInterceptToCrReason == null ? null : isInterceptToCrReason.trim();
    }

    public Date getBelongTimeFirst() {
        return belongTimeFirst;
    }

    public void setBelongTimeFirst(Date belongTimeFirst) {
        this.belongTimeFirst = belongTimeFirst;
    }

    public Date getBelongTime() {
        return belongTime;
    }

    public void setBelongTime(Date belongTime) {
        this.belongTime = belongTime;
    }

    public Date getRecentContactTimeFirst() {
        return recentContactTimeFirst;
    }

    public void setRecentContactTimeFirst(Date recentContactTimeFirst) {
        this.recentContactTimeFirst = recentContactTimeFirst;
    }

    public Date getRecentContactTime() {
        return recentContactTime;
    }

    public void setRecentContactTime(Date recentContactTime) {
        this.recentContactTime = recentContactTime;
    }

    public Date getReturnVisitTimeFirst() {
        return returnVisitTimeFirst;
    }

    public void setReturnVisitTimeFirst(Date returnVisitTimeFirst) {
        this.returnVisitTimeFirst = returnVisitTimeFirst;
    }

    public Date getReturnVisitTime() {
        return returnVisitTime;
    }

    public void setReturnVisitTime(Date returnVisitTime) {
        this.returnVisitTime = returnVisitTime;
    }

    public Byte getPendingFollowAt() {
        return pendingFollowAt;
    }

    public void setPendingFollowAt(Byte pendingFollowAt) {
        this.pendingFollowAt = pendingFollowAt;
    }

    public Byte getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Byte contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    public String getStudentProvince() {
        return studentProvince;
    }

    public void setStudentProvince(String studentProvince) {
        this.studentProvince = studentProvince == null ? null : studentProvince.trim();
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity == null ? null : studentCity.trim();
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}