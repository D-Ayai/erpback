package com.zheng.mapper.s;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zheng.pojo.s.DFile;
import com.zheng.pojo.s.SGather;
import com.zheng.pojo.s.SGatherEx;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SGatherMapper extends BaseMapper<SGather> {
    @Select("select * from `s_gather_details` sgd\n" +
            "left join `s_gather` sg  on sg.ID = sgd.PARENT_ID\n" +
            "left join s_cell sc on sgd.PRODUCT_ID = sc.PRODUCT_ID\n" +
            "left join `d_file` df on df.PRODUCT_ID = sc.PRODUCT_ID\n" +
            "where df.`CHECK_TAG`='1'\n" +
            "and sc.check_tag='1' \n" +
            "and sg.GATHER_TAG='1'\n" +
            "and sg.check_tag='1'\n" +
            "and sgd.GATHER_TAG='1'")
    List<DFile> querySGather();
    @Select("select * from `s_gather_details` sgd\n" +
            "left join `s_gather` sg  on sg.ID = sgd.PARENT_ID\n" +
            "left join s_cell sc on sgd.PRODUCT_ID = sc.PRODUCT_ID\n" +
            "left join `d_file` df on df.PRODUCT_ID = sc.PRODUCT_ID\n" +
            "where sgd.`ID`=#{id}\n" +
            "and sc.check_tag='1' \n" +
            "and sg.GATHER_TAG='1'\n" +
            "and sg.check_tag='1'\n" +
            "and sgd.GATHER_TAG='1' ")
    SGatherEx queryByIdSGatherEx(@Param("id") int id);
}
