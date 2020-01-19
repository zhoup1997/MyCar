package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "car_image")
public class CarImage {
    @Id
    private Integer id;

    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "img_title")
    private String imgTitle;

    @Column(name = "img_type")
    private Integer imgType;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "update_time")
    private Long updateTime;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    @Column(name = "sync_time")
    private Long syncTime;

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
     * @return img_title
     */
    public String getImgTitle() {
        return imgTitle;
    }

    /**
     * @param imgTitle
     */
    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle;
    }

    /**
     * @return img_type
     */
    public Integer getImgType() {
        return imgType;
    }

    /**
     * @param imgType
     */
    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    /**
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
     * @return update_time
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取仅当发布审核通过时才记录该时间
     *
     * @return sync_time - 仅当发布审核通过时才记录该时间
     */
    public Long getSyncTime() {
        return syncTime;
    }

    /**
     * 设置仅当发布审核通过时才记录该时间
     *
     * @param syncTime 仅当发布审核通过时才记录该时间
     */
    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}