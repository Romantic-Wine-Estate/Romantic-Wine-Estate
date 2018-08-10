package com.romantic.dao;

import com.romantic.pojo.TbOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/7
 * Time:23:04
 * To change this template use File | Settings | File Templates.
 */
@Repository(value = "TbOrderMapper")
public interface TbOrderMapper {
    //查询订单表所有信息
    TbOrder selectByOrderNum(@Param ("orderNum") String orderNum);

    //往订单表中插入一条数据
    void insertOrder(TbOrder order);

    //修改订单表中某一条数据的`is_alive`字段的值
    TbOrder updateOrderIsAlive(@Param ("orderNum") String orderNum);
}
