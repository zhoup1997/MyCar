package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sdk_interface_info")
public class SdkInterfaceInfo {
    @Id
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    @Column(name = "cars_id")
    private String carsId;

    @Column(name = "activity_key")
    private String activityKey;

    private String dealer;

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
     * @return cars_id
     */
    public String getCarsId() {
        return carsId;
    }

    /**
     * @param carsId
     */
    public void setCarsId(String carsId) {
        this.carsId = carsId;
    }

    /**
     * @return activity_key
     */
    public String getActivityKey() {
        return activityKey;
    }

    /**
     * @param activityKey
     */
    public void setActivityKey(String activityKey) {
        this.activityKey = activityKey;
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
}