package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarMake;
import org.zhoup.service.mapper.CarMakeMapper;
import org.zhoup.service.service.CarMakeService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CarMakeServiceImpl implements CarMakeService {

    @Autowired
    private CarMakeMapper carMakeMapper;


    @Override
    public DataGridResult findCarMakeByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        Example example = new Example(CarMake.class);
        if(queryDTO.getSort()!=null&&!queryDTO.getSort().equals("")){
            example.setOrderByClause("id"+" "+queryDTO.getOrder());
        }
        List<CarMake> carMakes = carMakeMapper.selectByExample(example);
        PageInfo<CarMake> pageInfo = new PageInfo<>(carMakes);
        long total = pageInfo.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total,carMakes);
        return dataGridResult;
    }

    @Override
    public int addCarMake(CarMake carMake) {
        return carMakeMapper.insert(carMake);
    }

    @Override
    public int delCarMake(String ids) {
        return carMakeMapper.deleteByIds(ids);
    }

    @Override
    public CarMake findCarMakeById(Integer id) {
        return carMakeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateCarMake(CarMake carMake) {
        return carMakeMapper.updateByPrimaryKey(carMake);
    }

    @Override
    public List<CarMake> findAll() {
        return carMakeMapper.selectAll();
    }
}
