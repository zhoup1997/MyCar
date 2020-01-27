package org.zhoup.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.zhoup.service.dto.ArticleDTO;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Article;
import org.zhoup.service.service.ArticleService;
import org.zhoup.service.utils.R;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 咨询管理控制类
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //分页查询
    @RequestMapping("/sys/article/list")
    @ResponseBody
    public DataGridResult findArticleByPage(QueryDTO queryDTO){
        return articleService.findArticleByPage(queryDTO);
    }

    //添加
    @RequestMapping("/sys/article/save")
    @ResponseBody
    public R findArticleByPage(@RequestBody ArticleDTO articleDTO){
        int result = articleService.addArticle(articleDTO);
        return result>0?R.ok():R.error("添加失败");
    }

    //删除
    @RequestMapping("/sys/article/del")
    @ResponseBody
    public R delArticles(@RequestBody String ids){
        String replace = ids.replace("[", "").replace("]", "");
        int result = articleService.delArticles(replace);
        return result>0?R.ok():R.error("删除失败");
    }

    //单个查询
    @RequestMapping("/sys/article/info/{id}")
    @ResponseBody
    public R findArticle(@PathVariable("id") Integer id){
        Article article = articleService.findArticleById(id);
        return R.ok().put("article",article);
    }

    //修改
    @RequestMapping("/sys/article/update")
    @ResponseBody
    public R UpdateArticle(@RequestBody ArticleDTO articleDTO){
        int result = articleService.updateArticle(articleDTO);
        return result>0?R.ok():R.error("修改失败");
    }

    @RequestMapping("/ytupload")
    @ResponseBody
    public R upload(@RequestParam("mypic") MultipartFile multipartFile, HttpServletRequest request){
        //得到文件名称
        String filename = multipartFile.getOriginalFilename();
        //上传的目的地,不做分布式，只是存储在本质,同时不考虑文件名重复的问题
        File dest = new File("D:\\Mycar\\"+filename);
        try {
            multipartFile.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok().put("file",filename);
    }

}
