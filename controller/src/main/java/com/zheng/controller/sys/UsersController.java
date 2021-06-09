package com.zheng.controller.sys;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zheng.pojo.sys.Users;
import com.zheng.service.sys.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("User")
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping("login.action")
    public boolean login(Users users){

        QueryWrapper<Users> queryWrapper =new QueryWrapper<Users>();
        if(!StringUtils.isEmpty(users.getLoginId())){
            queryWrapper.like("LOGIN_ID",users.getLoginId());
        }
        if(!StringUtils.isEmpty(users.getPassword())){
            queryWrapper.like("PASSWORD",users.getPassword());
        }

        Users one = usersService.getOne(queryWrapper);

        if (one==null){
            return false;
        }
        return true;
    }
}
