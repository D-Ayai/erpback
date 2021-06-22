package com.zheng.dao;

import org.springframework.beans.factory.annotation.Autowired;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowId {
    /**
     * 查询出当前日期的编号
     * @param biao
     * @param bianhao
     * @return 放回处理好后的编号
     */
    private String show(String biao,String bianhao){

        //我要获取当前的日期
        Date date = new Date();
        //设置要获取到什么样的时间
        SimpleDateFormat sdf = new SimpleDateFormat(bianhao+"yyyyMMdd");
        //获取String类型的时间
        String createdate =sdf.format(date);

        //从数据库查出当天的留水号
        String id = biao;

        if ("".equals(id)||"null".equals(id)||id==null){
            createdate+="0001";
        }else{
            int b = Integer.parseInt(id.substring(id.length() - 4));
            b++;
            DecimalFormat df=new DecimalFormat("0000");
            createdate+=df.format(b);
        }
       return createdate;
    }

    /**
     * 物料设计单编号
     * @param id 查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showWuLiaoId(String id){
        return  show(id,"200");
    }

    /**
     * 工序设计单编号
     * @param id 查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showGongXuId(String id){
        return  show(id,"201");
    }

    /**
     * 工序明细单编号
     * @param id 查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showGongXuMingxiId(String id){
        return  show(id,"202");
    }

    /**
     * 生产计划编号
     * @param id 查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showShengChanId(String id){
        return  show(id,"300");
    }

    /**
     * 库存编号
     * @param id 查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showKuCunId(String id){
        return  show(id,"400");
    }

    /**
     * 入库单编号
     * @param id  查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showRenkuId(String id){
        return  show(id,"401");
    }

    /**
     * 入库单编号
     * @param id  查询出当天的编号
     * @return 放回处理好后的编号
     */
    public String showChukuId(String id){
        return  show(id,"402");
    }
}
