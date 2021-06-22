package com.zheng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.ManufactureConfigProcedureListMapper;
import com.zheng.pojo.ManufactureConfigProcedureList;
import com.zheng.pojo.d.File;
import com.zheng.service.ManufactureConfigProcedureListService;
import org.springframework.stereotype.Service;

@Service
public class ManufactureConfigProcedureListServiceImpl extends ServiceImpl<ManufactureConfigProcedureListMapper, ManufactureConfigProcedureList> implements ManufactureConfigProcedureListService {
    @Override
    public IPage<ManufactureConfigProcedureList> queryAll(int pageno, int pagesize, String manufactureName) {
        QueryWrapper<ManufactureConfigProcedureList> queryWrapper = new QueryWrapper<>();
        if (manufactureName!=null&&!"".equals(manufactureName))
            queryWrapper.like("type_name",manufactureName);
        return this.page(new Page<ManufactureConfigProcedureList>(pageno,pagesize),queryWrapper);
    }
}
