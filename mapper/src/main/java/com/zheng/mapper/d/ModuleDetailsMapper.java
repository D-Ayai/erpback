package com.zheng.mapper.d;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.d.ModuleDetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ModuleDetailsMapper extends BaseMapper<ModuleDetails> {
    @Select("select md.* from 'd_module_details' md left join 'd_module' m on md.'product_id'=m.'id' left join 'd_file' f on f.'product_id'=m.'product_id' where f.'product_id'=#{productId} ")
    List<ModuleDetails> selectByProductId(String productId);

}