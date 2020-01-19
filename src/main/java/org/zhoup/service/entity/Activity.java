package org.zhoup.service.entity;

import javax.persistence.*;

public class Activity {
    @Id
    private Long id;

    private String title;

    @Column(name = "category_id")
    private Integer categoryId;

    private String url;

    /**
     * 0：未开始
            1：进行中
            2：已结束
     */
    private Byte state;

    private String summary;

    private String link;

    @Column(name = "begin_time")
    private Long beginTime;

    @Column(name = "end_time")
    private Long endTime;

    /**
     * 0：否
            1：是
     */
    @Column(name = "channel_top")
    private Byte channelTop;

    /**
     * 0：否
            1：是
     */
    @Column(name = "home_top")
    private Byte homeTop;

    @Column(name = "pv_count")
    private Integer pvCount;

    @Column(name = "uv_count")
    private Integer uvCount;

    @Column(name = "up_count")
    private Integer upCount;

    @Column(name = "fav_count")
    private Integer favCount;

    /**
     * 0：未发布
            1：已发布
            2：撤销发布
     */
    @Column(name = "publish_state")
    private Byte publishState;

    @Column(name = "create_uid")
    private Integer createUid;

    @Column(name = "create_time")
    private Long createTime;

    private String author;

    @Column(name = "unpublish_uname")
    private String unpublishUname;

    @Column(name = "unpublish_time")
    private Long unpublishTime;

    @Column(name = "seo_keywords")
    private String seoKeywords;

    @Column(name = "sdk_path")
    private String sdkPath;

    @Column(name = "like_count")
    private Integer likeCount;

    @Column(name = "share_count")
    private Integer shareCount;

    @Column(name = "view_count")
    private Integer viewCount;

    private String tags;

    @Column(name = "cover_pic")
    private String coverPic;

    private String cars;

    @Column(name = "sdk_id")
    private Integer sdkId;

    @Column(name = "sdk_title")
    private String sdkTitle;

    private String dealer;

    private String description;

    @Column(name = "seo_description")
    private String seoDescription;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取0：未开始
            1：进行中
            2：已结束
     *
     * @return state - 0：未开始
            1：进行中
            2：已结束
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置0：未开始
            1：进行中
            2：已结束
     *
     * @param state 0：未开始
            1：进行中
            2：已结束
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
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
     * @return begin_time
     */
    public Long getBeginTime() {
        return beginTime;
    }

    /**
     * @param beginTime
     */
    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * @return end_time
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取0：否
            1：是
     *
     * @return channel_top - 0：否
            1：是
     */
    public Byte getChannelTop() {
        return channelTop;
    }

    /**
     * 设置0：否
            1：是
     *
     * @param channelTop 0：否
            1：是
     */
    public void setChannelTop(Byte channelTop) {
        this.channelTop = channelTop;
    }

    /**
     * 获取0：否
            1：是
     *
     * @return home_top - 0：否
            1：是
     */
    public Byte getHomeTop() {
        return homeTop;
    }

    /**
     * 设置0：否
            1：是
     *
     * @param homeTop 0：否
            1：是
     */
    public void setHomeTop(Byte homeTop) {
        this.homeTop = homeTop;
    }

    /**
     * @return pv_count
     */
    public Integer getPvCount() {
        return pvCount;
    }

    /**
     * @param pvCount
     */
    public void setPvCount(Integer pvCount) {
        this.pvCount = pvCount;
    }

    /**
     * @return uv_count
     */
    public Integer getUvCount() {
        return uvCount;
    }

    /**
     * @param uvCount
     */
    public void setUvCount(Integer uvCount) {
        this.uvCount = uvCount;
    }

    /**
     * @return up_count
     */
    public Integer getUpCount() {
        return upCount;
    }

    /**
     * @param upCount
     */
    public void setUpCount(Integer upCount) {
        this.upCount = upCount;
    }

    /**
     * @return fav_count
     */
    public Integer getFavCount() {
        return favCount;
    }

    /**
     * @param favCount
     */
    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    /**
     * 获取0：未发布
            1：已发布
            2：撤销发布
     *
     * @return publish_state - 0：未发布
            1：已发布
            2：撤销发布
     */
    public Byte getPublishState() {
        return publishState;
    }

    /**
     * 设置0：未发布
            1：已发布
            2：撤销发布
     *
     * @param publishState 0：未发布
            1：已发布
            2：撤销发布
     */
    public void setPublishState(Byte publishState) {
        this.publishState = publishState;
    }

    /**
     * @return create_uid
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * @param createUid
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
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
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return unpublish_uname
     */
    public String getUnpublishUname() {
        return unpublishUname;
    }

    /**
     * @param unpublishUname
     */
    public void setUnpublishUname(String unpublishUname) {
        this.unpublishUname = unpublishUname;
    }

    /**
     * @return unpublish_time
     */
    public Long getUnpublishTime() {
        return unpublishTime;
    }

    /**
     * @param unpublishTime
     */
    public void setUnpublishTime(Long unpublishTime) {
        this.unpublishTime = unpublishTime;
    }

    /**
     * @return seo_keywords
     */
    public String getSeoKeywords() {
        return seoKeywords;
    }

    /**
     * @param seoKeywords
     */
    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    /**
     * @return sdk_path
     */
    public String getSdkPath() {
        return sdkPath;
    }

    /**
     * @param sdkPath
     */
    public void setSdkPath(String sdkPath) {
        this.sdkPath = sdkPath;
    }

    /**
     * @return like_count
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * @param likeCount
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * @return share_count
     */
    public Integer getShareCount() {
        return shareCount;
    }

    /**
     * @param shareCount
     */
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    /**
     * @return view_count
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * @param viewCount
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @return cover_pic
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * @param coverPic
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    /**
     * @return cars
     */
    public String getCars() {
        return cars;
    }

    /**
     * @param cars
     */
    public void setCars(String cars) {
        this.cars = cars;
    }

    /**
     * @return sdk_id
     */
    public Integer getSdkId() {
        return sdkId;
    }

    /**
     * @param sdkId
     */
    public void setSdkId(Integer sdkId) {
        this.sdkId = sdkId;
    }

    /**
     * @return sdk_title
     */
    public String getSdkTitle() {
        return sdkTitle;
    }

    /**
     * @param sdkTitle
     */
    public void setSdkTitle(String sdkTitle) {
        this.sdkTitle = sdkTitle;
    }

    /**
     * @return dealer
     */
    public String getDealer() {
        return dealer;
    }

    /**
     * @param dealer
     */
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return seo_description
     */
    public String getSeoDescription() {
        return seoDescription;
    }

    /**
     * @param seoDescription
     */
    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }
}