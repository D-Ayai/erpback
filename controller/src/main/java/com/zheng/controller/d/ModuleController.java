package com.zheng.controller.d;


import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zheng.pojo.d.Module;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ListUtil;
import com.zheng.pojo.util.ResultUtil;
import com.zheng.service.d.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Module")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;

    //添加物料组成
    @RequestMapping(value = "/addModuleDetails",produces = "application/json;charset=utf-8")
    public ResultUtil setRoleMenu(@RequestBody List<ModuleDetails> moduleDetails){
    return moduleService.saveBatchExtend(moduleDetails);
    }

    //条件分页查询
    @RequestMapping("/page")
    public IPage<Module> page(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                              @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                              Module module){
        //组装查询条件
        QueryWrapper<Module> queryWrapper =new QueryWrapper<Module>();

        if(!StringUtils.isEmpty(module.getProductName())){
            queryWrapper.like("PRODUCT_NAME",module.getProductName());
        }
        //一级
        if (!org.springframework.util.StringUtils.isEmpty(module.getFirstKindName()) &&  !"undefined".equals(module.getFirstKindName()) ){
            queryWrapper.like("FIRST_KIND_NAME",module.getFirstKindName());
        }
        //二级
        if (!org.springframework.util.StringUtils.isEmpty(module.getSecondKindName()) && !"undefined".equals(module.getSecondKindName()) ){
            queryWrapper.like("SECOND_KIND_NAME",module.getSecondKindName());
        }
        //三级
        if (!org.springframework.util.StringUtils.isEmpty(module.getThirdKindName()) && !"undefined".equals(module.getThirdKindName())){
            queryWrapper.like("THIRD_KIND_NAME",module.getThirdKindName());
        }
        if (!org.springframework.util.StringUtils.isEmpty(module.getCheckTime()) && !"undefined".equals(module.getCheckTime())){
            queryWrapper.le("CHECK_TIME",module.getCheckTime());
        }
        if (!org.springframework.util.StringUtils.isEmpty(module.getRegisterTime()) && !"undefined".equals(module.getRegisterTime())){
            queryWrapper.ge("REGISTER_TIME",module.getRegisterTime());
        }
        if(!StringUtils.isEmpty(module.getCheckTag())){
            queryWrapper.like("check_tag",module.getCheckTag());
        }
        return  moduleService.page(new Page<Module>(pageNo,pageSize),queryWrapper);
    }

    /**
     * 跟据id查询
     * @param id
     * @return
     */
    @RequestMapping("/ById/{id}")
    public ListUtil selectById(@PathVariable int id){
        return  moduleService.selectById(id);
    }

    /**
     * 不通过
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public ResultUtil delete(@PathVariable int id){
        return  moduleService.deleteById(id);
    }
    /**
     * 不通过
     * @param id
     * @return
     */
    @RequestMapping("/checkTag")
    public ResultUtil checkTag(int id, String checker){
        return  moduleService.checkTag(id,checker);
    }
    //变更物料组成
    @RequestMapping(value = "/updateModuleDetails",produces = "application/json;charset=utf-8")
    public ResultUtil updateModuleDetails(@RequestBody List<ModuleDetails> moduleDetails){
        return moduleService.updateBatchExtend(moduleDetails);
    }

}
