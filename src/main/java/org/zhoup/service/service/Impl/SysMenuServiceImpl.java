package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysMenu;
import org.zhoup.service.mapper.SysMenuMapper;
import org.zhoup.service.service.SysMenuService;
import org.zhoup.service.utils.R;

import java.util.*;

/**
 *
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;

    /** 菜单分页查询  */
    @Override
    public DataGridResult findMenuByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        //判断前端是否使用了排序
        if(queryDTO.getSort()!=null && !(queryDTO.getSort().equals(""))){
            queryDTO.setSort("menu_id");
        }
        List<SysMenu> menuByPage = sysMenuMapper.findMenuByPage(queryDTO);
        PageInfo<SysMenu> sysMenuPageInfo = new PageInfo<>(menuByPage);
        long total = sysMenuPageInfo.getTotal();
        DataGridResult result = new DataGridResult(total,sysMenuPageInfo.getList());
        return result;
    }
    /** 查询用户权限  */
    @Override
    public List<String> findPermsByUserId(Long userId) {
        List<String> permsByUserId = sysMenuMapper.findPermsByUserId(userId);
        Set<String> set = new HashSet<String>();
        for (String s : permsByUserId) {
            if(s!=null&&!s.equals("")){
                String[] split = s.split(",");
                for (String s1 : split) {
                    set.add(s1);
                }
            }
        }
        List<String> perms = new ArrayList<>();
        perms.addAll(set);
        return perms;
    }



    //查询一级菜单目录
    @Override
    public R findMenuByUserId(Long userId) {
        List<Map<String, Object>> menuByUserId = sysMenuMapper.findMenuByUserId(userId);
        return R.ok().put("menuList",menuByUserId);
    }

    //查询用户一级目录下的子菜单
    @Override
    public R findMenuNotButtonByUserId(Long userId) {
        //先查询一级菜单
        List<Map<String, Object>> menuByUserId = sysMenuMapper.findMenuByUserId(userId);
        //查询目录对应的子菜单
        for (Map<String, Object> map : menuByUserId) {
            Long menuId = Long.parseLong(map.get("menuId")+"");
            List<Map<String, Object>> subList = sysMenuMapper.findMenuNotButtonByUserId(userId,menuId);
            map.put("list",subList);
        }
        //查询权限
        List<String> permsByUserId = findPermsByUserId(userId);
        return R.ok().put("menuList",menuByUserId).put("permissions",permsByUserId);
    }

    //批量删除
    @Override
    public R deleteByIds(String ids) {
        String id = ids.replace("[","").replace("]","");
        int result = sysMenuMapper.deleteByIds(id);
        if(result>0){
            return R.ok();
        }
        return R.error("删除失败");
    }
    //加载菜单树
    @Override
    public R findMenuTree() {
        List<SysMenu> sysMenus = sysMenuMapper.findMenuTree();
        return R.ok().put("menuList",sysMenus);
    }
    //添加以及修改菜单
    @Override
    public R saveMenu(SysMenu sysMenu) {
        //如果id为空，则执行添加方法
        int result=0;
        if(sysMenu.getMenuId()==null){
            result = sysMenuMapper.insert(sysMenu);
        }else{//否则执行修改方法
            result = sysMenuMapper.updateByPrimaryKey(sysMenu);
        }
        return result>0?R.ok():R.error("执行失败");
    }
    //单个查询菜单
    @Override
    public R findMenu(Long menuId) {
        SysMenu sysMenu = sysMenuMapper.selectByPrimaryKey(menuId);
        return R.ok().put("menu",sysMenu);
    }

}
