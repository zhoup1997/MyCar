package org.zhoup.service.service;

import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysMenu;
import org.zhoup.service.utils.R;


public interface SysMenuService {

    DataGridResult findMenuByPage(QueryDTO queryDTO);

    R deleteByIds(String ids);

    R findMenuTree();

    R saveMenu(SysMenu sysMenu);

    R findMenu(Long menuId);

}
