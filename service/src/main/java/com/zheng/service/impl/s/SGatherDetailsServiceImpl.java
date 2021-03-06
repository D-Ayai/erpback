package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zheng.mapper.s.SGatherDetailsMapper;
import com.zheng.pojo.s.SGatherDetails;
import com.zheng.pojo.s.SGatherEx;
import com.zheng.service.s.SGatherDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SGatherDetailsServiceImpl extends ServiceImpl<SGatherDetailsMapper, SGatherDetails> implements SGatherDetailsService {

    @Autowired
    SGatherDetailsMapper sGatherDetailsMapper;

    /**
     * 入库调度单中的表格-xyb
     * @param parentId PARENT_ID与S_GATHER的ID相对应，为外键
     * @return
     */
    @Override
    public List<SGatherEx> queryByParentIdSGatherDetails(String parentId) {
        return sGatherDetailsMapper.queryByParentIdSGatherDetails(parentId);
    }
    /**
     * 入库查询-查看-xyb
     * @param id
     * @return
     */
    @Override
    public SGatherEx queryByIdSGatherEx(int id) {
        System.out.println("queryByIdSGatherEx的id:"+id);
        return sGatherDetailsMapper.queryByIdSGatherEx(id);
    }
    /**
     * 入库查询-查看-表格-xyb
     * @param id
     * @return
     */
    @Override
    public List<SGatherEx> queryByIdSGatherEx2(int id) {
        System.out.println("queryByIdSGatherEx2的id:"+id);
        return sGatherDetailsMapper.queryByIdSGatherEx2(id);
    }
}
