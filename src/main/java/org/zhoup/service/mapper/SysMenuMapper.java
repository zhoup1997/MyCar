package org.zhoup.service.mapper;

import org.apache.ibatis.annotations.Param;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysMenu;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

import java.util.List;
import java.util.Map;

public interface SysMenuMapper extends MyMapper<SysMenu>, IdsMapper<SysMenu> {

    List<SysMenu> findMenuByPage(QueryDTO queryDTO);

    List<SysMenu> findMenuTree();

    List<String> findPermsByUserId(Long userId);

    List<Map<String,Object>> findMenuByUserId(Long userId);

    List<Map<String,Object>> findMenuNotButtonByUserId(@Param("userId") Long userId,@Param("parentId") Long parentId);



}