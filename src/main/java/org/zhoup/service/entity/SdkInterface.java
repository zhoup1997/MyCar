package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "sdk_interface")
public class SdkInterface {
    @Id
    private Integer id;

    @Column(name = "type_id")
    private Integer typeId;

    private String name;

    @Column(name = "inter_desc")
    private String interDesc;

    private String url;

    private String success;

    private String error;

    @Column(name = "request_type")
    private String requestType;

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
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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
     * @return inter_desc
     */
    public String getInterDesc() {
        return interDesc;
    }

    /**
     * @param interDesc
     */
    public void setInterDesc(String interDesc) {
        this.interDesc = interDesc;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return success;
    }

    /**
     * @param success
     */
    public void setSuccess(String success) {
        this.success = success;
    }

    /**
     * @return error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return request_type
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * @param requestType
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}