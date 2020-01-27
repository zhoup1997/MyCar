package org.zhoup.service.mapper;

import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Article;
import org.zhoup.service.entity.SysUser;
import org.zhoup.service.entity.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

import java.util.List;
import java.util.Map;

public interface SysUserMapper extends MyMapper<SysUser>, IdsMapper<SysUser> {

    List<SysUser> findUserByPage(QueryDTO queryDTO);

    List<Map<String,Object>> exportUser();

}