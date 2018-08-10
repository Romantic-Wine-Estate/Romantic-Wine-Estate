package com.romantic.controller;

import com.alibaba.fastjson.JSON;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/8
 * Time:21:17
 */
@Controller
public class TbGoodsDescController {

    @Autowired
    private TbGoodsDescService tbGoodsDescService;

    @RequestMapping("/keysearch.htm/{keyWords}")
    @ResponseBody
    List<TbGoodsDesc> searchKeyWords(String keyWords){

        //String str ="法国";
        List<Word> words = WordSegmenter.seg(keyWords);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWords(words);

        return sesorce;
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
