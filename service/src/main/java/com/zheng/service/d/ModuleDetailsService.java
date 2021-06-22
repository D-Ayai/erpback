package com.zheng.service.d;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.d.ModuleDetails;

import java.util.List;

public interface ModuleDetailsService extends IService<ModuleDetails> {
    
    //查询所有档案订单工序
    List<ModuleDetails> SelectByProcedureIdAll(String procedureId);


    
}
