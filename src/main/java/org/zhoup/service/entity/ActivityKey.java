package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_key")
public class ActivityKey {
    @Id
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    /**
     * 对应car_model表的id字段
     */
    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "act_key")
    private String actKey;

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
     * @return activity_id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取对应car_model表的id字段
     *
     * @return create_time - 对应car_model表的id字段
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置对应car_model表的id字段
     *
     * @param createTime 对应car_model表的id字段
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * @return act_key
     */
    public String getActKey() {
        return actKey;
    }

    /**
     * @param actKey
     */
    public void setActKey(String actKey) {
        this.actKey = actKey;
    }
}