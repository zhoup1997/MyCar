package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_dealer")
public class ActivityDealer {
    @Id
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    /**
     * 对应car_model表的id字段
     */
    @Column(name = "dealer_id")
    private Integer dealerId;

    @Column(name = "dealer_province")
    private String dealerProvince;

    @Column(name = "dealer_city")
    private String dealerCity;

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
     * @return activity_id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取对应car_model表的id字段
     *
     * @return dealer_id - 对应car_model表的id字段
     */
    public Integer getDealerId() {
        return dealerId;
    }

    /**
     * 设置对应car_model表的id字段
     *
     * @param dealerId 对应car_model表的id字段
     */
    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * @return dealer_province
     */
    public String getDealerProvince() {
        return dealerProvince;
    }

    /**
     * @param dealerProvince
     */
    public void setDealerProvince(String dealerProvince) {
        this.dealerProvince = dealerProvince;
    }

    /**
     * @return dealer_city
     */
    public String getDealerCity() {
        return dealerCity;
    }

    /**
     * @param dealerCity
     */
    public void setDealerCity(String dealerCity) {
        this.dealerCity = dealerCity;
    }
}