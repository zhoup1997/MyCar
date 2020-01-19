package org.zhoup.service.service;

import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysMenu;
import org.zhoup.service.utils.R;

import java.util.List;


public interface SysMenuService {

    DataGridResult findMenuByPage(QueryDTO queryDTO);

    List<String> findPermsByUserId(Long userId);

    R deleteByIds(String ids);

    R findMenuTree();

    R saveMenu(SysMenu sysMenu);

    R findMenu(Long menuId);

}
