package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "car_param_type")
public class CarParamType {
    @Id
    private Integer id;

    @Column(name = "type_name")
    private String typeName;

    private Integer state;

    @Override
    public String toString() {
        return "CarParamType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", state=" + state +
                '}';
    }

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
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }
}