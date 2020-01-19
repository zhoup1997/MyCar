package org.zhoup.service.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "car_model")
public class CarModel {
    @Id
    private Integer id;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "make_id")
    private Integer makeId;

    @Column(name = "make_name")
    private String makeName;

    private String name;

    @Column(name = "display_name")
    private String displayName;

    /**
     * 0：未启用
            1：已启用
     */
    @Column(name = "other_name")
    private String otherName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "country_class")
    private Integer countryClass;

    @Column(name = "country_class_name")
    private String countryClassName;

    /**
     * 类似：SUV、MPV等
     */
    @Column(name = "body_form")
    private Integer bodyForm;

    @Column(name = "body_form_name")
    private String bodyFormName;

    @Column(name = "price_low")
    private BigDecimal priceLow;

    @Column(name = "price_high")
    private BigDecimal priceHigh;

    /**
     * 0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
     */
    private Integer level;

    @Column(name = "level_name")
    private String levelName;

    /**
     * 0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
     */
    @Column(name = "level_second")
    private Integer levelSecond;

    @Column(name = "level_second_name")
    private String levelSecondName;

    @Column(name = "sale_status")
    private Byte saleStatus;

    @Column(name = "all_spell")
    private String allSpell;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_name")
    private String countryName;

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
     * @return make_id
     */
    public Integer getMakeId() {
        return makeId;
    }

    /**
     * @param makeId
     */
    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    /**
     * @return make_name
     */
    public String getMakeName() {
        return makeName;
    }

    /**
     * @param makeName
     */
    public void setMakeName(String makeName) {
        this.makeName = makeName;
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
     * @return display_name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
     * @return country_class
     */
    public Integer getCountryClass() {
        return countryClass;
    }

    /**
     * @param countryClass
     */
    public void setCountryClass(Integer countryClass) {
        this.countryClass = countryClass;
    }

    /**
     * @return country_class_name
     */
    public String getCountryClassName() {
        return countryClassName;
    }

    /**
     * @param countryClassName
     */
    public void setCountryClassName(String countryClassName) {
        this.countryClassName = countryClassName;
    }

    /**
     * 获取类似：SUV、MPV等
     *
     * @return body_form - 类似：SUV、MPV等
     */
    public Integer getBodyForm() {
        return bodyForm;
    }

    /**
     * 设置类似：SUV、MPV等
     *
     * @param bodyForm 类似：SUV、MPV等
     */
    public void setBodyForm(Integer bodyForm) {
        this.bodyForm = bodyForm;
    }

    /**
     * @return body_form_name
     */
    public String getBodyFormName() {
        return bodyFormName;
    }

    /**
     * @param bodyFormName
     */
    public void setBodyFormName(String bodyFormName) {
        this.bodyFormName = bodyFormName;
    }

    /**
     * @return price_low
     */
    public BigDecimal getPriceLow() {
        return priceLow;
    }

    /**
     * @param priceLow
     */
    public void setPriceLow(BigDecimal priceLow) {
        this.priceLow = priceLow;
    }

    /**
     * @return price_high
     */
    public BigDecimal getPriceHigh() {
        return priceHigh;
    }

    /**
     * @param priceHigh
     */
    public void setPriceHigh(BigDecimal priceHigh) {
        this.priceHigh = priceHigh;
    }

    /**
     * 获取0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
     *
     * @return level - 0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
     *
     * @param level 0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return level_name
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * @param levelName
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    /**
     * 获取0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
     *
     * @return level_second - 0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
     */
    public Integer getLevelSecond() {
        return levelSecond;
    }

    /**
     * 设置0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
     *
     * @param levelSecond 0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
     */
    public void setLevelSecond(Integer levelSecond) {
        this.levelSecond = levelSecond;
    }

    /**
     * @return level_second_name
     */
    public String getLevelSecondName() {
        return levelSecondName;
    }

    /**
     * @param levelSecondName
     */
    public void setLevelSecondName(String levelSecondName) {
        this.levelSecondName = levelSecondName;
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
     * @return country_name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
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