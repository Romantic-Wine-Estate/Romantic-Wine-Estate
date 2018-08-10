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
public class TbGoodsDescServiceImp implements TbGoodsDescService{
    @Autowired
    private TbGoodsDescMapper tbGoodsDescMapper;
    @Override
    public List<TbGoodsDesc> queryByPlaceOfArea(String placeOfArea,String orderMethod) {
        List<TbGoodsDesc>  tempList=tbGoodsDescMapper.queryByPlaceOfArea(placeOfArea);
        if(orderMethod.equals("default"))
        {
            return tempList;
        }
        if(orderMethod.equals("orderByPrice"))
        {
            return TbGoodsDesc.sortByPrice(tempList);
        }
        else
        {
            return TbGoodsDesc.sortBySellNum(tempList);
        }
    }
    @Override
    public List<TbGoodsDesc> queryByTaste(String taste,String orderMethod) {
        List<TbGoodsDesc>  tempList= tbGoodsDescMapper.queryByTaste(taste);
        if(orderMethod.equals("default"))
        {
            return tempList;
        }
        if(orderMethod.equals("orderByPrice"))
        {
            return TbGoodsDesc.sortByPrice(tempList);
        }
        else
        {
            return TbGoodsDesc.sortBySellNum(tempList);
        }
    }
    @Override
    public List<TbGoodsDesc> queryByCategory(String category,String orderMethod) {
        List<TbGoodsDesc>  tempList= tbGoodsDescMapper.queryByCategory(category);
        if(orderMethod.equals("default"))
        {
            return tempList;
        }
        if(orderMethod.equals("orderByPrice"))
        {
            return TbGoodsDesc.sortByPrice(tempList);
        }
        else
        {
            return TbGoodsDesc.sortBySellNum(tempList);
        }
    }
    @Override
    public List<TbGoodsDesc> queryByGoodsPrice(String goodsPrice,String orderMethod) {
        if (goodsPrice.contains("-")) {
            String priceString1[] = goodsPrice.split("\\-");
            int priceInt1[] = new int[priceString1.length];
            for (int i = 0; i < priceString1.length; i++) {
                priceInt1[i] = Integer.parseInt(priceString1[i]);
            }
            List<TbGoodsDesc>  tempList= tbGoodsDescMapper.queryByGoodsPrice1(priceInt1[0], priceInt1[1]);
            if(orderMethod.equals("default"))
            {
                return tempList;
            }
            if(orderMethod.equals("orderByPrice"))
            {
                return TbGoodsDesc.sortByPrice(tempList);
            }
            else
            {
                return TbGoodsDesc.sortBySellNum(tempList);
            }
        } else {
            List<TbGoodsDesc>  tempList= tbGoodsDescMapper.queryByGoodsPrice2(Integer.parseInt(goodsPrice));
            if(orderMethod.equals("default"))
            {
                return tempList;
            }
            if(orderMethod.equals("orderByPrice"))
            {
                return TbGoodsDesc.sortByPrice(tempList);
            }
            else
            {
                return TbGoodsDesc.sortBySellNum(tempList);
            }

        }


    }


}
