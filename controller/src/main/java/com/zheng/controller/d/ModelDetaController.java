package com.zheng.controller.d;

import com.zheng.pojo.util.ResultUtil;
import com.zheng.service.d.ModuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/moduleDetails")
public class ModelDetaController {
    public class ModuleDetailsController {
        @Autowired
        private ModuleDetailsService moduleDetailsService;

        /**
         * 不通过
         * @param id
         * @return
         */
        @RequestMapping("/delete")
        public ResultUtil delete(int id, int parentId){
            return  moduleDetailsService.deleteById(id,parentId);
        }
    }
}
