package com.zheng.controller.m;

import com.zheng.pojo.ManufactureConfigProcedureList;
import com.zheng.pojo.m.DesignProcedure;
import com.zheng.service.m.DesignProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("DesignProcedure")
public class DesignProcedureController{

    @Autowired
    DesignProcedureService designProcedureService;

    //菜单获取
    @RequestMapping("DesignAdd")
    public boolean DesignAdd(DesignProcedure designProcedure ){
        return designProcedureService.DesignAdd(designProcedure);
    }

}
