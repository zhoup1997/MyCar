package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "car_make")
public class CarMake {
    @Id
    private Integer id;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    private String name;

    /**
     * 0：未启用
            1：已启用
     */
    @Column(name = "other_name")
    private String otherName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "manufacturer_id")
    private Integer manufacturerId;

    @Column(name = "country_id")
    private Integer countryId;

    private String phone;

    private String website;

    @Column(name = "logo_url")
    private String logoUrl;

    private String spell;

    private String introduction;

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
     * @return brand_id
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * @param brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * @return brand_name
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
     * @return manufacturer_id
     */
    public Integer getManufacturerId() {
        return manufacturerId;
    }

    /**
     * @param manufacturerId
     */
    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website
     */
    public void setWebsite(String website) {
        this.website = website;
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