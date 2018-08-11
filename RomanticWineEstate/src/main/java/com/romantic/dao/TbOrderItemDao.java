package com.romantic.dao;

import com.romantic.pojo.TbOrder;
import com.romantic.pojo.TbOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author: liufugen
 * Date:{2018/8/11}
 * Time:{12:25}
 */
public interface TbOrderItemDao {
    List<TbOrderItem> queryByOrderNum(@Param("orderNum") String orderNum);
}
