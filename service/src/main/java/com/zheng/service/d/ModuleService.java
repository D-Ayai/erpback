package com.zheng.service.d;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.d.Module;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ListUtil;
import com.zheng.pojo.util.ResultUtil;

import java.util.List;

public interface ModuleService extends IService<Module> {
    ResultUtil saveBatchExtend(List<ModuleDetails> roleMenus);

    ListUtil selectById(int id);

    ResultUtil deleteById(int id);

    ResultUtil checkTag(int id, String checker);

    ResultUtil updateBatchExtend(List<ModuleDetails> moduleDetails);
}
