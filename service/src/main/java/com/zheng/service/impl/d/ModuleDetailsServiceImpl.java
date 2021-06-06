package com.zheng.service.impl.d;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.d.ModuleDetailsMapper;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.service.d.ModuleDetailsService;
import org.springframework.stereotype.Service;

@Service
public class ModuleDetailsServiceImpl  extends ServiceImpl<ModuleDetailsMapper, ModuleDetails> implements ModuleDetailsService {
}
