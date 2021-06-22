package com.zheng.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("manufacture_config_procedure_list")
public class ManufactureConfigProcedureList {
    private Integer id;

    private String kind;

    private String typeId;

    private String typeName;

    private String describe1;

    private String describe2;

    private String register;

    private String registerId;

}