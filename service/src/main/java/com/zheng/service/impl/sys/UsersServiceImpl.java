package com.zheng.service.impl.sys;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.sys.UsersMapper;
import com.zheng.pojo.sys.Users;
import com.zheng.service.sys.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
}
