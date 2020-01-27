package org.zhoup.service.service;

import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarManufacturer;

public interface CarmanuFacturerService {

    public int addCarmanuFacturer(CarManufacturer carManufacturer);

    public int delCarManu(String ids);

    public int updateCarmanuFacturer(CarManufacturer carManufacturer);

    public CarManufacturer findById(Integer id);

    public DataGridResult findByPage(QueryDTO queryDTO);

}
