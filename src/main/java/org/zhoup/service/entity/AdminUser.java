package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "admin_user")
public class AdminUser {
    @Id
    private Integer id;

    private String username;

    private String password;

    private String name;

    private String salt;

    private String phone;

    private String email;

    /**
     * 0：未启用
            1：启用
     */
    private Byte status;

    @Column(name = "create_time")
    private Long createTime;

    /**
     * 0：普通管理员
            1：超级管理员
     */
    @Column(name = "is_super")
    private Byte isSuper;

    private String consumer;

    private String remark;

    private String dept;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取0：未启用
            1：启用
     *
     * @return status - 0：未启用
            1：启用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0：未启用
            1：启用
     *
     * @param status 0：未启用
            1：启用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取0：普通管理员
            1：超级管理员
     *
     * @return is_super - 0：普通管理员
            1：超级管理员
     */
    public Byte getIsSuper() {
        return isSuper;
    }

    /**
     * 设置0：普通管理员
            1：超级管理员
     *
     * @param isSuper 0：普通管理员
            1：超级管理员
     */
    public void setIsSuper(Byte isSuper) {
        this.isSuper = isSuper;
    }

    /**
     * @return consumer
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * @param consumer
     */
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
}