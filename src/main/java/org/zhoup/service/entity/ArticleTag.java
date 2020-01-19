package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "article_tag")
public class ArticleTag {
    @Id
    private Long id;

    /**
     * 0：未启用
            1：已启用
     */
    @Column(name = "tag_id")
    private Integer tagId;

    @Column(name = "article_id")
    private Long articleId;

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
     * 获取0：未启用
            1：已启用
     *
     * @return tag_id - 0：未启用
            1：已启用
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置0：未启用
            1：已启用
     *
     * @param tagId 0：未启用
            1：已启用
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
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
}