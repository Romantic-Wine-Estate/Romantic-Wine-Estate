package com.romantic.service.imp;

import com.romantic.dao.TbGoodsDescMapper;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
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
    public List<TbGoodsDesc> searchKeyWords(List<Word> keyWords) {
        List<TbGoodsDesc> result=null;
        Iterator<Word> it=keyWords.iterator();
        while(it.hasNext())
        {
            String aa=it.next().toString();
            result=tbGoodsDescMapper.searchKeyWords(aa);
        }

        return result;
    }
}
