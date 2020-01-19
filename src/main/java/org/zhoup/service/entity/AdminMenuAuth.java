package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "admin_menu_auth")
public class AdminMenuAuth {
    @Id
    private Short id;

    /**
     * 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    private String controller;

    private String action;

    private String name;

    private String classname;

    /**
     * 0：禁用
            1：启用
     */
    private Byte status;

    private Integer sort;

    /**
     * 1：模块
            2：菜单
            3：权限
     */
    private Byte type;

    @Column(name = "parent_id")
    private Short parentId;

    /**
     * @return id
     */
    public Short getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * 获取如果该菜单为一级菜单，那么parent_guid为NULL
     *
     * @return controller - 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    public String getController() {
        return controller;
    }

    /**
     * 设置如果该菜单为一级菜单，那么parent_guid为NULL
     *
     * @param controller 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    public void setController(String controller) {
        this.controller = controller;
    }

    /**
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
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
     * @return classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * 获取0：禁用
            1：启用
     *
     * @return status - 0：禁用
            1：启用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0：禁用
            1：启用
     *
     * @param status 0：禁用
            1：启用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取1：模块
            2：菜单
            3：权限
     *
     * @return type - 1：模块
            2：菜单
            3：权限
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1：模块
            2：菜单
            3：权限
     *
     * @param type 1：模块
            2：菜单
            3：权限
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return parent_id
     */
    public Short getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}