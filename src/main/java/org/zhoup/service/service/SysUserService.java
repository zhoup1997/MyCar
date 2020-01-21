package org.zhoup.service.service;

import org.apache.poi.ss.usermodel.Workbook;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysUser;

public interface SysUserService {

    DataGridResult findUserByPage(QueryDTO queryDTO);

    Workbook exportUser();

    SysUser findUserByUsername(String username);



}
