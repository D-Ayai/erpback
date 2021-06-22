package com.zheng.service.m;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.dao.QueryCondition;
import com.zheng.pojo.d.File;
import com.zheng.pojo.m.DesignProcedure;
import com.zheng.pojo.m.DesignProcedureDetails;

import java.util.List;
import java.util.Map;

public interface DesignProcedureService  extends IService<DesignProcedure> {

    //添加工序
    public boolean DesignAdd(List<DesignProcedureDetails> designProcedureDetails);

    //查询要审核的工序
    public IPage<DesignProcedure> queryGongXuShenHe(int pageno, int pagesize, QueryCondition queryCondition);

    //查询所有工序
    public IPage<DesignProcedure> queryGongXuAll(int pageno, int pagesize, QueryCondition queryCondition);

    //查询审核成功工序
    public IPage<DesignProcedure> queryGongXuShenHeCG(int pageno, int pagesize, QueryCondition queryCondition);

    //查询单个工序设计单
    public DesignProcedure SelectByGongXuId(int id);

    //修改审核状态
    public boolean GongXuShenHe(DesignProcedure designProcedure,boolean type );

    //修改工序明细
    public boolean DesignUpdate(List<DesignProcedureDetails> designProcedure);

    //查询待审核工序物料
    public IPage<DesignProcedure> queryGongXuWuLiaoShenghe(int pageno, int pagesize, QueryCondition queryCondition);

    //查询待审核工序物料
    public IPage<DesignProcedure> queryGongXuWuLiaoList(int pageno, int pagesize, QueryCondition queryCondition);

    //查询待审核工序物料
    public IPage<DesignProcedure> queryGongXuWuLiaoShow(int pageno, int pagesize, QueryCondition queryCondition);

}
