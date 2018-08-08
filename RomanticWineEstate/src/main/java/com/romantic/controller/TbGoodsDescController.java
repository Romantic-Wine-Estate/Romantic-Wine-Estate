package com.romantic.controller;

import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("/keysearch/{keyWords}")

    @ResponseBody
    List<TbGoodsDesc> searchKeyWords(String keyWords){
        return tbGoodsDescService.searchKeyWords(keyWords);
    }




}
