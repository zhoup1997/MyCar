package org.zhoup.service.mapper;

import org.zhoup.service.entity.Tag;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

public interface TagMapper extends MyMapper<Tag>, IdsMapper<Tag> {

}