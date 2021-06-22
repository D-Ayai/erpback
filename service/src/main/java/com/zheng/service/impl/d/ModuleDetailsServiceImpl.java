package com.zheng.service.impl.d;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.d.ModuleDetailsMapper;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ResultUtil;
import com.zheng.service.d.ModuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleDetailsServiceImpl  extends ServiceImpl<ModuleDetailsMapper, ModuleDetails> implements ModuleDetailsService {
    @Autowired
    ModuleDetailsMapper moduleDetailsMapper;
    @Override
    public ResultUtil deleteById(int id, int parentId) {
        return null;
    }
}
