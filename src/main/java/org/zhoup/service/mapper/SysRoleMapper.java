package org.zhoup.service.mapper;

import org.zhoup.service.entity.SysRole;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface SysRoleMapper extends MyMapper<SysRole> {

    List<String> findRolesByUserId(Long userId);

}