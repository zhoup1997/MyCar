package org.zhoup.service.entity;

import javax.persistence.*;

public class Tag {
    @Id
    private Integer id;

    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "last_update_time")
    private Long lastUpdateTime;

    @Column(name = "click_count")
    private Long clickCount;

    /**
     * 0：系统标签
            1：用户标签
     */
    private Byte type;

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
     * 获取0：未删除
            1：已删除
     *
     * @return is_deleted - 0：未删除
            1：已删除
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置0：未删除
            1：已删除
     *
     * @param isDeleted 0：未删除
            1：已删除
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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
     * @return last_update_time
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return click_count
     */
    public Long getClickCount() {
        return clickCount;
    }

    /**
     * @param clickCount
     */
    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * 获取0：系统标签
            1：用户标签
     *
     * @return type - 0：系统标签
            1：用户标签
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置0：系统标签
            1：用户标签
     *
     * @param type 0：系统标签
            1：用户标签
     */
    public void setType(Byte type) {
        this.type = type;
    }
}