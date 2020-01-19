package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "car_model_image")
public class CarModelImage {
    @Id
    private Integer id;

    @Column(name = "model_id")
    private Integer modelId;

    private String year;

    @Column(name = "mod_default")
    private Integer modDefault;

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
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return mod_default
     */
    public Integer getModDefault() {
        return modDefault;
    }

    /**
     * @param modDefault
     */
    public void setModDefault(Integer modDefault) {
        this.modDefault = modDefault;
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