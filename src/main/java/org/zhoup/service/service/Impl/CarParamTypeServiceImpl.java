package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarParamType;
import org.zhoup.service.mapper.CarParamTypeMapper;
import org.zhoup.service.service.CarParamTypeService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CarParamTypeServiceImpl implements CarParamTypeService {

    @Autowired
    private CarParamTypeMapper carParamTypeMapper;


    @Override
    public int addCarParamType(CarParamType carParamType) {
        return carParamTypeMapper.insert(carParamType);
    }

    @Override
    public int delCarParm(String ids) {
        return carParamTypeMapper.deleteByIds(ids);
    }

    @Override
    public int updateCarParamType(CarParamType carParamType) {
        return carParamTypeMapper.updateByPrimaryKey(carParamType);
    }

    @Override
    public CarParamType findById(Integer id) {
        return carParamTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CarParamType> findAll() {
        return carParamTypeMapper.selectAll();
    }

    @Override
    public DataGridResult findByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        Example example = new Example(CarParamType.class);
        if(queryDTO.getSort()!=null){
            example.setOrderByClause("id"+" "+queryDTO.getOrder());
        }
        List<CarParamType> carParamTypes = carParamTypeMapper.selectByExample(example);
        PageInfo<CarParamType> carParamTypePageInfo = new PageInfo<>(carParamTypes);
        long total = carParamTypePageInfo.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total,carParamTypes);
        return dataGridResult;
    }
}
