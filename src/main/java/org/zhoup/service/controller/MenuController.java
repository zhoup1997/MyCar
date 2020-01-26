package org.zhoup.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysMenu;
import org.zhoup.service.service.SysMenuService;
import org.zhoup.service.utils.R;
import org.zhoup.service.utils.ShiroUtils;


@Controller
public class MenuController {

    @Autowired
    SysMenuService sysMenuService;


    //查询一级菜单一级子菜单
    @RequestMapping("sys/menu/user")
    @ResponseBody
    public R findMenuByUserId(){
        long userId = ShiroUtils.getUserId();
        return sysMenuService.findMenuNotButtonByUserId(userId);
    }

    //分页查询
    @RequestMapping("sys/menu/list")
    @ResponseBody
    public DataGridResult findMenuByPage(QueryDTO queryDTO){
        return sysMenuService.findMenuByPage(queryDTO);
    }


    //批量删除
    @RequestMapping("/sys/menu/del")
    @ResponseBody
    public R deleteIds(@RequestBody String ids){
        return sysMenuService.deleteByIds(ids);
    }

    //加载菜单树
    @RequestMapping("/sys/menu/select")
    @ResponseBody
    public R menuTree(){
        return sysMenuService.findMenuTree();
    }

    //添加菜单
    @RequestMapping("/sys/menu/save")
    @ResponseBody
    public R saveMenu(@RequestBody SysMenu sysMenu){
        return sysMenuService.saveMenu(sysMenu);
    }

    //查询菜单
    @RequestMapping("/sys/menu/info/{menuId}")
    @ResponseBody
    public R findMenu(@PathVariable("menuId") Long menuId){
        return sysMenuService.findMenu(menuId);
    }

    //修改
    @RequestMapping("/sys/menu/update")
    @ResponseBody
    public R updateMenu(@RequestBody SysMenu sysMenu){
        return sysMenuService.saveMenu(sysMenu);
    }

}
