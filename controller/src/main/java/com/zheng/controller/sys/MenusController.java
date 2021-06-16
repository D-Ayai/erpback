package com.zheng.controller.sys;

import com.zheng.pojo.sys.Menus;
import com.zheng.service.sys.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Menus")
public class MenusController {

    @Autowired
    MenusService menusService;

    //菜单获取
    @RequestMapping("queryallmenus")
    public List<Menus> queryallmenus(){
        return menusService.queryallmenus();
    }

}
