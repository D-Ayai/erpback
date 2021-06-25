package com.zheng.controller.m;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zheng.dao.QueryCondition;
import com.zheng.pojo.ManufactureConfigProcedureList;
import com.zheng.pojo.m.Apply;
import com.zheng.pojo.m.DesignProcedureDetails;
import com.zheng.service.m.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Apply")
public class ApplyController {

    @Autowired
    ApplyService applyService;

    /**
     *  新发生生产计划登记-添加
     * @param applies
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "Add",produces = "application/json;charset=utf-8")
    public boolean Add(@RequestBody List<Apply> applies){
        return applyService.Add(applies);
    }

    /**
     * 查询apply_id 分组显示数据
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("selectGroupApplyIdList")
    public IPage<Apply> manufactureList(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                                 @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                        QueryCondition queryCondition){
        return applyService.selectGroupApplyIdList( pageno, pagesize, queryCondition);
    }

    /**
     * 查询 apply_id 分组显示数据 -查询待审核的
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("GroupApplyIdShenheAll")
    public IPage<Apply> GroupApplyIdShenheAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                        @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                        QueryCondition queryCondition){
        return applyService.GroupApplyIdShenheAll( pageno, pagesize, queryCondition);
    }

    /**
     * 查询 apply_id 显示数据
     * @param applyId
     * @return
     */
    @RequestMapping("selectByApplyId")
    public List<Apply> selectByApplyId(String applyId){
        return applyService.selectByApplyId(applyId);
    }


    /**
     *  生产计划审核-审核
     * @param apply
     * @return
     */
    @RequestMapping("Shengheupdate")
    public boolean Shengheupdate(Apply apply,boolean type){
        return applyService.Shengheupdate(apply,type);
    }
}
