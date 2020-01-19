package org.zhoup.service.entity;

import javax.persistence.*;

public class Visitor {
    @Id
    private Long id;

    @Column(name = "visitor_guid")
    private String visitorGuid;

    @Column(name = "first_visit_time")
    private Long firstVisitTime;

    /**
     * 0：不是首次登录
            1：是首次登录
     */
    @Column(name = "entry_url")
    private String entryUrl;

    @Column(name = "visitor_ip")
    private String visitorIp;

    @Column(name = "visitor_device")
    private String visitorDevice;

    @Column(name = "visitor_channel")
    private String visitorChannel;

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
     * @return visitor_guid
     */
    public String getVisitorGuid() {
        return visitorGuid;
    }

    /**
     * @param visitorGuid
     */
    public void setVisitorGuid(String visitorGuid) {
        this.visitorGuid = visitorGuid;
    }

    /**
     * @return first_visit_time
     */
    public Long getFirstVisitTime() {
        return firstVisitTime;
    }

    /**
     * @param firstVisitTime
     */
    public void setFirstVisitTime(Long firstVisitTime) {
        this.firstVisitTime = firstVisitTime;
    }

    /**
     * 获取0：不是首次登录
            1：是首次登录
     *
     * @return entry_url - 0：不是首次登录
            1：是首次登录
     */
    public String getEntryUrl() {
        return entryUrl;
    }

    /**
     * 设置0：不是首次登录
            1：是首次登录
     *
     * @param entryUrl 0：不是首次登录
            1：是首次登录
     */
    public void setEntryUrl(String entryUrl) {
        this.entryUrl = entryUrl;
    }

    /**
     * @return visitor_ip
     */
    public String getVisitorIp() {
        return visitorIp;
    }

    /**
     * @param visitorIp
     */
    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    /**
     * @return visitor_device
     */
    public String getVisitorDevice() {
        return visitorDevice;
    }

    /**
     * @param visitorDevice
     */
    public void setVisitorDevice(String visitorDevice) {
        this.visitorDevice = visitorDevice;
    }

    /**
     * @return visitor_channel
     */
    public String getVisitorChannel() {
        return visitorChannel;
    }

    /**
     * @param visitorChannel
     */
    public void setVisitorChannel(String visitorChannel) {
        this.visitorChannel = visitorChannel;
    }
}