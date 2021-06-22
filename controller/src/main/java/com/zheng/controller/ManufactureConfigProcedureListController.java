package com.zheng.controller;

import com.zheng.pojo.ManufactureConfigProcedureList;
import com.zheng.service.ManufactureConfigProcedureListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ManufactureConfig")
public class ManufactureConfigProcedureListController {

    @Autowired
    ManufactureConfigProcedureListService queryallmenus;

    /**
     * 查询全部的工序
     * @return
     */
    @RequestMapping("queryall")
    public List<ManufactureConfigProcedureList> queryall(){
        return queryallmenus.list();
    }
}
