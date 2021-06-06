package com.zheng.service.impl.d;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.d.FileMapper;
import com.zheng.pojo.d.File;
import com.zheng.service.d.FileService;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl  extends ServiceImpl<FileMapper, File> implements FileService {
}
