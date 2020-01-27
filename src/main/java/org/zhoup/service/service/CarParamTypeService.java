package org.zhoup.service.service;

import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarParamType;

import java.util.List;

public interface CarParamTypeService {

    public int addCarParamType(CarParamType carParamType);

    public int delCarParm(String ids);

    public int updateCarParamType(CarParamType carParamType);

    public CarParamType findById(Integer id);

    public List<CarParamType> findAll();

    public DataGridResult findByPage(QueryDTO queryDTO);

}
