package com.zheng.pojo.d;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 产品分类设置
 */
@Data
@TableName("d_config_file_kind")
public class ConfigFileKind {

    /**
     *序号
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;


    /**
     * 父级序号
     */
    @TableField("P_ID")
    private Integer pId;


    /**
     * 分类编号
     */
    @TableField("KIND_ID")
    private String kindId;

    /**
     * 分类名称
     */
    @TableField("KIND_NAME")
    private String kindName;

    /**
     * 级别
     */
    @TableField("KIND_LEVEL")
    private Integer kindLevel;

  }