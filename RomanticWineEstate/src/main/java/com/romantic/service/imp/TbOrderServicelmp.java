package com.romantic.service.imp;

import com.romantic.dao.TbOrderMapper;
import com.romantic.pojo.TbOrder;
import com.romantic.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/7
 * Time:21:02
 * To change this template use File | Settings | File Templates.
 */
@Service("TbOrderServicelmp")
public class TbOrderServicelmp implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;
    //1、查询订单表中的一条数据
    @Override
    public TbOrder selectOrder(String order_num) {
        TbOrder tbOrder=tbOrderMapper.selectByOrderNum (order_num);
        if(tbOrder!=null)
            return tbOrder;
        return null;
    }

    //2、在订单表中插入一条数据
    @Override
    public void insertOrder(TbOrder order) {
        tbOrderMapper.insertOrder (order);
    }

    //4、删除订单信息（软删除）(若未付款，到24小时就删除该订单)
    @Override
    public void deleteOrder(final String orderNum) {
        Timer timer = new Timer();
        //schedule(TimerTask task, Date time)：安排在指定的时间后执行指定的任务。
        timer.schedule(new TimerTask () {
            //要执行的任务——删除该订单
            public void run() {
                TbOrder tbOrder=tbOrderMapper.updateOrderIsAlive (orderNum);
            }
        }, 24*60*60*1000);// 设定指定的时间time,此处为2000毫秒
    }

}

