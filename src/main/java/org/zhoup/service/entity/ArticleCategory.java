package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "article_category")
public class ArticleCategory {
    @Id
    private Integer id;

    /**
     * 0：未启用
            1：已启用
     */
    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    @Column(name = "sort_num")
    private Integer sortNum;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "last_update_time")
    private Long lastUpdateTime;

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
     * 获取0：未启用
            1：已启用
     *
     * @return name - 0：未启用
            1：已启用
     */
    public String getName() {
        return name;
    }

    /**
     * 设置0：未启用
            1：已启用
     *
     * @param name 0：未启用
            1：已启用
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取0：未删除
            1：已删除
     *
     * @return is_deleted - 0：未删除
            1：已删除
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置0：未删除
            1：已删除
     *
     * @param isDeleted 0：未删除
            1：已删除
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return sort_num
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
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