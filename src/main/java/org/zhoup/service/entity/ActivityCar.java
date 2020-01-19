package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "activity_car")
public class ActivityCar {
    @Id
    private Long id;

    @Column(name = "activity_id")
    private Long activityId;

    /**
     * 对应car_model表的id字段
     */
    @Column(name = "car_id")
    private Long carId;

    private Integer enable;

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
     * 获取对应car_model表的id字段
     *
     * @return car_id - 对应car_model表的id字段
     */
    public Long getCarId() {
        return carId;
    }

    /**
     * 设置对应car_model表的id字段
     *
     * @param carId 对应car_model表的id字段
     */
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}