package com.zheng.service.s;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zheng.pojo.s.SGatherDetails;
import com.zheng.pojo.s.SGatherEx;

import java.util.List;

public interface SGatherDetailsService extends IService<SGatherDetails> {

    /**
     * 入库调度单中的表格-xyb
     * @param parentId PARENT_ID与S_GATHER的ID相对应，为外键
     * @return
     */
    List<SGatherEx> queryByParentIdSGatherDetails(String parentId);
    /**
     * 入库查询-查看-xyb
     * @param id
     * @return
     */
    SGatherEx queryByIdSGatherEx(int id);
    /**
     * 入库查询-查看-表格-xyb
     * @param id
     * @return
     */
    List<SGatherEx> queryByIdSGatherEx2(int id);
}
