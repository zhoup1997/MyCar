package org.zhoup.service.service;

import org.apache.poi.ss.usermodel.Workbook;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysUser;
import org.zhoup.service.utils.R;

import java.util.List;

public interface SysUserService {

    DataGridResult findUserByPage(QueryDTO queryDTO);

    Workbook exportUser();

}
