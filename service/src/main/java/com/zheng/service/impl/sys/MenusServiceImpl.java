package com.zheng.service.impl.sys;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.sys.MenusMapper;
import com.zheng.pojo.sys.Menus;
import com.zheng.service.sys.MenusService;
import org.springframework.stereotype.Service;

@Service
public class MenusServiceImpl  extends ServiceImpl<MenusMapper, Menus> implements MenusService {
}
