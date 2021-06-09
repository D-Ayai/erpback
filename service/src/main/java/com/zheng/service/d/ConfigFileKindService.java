package com.zheng.service.d;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.d.ConfigFileKind;

import java.util.List;

public interface ConfigFileKindService extends IService<ConfigFileKind> {

    public List<ConfigFileKind> isSanjild();
}
