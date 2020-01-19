package org.zhoup.service.entity;

import javax.persistence.*;

public class Message {
    @Id
    private Long id;

    private Byte type;

    private String link;

    /**
     * 0：立即发送
            1：定时发送
     */
    @Column(name = "is_schedule")
    private Integer isSchedule;

    @Column(name = "schedule_time")
    private Long scheduleTime;

    @Column(name = "send_time")
    private Long sendTime;

    private String content;

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
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
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

    /**
     * 获取0：立即发送
            1：定时发送
     *
     * @return is_schedule - 0：立即发送
            1：定时发送
     */
    public Integer getIsSchedule() {
        return isSchedule;
    }

    /**
     * 设置0：立即发送
            1：定时发送
     *
     * @param isSchedule 0：立即发送
            1：定时发送
     */
    public void setIsSchedule(Integer isSchedule) {
        this.isSchedule = isSchedule;
    }

    /**
     * @return schedule_time
     */
    public Long getScheduleTime() {
        return scheduleTime;
    }

    /**
     * @param scheduleTime
     */
    public void setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    /**
     * @return send_time
     */
    public Long getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime
     */
    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}