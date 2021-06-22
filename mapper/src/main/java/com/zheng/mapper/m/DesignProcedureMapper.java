package com.zheng.mapper.m;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.m.DesignProcedure;
import org.apache.ibatis.annotations.Select;

public interface DesignProcedureMapper extends BaseMapper<DesignProcedure> {

    @Select("SELECT MAX(m_design_procedure.`PRODUCT_ID`)   FROM m_design_procedure WHERE TO_DAYS(register_time) = TO_DAYS(NOW()) ")
    String showProductId();
}