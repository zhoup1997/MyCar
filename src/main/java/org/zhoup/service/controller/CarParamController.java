package org.zhoup.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.CarParams;
import org.zhoup.service.service.CarParamService;
import org.zhoup.service.utils.R;

/**
 *  参数管理Controller
 *  2020年1月27日20:54:28
 */
@Controller
public class CarParamController {

    @Autowired
    private CarParamService carParamService;


    //分页查询
    @RequestMapping("/sys/params/list")
    @ResponseBody
    public DataGridResult findCarParamsByPage(QueryDTO queryDTO){
        return carParamService.findCarParamByPage(queryDTO);
    }

    //添加
    @RequestMapping("/sys/params/save")
    @ResponseBody
    public R findCarParamsByPage(@RequestBody CarParams carParams){
        int result = carParamService.addCarParam(carParams);
        return result>0?R.ok():R.error("添加失败");
    }

    //删除
    @RequestMapping("/sys/params/del")
    @ResponseBody
    public R delCarParams(@RequestBody String ids){
        String replace = ids.replace("[", "").replace("]", "");
        int result = carParamService.delCarParam(replace);
        return result>0? R.ok():R.error("删除失败");
    }

    //单个查询
    @RequestMapping("/sys/params/info/{id}")
    @ResponseBody
    public R findCarParams(@PathVariable("id") Integer id){
        CarParams carParams = carParamService.findCarParamById(id);
        return R.ok().put("params",carParams);
    }

    //修改
    @RequestMapping("/sys/params/update")
    @ResponseBody
    public R UpdateCarParams(@RequestBody CarParams carParams){
        int result = carParamService.updateCarParam(carParams);
        return result>0?R.ok():R.error("修改失败");
    }



}
