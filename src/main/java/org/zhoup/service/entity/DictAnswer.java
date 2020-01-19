package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "dict_answer")
public class DictAnswer {
    @Id
    private Integer id;

    @Column(name = "weight_id")
    private Integer weightId;

    private String name;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "adjust_value")
    private Integer adjustValue;

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
     * @return weight_id
     */
    public Integer getWeightId() {
        return weightId;
    }

    /**
     * @param weightId
     */
    public void setWeightId(Integer weightId) {
        this.weightId = weightId;
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
     * @return en_name
     */
    public String getEnName() {
        return enName;
    }

    /**
     * @param enName
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * @return adjust_value
     */
    public Integer getAdjustValue() {
        return adjustValue;
    }

    /**
     * @param adjustValue
     */
    public void setAdjustValue(Integer adjustValue) {
        this.adjustValue = adjustValue;
    }
}