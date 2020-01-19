package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "car_manufacturer")
public class CarManufacturer {
    @Id
    private Integer id;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "make_id")
    private Integer makeId;

    @Column(name = "create_time")
    private Long createTime;

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
     * @return manufacturer_name
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * @param manufacturerName
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
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
}