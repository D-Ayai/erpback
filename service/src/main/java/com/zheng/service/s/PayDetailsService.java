package com.zheng.service.s;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.s.Pay;
import com.zheng.pojo.s.PayDetails;
import com.zheng.pojo.util.Conut;
import com.zheng.pojo.util.Paypayd;

import java.util.List;

public interface PayDetailsService extends IService<PayDetails> {
    List<PayDetails> select(Integer parenId);
    Paypayd selectq(Integer id);
    Boolean updateid(Paypayd paypayd);
    Conut conutid(String paytag);
}
