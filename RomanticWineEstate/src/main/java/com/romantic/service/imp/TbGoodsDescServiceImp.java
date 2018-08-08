package com.romantic.service.imp;

import com.romantic.dao.TbGoodsDescMapper;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/8
 * Time:21:28
 */
@Service
public class TbGoodsDescServiceImp implements TbGoodsDescService {
    @Autowired
    private TbGoodsDescMapper tbGoodsDescMapper;

    @Override
    public List<TbGoodsDesc> searchKeyWords(String keyWords) {

        String str="法国赤霞珠干红葡萄酒";
        List<Word> words = WordSegmenter.seg("str");
        System.out.println(words);




        return tbGoodsDescMapper.searchKeyWords(keyWords);
    }
}
