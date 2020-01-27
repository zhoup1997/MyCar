package org.zhoup.service.mapper;

import org.zhoup.service.entity.CarParamType;
import org.zhoup.service.entity.CarParams;
import org.zhoup.service.entity.mapper.MyMapper;
import tk.mybatis.mapper.common.IdsMapper;

import java.util.List;

public interface CarParamsMapper extends MyMapper<CarParams>, IdsMapper<CarParams> {

    List<CarParamType> findCarType();

}