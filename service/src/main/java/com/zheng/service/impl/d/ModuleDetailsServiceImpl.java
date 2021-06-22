package com.zheng.service.impl.d;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.d.ModuleDetailsMapper;
import com.zheng.mapper.d.ModuleMapper;
import com.zheng.pojo.d.Module;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.util.ResultUtil;
import com.zheng.service.d.ModuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ModuleDetailsServiceImpl  extends ServiceImpl<ModuleDetailsMapper, ModuleDetails> implements ModuleDetailsService {

    @Autowired
    ModuleMapper moduleMapper;

    @Override
    public List<ModuleDetails> SelectByProcedureIdAll(String procedureId) {
        Map<String,Object> map=new HashMap<>();
        map.put("product_id",procedureId);
         List<Module> modules =moduleMapper.selectByMap(map);
         if (modules.size()==0){
             return  new ArrayList<>();
         }

        Module module = modules.get(0);
        QueryWrapper<ModuleDetails> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",module.getId());
        return this.list(queryWrapper);
    }

}
