package com.romantic.service;

import com.romantic.pojo.TbGoodsDesc;
import org.apdplat.word.segmentation.Word;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/8
 * Time:17:26
 */
public interface TbGoodsDescService {
    public List<TbGoodsDesc> queryByPlaceOfArea(String placeOfArea,String orderMethod);
    public List<TbGoodsDesc> queryByTaste(String taste,String orderMethod);
    public List<TbGoodsDesc> queryByCategory(String category,String orderMethod);
    public List<TbGoodsDesc> queryByGoodsPrice(String goodsPrice,String orderMethod);
    List<TbGoodsDesc> searchKeyWords(List<Word> keyWords);


}
