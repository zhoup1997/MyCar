package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "car_brand")
public class CarBrand {
    @Id
    private Integer id;

    private String name;

    /**
     * 0：未启用
            1：已启用
     */
    @Column(name = "other_name")
    private String otherName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "logo_url")
    private String logoUrl;

    /**
     * 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    @Column(name = "logo_meaning")
    private String logoMeaning;

    @Column(name = "first_char")
    private String firstChar;

    private String spell;

    @Column(name = "all_spell")
    private String allSpell;

    @Column(name = "name_spell")
    private String nameSpell;

    @Column(name = "name_all_spell")
    private String nameAllSpell;

    private String introduction;

    @Column(name = "sale_status")
    private Byte saleStatus;

    @Column(name = "is_enabled")
    private Byte isEnabled;

    /**
     * 如果是外部资源，那么该字段值为0
     */
    @Column(name = "is_removed")
    private Byte isRemoved;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "update_time")
    private Long updateTime;

    /**
     * 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    @Column(name = "do_time")
    private Long doTime;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    @Column(name = "sync_time")
    private Long syncTime;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取0：未启用
            1：已启用
     *
     * @return other_name - 0：未启用
            1：已启用
     */
    public String getOtherName() {
        return otherName;
    }

    /**
     * 设置0：未启用
            1：已启用
     *
     * @param otherName 0：未启用
            1：已启用
     */
    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    /**
     * @return english_name
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * @return country_id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * @return logo_url
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * @param logoUrl
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * 获取此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     *
     * @return logo_meaning - 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    public String getLogoMeaning() {
        return logoMeaning;
    }

    /**
     * 设置此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     *
     * @param logoMeaning 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    public void setLogoMeaning(String logoMeaning) {
        this.logoMeaning = logoMeaning;
    }

    /**
     * @return first_char
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * @param firstChar
     */
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    /**
     * @return spell
     */
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * @return all_spell
     */
    public String getAllSpell() {
        return allSpell;
    }

    /**
     * @param allSpell
     */
    public void setAllSpell(String allSpell) {
        this.allSpell = allSpell;
    }

    /**
     * @return name_spell
     */
    public String getNameSpell() {
        return nameSpell;
    }

    /**
     * @param nameSpell
     */
    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell;
    }

    /**
     * @return name_all_spell
     */
    public String getNameAllSpell() {
        return nameAllSpell;
    }

    /**
     * @param nameAllSpell
     */
    public void setNameAllSpell(String nameAllSpell) {
        this.nameAllSpell = nameAllSpell;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * @return sale_status
     */
    public Byte getSaleStatus() {
        return saleStatus;
    }

    /**
     * @param saleStatus
     */
    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * @return is_enabled
     */
    public Byte getIsEnabled() {
        return isEnabled;
    }

    /**
     * @param isEnabled
     */
    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取如果是外部资源，那么该字段值为0
     *
     * @return is_removed - 如果是外部资源，那么该字段值为0
     */
    public Byte getIsRemoved() {
        return isRemoved;
    }

    /**
     * 设置如果是外部资源，那么该字段值为0
     *
     * @param isRemoved 如果是外部资源，那么该字段值为0
     */
    public void setIsRemoved(Byte isRemoved) {
        this.isRemoved = isRemoved;
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
     * @return update_time
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     *
     * @return do_time - 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    public Long getDoTime() {
        return doTime;
    }

    /**
     * 设置0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     *
     * @param doTime 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    public void setDoTime(Long doTime) {
        this.doTime = doTime;
    }

    /**
     * 获取仅当发布审核通过时才记录该时间
     *
     * @return sync_time - 仅当发布审核通过时才记录该时间
     */
    public Long getSyncTime() {
        return syncTime;
    }

    /**
     * 设置仅当发布审核通过时才记录该时间
     *
     * @param syncTime 仅当发布审核通过时才记录该时间
     */
    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}