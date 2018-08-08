package com.romantic.service;

import com.romantic.pojo.TbGoodsDesc;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/8
 * Time:21:14
 */
public interface TbGoodsDescService {

    List<TbGoodsDesc> searchKeyWords(String keyWords);

}
