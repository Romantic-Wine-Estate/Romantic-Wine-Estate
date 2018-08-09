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
    //判断该用户是否有该商品
    boolean hasGoods(String userId,String goodsId);
    //更新该用户的该商品在购物车中的数量
    void updateGoodsNum(String userId,String goodsId,int goodsNum);
    //boolean isEnough(String goodsId,int goodsNum);
    //该用户全选或取消选择自己购物车中的商品
    void choose(String userId,char amount);
    //该用户选择购物车中的某种商品
    void chooseSingle(String userId,String goodsId);
    //软删除用户购物车中被勾选的商品
    void delete(String userId);
}
