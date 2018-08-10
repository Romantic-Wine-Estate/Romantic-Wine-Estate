package com.romantic.dao;

import com.romantic.pojo.TbGoodsDesc;
import org.apache.ibatis.annotations.Param;

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
