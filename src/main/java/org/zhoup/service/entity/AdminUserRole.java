package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "admin_user_role")
public class AdminUserRole {
    @Id
    private Integer id;

    /**
     * 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;

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
     * 获取如果该菜单为一级菜单，那么parent_guid为NULL
     *
     * @return user_id - 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置如果该菜单为一级菜单，那么parent_guid为NULL
     *
     * @param userId 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}