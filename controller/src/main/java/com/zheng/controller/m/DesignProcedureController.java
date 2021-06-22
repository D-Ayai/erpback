package com.zheng.controller.m;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zheng.dao.QueryCondition;
import com.zheng.pojo.ManufactureConfigProcedureList;
import com.zheng.pojo.d.File;
import com.zheng.pojo.m.DesignProcedure;
import com.zheng.pojo.m.DesignProcedureDetails;
import com.zheng.service.ManufactureConfigProcedureListService;
import com.zheng.service.d.FileService;
import com.zheng.service.m.DesignProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("DesignProcedure")
public class DesignProcedureController{

    @Autowired
    DesignProcedureService designProcedureService;

    @Autowired
    FileService fileService;

    @Autowired
    ManufactureConfigProcedureListService manufactureConfigProcedureListService;

    /**
     * 查询可以添加工序的产品
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("DesignSelectAllFile")
    public IPage<File> DesignAdd(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                 @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                 QueryCondition queryCondition){
        return fileService.queryFlieShengChanGongXu(pageno,pagesize,queryCondition);
    }

    /**
     * 查询所有工序
     * @param pageno
     * @param pagesize
     * @param manufactureName
     * @return
     */
    @RequestMapping("manufactureList")
    public IPage<ManufactureConfigProcedureList> manufactureList(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                 @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                 String manufactureName){
        return manufactureConfigProcedureListService.queryAll(pageno,pagesize,manufactureName);
    }

    /**
     * 添加工序
     * @param designProcedureDetails
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "DesignAdd",produces = "application/json;charset=utf-8")
    public boolean DesignAdd(@RequestBody List<DesignProcedureDetails> designProcedureDetails){
        return designProcedureService.DesignAdd(designProcedureDetails);
    }

    /**
     * 查询所有待审核工序
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("queryGongXuShenHe")
    public IPage<DesignProcedure> queryGongXuShenHe(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                           @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                                           QueryCondition queryCondition){
        return designProcedureService.queryGongXuShenHe(pageno,pagesize,queryCondition);
    }

    /**
     * 查询所有工序
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("queryGongXuAll")
    public IPage<DesignProcedure> queryGongXuAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                            @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                            QueryCondition queryCondition){
        return designProcedureService.queryGongXuAll(pageno,pagesize,queryCondition);
    }

    /**
     * 查询所有审核成功工序
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("queryGongXuShenHeCG")
    public IPage<DesignProcedure> queryGongXuShenHeCG(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                    @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                                    QueryCondition queryCondition){
        return designProcedureService.queryGongXuShenHeCG(pageno,pagesize,queryCondition);
    }



    /**
     * 查询单个工序
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("SelectByGongXuId")
    public DesignProcedure SelectByGongXuId(int id){
        return designProcedureService.SelectByGongXuId(id);
    }


    /**
     * 修改状态
     */
    @RequestMapping(value = "GongXuShenHe")
    public boolean DesignAdd(DesignProcedure designProcedure,boolean type){
        if (designProcedure==null){
            return false;
        }
        if (designProcedure.getId()==null){
            return false;
        }
        return designProcedureService.GongXuShenHe(designProcedure,type);
    }

    /**
     * 添加工序
     * @param designProcedureDetails
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "DesignUpdate",produces = "application/json;charset=utf-8")
    public boolean DesignUpdate(@RequestBody List<DesignProcedureDetails> designProcedureDetails){
        return designProcedureService.DesignUpdate(designProcedureDetails);
    }





    /**
     * 查询所有审核成功工序
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("queryGongXuWuLiao.Shenghe")
    public IPage<DesignProcedure> queryGongXuWuLiaoShenghe(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                      @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                                      QueryCondition queryCondition){
        return designProcedureService.queryGongXuWuLiaoShenghe(pageno,pagesize,queryCondition);
    }

    /**
     * 查询所有工序已添加物料工序
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("queryGongXuWuLiaoList")
    public IPage<DesignProcedure> queryGongXuWuLiaoList(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                    @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                                    QueryCondition queryCondition){
        return designProcedureService.queryGongXuWuLiaoList(pageno,pagesize,queryCondition);
    }

    /**
     * 查询所有工序已添加物料工序并且审核成功
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("queryGongXuWuLiaoShow")
    public IPage<DesignProcedure> queryGongXuWuLiaoShow(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                    @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                                    QueryCondition queryCondition){
        return designProcedureService.queryGongXuWuLiaoShow(pageno,pagesize,queryCondition);
    }





}
