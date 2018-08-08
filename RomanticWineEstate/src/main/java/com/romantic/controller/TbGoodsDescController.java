package com.romantic.controller;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/8
 * Time:17:54
 */
@Controller
@RequestMapping("/goodsSort")
public class TbGoodsDescController {
    @Autowired
    private TbGoodsDescService tbGoodsDescService;
    @RequestMapping("/")
    public String index(){
        return "hello";
    }

    @RequestMapping("/placeOfArea.htm/{placeOfArea}")
    @ResponseBody
    public List<TbGoodsDesc> queryByPlaceOfArea(String placeOfArea)
    {
        return  tbGoodsDescService.queryByPlaceOfArea(placeOfArea);
    }

    @RequestMapping("/taste.htm/{taste}")
    @ResponseBody
    public List<TbGoodsDesc> queryByTaste(String taste)
    {
        return  tbGoodsDescService.queryByTaste(taste);
    }


    @RequestMapping("/category.htm/{category}")
    @ResponseBody
    public List<TbGoodsDesc> queryByCategory(String category)
    {
        return  tbGoodsDescService.queryByCategory(category);
    }

    @RequestMapping("/goodsPrice.htm/{goodsPrice}")
    @ResponseBody
    public List<TbGoodsDesc> queryByGoodsPrice(String goodsPrice)
    {
        return  tbGoodsDescService.queryByGoodsPrice(goodsPrice);
    }


}
