package com.zheng.service.impl.d;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.d.ConfigFileKindMapper;
import com.zheng.pojo.d.ConfigFileKind;
import com.zheng.service.d.ConfigFileKindService;
import org.springframework.stereotype.Service;

@Service
public class ConfigFileKindServiceImpl  extends ServiceImpl<ConfigFileKindMapper, ConfigFileKind> implements ConfigFileKindService {
}
