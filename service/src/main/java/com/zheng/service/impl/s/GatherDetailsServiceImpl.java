package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.s.GatherDetailsMapper;
import com.zheng.pojo.s.GatherDetails;
import com.zheng.service.s.GatherDetailsService;
import org.springframework.stereotype.Service;

@Service
public class GatherDetailsServiceImpl  extends ServiceImpl<GatherDetailsMapper, GatherDetails> implements GatherDetailsService {
}
