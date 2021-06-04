package com.zheng.pojo.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("d_config_file_kind")
/**
 * 用户表
 */
public class Users {

    /**
     * 序号
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名称
     */
    @TableField("LOGIN_ID")
    private String loginId;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     *
     */
    @TableField("PHOTO_PATH")
    private String photoPath;

   }