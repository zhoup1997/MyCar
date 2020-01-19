package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "member_token")
public class MemberToken {
    @Id
    @Column(name = "member_id")
    private Long memberId;

    private String token;

    @Column(name = "create_time")
    private Long createTime;

    private Long duration;

    @Column(name = "expired_time")
    private Long expiredTime;

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
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
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
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * @return expired_time
     */
    public Long getExpiredTime() {
        return expiredTime;
    }

    /**
     * @param expiredTime
     */
    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }
}