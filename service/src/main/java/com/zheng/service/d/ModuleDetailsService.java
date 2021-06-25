package com.zheng.service.d;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ResultUtil;

import java.util.List;

public interface ModuleDetailsService extends IService<ModuleDetails> {

    //根据产品编号查询
    List<ModuleDetails> SelectByProcedureIdAll(String procedureId);

    //根据生产工序组成id查询
    List<ModuleDetails> selectByGongXuId(String procedureId);

    //返回工序物料组成
    List<ModuleDetails> ChongXin(String Id);
}
