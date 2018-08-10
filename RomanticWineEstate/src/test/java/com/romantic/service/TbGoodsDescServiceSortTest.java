package com.romantic.service;

import com.romantic.pojo.TbGoodsDesc;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/10
 * Time:19:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-mybatis.xml",
        "classpath:spring-mvc.xml"})


public class TbGoodsDescServiceSortTest {

    @Autowired
    private TbGoodsDescService tbGoodsDescService;

    @Test
    public void searchKeyWordsByPrice() {

        String str ="法国";
        List<Word> words = WordSegmenter.seg(str);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWordsByPrice(words);

    }

    @Test
    public void searchKeyWordsBysellNum() {

        String str ="法国";
        List<Word> words = WordSegmenter.seg(str);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWordsBysellNum(words);

    }
}