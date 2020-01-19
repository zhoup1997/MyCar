package org.zhoup.service.entity;

import javax.persistence.*;

public class Area {
    @Id
    private Integer id;

    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    private Integer pid;

    private String areacode;

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
     * @return pid - 0：未删除
            1：已删除
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置0：未删除
            1：已删除
     *
     * @param pid 0：未删除
            1：已删除
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * @param areacode
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }
}