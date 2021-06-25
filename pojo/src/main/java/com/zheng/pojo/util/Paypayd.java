package com.zheng.pojo.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zheng.pojo.s.PayDetails;
import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
public class Paypayd{
    private String id;
    private String payid;
    private String productid;
    private String productname;
    private Integer costprice;
    private Integer amount;
    private Integer paidamount;
    private String register;
    private String paytag;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registertime;

}
