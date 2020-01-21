package org.zhoup.service.realm;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zhoup.service.entity.SysUser;
import org.zhoup.service.service.RoleService;
import org.zhoup.service.service.SysMenuService;
import org.zhoup.service.service.SysUserService;

import java.util.List;

@Component
public class UserRealm extends AuthorizingRealm {

    @Autowired
    SysMenuService sysMenuService;
    @Autowired
    SysUserService sysUserService;
    @Autowired
    RoleService roleService;

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //这里是拿到的用户名密码
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        String username = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());
        //这里是数据库查询到的用户信息
        SysUser sysUser = sysUserService.findUserByUsername(username);
        if(sysUser==null){
            throw new UnknownAccountException("账户不存在！");
        }
        if(!sysUser.getPassword().equals(password)){
            throw new IncorrectCredentialsException("密码不正确");
        }
        if(sysUser.getStatus()==0){
            throw new LockedAccountException("账户被冻结");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysUser, password, this.getName());
        return info;
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        SysUser sysUser = (SysUser)principal.getPrimaryPrincipal();
        Long userId = sysUser.getUserId();
        //查询用户的角色
        List<String> roles = roleService.findRolesByUserId(userId);
        //用户的菜单权限
        List<String> perms = sysMenuService.findPermsByUserId(userId);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        info.addStringPermissions(perms);
        return info;
    }
}
