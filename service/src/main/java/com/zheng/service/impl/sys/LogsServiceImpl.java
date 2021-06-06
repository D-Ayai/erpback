package com.zheng.service.impl.sys;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.sys.LogsMapper;
import com.zheng.pojo.sys.Logs;
import com.zheng.service.sys.LogsService;
import org.springframework.stereotype.Service;

@Service
public class LogsServiceImpl  extends ServiceImpl<LogsMapper, Logs> implements LogsService {
}
