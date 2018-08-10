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
    //李宁康的方法：关键字查找
    List<TbGoodsDesc> searchKeyWords(List<Word> keyWords);
    //李宁康的方法：关键字查找并按价格排序
    List<TbGoodsDesc> searchKeyWordsByPrice(List<Word> keyWords);
    //李宁康的方法：关键字查找并按销量排序
    List<TbGoodsDesc> searchKeyWordsBysellNum(List<Word> keyWords);

}
