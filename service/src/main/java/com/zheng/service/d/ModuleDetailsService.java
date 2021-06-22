package com.zheng.service.d;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ResultUtil;

public interface ModuleDetailsService extends IService<ModuleDetails> {
    ResultUtil deleteById(int id, int parentId);
}
