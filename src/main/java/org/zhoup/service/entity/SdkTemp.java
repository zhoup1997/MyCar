package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sdk_temp")
public class SdkTemp {
    @Id
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    @Column(name = "sdk_path")
    private String sdkPath;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "sdk_name")
    private String sdkName;

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
     * @return sdk_name
     */
    public String getSdkName() {
        return sdkName;
    }

    /**
     * @param sdkName
     */
    public void setSdkName(String sdkName) {
        this.sdkName = sdkName;
    }
}