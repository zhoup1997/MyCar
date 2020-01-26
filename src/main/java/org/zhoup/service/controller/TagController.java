package org.zhoup.service.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Tag;
import org.zhoup.service.service.TagService;
import org.zhoup.service.utils.R;

/**
 *  这是标签Tag的控制器
 *  2020年1月21日22:17:53
 */
@Controller
public class TagController {

    @Autowired
    TagService tagService;

    @Autowired
    DefaultKaptcha kaptcha;

    //分页查询
    @RequestMapping("/sys/tag/list")
    @ResponseBody
    public DataGridResult findTagByPage(QueryDTO queryDTO){
        return tagService.findTagByPage(queryDTO);
    }

    //添加
    @RequestMapping("/sys/tag/save")
    @ResponseBody
    public R saveTag(@RequestBody Tag tag){
        int result = tagService.addTag(tag);
        return result>0?R.ok():R.error("修改失败");
    }

    //删除
    @RequestMapping("/sys/tag/del")
    @ResponseBody
    public R delTag(@RequestBody String ids){
        String id = ids.replace("[","").replace("]","");
        int result = tagService.delTagByIds(id);
        return result>0?R.ok():R.error("修改失败");
    }

    //删除
    @RequestMapping("/sys/tag/info/{id}")
    @ResponseBody
    public R delTag(@PathVariable Integer id){
        Tag tag = tagService.findTagById(id);
        if(tag!=null){
            return R.ok().put("tag",tag);
        }
        return R.error("没有找到该标签");
    }


    //修改
    @RequestMapping("/sys/tag/update")
    @ResponseBody
    public R updateTag(@RequestBody Tag tag){
        int result = tagService.updateTag(tag);
        return result>0?R.ok():R.error("修改失败");
    }




}
