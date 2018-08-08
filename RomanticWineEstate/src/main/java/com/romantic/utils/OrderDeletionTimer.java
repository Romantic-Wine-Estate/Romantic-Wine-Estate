package com.romantic.utils;

import org.apache.log4j.Logger;

import java.util.Timer;
import java.util.TimerTask;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/8
 * Time:18:47
 * To change this template use File | Settings | File Templates.
 */
public class OrderDeletionTimer {
    /**
     * 订单关闭(设置指定24小时后，修改订单状态为已关闭)
     * @param orderId  订单号
     */
    //设定指定任务task在指定时间time执行
    public static void orderClose(String orderId) {
            Timer timer = new Timer();
            //schedule(TimerTask task, Date time)：安排在指定的时间后执行指定的任务。
            timer.schedule(new TimerTask() {
                //要执行的任务——删除该订单
                public void run() {
                   // deleteOrder
                }
            }, 24*60*60);// 设定指定的时间time,此处为2000毫秒
    }

    public static void main(String[] args) {
        orderClose ("1");
    }
}
