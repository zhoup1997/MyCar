package org.zhoup.service.service;

import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Tag;

public interface TagService {

    DataGridResult findTagByPage(QueryDTO queryDTO);

    int addTag(Tag tag);

    int delTagByIds(String ids);

    Tag findTagById(Integer id);

    int updateTag(Tag tag);

}
