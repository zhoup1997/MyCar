package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Tag;
import org.zhoup.service.mapper.TagMapper;
import org.zhoup.service.service.TagService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Tag标签的Service层
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public DataGridResult findTagByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        Example example = new Example(Tag.class);
        if(queryDTO.getSort()!=null&&!queryDTO.getSort().equals("")){
            example.setOrderByClause("id"+" "+queryDTO.getOrder());
        }
        List<Tag> tags = tagMapper.selectByExample(example);
        PageInfo<Tag> tagPageInfo = new PageInfo<>();
        long total = tagPageInfo.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total, tags);
        return dataGridResult;
    }

    @Override//添加标签
    public int addTag(Tag tag) {
        return  tagMapper.insert(tag);
    }

    @Override//批量删除
    public int delTagByIds(String ids) {
        return tagMapper.deleteByIds(ids);
    }

    @Override
    public Tag findTagById(Integer id) {
        return tagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateTag(Tag tag) {
        return tagMapper.updateByPrimaryKey(tag);
    }
}
