package org.zhoup.service.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.mapper.SysRoleMapper;
import org.zhoup.service.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

    //根据用户ID查询角色名称
    @Override
    public List<String> findRolesByUserId(Long userId) {
        return sysRoleMapper.findRolesByUserId(userId);
    }
}
