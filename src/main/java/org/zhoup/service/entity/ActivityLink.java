package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_link")
public class ActivityLink {
    @Id
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    @Column(name = "channel_id")
    private Integer channelId;

    private String link;

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
     * @return channel_id
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * @param channelId
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * @return link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }
}