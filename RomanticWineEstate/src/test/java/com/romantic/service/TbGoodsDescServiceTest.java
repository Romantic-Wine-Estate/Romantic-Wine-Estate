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
 * Data:2018/8/9
 * Time:15:02
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-mybatis.xml",
        "classpath:spring-mvc.xml"})
public class TbGoodsDescServiceTest {

    @Autowired
    private TbGoodsDescService tbGoodsDescService;

    @Test
    public void testSearchKeyWords()
    {
        String str ="法国干红葡萄酒";
        List<Word> words = WordSegmenter.seg(str);
        List<TbGoodsDesc> sesorce=tbGoodsDescService.searchKeyWords(words);

    }





}