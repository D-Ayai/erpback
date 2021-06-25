package com.zheng.controller.d;

import com.zheng.pojo.d.File;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.service.d.ModuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ModuleDetails")
public class ModuleDetailsController {

    @Autowired
    ModuleDetailsService moduleDetailsService;


    @RequestMapping("WuLiaoGongXu")
    public List<ModuleDetails> WuLiaoGongXu(String procedureId){
       return moduleDetailsService.SelectByProcedureIdAll(procedureId);
    }

    @RequestMapping("WuLiaoGongXuByidAll")
    public List<ModuleDetails> WuLiaoGongXuByidAll(String Id){
        return moduleDetailsService.selectByGongXuId(Id);
    }

    @RequestMapping("ChongXin")
    public List<ModuleDetails> ChongXin(String Id){
        return moduleDetailsService.ChongXin(Id);
    }
}
