package org.zhoup.service.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.service.TagService;

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


}
