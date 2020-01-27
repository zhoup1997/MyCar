package org.zhoup.service.service;

import org.zhoup.service.dto.ArticleDTO;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Article;

public interface ArticleService {

    DataGridResult findArticleByPage(QueryDTO queryDTO);

    int addArticle(ArticleDTO articleDTO);

    int delArticles(String ids);

    Article findArticleById(Integer id);

    int updateArticle(ArticleDTO articleDTO);

}
