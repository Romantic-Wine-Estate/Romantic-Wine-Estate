package com.romantic.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/8
 * Time:16:26
 * To change this template use File | Settings | File Templates.
 */

/**
 * 生成随机订单号：当前年月日时分秒+五位随机数
 * */
public class CreateOrderNumber {
    /**
     * @return 订单编号
     */
    public static String createOrderNum() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date ();
        String str = simpleDateFormat.format(date);
        Random random = new Random();
        int rannum=random.nextInt (99999);
        return str+rannum ;// 当前时间 + 系统5随机生成位数
}
   /* public static void main(String[] args) {
        String fileName = CreateOrderNumber.createOrderNum();
        System.out.println(fileName);
    }*/
}
