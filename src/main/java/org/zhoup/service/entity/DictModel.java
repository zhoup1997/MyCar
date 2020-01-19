package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "dict_model")
public class DictModel {
    @Id
    private Integer id;

    private String code;

    private String country;

    @Column(name = "model_name")
    private String modelName;

    /**
     * 关联car_model表的ID字段
     */
    @Column(name = "model_id")
    private Integer modelId;

    @Column(name = "msrp_min")
    private Integer msrpMin;

    private Byte space;

    private Byte power;

    private Byte comfort;

    private Byte cost;

    private Byte safety;

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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
     * 获取关联car_model表的ID字段
     *
     * @return model_id - 关联car_model表的ID字段
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * 设置关联car_model表的ID字段
     *
     * @param modelId 关联car_model表的ID字段
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * @return msrp_min
     */
    public Integer getMsrpMin() {
        return msrpMin;
    }

    /**
     * @param msrpMin
     */
    public void setMsrpMin(Integer msrpMin) {
        this.msrpMin = msrpMin;
    }

    /**
     * @return space
     */
    public Byte getSpace() {
        return space;
    }

    /**
     * @param space
     */
    public void setSpace(Byte space) {
        this.space = space;
    }

    /**
     * @return power
     */
    public Byte getPower() {
        return power;
    }

    /**
     * @param power
     */
    public void setPower(Byte power) {
        this.power = power;
    }

    /**
     * @return comfort
     */
    public Byte getComfort() {
        return comfort;
    }

    /**
     * @param comfort
     */
    public void setComfort(Byte comfort) {
        this.comfort = comfort;
    }

    /**
     * @return cost
     */
    public Byte getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(Byte cost) {
        this.cost = cost;
    }

    /**
     * @return safety
     */
    public Byte getSafety() {
        return safety;
    }

    /**
     * @param safety
     */
    public void setSafety(Byte safety) {
        this.safety = safety;
    }
}