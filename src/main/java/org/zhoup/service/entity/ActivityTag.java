package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_tag")
public class ActivityTag {
    @Id
    private Long id;

    @Column(name = "activity_id")
    private Long activityId;

    /**
     * 对应car_model表的id字段
     */
    @Column(name = "tag_id")
    private Long tagId;

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
     * @return activity_id
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取对应car_model表的id字段
     *
     * @return tag_id - 对应car_model表的id字段
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置对应car_model表的id字段
     *
     * @param tagId 对应car_model表的id字段
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}