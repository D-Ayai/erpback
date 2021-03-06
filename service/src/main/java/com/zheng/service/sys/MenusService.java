package com.zheng.service.sys;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zheng.pojo.sys.Menus;

import java.util.List;

public interface MenusService  extends IService<Menus> {

    /**
     * 菜单组装包含父子关系的菜单集合
     * @return 返回菜单父子集合
     */
    public List<Menus> queryallmenus();

}
