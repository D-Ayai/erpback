package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.s.PayDetailsMapper;
import com.zheng.pojo.s.PayDetails;
import com.zheng.service.s.PayDetailsService;
import org.springframework.stereotype.Service;

@Service
public class PayDetailsServiceImpl extends ServiceImpl<PayDetailsMapper, PayDetails> implements PayDetailsService {
}
