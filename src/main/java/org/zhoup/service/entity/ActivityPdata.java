package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_pdata")
public class ActivityPdata {
    @Id
    private Long id;

    @Column(name = "activity_id")
    private Long activityId;

    @Column(name = "member_id")
    private Long memberId;

    private String name;

    private String mobile;

    private Integer province;

    @Column(name = "province_name")
    private String provinceName;

    private Integer city;

    @Column(name = "city_name")
    private String cityName;

    private String remark;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "make_id")
    private Integer makeId;

    @Column(name = "make_name")
    private String makeName;

    @Column(name = "model_id")
    private Integer modelId;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "dealer_id")
    private Integer dealerId;

    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 0：待处理
            1：跟进中
            2：战败
            3：无效
            4：成交
     */
    private Byte state;

    @Column(name = "state_update_uid")
    private Integer stateUpdateUid;

    @Column(name = "state_update_time")
    private Long stateUpdateTime;

    @Column(name = "visitor_guid")
    private String visitorGuid;

    @Column(name = "visit_ip")
    private String visitIp;

    @Column(name = "dealer_name")
    private String dealerName;

    @Column(name = "extend_data")
    private String extendData;

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
    public Long getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return province
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * @return province_name
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * @return city
     */
    public Integer getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * @return city_name
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * @return model_id
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * @param modelId
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * @return model_name
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    /**
     * @return car_name
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return dealer_id
     */
    public Integer getDealerId() {
        return dealerId;
    }

    /**
     * @param dealerId
     */
    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * @return channel_id
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * @param channelId
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取0：待处理
            1：跟进中
            2：战败
            3：无效
            4：成交
     *
     * @return state - 0：待处理
            1：跟进中
            2：战败
            3：无效
            4：成交
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置0：待处理
            1：跟进中
            2：战败
            3：无效
            4：成交
     *
     * @param state 0：待处理
            1：跟进中
            2：战败
            3：无效
            4：成交
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * @return state_update_uid
     */
    public Integer getStateUpdateUid() {
        return stateUpdateUid;
    }

    /**
     * @param stateUpdateUid
     */
    public void setStateUpdateUid(Integer stateUpdateUid) {
        this.stateUpdateUid = stateUpdateUid;
    }

    /**
     * @return state_update_time
     */
    public Long getStateUpdateTime() {
        return stateUpdateTime;
    }

    /**
     * @param stateUpdateTime
     */
    public void setStateUpdateTime(Long stateUpdateTime) {
        this.stateUpdateTime = stateUpdateTime;
    }

    /**
     * @return visitor_guid
     */
    public String getVisitorGuid() {
        return visitorGuid;
    }

    /**
     * @param visitorGuid
     */
    public void setVisitorGuid(String visitorGuid) {
        this.visitorGuid = visitorGuid;
    }

    /**
     * @return visit_ip
     */
    public String getVisitIp() {
        return visitIp;
    }

    /**
     * @param visitIp
     */
    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }

    /**
     * @return dealer_name
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * @param dealerName
     */
    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    /**
     * @return extend_data
     */
    public String getExtendData() {
        return extendData;
    }

    /**
     * @param extendData
     */
    public void setExtendData(String extendData) {
        this.extendData = extendData;
    }
}