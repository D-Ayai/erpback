package com.zheng.mapper.m;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.d.ModuleDetails;
import com.zheng.pojo.m.DesignProcedureModule;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DesignProcedureModuleMapper extends BaseMapper<DesignProcedureModule> {

    @Select("SELECT * FROM `m_design_procedure_module` WHERE `PARENT_ID`=#{Id}")
    List<DesignProcedureModule> SelectByProcedureIdAll(String Id);
}