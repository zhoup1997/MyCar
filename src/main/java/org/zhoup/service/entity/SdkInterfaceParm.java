package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sdk_interface_parm")
public class SdkInterfaceParm {
    @Id
    private Integer id;

    @Column(name = "interface_id")
    private Integer interfaceId;

    private String name;

    @Column(name = "parm_name")
    private String parmName;

    @Column(name = "data_type")
    private Integer dataType;

    private String description;

    @Column(name = "is_required")
    private Integer isRequired;

    @Column(name = "is_custom")
    private Integer isCustom;

    @Column(name = "is_login")
    private Integer isLogin;

    @Column(name = "activity_key")
    private Integer activityKey;

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
     * @return interface_id
     */
    public Integer getInterfaceId() {
        return interfaceId;
    }

    /**
     * @param interfaceId
     */
    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
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
     * @return parm_name
     */
    public String getParmName() {
        return parmName;
    }

    /**
     * @param parmName
     */
    public void setParmName(String parmName) {
        this.parmName = parmName;
    }

    /**
     * @return data_type
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return is_required
     */
    public Integer getIsRequired() {
        return isRequired;
    }

    /**
     * @param isRequired
     */
    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * @return is_custom
     */
    public Integer getIsCustom() {
        return isCustom;
    }

    /**
     * @param isCustom
     */
    public void setIsCustom(Integer isCustom) {
        this.isCustom = isCustom;
    }

    /**
     * @return is_login
     */
    public Integer getIsLogin() {
        return isLogin;
    }

    /**
     * @param isLogin
     */
    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    /**
     * @return activity_key
     */
    public Integer getActivityKey() {
        return activityKey;
    }

    /**
     * @param activityKey
     */
    public void setActivityKey(Integer activityKey) {
        this.activityKey = activityKey;
    }
}