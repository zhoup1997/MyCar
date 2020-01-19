package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "member_fav")
public class MemberFav {
    @Id
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    /**
     * 1：资讯
            2：活动
            3：车系
     */
    @Column(name = "fav_type")
    private Byte favType;

    @Column(name = "content_id")
    private Long contentId;

    @Column(name = "fav_time")
    private Long favTime;

    @Column(name = "fav_ip")
    private String favIp;

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
     * 获取1：资讯
            2：活动
            3：车系
     *
     * @return fav_type - 1：资讯
            2：活动
            3：车系
     */
    public Byte getFavType() {
        return favType;
    }

    /**
     * 设置1：资讯
            2：活动
            3：车系
     *
     * @param favType 1：资讯
            2：活动
            3：车系
     */
    public void setFavType(Byte favType) {
        this.favType = favType;
    }

    /**
     * @return content_id
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * @param contentId
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * @return fav_time
     */
    public Long getFavTime() {
        return favTime;
    }

    /**
     * @param favTime
     */
    public void setFavTime(Long favTime) {
        this.favTime = favTime;
    }

    /**
     * @return fav_ip
     */
    public String getFavIp() {
        return favIp;
    }

    /**
     * @param favIp
     */
    public void setFavIp(String favIp) {
        this.favIp = favIp;
    }
}