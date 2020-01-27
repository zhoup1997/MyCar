package org.zhoup.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarMake;
import org.zhoup.service.entity.CarManufacturer;
import org.zhoup.service.service.CarMakeService;
import org.zhoup.service.service.CarmanuFacturerService;
import org.zhoup.service.utils.R;

import java.util.List;

/**
 * 厂商管理Controller
 * 2020年1月27日22:25:05
 */
@Controller
public class CarManufacturerController {

    @Autowired
    private CarmanuFacturerService carmanuFacturerService;

    @Autowired
    private CarMakeService carMakeService;


    //分页查询
    @RequestMapping("/sys/manufacturer/list")
    @ResponseBody
    public DataGridResult findCarMenuFacturerByPage(QueryDTO queryDTO){
        return carmanuFacturerService.findByPage(queryDTO);
    }

    //添加
    @RequestMapping("/sys/manufacturer/save")
    @ResponseBody
    public R addCarMenuFacturer(@RequestBody CarManufacturer carManufacturer){
        int result = carmanuFacturerService.addCarmanuFacturer(carManufacturer);
        return result>0?R.ok():R.error("添加失败");
    }

    //删除
    @RequestMapping("/sys/manufacturer/del")
    @ResponseBody
    public R delCarMenuFacturer(@RequestBody String ids){
        String replace = ids.replace("[", "").replace("]", "");
        int result = carmanuFacturerService.delCarManu(replace);
        return result>0? R.ok():R.error("删除失败");
    }

    //单个查询
    @RequestMapping("/sys/manufacturer/info/{id}")
    @ResponseBody
    public R findCarMenuFacturer(@PathVariable("id") Integer id){
        CarManufacturer carManufacturer = carmanuFacturerService.findById(id);
        return R.ok().put("manufacturer",carManufacturer);
    }

    //单个查询
    @RequestMapping("/sys/manufacturer/typeall")
    @ResponseBody
    public R findCarMakes(){
        List<CarMake> carMakes = carMakeService.findAll();
        return R.ok().put("sites",carMakes);
    }

    //修改
    @RequestMapping("/sys/manufacturer/update")
    @ResponseBody
    public R UpdateCarParams(@RequestBody CarManufacturer carManufacturer){
        int result = carmanuFacturerService.updateCarmanuFacturer(carManufacturer);
        return result>0?R.ok():R.error("修改失败");
    }



}
