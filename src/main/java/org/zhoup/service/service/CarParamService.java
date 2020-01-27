package org.zhoup.service.service;

import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarParamType;
import org.zhoup.service.entity.CarParams;

import java.util.List;


public interface CarParamService {


    DataGridResult findCarParamByPage(QueryDTO queryDTO);

    int addCarParam(CarParams carParams);

    int delCarParam(String ids);

    CarParams findCarParamById(Integer id);

    int updateCarParam(CarParams carParams);


}
