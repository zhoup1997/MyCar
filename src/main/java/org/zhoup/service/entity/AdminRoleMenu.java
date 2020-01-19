package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "admin_role_menu")
public class AdminRoleMenu {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Id
    @Column(name = "menu_id")
    private Integer menuId;

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

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}