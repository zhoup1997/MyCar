package org.zhoup.service.mapper;

import org.zhoup.service.entity.Article;
import org.zhoup.service.entity.Tag;
import org.zhoup.service.entity.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

public interface TagMapper extends MyMapper<Tag>, IdsMapper<Tag> {

}