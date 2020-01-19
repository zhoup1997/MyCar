package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sdk_interface_type")
public class SdkInterfaceType {
    @Id
    private Integer id;

    @Column(name = "type_id")
    private String typeId;

    @Column(name = "interface_count")
    private Integer interfaceCount;

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
     * @return type_id
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * @return interface_count
     */
    public Integer getInterfaceCount() {
        return interfaceCount;
    }

    /**
     * @param interfaceCount
     */
    public void setInterfaceCount(Integer interfaceCount) {
        this.interfaceCount = interfaceCount;
    }
}