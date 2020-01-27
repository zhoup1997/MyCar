package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Article;
import org.zhoup.service.entity.CarParamType;
import org.zhoup.service.entity.CarParams;
import org.zhoup.service.mapper.CarParamsMapper;
import org.zhoup.service.service.CarParamService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CarParamServiceImpl implements CarParamService {

    @Autowired
    private CarParamsMapper carParamsMapper;


    @Override
    public DataGridResult findCarParamByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(), queryDTO.getLimit());
        Example example = new Example(CarParams.class);
        if(queryDTO.getSort()!=null&&!queryDTO.getSort().equals("")){
            example.setOrderByClause("id"+" "+queryDTO.getOrder());
        }
        List<CarParams> carParams = carParamsMapper.selectByExample(example);
        PageInfo<Article> pageInfo = new PageInfo<>();
        long total = pageInfo.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total,carParams);
        return dataGridResult;
    }

    @Override
    public int addCarParam(CarParams carParams) {
        return carParamsMapper.insert(carParams);
    }

    @Override
    public int delCarParam(String ids) {
        return carParamsMapper.deleteByIds(ids);
    }

    @Override
    public CarParams findCarParamById(Integer id) {
        return carParamsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateCarParam(CarParams carParams) {
        return carParamsMapper.updateByPrimaryKey(carParams);
    }

}
