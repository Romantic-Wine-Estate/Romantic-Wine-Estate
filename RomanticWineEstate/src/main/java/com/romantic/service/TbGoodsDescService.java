package com.romantic.service;

import com.romantic.pojo.TbGoodsDesc;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/8
 * Time:17:26
 */
public interface TbGoodsDescService {
    public List<TbGoodsDesc> queryByPlaceOfArea(String placeOfArea);
    public List<TbGoodsDesc> queryByTaste(String taste);
    public List<TbGoodsDesc> queryByCategory(String category);
    public List<TbGoodsDesc> queryByGoodsPrice(String goodsPrice);



}
