package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "article_action")
public class ArticleAction {
    @Id
    private Long id;

    @Column(name = "article_id")
    private Long articleId;

    /**
     * 0：未启用
            1：已启用
     */
    @Column(name = "operator_uid")
    private Integer operatorUid;

    /**
     * 0：非默认摘要
            1：默认摘要
     */
    @Column(name = "operator_username")
    private String operatorUsername;

    @Column(name = "create_time")
    private Long createTime;

    private String content;

    /**
     * 1：新增
            2：编辑
            3：审核
            4：删除
     */
    @Column(name = "operate_type")
    private Byte operateType;

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
     * @return article_id
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取0：未启用
            1：已启用
     *
     * @return operator_uid - 0：未启用
            1：已启用
     */
    public Integer getOperatorUid() {
        return operatorUid;
    }

    /**
     * 设置0：未启用
            1：已启用
     *
     * @param operatorUid 0：未启用
            1：已启用
     */
    public void setOperatorUid(Integer operatorUid) {
        this.operatorUid = operatorUid;
    }

    /**
     * 获取0：非默认摘要
            1：默认摘要
     *
     * @return operator_username - 0：非默认摘要
            1：默认摘要
     */
    public String getOperatorUsername() {
        return operatorUsername;
    }

    /**
     * 设置0：非默认摘要
            1：默认摘要
     *
     * @param operatorUsername 0：非默认摘要
            1：默认摘要
     */
    public void setOperatorUsername(String operatorUsername) {
        this.operatorUsername = operatorUsername;
    }

    /**
     * @return create_time
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取1：新增
            2：编辑
            3：审核
            4：删除
     *
     * @return operate_type - 1：新增
            2：编辑
            3：审核
            4：删除
     */
    public Byte getOperateType() {
        return operateType;
    }

    /**
     * 设置1：新增
            2：编辑
            3：审核
            4：删除
     *
     * @param operateType 1：新增
            2：编辑
            3：审核
            4：删除
     */
    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }
}