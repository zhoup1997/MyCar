package org.zhoup.service.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "car_select_list")
public class CarSelectList {
    @Id
    private Integer id;

    private String type;

    private String country;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "car_type_bak")
    private Boolean carTypeBak;

    /**
     * 关联car_model表的ID字段
     */
    @Column(name = "msrp_min")
    private BigDecimal msrpMin;

    @Column(name = "msrp_max")
    private BigDecimal msrpMax;

    /**
     * 所属车系 ：自主1 日2 韩3 德4 美5 欧6
     */
    @Column(name = "country_type")
    private Boolean countryType;

    @Column(name = "country_std")
    private Boolean countryStd;

    @Column(name = "space_std")
    private BigDecimal spaceStd;

    @Column(name = "power_std")
    private BigDecimal powerStd;

    @Column(name = "comfort_std")
    private BigDecimal comfortStd;

    @Column(name = "cost_std")
    private BigDecimal costStd;

    @Column(name = "safe_std")
    private BigDecimal safeStd;

    @Column(name = "car_id")
    private Integer carId;

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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return car_type
     */
    public String getCarType() {
        return carType;
    }

    /**
     * @param carType
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * @return car_type_bak
     */
    public Boolean getCarTypeBak() {
        return carTypeBak;
    }

    /**
     * @param carTypeBak
     */
    public void setCarTypeBak(Boolean carTypeBak) {
        this.carTypeBak = carTypeBak;
    }

    /**
     * 获取关联car_model表的ID字段
     *
     * @return msrp_min - 关联car_model表的ID字段
     */
    public BigDecimal getMsrpMin() {
        return msrpMin;
    }

    /**
     * 设置关联car_model表的ID字段
     *
     * @param msrpMin 关联car_model表的ID字段
     */
    public void setMsrpMin(BigDecimal msrpMin) {
        this.msrpMin = msrpMin;
    }

    /**
     * @return msrp_max
     */
    public BigDecimal getMsrpMax() {
        return msrpMax;
    }

    /**
     * @param msrpMax
     */
    public void setMsrpMax(BigDecimal msrpMax) {
        this.msrpMax = msrpMax;
    }

    /**
     * 获取所属车系 ：自主1 日2 韩3 德4 美5 欧6
     *
     * @return country_type - 所属车系 ：自主1 日2 韩3 德4 美5 欧6
     */
    public Boolean getCountryType() {
        return countryType;
    }

    /**
     * 设置所属车系 ：自主1 日2 韩3 德4 美5 欧6
     *
     * @param countryType 所属车系 ：自主1 日2 韩3 德4 美5 欧6
     */
    public void setCountryType(Boolean countryType) {
        this.countryType = countryType;
    }

    /**
     * @return country_std
     */
    public Boolean getCountryStd() {
        return countryStd;
    }

    /**
     * @param countryStd
     */
    public void setCountryStd(Boolean countryStd) {
        this.countryStd = countryStd;
    }

    /**
     * @return space_std
     */
    public BigDecimal getSpaceStd() {
        return spaceStd;
    }

    /**
     * @param spaceStd
     */
    public void setSpaceStd(BigDecimal spaceStd) {
        this.spaceStd = spaceStd;
    }

    /**
     * @return power_std
     */
    public BigDecimal getPowerStd() {
        return powerStd;
    }

    /**
     * @param powerStd
     */
    public void setPowerStd(BigDecimal powerStd) {
        this.powerStd = powerStd;
    }

    /**
     * @return comfort_std
     */
    public BigDecimal getComfortStd() {
        return comfortStd;
    }

    /**
     * @param comfortStd
     */
    public void setComfortStd(BigDecimal comfortStd) {
        this.comfortStd = comfortStd;
    }

    /**
     * @return cost_std
     */
    public BigDecimal getCostStd() {
        return costStd;
    }

    /**
     * @param costStd
     */
    public void setCostStd(BigDecimal costStd) {
        this.costStd = costStd;
    }

    /**
     * @return safe_std
     */
    public BigDecimal getSafeStd() {
        return safeStd;
    }

    /**
     * @param safeStd
     */
    public void setSafeStd(BigDecimal safeStd) {
        this.safeStd = safeStd;
    }

    /**
     * @return car_id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * @param carId
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}