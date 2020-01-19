package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sdk_interface_udparm")
public class SdkInterfaceUdparm {
    @Id
    private Integer id;

    @Column(name = "activity_id")
    private Integer activityId;

    @Column(name = "interface_id")
    private Integer interfaceId;

    private String name;

    @Column(name = "parm_name")
    private String parmName;

    @Column(name = "data_type")
    private Integer dataType;

    private String description;

    /**
     * 关联car_product表的ID
     */
    @Column(name = "product_id")
    private Integer productId;

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
     * @return parm_name
     */
    public String getParmName() {
        return parmName;
    }

    /**
     * @param parmName
     */
    public void setParmName(String parmName) {
        this.parmName = parmName;
    }

    /**
     * @return data_type
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取关联car_product表的ID
     *
     * @return product_id - 关联car_product表的ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置关联car_product表的ID
     *
     * @param productId 关联car_product表的ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}