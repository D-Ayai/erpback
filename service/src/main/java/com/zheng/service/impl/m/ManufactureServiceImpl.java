package com.zheng.service.impl.m;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.m.ManufactureMapper;
import com.zheng.pojo.m.Manufacture;
import com.zheng.service.m.ManufactureService;
import org.springframework.stereotype.Service;

@Service
public class ManufactureServiceImpl extends ServiceImpl<ManufactureMapper, Manufacture> implements ManufactureService {
}
