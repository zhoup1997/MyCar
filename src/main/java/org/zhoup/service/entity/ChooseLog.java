package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "choose_log")
public class ChooseLog {
    @Id
    private Integer id;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "user_country")
    private Byte userCountry;

    @Column(name = "user_space")
    private String userSpace;

    @Column(name = "user_power")
    private String userPower;

    /**
     * 关联car_model表的ID字段
     */
    @Column(name = "user_comfort")
    private String userComfort;

    @Column(name = "user_safe")
    private String userSafe;

    @Column(name = "user_cost")
    private String userCost;

    @Column(name = "user_min")
    private String userMin;

    @Column(name = "user_max")
    private String userMax;

    @Column(name = "user_ptime")
    private String userPtime;

    @Column(name = "user_car")
    private String userCar;

    @Column(name = "choose_car")
    private String chooseCar;

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
     * @return member_id
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return user_country
     */
    public Byte getUserCountry() {
        return userCountry;
    }

    /**
     * @param userCountry
     */
    public void setUserCountry(Byte userCountry) {
        this.userCountry = userCountry;
    }

    /**
     * @return user_space
     */
    public String getUserSpace() {
        return userSpace;
    }

    /**
     * @param userSpace
     */
    public void setUserSpace(String userSpace) {
        this.userSpace = userSpace;
    }

    /**
     * @return user_power
     */
    public String getUserPower() {
        return userPower;
    }

    /**
     * @param userPower
     */
    public void setUserPower(String userPower) {
        this.userPower = userPower;
    }

    /**
     * 获取关联car_model表的ID字段
     *
     * @return user_comfort - 关联car_model表的ID字段
     */
    public String getUserComfort() {
        return userComfort;
    }

    /**
     * 设置关联car_model表的ID字段
     *
     * @param userComfort 关联car_model表的ID字段
     */
    public void setUserComfort(String userComfort) {
        this.userComfort = userComfort;
    }

    /**
     * @return user_safe
     */
    public String getUserSafe() {
        return userSafe;
    }

    /**
     * @param userSafe
     */
    public void setUserSafe(String userSafe) {
        this.userSafe = userSafe;
    }

    /**
     * @return user_cost
     */
    public String getUserCost() {
        return userCost;
    }

    /**
     * @param userCost
     */
    public void setUserCost(String userCost) {
        this.userCost = userCost;
    }

    /**
     * @return user_min
     */
    public String getUserMin() {
        return userMin;
    }

    /**
     * @param userMin
     */
    public void setUserMin(String userMin) {
        this.userMin = userMin;
    }

    /**
     * @return user_max
     */
    public String getUserMax() {
        return userMax;
    }

    /**
     * @param userMax
     */
    public void setUserMax(String userMax) {
        this.userMax = userMax;
    }

    /**
     * @return user_ptime
     */
    public String getUserPtime() {
        return userPtime;
    }

    /**
     * @param userPtime
     */
    public void setUserPtime(String userPtime) {
        this.userPtime = userPtime;
    }

    /**
     * @return user_car
     */
    public String getUserCar() {
        return userCar;
    }

    /**
     * @param userCar
     */
    public void setUserCar(String userCar) {
        this.userCar = userCar;
    }

    /**
     * @return choose_car
     */
    public String getChooseCar() {
        return chooseCar;
    }

    /**
     * @param chooseCar
     */
    public void setChooseCar(String chooseCar) {
        this.chooseCar = chooseCar;
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