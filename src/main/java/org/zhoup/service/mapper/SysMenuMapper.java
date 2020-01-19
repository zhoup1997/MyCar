package org.zhoup.service.mapper;

import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysMenu;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

import java.util.List;

public interface SysMenuMapper extends MyMapper<SysMenu>, IdsMapper<SysMenu> {

    List<SysMenu> findMenuByPage(QueryDTO queryDTO);

    List<SysMenu> findMenuTree();

    List<String> findPermsByUserId(Long userId);

}