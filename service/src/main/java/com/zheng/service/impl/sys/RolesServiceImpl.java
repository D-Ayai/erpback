package com.zheng.service.impl.sys;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.sys.RolesMapper;
import com.zheng.pojo.sys.Roles;
import com.zheng.service.sys.RolesService;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl  extends ServiceImpl<RolesMapper, Roles> implements RolesService {
}
