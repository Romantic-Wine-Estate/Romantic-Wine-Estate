package com.romantic.service;

import com.romantic.pojo.TbOrderItem;
import org.apache.ibatis.annotations.Param;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/8
 * Time:01:10
 * To change this template use File | Settings | File Templates.
 */
public interface TbOrderItemService {
    //1、查询订单中商品的所有信息
    TbOrderItem selectOrderItem(String orderNum, String goodsId);

    //4、删除该订单中商品的所有信息（软删除）(若未付款，到24小时就删除该订单里商品信息)
    void deleteOrderItem(String orderNum);
}
