package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "member_car")
public class MemberCar {
    @Id
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "make_id")
    private Integer makeId;

    @Column(name = "model_id")
    private Integer modelId;

    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "buy_year")
    private Integer buyYear;

    @Column(name = "current_mileage")
    private Integer currentMileage;

    private String remark;

    /**
     * 1：已有座驾
            2：期望座驾
     */
    private Byte type;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "last_update_time")
    private Long lastUpdateTime;

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
     * @return buy_year
     */
    public Integer getBuyYear() {
        return buyYear;
    }

    /**
     * @param buyYear
     */
    public void setBuyYear(Integer buyYear) {
        this.buyYear = buyYear;
    }

    /**
     * @return current_mileage
     */
    public Integer getCurrentMileage() {
        return currentMileage;
    }

    /**
     * @param currentMileage
     */
    public void setCurrentMileage(Integer currentMileage) {
        this.currentMileage = currentMileage;
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
     * 获取1：已有座驾
            2：期望座驾
     *
     * @return type - 1：已有座驾
            2：期望座驾
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1：已有座驾
            2：期望座驾
     *
     * @param type 1：已有座驾
            2：期望座驾
     */
    public void setType(Byte type) {
        this.type = type;
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
}