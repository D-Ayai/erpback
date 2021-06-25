package com.zheng.controller.s;


import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zheng.pojo.d.Module;
import com.zheng.pojo.s.Pay;
import com.zheng.pojo.s.PayDetails;
import com.zheng.pojo.util.Conut;
import com.zheng.pojo.util.Paypayd;
import com.zheng.service.s.PayDetailsService;
import com.zheng.service.s.PayService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.BlockingDeque;

@RestController
@CrossOrigin
@RequestMapping("/Pay")
public class PayControll {
    @Autowired
    PayService payService;
    @Autowired
    PayDetailsService payDetailsService;
    @RequestMapping("page.action")
    public IPage<Pay> page(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                              @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                              Pay pay){
        //组装查询条件
        QueryWrapper<Pay> queryWrapper =new QueryWrapper<Pay>();
        if(!StringUtils.isEmpty(pay.getPayTag())){
            queryWrapper.like("pay_tag",pay.getPayTag());
        }
        /*if(!StringUtils.isEmpty(module.getCheckTag())){
            queryWrapper.like("check_tag",module.getCheckTag());
        }*/
        return  payService.page(new Page<Pay>(pageNo,pageSize),queryWrapper);
    }

    @RequestMapping("seleid.action")
    public List<PayDetails> byid(Integer parenId){
        System.out.println(payDetailsService.select(parenId));
        return payDetailsService.select(parenId);
    }
    @RequestMapping("byid.action")
    public Pay ById(Integer id){
        return payService.getById(id);
    }
    @RequestMapping("byidpayd.action")
    public PayDetails ByIds(Integer id){
        return payDetailsService.getById(id);
    }
    @RequestMapping("idselect.action")
    public Paypayd idselect(Integer id,Paypayd paypayd){
        System.out.println(payDetailsService.selectq(id));
        return payDetailsService.selectq(id);
    }
    @RequestMapping("updateid.action")
    public Boolean updateid(Paypayd paypayd){
        return payDetailsService.updateid(paypayd);
    }
    @RequestMapping("update.action")
    public Boolean update(Pay pay){
        return payService.updateById(pay);
    }
    @RequestMapping("conutid.action")
    public Conut conutid(String paytag){
        System.out.println(payDetailsService.conutid(paytag));
        return payDetailsService.conutid(paytag);
    }
}
