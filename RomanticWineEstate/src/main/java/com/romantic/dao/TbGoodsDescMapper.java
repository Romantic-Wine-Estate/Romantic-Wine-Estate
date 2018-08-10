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
    /*李宁康的方法：关键字查找
     * 通过关键词查询商品列表
     *
     * @param     keyWoeds    传入的关键词
     * @return    返回一个List
     * @throws
     *
     * */
    List<TbGoodsDesc>   searchKeyWords(@Param("keyWords") String keyWords);

    List<TbGoodsDesc>   searchKeyWordsByPrice(@Param("keyWords") String keyWords);

    List<TbGoodsDesc>   searchKeyWordsBysellNum(@Param("keyWords") String keyWords);

}
