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
    private SysUserService sysUserService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private SysMenuService menuService;

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //得到用户名和密码
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        String username = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());
        SysUser byUsername = sysUserService.findUserByUsername(username);
        if(byUsername==null){
            throw new UnknownAccountException("账户不存在");
        }
        if(!byUsername.getPassword().equals(password)){
            throw new IncorrectCredentialsException("密码不正确");
        }
        if(byUsername.getStatus()==0){
            throw new LockedAccountException("账户被冻结");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(byUsername,password,this.getName());
        return info;
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUser sysUser = (SysUser)principals.getPrimaryPrincipal();
        Long userId = sysUser.getUserId();
        //用户的角色
        List<String> rolsByUserID = roleService.findRolesByUserId(userId);
        //用户的菜单权限
        List<String> permsByUserId = menuService.findPermsByUserId(userId);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(rolsByUserID);
        info.addStringPermissions(permsByUserId);
        return info;
    }

}
