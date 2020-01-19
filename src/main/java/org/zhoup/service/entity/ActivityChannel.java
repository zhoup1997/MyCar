package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_channel")
public class ActivityChannel {
    @Id
    private Long id;

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

    @Column(name = "use_count")
    private String useCount;

    private String sign;

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
     * @return use_count
     */
    public String getUseCount() {
        return useCount;
    }

    /**
     * @param useCount
     */
    public void setUseCount(String useCount) {
        this.useCount = useCount;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }
}