package com.romantic.dao;

import com.romantic.pojo.TbOrder;
import org.apache.ibatis.annotations.Param;

/**
 * Create with IntelliJ IDEA
 * Author: liufugen
 * Date:{2018/8/11}
 * Time:{12:25}
 */
public interface TbOrderDao {
    TbOrder selectByOrderIdAndUserId(@Param("orderNum") String orderNum, @Param("userId") String userId);
}
