package org.zhoup.service.service;


import java.util.List;

public interface RoleService {

    List<String> findRolesByUserId(Long userId);

}
