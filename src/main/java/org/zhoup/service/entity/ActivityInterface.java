package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_interface")
public class ActivityInterface {
    @Id
    private Long id;

    @Column(name = "activity_id")
    private Integer activityId;

    @Column(name = "interface_id")
    private Integer interfaceId;

    @Column(name = "sdk_id")
    private Integer sdkId;

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
     * @return interface_id
     */
    public Integer getInterfaceId() {
        return interfaceId;
    }

    /**
     * @param interfaceId
     */
    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
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
}