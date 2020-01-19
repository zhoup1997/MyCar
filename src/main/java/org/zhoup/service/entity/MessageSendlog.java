package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "message_sendlog")
public class MessageSendlog {
    @Id
    private Long id;

    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "send_time")
    private Long sendTime;

    @Column(name = "to_mid")
    private Long toMid;

    /**
     * 0：未接收
            1：已接收
     */
    private Integer received;

    @Column(name = "receive_time")
    private Long receiveTime;

    /**
     * 0：未阅读
            1：已阅读
     */
    private Byte viewed;

    @Column(name = "view_time")
    private Long viewTime;

    @Column(name = "view_detail")
    private Byte viewDetail;

    @Column(name = "view_detail_time")
    private Long viewDetailTime;

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
     * @return message_id
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * @param messageId
     */
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
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
     * @return to_mid
     */
    public Long getToMid() {
        return toMid;
    }

    /**
     * @param toMid
     */
    public void setToMid(Long toMid) {
        this.toMid = toMid;
    }

    /**
     * 获取0：未接收
            1：已接收
     *
     * @return received - 0：未接收
            1：已接收
     */
    public Integer getReceived() {
        return received;
    }

    /**
     * 设置0：未接收
            1：已接收
     *
     * @param received 0：未接收
            1：已接收
     */
    public void setReceived(Integer received) {
        this.received = received;
    }

    /**
     * @return receive_time
     */
    public Long getReceiveTime() {
        return receiveTime;
    }

    /**
     * @param receiveTime
     */
    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取0：未阅读
            1：已阅读
     *
     * @return viewed - 0：未阅读
            1：已阅读
     */
    public Byte getViewed() {
        return viewed;
    }

    /**
     * 设置0：未阅读
            1：已阅读
     *
     * @param viewed 0：未阅读
            1：已阅读
     */
    public void setViewed(Byte viewed) {
        this.viewed = viewed;
    }

    /**
     * @return view_time
     */
    public Long getViewTime() {
        return viewTime;
    }

    /**
     * @param viewTime
     */
    public void setViewTime(Long viewTime) {
        this.viewTime = viewTime;
    }

    /**
     * @return view_detail
     */
    public Byte getViewDetail() {
        return viewDetail;
    }

    /**
     * @param viewDetail
     */
    public void setViewDetail(Byte viewDetail) {
        this.viewDetail = viewDetail;
    }

    /**
     * @return view_detail_time
     */
    public Long getViewDetailTime() {
        return viewDetailTime;
    }

    /**
     * @param viewDetailTime
     */
    public void setViewDetailTime(Long viewDetailTime) {
        this.viewDetailTime = viewDetailTime;
    }
}