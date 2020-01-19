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

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<String> findPermsByUserId(Long userId) {
        List<String> perms = sysMenuMapper.findPermsByUserId(userId);
        List<String> permes = new ArrayList<>();
        for (String s: perms) {
            if(s!=null&&!s.equals("")){
                String[] split = s.split(",");
                for (String s1: split) {
                    permes.add(s1);
                }
            }
        }
        return perms;
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
