package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "member_login_log")
public class MemberLoginLog {
    @Id
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "login_time")
    private Long loginTime;

    /**
     * 0：不是首次登录
            1：是首次登录
     */
    @Column(name = "is_first")
    private Byte isFirst;

    @Column(name = "login_ip")
    private String loginIp;

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
     * @return login_time
     */
    public Long getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取0：不是首次登录
            1：是首次登录
     *
     * @return is_first - 0：不是首次登录
            1：是首次登录
     */
    public Byte getIsFirst() {
        return isFirst;
    }

    /**
     * 设置0：不是首次登录
            1：是首次登录
     *
     * @param isFirst 0：不是首次登录
            1：是首次登录
     */
    public void setIsFirst(Byte isFirst) {
        this.isFirst = isFirst;
    }

    /**
     * @return login_ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * @param loginIp
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}