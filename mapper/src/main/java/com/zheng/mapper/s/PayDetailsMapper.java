package com.zheng.mapper.s;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.s.Pay;
import com.zheng.pojo.s.PayDetails;
import com.zheng.pojo.util.Conut;
import com.zheng.pojo.util.Paypayd;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PayDetailsMapper extends BaseMapper<PayDetails> {
    @Select("select * from S_PAY_DETAILS where PARENT_ID = #{parentId}")
    List<PayDetails> selectid(Integer parenId);
    @Select("SELECT  s.PAY_ID AS payid,sp.PRODUCT_ID AS productid,\n" +
            "sp.id AS id,\n" +
            "sp.PRODUCT_NAME AS productname,\n" +
            "sp.COST_PRICE AS costprice,\n" +
            "se.AMOUNT AS amount,\n" +
            "sp.PAID_AMOUNT AS paidamount,\n" +
            "s.REGISTER AS register,\n" +
            "s.REGISTER_TIME AS registertime FROM `s_pay` s\n" +
            "LEFT  JOIN  `s_pay_details` sp\n" +
            "ON  s.id = sp.parent_id\n" +
            "LEFT  JOIN  `s_cell` se\n" +
            "ON  se.product_id =sp.PRODUCT_ID\n" +
            "WHERE sp.id= #{id}")
    Paypayd selectidp(Integer id);
    @Update("UPDATE s_pay s \n" +
            "INNER JOIN `s_pay_details` sp\n" +
            "ON s.id = sp.parent_id\n" +
            "INNER JOIN `s_cell` se\n" +
            "ON se.product_id =sp.PRODUCT_ID\n" +
            "SET se.amount=#{amount},sp.pay_tag=#{paytag}\n" +
            "WHERE sp.id=#{id}")
    Boolean updateid(Paypayd paypayd);
    @Select("SELECT COUNT(*) AS sl FROM s_pay_details WHERE pay_tag=#{paytag}")
    Conut conutid(String paytag);
}