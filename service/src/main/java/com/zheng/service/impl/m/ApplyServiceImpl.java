package com.zheng.service.impl.m;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.m.ApplyMapper;
import com.zheng.pojo.m.Apply;
import com.zheng.service.m.ApplyService;
import org.springframework.stereotype.Service;

@Service
public class ApplyServiceImpl  extends ServiceImpl<ApplyMapper, Apply> implements ApplyService {
}
