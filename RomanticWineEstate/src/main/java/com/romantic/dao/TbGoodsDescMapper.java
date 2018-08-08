package com.romantic.dao;

import com.romantic.pojo.TbGoodsDesc;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/8
 * Time:13:53
 */
public interface TbGoodsDescMapper {
   /*
    * 通过关键词查询商品列表
    *
    * @param     keyWoeds    传入的关键词
    * @return    返回一个List
    * @throws
    *
    * */
    List<TbGoodsDesc>   searchKeyWords(String keyWords);


}
