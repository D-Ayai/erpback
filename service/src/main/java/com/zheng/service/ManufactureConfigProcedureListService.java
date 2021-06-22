package com.zheng.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.ManufactureConfigProcedureList;

public interface ManufactureConfigProcedureListService extends IService<ManufactureConfigProcedureList> {

    IPage<ManufactureConfigProcedureList> queryAll(int pageno,int pagesize,String manufactureName);

}
