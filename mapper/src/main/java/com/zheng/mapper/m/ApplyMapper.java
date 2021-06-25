package com.zheng.mapper.m;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.m.Apply;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ApplyMapper  extends BaseMapper<Apply> {

    @Select("SELECT MAX(`APPLY_ID`)   FROM m_apply WHERE TO_DAYS(register_time) = TO_DAYS(NOW()) ")
    String showApplyId();


  /*  @Select("SELECT * FROM m_apply GROUP BY apply_id")
    List<Apply> selectGroupApplyId();*/
}
