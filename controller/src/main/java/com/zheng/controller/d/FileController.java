package com.zheng.controller.d;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zheng.pojo.d.File;
import com.zheng.service.d.ConfigFileKindService;
import com.zheng.service.d.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("file")
public class FileController {

    @Autowired
    FileService fileService;
    @Autowired
    ConfigFileKindService configFileKindService;

    @RequestMapping("addr.action")
    public boolean  addrfile(File file){
        return fileService.save(file);
    }


    @RequestMapping("page.action")
    public IPage<File> fileIPage(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                 @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                 File file){
        QueryWrapper<File> queryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(file.getCheckTag())){
            queryWrapper.like("CHECK_TAG",file.getCheckTag());
        }
        if(!StringUtils.isEmpty(file.getDeleteTag())){
            queryWrapper.like("DELETE_TAG",file.getDeleteTag());
        }
        //一级
        if (!StringUtils.isEmpty(file.getFirstKindName()) &&  !"undefined".equals(file.getFirstKindName()) ){
            queryWrapper.like("FIRST_KIND_NAME",file.getFirstKindName());
        }
        //二级
        if (!StringUtils.isEmpty(file.getSecondKindName()) && !"undefined".equals(file.getSecondKindName()) ){
            queryWrapper.like("SECOND_KIND_NAME",file.getSecondKindName());
        }
        //三级
        if (!StringUtils.isEmpty(file.getThirdKindName()) && !"undefined".equals(file.getThirdKindName())){
            queryWrapper.like("THIRD_KIND_NAME",file.getThirdKindName());
        }
        if (!StringUtils.isEmpty(file.getCheckTime()) && !"undefined".equals(file.getCheckTime())){
            queryWrapper.le("CHECK_TIME",file.getCheckTime());
        }
        if (!StringUtils.isEmpty(file.getRegisterTime()) && !"undefined".equals(file.getRegisterTime())){
            queryWrapper.ge("REGISTER_TIME",file.getRegisterTime());
        }
        if (!StringUtils.isEmpty(file.getProductName()) && !"undefined".equals(file.getProductName())){
            queryWrapper.like("PRODUCT_NAME",file.getProductName());
        }
        return  fileService.page(new Page<File>(pageno,pagesize),queryWrapper);
    }
    @RequestMapping("byid.action")
    public File byidfile(Integer id){
        return fileService.getById(id);
    }

    @RequestMapping("update.action")
    public Boolean updfile(File file){
        return fileService.updateById(file);
    }

    @RequestMapping("dele.action")
    public Boolean dele(Integer id){
        return fileService.removeById(id);
    }

}
