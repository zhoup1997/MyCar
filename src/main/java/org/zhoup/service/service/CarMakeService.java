package org.zhoup.service.service;

import org.zhoup.service.dto.ArticleDTO;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarMake;

import java.util.List;

public interface CarMakeService {

    DataGridResult findCarMakeByPage(QueryDTO queryDTO);

    int addCarMake(CarMake carMake);

    int delCarMake(String ids);

    CarMake findCarMakeById(Integer id);

    int updateCarMake(CarMake carMake);

    List<CarMake> findAll();


}
