package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "visit_log")
public class VisitLog {
    @Id
    private Long id;

    @Column(name = "visitor_id")
    private Long visitorId;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "visit_url")
    private String visitUrl;

    /**
     * 0：不是首次登录
            1：是首次登录
     */
    @Column(name = "visit_ip")
    private String visitIp;

    @Column(name = "visit_device")
    private String visitDevice;

    @Column(name = "visit_source")
    private String visitSource;

    @Column(name = "enter_time")
    private Long enterTime;

    @Column(name = "exit_time")
    private Long exitTime;

    private Long stay;

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
     * @return visitor_id
     */
    public Long getVisitorId() {
        return visitorId;
    }

    /**
     * @param visitorId
     */
    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return visit_url
     */
    public String getVisitUrl() {
        return visitUrl;
    }

    /**
     * @param visitUrl
     */
    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl;
    }

    /**
     * 获取0：不是首次登录
            1：是首次登录
     *
     * @return visit_ip - 0：不是首次登录
            1：是首次登录
     */
    public String getVisitIp() {
        return visitIp;
    }

    /**
     * 设置0：不是首次登录
            1：是首次登录
     *
     * @param visitIp 0：不是首次登录
            1：是首次登录
     */
    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }

    /**
     * @return visit_device
     */
    public String getVisitDevice() {
        return visitDevice;
    }

    /**
     * @param visitDevice
     */
    public void setVisitDevice(String visitDevice) {
        this.visitDevice = visitDevice;
    }

    /**
     * @return visit_source
     */
    public String getVisitSource() {
        return visitSource;
    }

    /**
     * @param visitSource
     */
    public void setVisitSource(String visitSource) {
        this.visitSource = visitSource;
    }

    /**
     * @return enter_time
     */
    public Long getEnterTime() {
        return enterTime;
    }

    /**
     * @param enterTime
     */
    public void setEnterTime(Long enterTime) {
        this.enterTime = enterTime;
    }

    /**
     * @return exit_time
     */
    public Long getExitTime() {
        return exitTime;
    }

    /**
     * @param exitTime
     */
    public void setExitTime(Long exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * @return stay
     */
    public Long getStay() {
        return stay;
    }

    /**
     * @param stay
     */
    public void setStay(Long stay) {
        this.stay = stay;
    }
}