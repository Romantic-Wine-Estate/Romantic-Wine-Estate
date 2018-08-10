package com.romantic.dao;

import com.romantic.pojo.TbGoodsDesc;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/7
 * Time:22:51
 */
public interface TbGoodsDescMapper {
    public List<TbGoodsDesc> queryByPlaceOfArea(@Param("placeOfArea") String placeOfArea);
    public List<TbGoodsDesc> queryByTaste(@Param("taste") String taste);
    public List<TbGoodsDesc> queryByCategory(@Param("category") String category);
    public List<TbGoodsDesc> queryByGoodsPrice1(@Param("minPrice") int minPrice,@Param("maxPrice") int maxPrice);
    public List<TbGoodsDesc> queryByGoodsPrice2(@Param("price") int price);





}
