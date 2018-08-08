package com.romantic.service;

import com.romantic.pojo.TbCart;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:17:00
 */
public interface TbCartService {
    TbCart selectById(int id);
    List<TbCart> selectByUserId(String userId);
    void insertGoods(String userId,String goodsId,int goodsNum);
    boolean hasGoods(String userId,String goodsId);
    void updateGoodsNum(String userId,String goodsId,int goodsNum);

}
