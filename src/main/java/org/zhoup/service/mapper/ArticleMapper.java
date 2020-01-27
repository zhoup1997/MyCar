package org.zhoup.service.mapper;

import org.zhoup.service.entity.Article;
import org.zhoup.service.entity.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

public interface ArticleMapper extends MyMapper<Article>,IdsMapper<Article> {
}