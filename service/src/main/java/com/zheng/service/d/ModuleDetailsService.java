package com.zheng.service.d;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ResultUtil;

import java.util.List;

public interface ModuleDetailsService extends IService<ModuleDetails> {

    List<ModuleDetails> SelectByProcedureIdAll(String procedureId);
}
