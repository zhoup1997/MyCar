package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "admin_role")
public class AdminRole {
    @Id
    private Integer id;

    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    private Byte deleted;

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
     * 获取0：未删除
            1：已删除
     *
     * @return deleted - 0：未删除
            1：已删除
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 设置0：未删除
            1：已删除
     *
     * @param deleted 0：未删除
            1：已删除
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}