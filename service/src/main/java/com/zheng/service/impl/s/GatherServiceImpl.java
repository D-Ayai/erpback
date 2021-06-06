package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.s.GatherMapper;
import com.zheng.pojo.s.Gather;
import com.zheng.service.s.GatherService;
import org.springframework.stereotype.Service;

@Service
public class GatherServiceImpl extends ServiceImpl<GatherMapper, Gather> implements GatherService {
}
