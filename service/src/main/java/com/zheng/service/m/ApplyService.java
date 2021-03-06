package com.zheng.service.m;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.dao.QueryCondition;
import com.zheng.pojo.m.Apply;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ApplyService extends IService<Apply> {

    //新发生生产计划登记-添加
    boolean Add(List<Apply> applies);

    //查询所有
    IPage<Apply>  selectGroupApplyIdList(int pageno, int pagesize, QueryCondition manufactureName);

    //查询审核
    IPage<Apply>  GroupApplyIdShenheAll(int pageno, int pagesize, QueryCondition manufactureName);

    //根据 applyId 查询
    List<Apply> selectByApplyId(String applyId);

    //生产计划审核-审核
    boolean Shengheupdate(Apply apply,boolean type);
}
