package org.zhoup.service.controller;

import com.sun.deploy.net.HttpResponse;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.dto.UserDTO;
import org.zhoup.service.service.SysUserService;
import org.zhoup.service.utils.R;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@Controller
@RequestMapping("sys")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;
    //分页查询
    @RequestMapping("user/list")
    @ResponseBody
    public DataGridResult findUserByPage(QueryDTO queryDTO){
        return sysUserService.findUserByPage(queryDTO);
    }


    @ResponseBody
    @RequestMapping("login")
    public R login(@RequestBody UserDTO userDTO){
        return R.ok();
    }

    @RequestMapping("/user/export")
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
