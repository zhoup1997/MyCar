package org.zhoup.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarParamType;
import org.zhoup.service.service.CarParamTypeService;
import org.zhoup.service.utils.R;

import java.util.List;

/**
 * 参数分类管理Controller
 * 2020年1月27日20:55:45
 * author：zhoup
 */
@Controller
public class CarParamTypeController {

    @Autowired
    private CarParamTypeService carParamTypeService;

    //分页查询
    @RequestMapping("/sys/paramtype/list")
    @ResponseBody
    public DataGridResult findCarParamTypeByPage(QueryDTO queryDTO){
        return carParamTypeService.findByPage(queryDTO);
    }

    //批量删除
    @RequestMapping("/sys/paramtype/del")
    @ResponseBody
    public R delCarParamType(@RequestBody String ids){
        String replace = ids.replace("[", "").replace("]", "");
        int result = carParamTypeService.delCarParm(replace);
        return result>0?R.ok():R.error("删除失败");
    }

    //修改前的查询
    @RequestMapping("/sys/paramtype/info/{id}")
    @ResponseBody
    public R findCarParamType(@PathVariable("id") Integer id){

        CarParamType carParamType = carParamTypeService.findById(id);
        return R.ok().put("paramtype",carParamType);
    }

    //添加
    @RequestMapping("/sys/paramtype/save")
    @ResponseBody
    public R addCarParamType(@RequestBody CarParamType carParamType){
        int result = carParamTypeService.addCarParamType(carParamType);
        return result>0?R.ok():R.error("添加失败");
    }

    //修改
    @RequestMapping("/sys/paramtype/update")
    @ResponseBody
    public R updateCarParamType(@RequestBody CarParamType carParamType){
        int result = carParamTypeService.updateCarParamType(carParamType);
        return result>0?R.ok():R.error("添加失败");
    }

    //修改
    @RequestMapping("/sys/params/typeall")
    @ResponseBody
    public R findAllCarParamType(){
        List<CarParamType> all = carParamTypeService.findAll();
        return R.ok().put("sites",all);
}





}
