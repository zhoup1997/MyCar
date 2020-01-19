package org.zhoup.service.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.SysUser;
import org.zhoup.service.mapper.SysUserMapper;
import org.zhoup.service.service.SysUserService;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override//排序、搜索以及分页的联合查询
    public DataGridResult findUserByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(),queryDTO.getLimit());
        if (queryDTO.getSort()!=null){
            queryDTO.setSort("user_id");
        }
        List<SysUser> sysUsers = sysUserMapper.findUserByPage(queryDTO);
        PageInfo<SysUser> pageInfo = new PageInfo<>(sysUsers);
        long total = pageInfo.getTotal();
        DataGridResult result = new DataGridResult(total, pageInfo.getList());
        return result;
    }
    //单用户查找
    public SysUser findUserByUsername(String username){
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(username);
        return sysUser;
    }

    //导出用户信息Excel
    @Override
    public Workbook exportUser() {
//        1.创建一个空的excel文件
        Workbook workbook = new HSSFWorkbook();
//        2.填充数据，创建sheet表
        Sheet sheet = workbook.createSheet();
//        3.标题数组
        String titles[] = {"用户id","用户名","邮箱","电话","创建时间"};
        String colums[] = {"user_id","username","email","mobile","create_time"};
        //查询数据
        List<Map<String, Object>> maps = sysUserMapper.exportUser();
        //标题行,把标题遍历并且填充进去
        Row row = sheet.createRow(0);
        for (int i = 0; i < titles.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(titles[i]);
        }
        //遍历数据填充到单元格
        for (int i = 0; i <maps.size() ; i++) {
            //一条记录应该创建一个Row对象 这里从第二行开始所以+1
            Row rows = sheet.createRow(i+1);//这个是空的，需要填充数据
            //填充单元格
            for (int j = 0; j < titles.length; j++) {
                Cell cell = rows.createCell(j);
                //获取用户id的值
                Map<String, Object> rowValue = maps.get(i);
                //循环动态设置多个字段的值
                Object o = rowValue.get(colums[j]);//这里获取的值可以是"userId"..
                //这里也就是为什么查询数据库使用map封装的原因。
                cell.setCellValue(o+"");
            }
        }
        return workbook;
    }

}
