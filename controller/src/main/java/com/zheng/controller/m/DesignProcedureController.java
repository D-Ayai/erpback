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
     * 制定产品生产工序设计单 - 显示数据 (待添加生产工序的数据)
     * @param pageno
     * @param pagesize
     * @param queryCondition
     * @return
     */
    @RequestMapping("DesignSelectAllFile")
    public IPage<File> DesignSelectAllFile(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
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
     * 制定产品生产工序设计单-添加工序
     * @param designProcedureDetails
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "DesignAdd",produces = "application/json;charset=utf-8")
    public boolean DesignAdd(@RequestBody List<DesignProcedureDetails> designProcedureDetails){
        return designProcedureService.DesignAdd(designProcedureDetails);
    }

    /**
     * 产品生产工序设计单审核 - 显示数据 (查询工序要审核的数据)
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
     * 产品生产工序设计单查询 - 显示数据
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
     * 产品生产工序设计单变更  以及 制定工序物料设计单 的- 显示数据 -
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
     * 查看单个生产设计工序
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("SelectByGongXuId")
    public DesignProcedure SelectByGongXuId(int id){
        return designProcedureService.SelectByGongXuId(id);
    }


    /**
     * 产品生产工序设计单审核 - 修改审核状态
     */
    @RequestMapping(value = "GongXuShenHe")
    public boolean GongXuShenHe(DesignProcedure designProcedure,boolean type){
        if (designProcedure==null){
            return false;
        }
        if (designProcedure.getId()==null){
            return false;
        }
        return designProcedureService.GongXuShenHe(designProcedure,type);
    }

    /**
     * 产品生产工序设计单变更 - 修改数据
     * @param designProcedureDetails
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "DesignUpdate",produces = "application/json;charset=utf-8")
    public boolean DesignUpdate(@RequestBody List<DesignProcedureDetails> designProcedureDetails){
        return designProcedureService.DesignUpdate(designProcedureDetails);
    }

    /**
     * 工序物料设计单查询 - 显示数据
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



    /**
     * 制定工序物料设计单 - 显示数据( 查询所有待添加工序物料) 工序物料设计单审核
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
     * 工序物料设计单查询 -显示数据
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
     * 制定工序物料设计单 - 提交添加好的数据
     * @return
     */
    @ResponseBody
    @RequestMapping("GongXuWuLiaoZZ")
    public boolean GongXuWuLiaoZZ(String id){
        return designProcedureService.GongXuWuLiaoZZ(id);
    }



    /**
     * 工序物料设计单审核 - 修改审核状态
     */
    @RequestMapping(value = "GongXuWuLiaoupdate")
    public boolean GongXuWuLiaoupdate(DesignProcedure designProcedure,boolean type){
        if (designProcedure==null){
            return false;
        }
        if (designProcedure.getId()==null){
            return false;
        }
        return designProcedureService.GongXuWuLiaoupdate(designProcedure,type);
    }

    /**
     * 工序物料设计单变更 - 显示数据
     */
    @RequestMapping(value = "GongXuWuLiaoUpdateShow")
    public IPage<DesignProcedure> GongXuWuLiaoUpdateShow(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                        @RequestParam(value = "pagesize",defaultValue = "10") int pagesize,
                                                        QueryCondition queryCondition){
        return designProcedureService.GongXuWuLiaoUpdateShow(pageno,pagesize,queryCondition);
    }

    /**
     * 制定工序物料设计单 - 提交添加好的数据
     * @return
     */
    @ResponseBody
    @RequestMapping("GXWLupdate")
    public boolean GXWLupdate(String id){
        return designProcedureService.GXWLupdate(id);
    }




}
