package com.zheng.mapper.d;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.d.File;
import org.apache.ibatis.annotations.Select;

public interface FileMapper extends BaseMapper<File> {

    @Select("SELECT MAX(d_file.`PRODUCT_ID`)   FROM d_file WHERE TO_DAYS(register_time) = TO_DAYS(NOW()) ")
    String showProductId();
}