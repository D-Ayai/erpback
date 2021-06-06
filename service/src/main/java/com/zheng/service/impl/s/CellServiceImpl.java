package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.s.CellMapper;
import com.zheng.pojo.s.Cell;
import com.zheng.service.s.CellService;
import org.springframework.stereotype.Service;

@Service
public class CellServiceImpl  extends ServiceImpl<CellMapper, Cell> implements CellService {
}
