package org.zhoup.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarMake;
import org.zhoup.service.service.CarMakeService;
import org.zhoup.service.utils.R;


@Controller
public class CarMakeController {

    @Autowired
    private CarMakeService carMakeService;


    //分页查询
    @RequestMapping("/sys/make/list")
    @ResponseBody
    public DataGridResult findCarMakeByPage(QueryDTO queryDTO){
        return carMakeService.findCarMakeByPage(queryDTO);
    }

    //添加
    @RequestMapping("/sys/make/save")
    @ResponseBody
    public R addCarMake(@RequestBody CarMake carMake){
        int result = carMakeService.addCarMake(carMake);
        return result>0?R.ok():R.error("添加失败");
    }

    //删除
    @RequestMapping("/sys/make/del")
    @ResponseBody
    public R delCarMakes(@RequestBody String ids){
        String replace = ids.replace("[", "").replace("]", "");
        int result = carMakeService.delCarMake(replace);
        return result>0?R.ok():R.error("删除失败");
    }

    //单个查询
    @RequestMapping("/sys/make/info/{id}")
    @ResponseBody
    public R findCarMake(@PathVariable("id") Integer id){
        CarMake carMake = carMakeService.findCarMakeById(id);
        return R.ok().put("carMake",carMake);
    }

    //修改
    @RequestMapping("/sys/make/update")
    @ResponseBody
    public R UpdateCarMake(@RequestBody CarMake carMake){
        int result = carMakeService.updateCarMake(carMake);
        return result>0?R.ok():R.error("修改失败");
    }




}
