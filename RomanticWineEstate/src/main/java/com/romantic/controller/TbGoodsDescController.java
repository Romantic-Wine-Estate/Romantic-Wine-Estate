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

    @RequestMapping("/placeOfArea.htm/{placeOfArea,orderMethod}")
    @ResponseBody
    public List<TbGoodsDesc> queryByPlaceOfArea(String placeOfArea,String orderMethod)
    {
        return  tbGoodsDescService.queryByPlaceOfArea(placeOfArea,orderMethod);
    }

    @RequestMapping("/taste.htm/{taste,orderMethod}")
    @ResponseBody
    public List<TbGoodsDesc> queryByTaste(String taste,String orderMethod)
    {
        return  tbGoodsDescService.queryByTaste(taste,orderMethod);
    }


    @RequestMapping("/category.htm/{category,orderMethod}")
    @ResponseBody
    public List<TbGoodsDesc> queryByCategory(String category,String orderMethod)
    {
        return  tbGoodsDescService.queryByCategory(category,orderMethod);
    }

    @RequestMapping("/goodsPrice.htm/{goodsPrice,orderMethod}")
    @ResponseBody
    public List<TbGoodsDesc> queryByGoodsPrice(String goodsPrice,String OrderMethod)
    {
        System.out.println(goodsPrice);
        return  tbGoodsDescService.queryByGoodsPrice(goodsPrice,OrderMethod);
    }


}
