package com.romantic.service;

import com.romantic.pojo.TbOrder;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/7
 * Time:21:02
 * To change this template use File | Settings | File Templates.
 */
public interface TbOrderService {
    //1、查询订单表中的所有信息
    TbOrder selectOrder(String orderNum);

    //在订单表中插入一条数据
    void insertOrder(TbOrder order);

    //3、点击结算————>完善订单
    /**
     *要实现的功能：
     *1、获取购物车传来的用户id，商品id以及商品数量，通过这些信息，在不同的数据表中查询需要的信息，存入订单表或者订单详情表
     *2、获取收货人姓名，地址，填入订单表
     */

    //3、提交订单——生成订单或者等待付款（定时）


    //4、删除订单信息(若未付款，到24小时就删除该订单)
    void deleteOrder(String orderNum);


}
