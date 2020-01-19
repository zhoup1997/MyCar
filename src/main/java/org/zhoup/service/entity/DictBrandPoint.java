package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "dict_brand_point")
public class DictBrandPoint {
    @Id
    private Integer id;

    /**
     * 关联car_brand表的ID字段
     */
    @Column(name = "brand_id")
    private Integer brandId;

    private String name;

    private Byte point;

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
     * 获取关联car_brand表的ID字段
     *
     * @return brand_id - 关联car_brand表的ID字段
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置关联car_brand表的ID字段
     *
     * @param brandId 关联car_brand表的ID字段
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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
     * @return point
     */
    public Byte getPoint() {
        return point;
    }

    /**
     * @param point
     */
    public void setPoint(Byte point) {
        this.point = point;
    }
}