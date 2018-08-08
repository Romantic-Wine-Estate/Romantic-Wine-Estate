package com.romantic.service.imp;

import com.romantic.dao.TbGoodsDescMapper;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/8
 * Time:17:32
 */
@Service
public class TbGoodsDescServiceImp implements TbGoodsDescService {
    @Autowired
    private TbGoodsDescMapper tbGoodsDescMapper;

    @Override
    public List<TbGoodsDesc> queryByPlaceOfArea(String placeOfArea) {
        return tbGoodsDescMapper.queryByPlaceOfArea(placeOfArea);
    }

    @Override
    public List<TbGoodsDesc> queryByTaste(String taste) {
        return tbGoodsDescMapper.queryByTaste(taste);
    }

    @Override
    public List<TbGoodsDesc> queryByCategory(String category) {
        return tbGoodsDescMapper.queryByCategory(category);
    }

    @Override
    public List<TbGoodsDesc> queryByGoodsPrice(String goodsPrice) {
        if (goodsPrice.contains("-")) {
            String priceString1[] = goodsPrice.split("-");
            int priceInt1[] = new int[priceString1.length];
            for (int i = 0; i < priceString1.length; i++) {
                priceInt1[i] = Integer.parseInt(priceString1[i]);
            }
            return tbGoodsDescMapper.queryByGoodsPrice1(priceInt1[0], priceInt1[1]);
        } else {

            String priceString2[] = goodsPrice.split("+");
            int priceInt2[] = new int[priceString2.length];
            for (int i = 0; i < priceString2.length; i++) {
                priceInt2[i] = Integer.parseInt(priceString2[i]);
            }
            return tbGoodsDescMapper.queryByGoodsPrice2(priceInt2[0]);

        }


    }
}
