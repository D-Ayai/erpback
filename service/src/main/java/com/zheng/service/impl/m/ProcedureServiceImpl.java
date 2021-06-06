package com.zheng.service.impl.m;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.m.ProcedureMapper;
import com.zheng.pojo.m.Procedure;
import com.zheng.service.m.ProcedureService;
import org.springframework.stereotype.Service;

@Service
public class ProcedureServiceImpl extends ServiceImpl<ProcedureMapper, Procedure> implements ProcedureService {
}
