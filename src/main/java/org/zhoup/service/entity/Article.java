package org.zhoup.service.entity;

import javax.persistence.*;

public class Article {
    @Id
    private Long id;

    private String title;

    /**
     * 0：未启用
            1：已启用
     */
    @Column(name = "category_id")
    private Integer categoryId;

    private String source;

    private String author;

    private String summary;

    @Column(name = "cover_pic")
    private String coverPic;

    @Column(name = "thumb_pic")
    private String thumbPic;

    /**
     * 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    private String tags;

    @Column(name = "preview_url")
    private String previewUrl;

    @Column(name = "qrcode_url")
    private String qrcodeUrl;

    @Column(name = "pv_count")
    private Integer pvCount;

    @Column(name = "uv_count")
    private Integer uvCount;

    @Column(name = "comment_count")
    private Integer commentCount;

    @Column(name = "like_count")
    private Integer likeCount;

    @Column(name = "fav_count")
    private Integer favCount;

    @Column(name = "share_count")
    private Integer shareCount;

    @Column(name = "channel_top")
    private Byte channelTop;

    @Column(name = "home_top")
    private Byte homeTop;

    /**
     * 如果是外部资源，那么该字段值为0
     */
    @Column(name = "create_uid")
    private Integer createUid;

    @Column(name = "create_uname")
    private String createUname;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "submit_uid")
    private Integer submitUid;

    @Column(name = "submit_time")
    private Long submitTime;

    /**
     * 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    private Integer state;

    /**
     * 该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
     */
    @Column(name = "state_order")
    private Integer stateOrder;

    @Column(name = "last_audit_uid")
    private Integer lastAuditUid;

    @Column(name = "last_audit_username")
    private String lastAuditUsername;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    @Column(name = "last_audit_time")
    private Long lastAuditTime;

    @Column(name = "last_reject_reason")
    private String lastRejectReason;

    /**
     * 0：未发布
            1：已发布
     */
    @Column(name = "publish_state")
    private Byte publishState;

    @Column(name = "publish_uid")
    private Integer publishUid;

    @Column(name = "publish_uname")
    private String publishUname;

    @Column(name = "publish_time")
    private Long publishTime;

    @Column(name = "unpublish_uid")
    private Integer unpublishUid;

    @Column(name = "unpublish_uname")
    private String unpublishUname;

    @Column(name = "unpublish_time")
    private Long unpublishTime;

    @Column(name = "unpublish_reason")
    private String unpublishReason;

    @Column(name = "last_update_uid")
    private Integer lastUpdateUid;

    @Column(name = "last_update_uname")
    private String lastUpdateUname;

    @Column(name = "last_update_time")
    private Long lastUpdateTime;

    @Column(name = "seo_keywords")
    private String seoKeywords;

    @Column(name = "seo_description")
    private String seoDescription;

    /**
     * 0：不允许
            1：允许
     */
    @Column(name = "allow_up")
    private Byte allowUp;

    /**
     * 0：不允许
            1：允许
     */
    @Column(name = "allow_fav")
    private Byte allowFav;

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
     * 获取0：未启用
            1：已启用
     *
     * @return category_id - 0：未启用
            1：已启用
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置0：未启用
            1：已启用
     *
     * @param categoryId 0：未启用
            1：已启用
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
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
     * @return thumb_pic
     */
    public String getThumbPic() {
        return thumbPic;
    }

    /**
     * @param thumbPic
     */
    public void setThumbPic(String thumbPic) {
        this.thumbPic = thumbPic;
    }

    /**
     * 获取此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     *
     * @return tags - 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     *
     * @param tags 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @return preview_url
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * @param previewUrl
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * @return qrcode_url
     */
    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    /**
     * @param qrcodeUrl
     */
    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
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
     * @return comment_count
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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
     * @return channel_top
     */
    public Byte getChannelTop() {
        return channelTop;
    }

    /**
     * @param channelTop
     */
    public void setChannelTop(Byte channelTop) {
        this.channelTop = channelTop;
    }

    /**
     * @return home_top
     */
    public Byte getHomeTop() {
        return homeTop;
    }

    /**
     * @param homeTop
     */
    public void setHomeTop(Byte homeTop) {
        this.homeTop = homeTop;
    }

    /**
     * 获取如果是外部资源，那么该字段值为0
     *
     * @return create_uid - 如果是外部资源，那么该字段值为0
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * 设置如果是外部资源，那么该字段值为0
     *
     * @param createUid 如果是外部资源，那么该字段值为0
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * @return create_uname
     */
    public String getCreateUname() {
        return createUname;
    }

    /**
     * @param createUname
     */
    public void setCreateUname(String createUname) {
        this.createUname = createUname;
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
     * @return submit_uid
     */
    public Integer getSubmitUid() {
        return submitUid;
    }

    /**
     * @param submitUid
     */
    public void setSubmitUid(Integer submitUid) {
        this.submitUid = submitUid;
    }

    /**
     * @return submit_time
     */
    public Long getSubmitTime() {
        return submitTime;
    }

    /**
     * @param submitTime
     */
    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 获取0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     *
     * @return state - 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     *
     * @param state 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
     *
     * @return state_order - 该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
     */
    public Integer getStateOrder() {
        return stateOrder;
    }

    /**
     * 设置该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
     *
     * @param stateOrder 该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
     */
    public void setStateOrder(Integer stateOrder) {
        this.stateOrder = stateOrder;
    }

    /**
     * @return last_audit_uid
     */
    public Integer getLastAuditUid() {
        return lastAuditUid;
    }

    /**
     * @param lastAuditUid
     */
    public void setLastAuditUid(Integer lastAuditUid) {
        this.lastAuditUid = lastAuditUid;
    }

    /**
     * @return last_audit_username
     */
    public String getLastAuditUsername() {
        return lastAuditUsername;
    }

    /**
     * @param lastAuditUsername
     */
    public void setLastAuditUsername(String lastAuditUsername) {
        this.lastAuditUsername = lastAuditUsername;
    }

    /**
     * 获取仅当发布审核通过时才记录该时间
     *
     * @return last_audit_time - 仅当发布审核通过时才记录该时间
     */
    public Long getLastAuditTime() {
        return lastAuditTime;
    }

    /**
     * 设置仅当发布审核通过时才记录该时间
     *
     * @param lastAuditTime 仅当发布审核通过时才记录该时间
     */
    public void setLastAuditTime(Long lastAuditTime) {
        this.lastAuditTime = lastAuditTime;
    }

    /**
     * @return last_reject_reason
     */
    public String getLastRejectReason() {
        return lastRejectReason;
    }

    /**
     * @param lastRejectReason
     */
    public void setLastRejectReason(String lastRejectReason) {
        this.lastRejectReason = lastRejectReason;
    }

    /**
     * 获取0：未发布
            1：已发布
     *
     * @return publish_state - 0：未发布
            1：已发布
     */
    public Byte getPublishState() {
        return publishState;
    }

    /**
     * 设置0：未发布
            1：已发布
     *
     * @param publishState 0：未发布
            1：已发布
     */
    public void setPublishState(Byte publishState) {
        this.publishState = publishState;
    }

    /**
     * @return publish_uid
     */
    public Integer getPublishUid() {
        return publishUid;
    }

    /**
     * @param publishUid
     */
    public void setPublishUid(Integer publishUid) {
        this.publishUid = publishUid;
    }

    /**
     * @return publish_uname
     */
    public String getPublishUname() {
        return publishUname;
    }

    /**
     * @param publishUname
     */
    public void setPublishUname(String publishUname) {
        this.publishUname = publishUname;
    }

    /**
     * @return publish_time
     */
    public Long getPublishTime() {
        return publishTime;
    }

    /**
     * @param publishTime
     */
    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * @return unpublish_uid
     */
    public Integer getUnpublishUid() {
        return unpublishUid;
    }

    /**
     * @param unpublishUid
     */
    public void setUnpublishUid(Integer unpublishUid) {
        this.unpublishUid = unpublishUid;
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
     * @return unpublish_reason
     */
    public String getUnpublishReason() {
        return unpublishReason;
    }

    /**
     * @param unpublishReason
     */
    public void setUnpublishReason(String unpublishReason) {
        this.unpublishReason = unpublishReason;
    }

    /**
     * @return last_update_uid
     */
    public Integer getLastUpdateUid() {
        return lastUpdateUid;
    }

    /**
     * @param lastUpdateUid
     */
    public void setLastUpdateUid(Integer lastUpdateUid) {
        this.lastUpdateUid = lastUpdateUid;
    }

    /**
     * @return last_update_uname
     */
    public String getLastUpdateUname() {
        return lastUpdateUname;
    }

    /**
     * @param lastUpdateUname
     */
    public void setLastUpdateUname(String lastUpdateUname) {
        this.lastUpdateUname = lastUpdateUname;
    }

    /**
     * @return last_update_time
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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

    /**
     * 获取0：不允许
            1：允许
     *
     * @return allow_up - 0：不允许
            1：允许
     */
    public Byte getAllowUp() {
        return allowUp;
    }

    /**
     * 设置0：不允许
            1：允许
     *
     * @param allowUp 0：不允许
            1：允许
     */
    public void setAllowUp(Byte allowUp) {
        this.allowUp = allowUp;
    }

    /**
     * 获取0：不允许
            1：允许
     *
     * @return allow_fav - 0：不允许
            1：允许
     */
    public Byte getAllowFav() {
        return allowFav;
    }

    /**
     * 设置0：不允许
            1：允许
     *
     * @param allowFav 0：不允许
            1：允许
     */
    public void setAllowFav(Byte allowFav) {
        this.allowFav = allowFav;
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