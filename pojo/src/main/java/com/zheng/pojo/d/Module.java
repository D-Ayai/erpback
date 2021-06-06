package com.zheng.pojo.d;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 	产品物料组成
 */
@Data
@TableName("d_module")
public class Module {

    /**
     * 序号
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 设计编号
     */
    @TableField(value = "design_id")
    private String designId;

    /**
     * 产品编号
     */
    @TableField(value = "PRODUCT_ID")
    private String productId;

    /**
     * 产品名称
     */
    @TableField(value = "PRODUCT_NAME")
    private String productName;

    /**
     * 产品I级分类编号
     */
    @TableField(value = "FIRST_KIND_ID")
    private String firstKindId;

    /**
     * 产品I级分类名称
     */
    @TableField(value = "FIRST_KIND_NAME")
    private String firstKindName;

    /**
     * 产品II级分类编号
     */
    @TableField(value = "SECOND_KIND_ID")
    private String secondKindId;

    /**
     * 产品II级分类编号
     */
    @TableField(value = "SECOND_KIND_NAME")
    private String secondKindName;

    /**
     * 产品III级分类编号
     */
    @TableField(value = "THIRD_KIND_ID")
    private String thirdKindId;

    /**
     * 产品III级分类名称
     */
    @TableField(value = "third_kind_name")
    private String thirdKindName;

    /**
     * 设计人
     */
    @TableField(value = "designer")
    private String designer;

    /**
     * 设计要求
     */
    @TableField(value = "module_describe")
    private String moduleDescribe;

    /**
     * 物料总成本
     * 等于本产品所有构成物料成本之和
     */
    @TableField(value = "cost_price_sum")
    private BigDecimal costPriceSum;

    /**
     * 登记人
     */
    @TableField(value = "register")
    private String register;

    /**
     * 登记时间
     */
    @TableField(value = "register_time")
    private Date registerTime;

    /**
     * 复核人
     */
    @TableField(value = "checker")
    private String checker;

    /**
     * 复核时间
     */
    @TableField(value = "check_time")
    private Date checkTime;

    /**
     * 变更人
     */
    @TableField(value = "changer")
    private String changer;

    /**
     * 变更人时间
     */
    @TableField(value = "change_time")
    private Date changeTime;

    /**
     * 审核标志
     * s001-0: 等待审核
     * s001-1: 审核通过
     * s001-2: 审核不通过
     */
    @TableField(value = "check_tag")
    private String checkTag;

    /**
     * 变更标志
     * b002-0: 未变更
     * b002-1: 已变更
     */
    @TableField(value = "change_tag")
    private String changeTag;

  }