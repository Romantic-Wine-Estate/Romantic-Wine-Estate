package com.romantic.dao;

import com.romantic.pojo.TbOrderItem;
import org.apache.ibatis.annotations.Param;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/8
 * Time:01:00
 * To change this template use File | Settings | File Templates.
 */
public interface TbOrderItemMapper {
    //查询订单表中商品信息（订单编号+商品id）
    TbOrderItem selectByOnGi(@Param("orderNum") String orderNum,@Param ("goodsId") String goodsId);
}
