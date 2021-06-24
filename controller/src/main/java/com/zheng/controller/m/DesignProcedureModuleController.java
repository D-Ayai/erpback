package com.zheng.controller.m;

import com.zheng.pojo.m.DesignProcedureModule;
import com.zheng.service.m.DesignProcedureModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("DesignProcedureModule")
public class  DesignProcedureModuleController {

    @Autowired
    DesignProcedureModuleService designProcedureModuleService ;

    @ResponseBody
    @RequestMapping(value = "add",produces = "application/json;charset=utf-8")
    public boolean add(@RequestBody List<DesignProcedureModule> designProcedureModules){
        return designProcedureModuleService.add(designProcedureModules);
    }

    /**
     * 查询所有工序组成下的物料
     * @param Id
     * @return
     */
    @RequestMapping("WuLiaoGongXuByidAll")
    public List<DesignProcedureModule> WuLiaoGongXuByidAll(String Id){
        return designProcedureModuleService.WuLiaoGongXuByidAll(Id);
    }


    /**
     * 根据 Id 查询产品生产工序物料明细
     * @param id
     * @return
     */
    @RequestMapping("selectWuLiaoByid")
    public List<DesignProcedureModule> selectWuLiaoByid(String id){
        return designProcedureModuleService.selectWuLiaoByid(id);
    }

    /**
     * 工序物料设计单变更 根据 id 查询产品生产工序物料明细
     * @param id
     * @return
     */
    @RequestMapping("SelectWLGXUpdateByidAll")
    public List<DesignProcedureModule> SelectWLGXUpdateByidAll(String id){
        return designProcedureModuleService.SelectWLGXUpdateByidAll(id);
    }

    /**
     * 工序物料设计单变更 - 修改部分
     * @param designProcedureModules
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "update",produces = "application/json;charset=utf-8")
    public boolean update(@RequestBody List<DesignProcedureModule> designProcedureModules){
        return designProcedureModuleService.WLGXUupdate(designProcedureModules);
    }

    /**
     * 工序物料设计单变更 - 重新修改部分
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "ChongxinUpdate",produces = "application/json;charset=utf-8")
    public List<DesignProcedureModule> ChongxinUpdate(String id){
        return designProcedureModuleService.ChongxinUpdate(id);
    }

}