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
@RequestMapping("/search")
public class TbGoodsDescController {

    @Autowired
    private TbGoodsDescService tbGoodsDescService;
    //李宁康的方法：关键词查找
    @RequestMapping("/keysearch.htm/{keyWords}")
    @ResponseBody
    List<TbGoodsDesc> searchKeyWords(String keyWords){

        List<Word> words = WordSegmenter.seg(keyWords);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWords(words);

        return sesorce;
    }
    //李宁康的方法：关键词查找并按价格排序
    @RequestMapping("/keysearchByPrice.htm/{keyWords}")
    @ResponseBody
    List<TbGoodsDesc> searchKeyWordsByPrice(String keyWords){

        List<Word> words = WordSegmenter.seg(keyWords);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWords(words);

        return sesorce;
    }
    //李宁康的方法：关键词查找并按销量排序
    @RequestMapping("/keysearchBysellNum.htm/{keyWords}")
    @ResponseBody
    List<TbGoodsDesc> searchKeyWordsBysellNum(String keyWords){

        List<Word> words = WordSegmenter.seg(keyWords);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWords(words);

        return sesorce;
    }

}
