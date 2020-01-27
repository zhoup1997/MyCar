package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarManufacturer;
import org.zhoup.service.mapper.CarManufacturerMapper;
import org.zhoup.service.service.CarmanuFacturerService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CarmanuFacturerServiceImpl implements CarmanuFacturerService {

    @Autowired
    private CarManufacturerMapper carManufacturerMapper;

    @Override
    public int addCarmanuFacturer(CarManufacturer carManufacturer) {
        return carManufacturerMapper.insert(carManufacturer);
    }

    @Override
    public int delCarManu(String ids) {
        return carManufacturerMapper.deleteByIds(ids);
    }

    @Override
    public int updateCarmanuFacturer(CarManufacturer carManufacturer) {
        return carManufacturerMapper.updateByPrimaryKey(carManufacturer);
    }

    @Override
    public CarManufacturer findById(Integer id) {
        return carManufacturerMapper.selectByPrimaryKey(id);
    }

    @Override
    public DataGridResult findByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        Example example = new Example(CarManufacturer.class);
        if(queryDTO.getSort()!=null){
            example.setOrderByClause("id"+" "+queryDTO.getOrder());
        }
        List<CarManufacturer> carManufacturers = carManufacturerMapper.selectByExample(example);
        PageInfo<CarManufacturer> pageInfo = new PageInfo<>(carManufacturers);
        long total = pageInfo.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total,carManufacturers);
        return dataGridResult;
    }
}
