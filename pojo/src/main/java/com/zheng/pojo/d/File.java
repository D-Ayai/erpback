package com.zheng.pojo.d;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品档案
 */
@Data
@TableName("d_config_file_kind")
public class File {

    /**
     * 序号
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 产品编号
     */
    @TableId(value = "PRODUCT_ID",type = IdType.AUTO)
    private String productId;

    /**
     * 产品名称
     */
    @TableId(value = "PRODUCT_NAME",type = IdType.AUTO)
    private String productName;

    /**
     * 制造商
     */
    @TableId(value = "FACTORY_ID",type = IdType.AUTO)
    private String factoryName;

    /**
     * 产品I级分类编号
     */
    @TableId(value = "FIRST_KIND_ID",type = IdType.AUTO)
    private String firstKindId;

    /**
     * 产品I级分类名称
     */
    @TableId(value = "FIRST_KIND_NAME",type = IdType.AUTO)
    private String firstKindName;

    /**
     * 产品II级分类编号
     */
    @TableId(value = "SECOND_KIND_ID",type = IdType.AUTO)
    private String secondKindId;

    /**
     * 产品II级分类名称
     */
    @TableId(value = "PRODUCT_ID",type = IdType.AUTO)
    private String secondKindName;

    /**
     * 产品III级分类编号
     */
    @TableId(value = "THIRD_KIND_ID",type = IdType.AUTO)
    private String thirdKindId;

    /**
     * 产品III级分类名称
     */
    @TableId(value = "THIRD_KIND_NAME",type = IdType.AUTO)
    private String thirdKindName;

    /**
     * 产品简称
     */
    @TableId(value = "PRODUCT_NICK",type = IdType.AUTO)
    private String productNick;

    /**
     * 用途类型
     * Y001-1: 商品
     * Y001-2: 物料
     */
    @TableId(value = "TYPE",type = IdType.AUTO)
    private String type;

    /**
     * 档次级别
     * D001-1: 高档
     * D001-2: 中档
     * D001-3: 低档
     */
    @TableId(value = "PRODUCT_CLASS",type = IdType.AUTO)
    private String productClass;

    /**
     * 计量单位
     */
    @TableId(value = "PERSONAL_UNIT",type = IdType.AUTO)
    private String personalUnit;

    /**
     * 计量值
     */
    @TableId(value = "PERSONAL_VALUE",type = IdType.AUTO)
    private String personalValue;

    /**
     * 供应商集合
     */
    @TableId(value = "PROVIDER_GROUP",type = IdType.AUTO)
    private String providerGroup;

    /**
     * 保修期
     */
    @TableId(value = "WARRANTY",type = IdType.AUTO)
    private String warranty;

    /**
     * 替代品名称
     */
    @TableId(value = "TWIN_NAME",type = IdType.AUTO)
    private String twinName;

    /**
     * 替代品编号
     */
    @TableId(value = "TWIN_ID",type = IdType.AUTO)
    private String twinId;

    /**
     * 生命周期
     */
    @TableId(value = "LIFECYCLE",type = IdType.AUTO)
    private String lifecycle;

    /**
     * 市场单价
     */
    @TableId(value = "LIST_PRICE",type = IdType.AUTO)
    private BigDecimal listPrice;

    /**
     * 计划成本单价
     */
    @TableId(value = "COST_PRICE",type = IdType.AUTO)
    private BigDecimal costPrice;

    /**
     * 成本单价
     */
    @TableId(value = "REAL_COST_PRICE",type = IdType.AUTO)
    private BigDecimal realCostPrice;

    /**
     * 单位
     */
    @TableId(value = "AMOUNT_UNIT",type = IdType.AUTO)
    private String amountUnit;

    /**
     * 产品描述
     */
    @TableId(value = "PRODUCT_DESCRIBE",type = IdType.AUTO)
    private String productDescribe;

    /**
     * 产品经理
     */
    @TableId(value = "RESPONSIBLE_PERSON",type = IdType.AUTO)
    private String responsiblePerson;

    /**
     * 登记人
     */
    @TableId(value = "REGISTER",type = IdType.AUTO)
    private String register;

    /**
     * 建档时间
     */
    @TableId(value = "REGISTER_TIME",type = IdType.AUTO)
    private Date registerTime;

    /**
     * 复核人
     */
    @TableId(value = "CHECKER",type = IdType.AUTO)
    private String checker;

    /**
     * 复核时间
     */
    @TableId(value = "CHECK_TIME",type = IdType.AUTO)
    private Date checkTime;

    /*
     * 审核标志
     *  S001-0: 等待审核
     *  S001-1: 审核通过
     *  S001-2: 审核不通过
     */
    @TableId(value = "CHECK_TAG",type = IdType.AUTO)
    private String checkTag;

    /**
     * 变更人
     */
    @TableId(value = "CHANGER",type = IdType.AUTO)
    private String changer;

    /**
     * 变更时间
     */
    @TableId(value = "CHANGE_TIME",type = IdType.AUTO)
    private Date changeTime;

    /**
     * 档案变更标志
     *  D002-0: 未变更
     *  D002-1: 已变更
     */
    @TableId(value = "CHANGE_TAG",type = IdType.AUTO)
    private String changeTag;

    /**
     *价格变更标志
     * J001-0：未变更
     * J001-1：已变更
     */
    @TableId(value = "PRICE_CHANGE_TAG",type = IdType.AUTO)
    private String priceChangeTag;

    /**
     * 档案变更累计
     */
    @TableId(value = "FILE_CHANGE_AMOUNT",type = IdType.AUTO)
    private Integer fileChangeAmount;

    /**
     *  产品删除标志
     *      C001-0: 未删除
     *      C001-1: 已删除
     */
    @TableId(value = "DELETE_TAG",type = IdType.AUTO)
    private String deleteTag;

    /**
     * 物料组成标志
     *   W001-0: 未设计
     *   W001-1: 已设计
     */
    @TableId(value = "DESIGN_MODULE_TAG",type = IdType.AUTO)
    private String designModuleTag;

    /**
     * 工序组成标志
     *  G001-0: 未设计
     *  G001-1: 已设计
     */
    @TableId(value = "DESIGN_PROCEDURE_TAG",type = IdType.AUTO)
    private String designProcedureTag;

    /**
     *库存分配标志
     * K001-0: 未设计
     * K001-1: 已设计
     */
    @TableId(value = "DESIGN_CELL_TAG",type = IdType.AUTO)
    private String designCellTag;

   }