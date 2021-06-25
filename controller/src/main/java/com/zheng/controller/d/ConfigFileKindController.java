package com.zheng.controller.d;

import com.zheng.pojo.d.ConfigFileKind;
import com.zheng.service.d.ConfigFileKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Config")
public class ConfigFileKindController {

    @Autowired
    ConfigFileKindService fileKindService;

    @RequestMapping("Add")//添加
    @ResponseBody
    public boolean addmedicines(ConfigFileKind medicines){

        return fileKindService.save(medicines);
    }
    @RequestMapping("queryAll")//查询
    @ResponseBody
    public List<ConfigFileKind> queryByMedicinesId(){
        return fileKindService.isSanjild();
    }

    @RequestMapping("byid.action")
    public ConfigFileKind byid(Integer id){
        return fileKindService.getById(id);
    }

}
