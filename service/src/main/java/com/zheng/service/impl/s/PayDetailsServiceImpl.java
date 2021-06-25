package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.s.PayDetailsMapper;
import com.zheng.pojo.s.Pay;
import com.zheng.pojo.s.PayDetails;
import com.zheng.pojo.util.Conut;
import com.zheng.pojo.util.Paypayd;
import com.zheng.service.s.PayDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayDetailsServiceImpl extends ServiceImpl<PayDetailsMapper, PayDetails> implements PayDetailsService {
    @Autowired
    private PayDetailsMapper payDetailsMapper;
    @Override
    public List<PayDetails> select(Integer parenId) {
        return payDetailsMapper.selectid(parenId);
    }

    @Override
    public Paypayd selectq(Integer id) {
        return payDetailsMapper.selectidp(id);
    }

    @Override
    public Boolean updateid(Paypayd paypayd) {
        return payDetailsMapper.updateid(paypayd);
    }

    @Override
    public Conut conutid(String paytag) {
        return payDetailsMapper.conutid(paytag);
    }

}
