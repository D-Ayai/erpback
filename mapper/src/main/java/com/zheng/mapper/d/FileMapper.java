package com.zheng.mapper.d;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.d.File;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FileMapper extends BaseMapper<File> {

    @Select("SELECT MAX(d_file.`PRODUCT_ID`)   FROM d_file WHERE TO_DAYS(register_time) = TO_DAYS(NOW()) ")
    String showProductId();

    @Select("SELECT DISTINCT  df.* FROM `d_file` df \n" +
            "LEFT JOIN `m_design_procedure` mdp ON df.`PRODUCT_ID` =mdp.`PRODUCT_ID`\n" +
            "LEFT JOIN `m_design_procedure_details` mdpd ON mdpd.`PARENT_ID`=mdp.`ID`\n" +
            "WHERE mdpd.`DESIGN_MODULE_TAG`='1' AND mdp.`DESIGN_MODULE_TAG`='2' AND\n" +
            " df.`DELETE_TAG`='0' AND df.`DESIGN_MODULE_TAG`='1'\n" +
            "AND df.`DESIGN_PROCEDURE_TAG`='1'")
    List<File> Shengchangshow();
}