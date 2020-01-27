package org.zhoup.service.mapper;

import org.zhoup.service.entity.Article;
import org.zhoup.service.entity.CarMake;
import org.zhoup.service.entity.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

public interface CarMakeMapper extends MyMapper<CarMake>, IdsMapper<CarMake> {
}