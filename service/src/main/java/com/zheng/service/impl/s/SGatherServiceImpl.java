package com.zheng.service.impl.s;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.util.StringUtil;
import com.zheng.mapper.s.SCellMapper;
import com.zheng.mapper.s.SGatherDetailsMapper;
import com.zheng.mapper.s.SGatherMapper;
import com.zheng.pojo.s.*;
import com.zheng.service.s.SGatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SGatherServiceImpl extends ServiceImpl<SGatherMapper, SGather> implements SGatherService {

    @Autowired
    SGatherMapper sGatherMapper;
    @Autowired
    SGatherDetailsMapper sGatherDetailsMapper;
    @Autowired
    SCellMapper sCellMapper;

    /**
     * 入库调度-总数据查询-xyb
     * @param pageNo
     * @param pageSize
     * @param sGather
     * @return
     */
    @Override
    public IPage<SGather> queryAllSGather(int pageNo, int pageSize, SGather sGather) {
         QueryWrapper<SGather> sGatherQueryWrapper = new QueryWrapper<>();
        if (!StringUtil.isEmpty(sGather.getGatherId())) {
            sGatherQueryWrapper.eq("GATHER_ID", sGather.getGatherId());
        }
        sGatherQueryWrapper.eq("GATHER_TAG","K002-1");
        IPage<SGather> page = this.page(new Page<SGather>(pageNo, pageSize), sGatherQueryWrapper);
        System.out.println("queryAllSGather:"+page);
        return page;
    }
    /**
     * 入库管理-总数据查询-xyb
     * @param pageNo
     * @param pageSize
     * @param sGather
     * @return
     */
    @Override
    public IPage<SGather> queryAllSGather1(int pageNo, int pageSize, SGather sGather) {
        QueryWrapper<SGather> sGatherQueryWrapper = new QueryWrapper<>();

        if (!StringUtil.isEmpty(sGather.getGatherId())) {
            sGatherQueryWrapper.eq("GATHER_ID", sGather.getGatherId());
        }
        if (!StringUtil.isEmpty(sGather.getCheckTag())) {
            sGatherQueryWrapper.eq("CHECK_TAG", sGather.getCheckTag());
        }
        sGatherQueryWrapper.eq("GATHER_TAG","K002-2");
        IPage<SGather> page = this.page(new Page<SGather>(pageNo, pageSize), sGatherQueryWrapper);
        System.out.println("queryAllSGather:"+page);
        return page;
    }
    /**
     * 入库查询-总数据查询-xyb
     * @param pageNo
     * @param pageSize
     * @param sGather
     * @return
     */
    @Override
    public IPage<SGather> queryRuKuAllSGather(int pageNo, int pageSize, SGather sGather) {
        QueryWrapper<SGather> sGatherQueryWrapper = new QueryWrapper<>();

        if (!StringUtil.isEmpty(sGather.getGatherId())) {
            sGatherQueryWrapper.eq("GATHER_ID", sGather.getGatherId());
        }
        sGatherQueryWrapper.eq("GATHER_TAG","K002-2");
        sGatherQueryWrapper.eq("CHECK_TAG","S001-2");
        sGatherQueryWrapper.or();
        sGatherQueryWrapper.eq("CHECK_TAG","S001-1");

        IPage<SGather> page = this.page(new Page<SGather>(pageNo, pageSize), sGatherQueryWrapper);
        System.out.println("queryAllSGather:"+page);
        return page;
    }

    /**
     * 入库调度单-查询-xyb
     *
     * @param
     * @param id
     */
    @Override
    public SGatherEx queryByIdSGatherEx(int id) {
        return sGatherMapper.queryByIdSGatherEx(id);
    }

    /**
     * 入库调度-xyb
     * @param scheduling 入库调度特制beng
     * @return
     */
    @Transactional
    @Override
    public String addSGather(Scheduling scheduling) {
        System.out.println("scheduling"+scheduling);

        // 本次入库数量=应入库数
        // b)本次入库数量如果不等于应入库数
        QueryWrapper<SGatherDetails> sGatherDetailsQueryWrapper = new QueryWrapper<>();
        sGatherDetailsQueryWrapper.eq("PRODUCT_ID",scheduling.getProductId());
        SGatherDetails sGatherDetails = sGatherDetailsMapper.selectOne(sGatherDetailsQueryWrapper);

        QueryWrapper<SGather> sGatherQueryWrapper = new QueryWrapper<>();
        sGatherQueryWrapper.eq("GATHER_ID",scheduling.getGatherId());
        SGather sGather = this.getOne(sGatherQueryWrapper);
        sGather.setAmountSum(sGather.getAmountSum()+scheduling.getAmount());//总确认数
        if (sGatherDetails.getAmount().equals(scheduling.getAmount())){
            // 本次入库数量<=最大存储量—当前存储量
            QueryWrapper<SCell> sCellQueryWrapper = new QueryWrapper<>();
            sCellQueryWrapper.eq("PRODUCT_ID",scheduling.getProductId());
            SCell sCell = sCellMapper.selectOne(sCellQueryWrapper);
            int sCellAmount=sCell.getMaxCapacityAmount()-sCell.getAmount();
            if(sCellAmount<scheduling.getAmount()){
                System.out.println(sCellAmount+"本次入库数量过大,仓库储存不足"+scheduling.getAmount());
                return "本次入库数量过大,仓库储存不足";
            }
            // 保存时：
            // a)当前存储量=当前存储量+本次入库数量
            int sCellAmount2=sCell.getAmount()+scheduling.getAmount();
            sCell.setAmount(sCellAmount2);//当前储存

            sGatherDetails.setGatherTag("K002-2");//明细-已调度
            sGatherDetails.setAss(scheduling.getAss());//储存地址集合
            sGatherDetails.setGatheredAmount(scheduling.getAmount());//确认入库数量
            //连接查询
            List<SGatherDetails> sGatherDetails1 = sGatherDetailsMapper.queryByParentIdSGatherDetails1(scheduling.getScellformId());
            //判断明细表里的入库标志为K002-1字段是否只有一条
            //只有一条就证明:这条明细记录入库标志为K002-1
            //修改完这条就没有不调用的明细记录,可进入if判断修改入库表库存标志为K002-2(以调用)
            System.out.println("addSGather中的sGatherDetails1.getProductId:"+scheduling.getProductId());
            System.out.println("addSGather中的sGatherDetails1.size:"+sGatherDetails1.size());
            if (sGatherDetails1.size() ==1){
                System.out.println("进入if方法");
                sGather.setGatherTag("2");//已调度
            }

            sGather.setAttemper(scheduling.getAttemper());//调度人
            sGather.setAttemperTime(scheduling.getAttemperTime());//调度时间;


            UpdateWrapper<SGather> sGatherUpdateWrapper = new UpdateWrapper<>();
            sGatherUpdateWrapper.eq("GATHER_ID",scheduling.getGatherId());

            sCellMapper.updateById(sCell);//添加当前储存
            sGatherDetailsMapper.updateById(sGatherDetails);//修改入库标志
            boolean save = this.update(sGather,sGatherUpdateWrapper);
            if (save)
                return "入库成功!";
        }else {
            System.out.println(sGatherDetails.getAmount()+"本次入库数量应该与应入库数量一致!"+scheduling.getAmount());
            return "本次入库数量应该与应入库数量一致!";
        }
        return "入库失败!";
    }

    /**
     * 入库调度单总调度-xyb
     * @param gatherId 入库编号
     * @return
     */
    @Override
    public SGather queryByGatherIdSGather(String gatherId) {
        QueryWrapper<SGather> sGatherQueryWrapper = new QueryWrapper<>();
        sGatherQueryWrapper.eq("GATHER_ID",gatherId);
        return this.getOne(sGatherQueryWrapper);
    }
    /**
     * 入库-复核-xyb
     * @param sGather
     * @return
     */
    @Override
    public boolean amendSGather(SGather sGather) {
        return this.updateById(sGather);
    }
    /**
     * 入库登记-xyb
     * @param putInStorages
     * @return
     */
    @Transactional
    @Override
    public boolean addPutInStorage(List<PutInStorage> putInStorages) {
        SGatherDetails sGatherDetails = new SGatherDetails();
        SGather sGather = new SGather();
        UpdateWrapper<SGather> sGatherUpdateWrapper = new UpdateWrapper<>();

        Integer sum=0;
        int i = 0;
        for (PutInStorage put:putInStorages) {
            System.out.println("addPutInStorage-putInStorages:"+put);
            sGatherDetails.setId(put.getId());//明细表-id
            sGatherDetails.setGatheredAmount(put.getGatheredAmount());//明细表-确认入库件数
           sum+=put.getGatheredAmount();//确认入库总件数
            if (!StringUtil.isEmpty(put.getRegister())) {
                System.out.println("put.getRegister():"+put.getRegister());
                sGather.setRegister(put.getRegister());//登记人
            }
            if (put.getRegisterTime()!=null){
                System.out.println("put.getRegisterTime():"+put.getRegisterTime());
                sGather.setRegisterTime(put.getRegisterTime());//登记时间
            }
            if (!StringUtil.isEmpty(put.getGatherId())) {
                System.out.println("put.getGatherId():"+put.getGatherId());
                sGatherUpdateWrapper.eq("GATHER_ID",put.getGatherId());//用入库单号做条件
            }
            sGatherDetails.setGatherTag("1");//明细表状态已调度
             i = sGatherDetailsMapper.updateById(sGatherDetails);//修改入库明细表
        }
        sGather.setCheckTag("0");//等待审核
        sGather.setGatherTag("1");//已调度
        sGather.setGatheredAmountSum(sum);//确认入库总件数
        System.out.println("i:"+i);
        boolean update = this.update(sGather, sGatherUpdateWrapper);
        System.out.println("update:"+update);
        return update;//修改入库表
    }
}
