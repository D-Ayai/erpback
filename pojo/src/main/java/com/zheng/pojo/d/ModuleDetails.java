package com.zheng.pojo.d;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 产品物料组成明细
 */
@Data
@TableName("d_Module_details")
public class ModuleDetails {

    /**
     * 序号
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 父级序号
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 物料序号
     */
    @TableField(value = "details_number")
    private Integer detailsNumber;

    /**
     * 物料编号
     */
    @TableField(value = "product_id")
    private String productId;

    /**
     * 物料名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 用途类型
     */
    @TableField(value = "type")
    private String type;

    /**
     * 描述
     */
    @TableField(value = "product_describe")
    private String productDescribe;

    /**
     * 单位
     */
    @TableField(value = "amount_unit")
    private String amountUnit;

    /**
     * 数量
     */
    @TableField(value = "amount")
    private Integer amount;

    /**
     * 可用数量
     */
    @TableField(value = "residual_amount")
    private Integer residualAmount;

    /**
     * 单价
     */
    @TableField(value = "cost_price")
    private BigDecimal costPrice;

    /**
     * 小计
     */
    @TableField(value = "subtotal")
    private BigDecimal subtotal;

   }