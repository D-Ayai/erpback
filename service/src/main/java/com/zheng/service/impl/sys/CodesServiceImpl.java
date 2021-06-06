package com.zheng.service.impl.sys;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.sys.CodesMapper;
import com.zheng.pojo.sys.Codes;
import com.zheng.service.sys.CodesService;
import org.springframework.stereotype.Service;

@Service
public class CodesServiceImpl  extends ServiceImpl<CodesMapper, Codes> implements CodesService {
}
