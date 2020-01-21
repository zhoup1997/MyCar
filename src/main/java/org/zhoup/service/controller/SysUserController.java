package org.zhoup.service.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.dto.UserDTO;
import org.zhoup.service.entity.SysUser;
import org.zhoup.service.service.SysUserService;
import org.zhoup.service.utils.MD5Utils;
import org.zhoup.service.utils.R;
import org.zhoup.service.utils.ShiroUtils;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URLEncoder;


@Controller
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @Autowired
    DefaultKaptcha kaptcha;

    //分页查询
    @RequestMapping("sys/user/list")
    @ResponseBody
    public DataGridResult findUserByPage(QueryDTO queryDTO){
        return sysUserService.findUserByPage(queryDTO);
    }


    @ResponseBody
    @RequestMapping("sys/login")
    public R login(@RequestBody UserDTO userDTO){
        //获取服务端的验证码
        String kaptcha = ShiroUtils.getKaptcha();
        //对比验证码,不区分大小写
        if(!kaptcha.equalsIgnoreCase(userDTO.getCaptcha())){
            return R.error("验证码错误");
        }
        String md5Password = MD5Utils.md5(userDTO.getPassword(), userDTO.getUsername(), 1024);
        UsernamePasswordToken token = new UsernamePasswordToken(userDTO.getUsername(), md5Password);
        //判断是否记住账号密码
        if(userDTO.isRememberMe()){
            token.setRememberMe(true);
        }
        //得到shiro的核心subject
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return R.ok();
    }


    //退出登陆
    @RequestMapping("/logout")
    public String logout(){
        ShiroUtils.logout();
        return "redirect: login.html";
    }


    @RequestMapping("sys/user/info")
    @ResponseBody
    public R Userinfo(){
        SysUser userEntity = ShiroUtils.getUserEntity();
        return R.ok().put("user",userEntity);
    }




    //获取验证码
    @RequestMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response){
        // 缓存设置-设置不缓存（可选操作）
        response.setHeader("Cache-Control","no-store, no-cache");
        // 设置响应内容
        response.setContentType("image/jpg");
        //生成验证码
        String text = kaptcha.createText();
        //生成图片
        BufferedImage image = kaptcha.createImage(text);
        //将验证码存储到shiro的session中
        ShiroUtils.setKaptcha(text);
        try {
            ServletOutputStream outputStream = response.getOutputStream();
            ImageIO.write(image,"jpg",outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //导出Excel模块
    @RequestMapping("sys/user/export")
    public void exportUser(HttpServletResponse response){
        Workbook workbook = sysUserService.exportUser();
        try {
            //设置响应头
            response.setContentType("application/octet-stream");//所有文件都支持
            String fileName = "员工信息.xls";
            fileName = URLEncoder.encode(fileName,"utf-8");
            response.setHeader("content-disposition","attachment;filename="+fileName);
            //文件下载
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
