package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "operate_log")
public class OperateLog {
    @Id
    private Long id;

    @Column(name = "operate_time")
    private Integer operateTime;

    @Column(name = "operate_uid")
    private Integer operateUid;

    /**
     * 0：未接收
            1：已接收
     */
    @Column(name = "table_name")
    private String tableName;

    @Column(name = "table_disname")
    private String tableDisname;

    /**
     * 0：未阅读
            1：已阅读
     */
    @Column(name = "data_id")
    private Long dataId;

    @Column(name = "operate_desc")
    private String operateDesc;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return operate_time
     */
    public Integer getOperateTime() {
        return operateTime;
    }

    /**
     * @param operateTime
     */
    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return operate_uid
     */
    public Integer getOperateUid() {
        return operateUid;
    }

    /**
     * @param operateUid
     */
    public void setOperateUid(Integer operateUid) {
        this.operateUid = operateUid;
    }

    /**
     * 获取0：未接收
            1：已接收
     *
     * @return table_name - 0：未接收
            1：已接收
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置0：未接收
            1：已接收
     *
     * @param tableName 0：未接收
            1：已接收
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return table_disname
     */
    public String getTableDisname() {
        return tableDisname;
    }

    /**
     * @param tableDisname
     */
    public void setTableDisname(String tableDisname) {
        this.tableDisname = tableDisname;
    }

    /**
     * 获取0：未阅读
            1：已阅读
     *
     * @return data_id - 0：未阅读
            1：已阅读
     */
    public Long getDataId() {
        return dataId;
    }

    /**
     * 设置0：未阅读
            1：已阅读
     *
     * @param dataId 0：未阅读
            1：已阅读
     */
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    /**
     * @return operate_desc
     */
    public String getOperateDesc() {
        return operateDesc;
    }

    /**
     * @param operateDesc
     */
    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }
}