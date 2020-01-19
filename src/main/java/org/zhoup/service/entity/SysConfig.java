package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sys_config")
public class SysConfig {
    private Long id;

    /**
     * key
     */
    private String key;

    /**
     * value
     */
    private String value;

    /**
     * 状态   0：隐藏   1：显示
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取key
     *
     * @return key - key
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置key
     *
     * @param key key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取value
     *
     * @return value - value
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value
     *
     * @param value value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取状态   0：隐藏   1：显示
     *
     * @return status - 状态   0：隐藏   1：显示
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态   0：隐藏   1：显示
     *
     * @param status 状态   0：隐藏   1：显示
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}