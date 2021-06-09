package com.zheng.controller.d;

import com.zheng.pojo.d.File;
import com.zheng.service.d.ConfigFileKindService;
import com.zheng.service.d.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("file")
public class FileController {
    @Autowired
    FileService fileService;
    @Autowired
    ConfigFileKindService configFileKindService;
    @RequestMapping("addr.action")
    public boolean  addrfile(File file){
        return fileService.save(file);
    }
}
