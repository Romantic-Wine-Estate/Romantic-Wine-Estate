package com.romantic.dao;

import com.romantic.pojo.TbGoodsDesc;
import org.apache.ibatis.annotations.Param;

/**
 * IntelliJ IDEA
 * Author:Hu HaoRan
 * <p>
 * Data:2018-08-08
 * Time:14:19
 */
public interface TbGoodsDescMapper {
    TbGoodsDesc queryByGoodsId(@Param("goods_id") String goods_id);
}