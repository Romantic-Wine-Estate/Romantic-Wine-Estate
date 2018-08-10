package com.romantic.service.imp;

import com.romantic.dao.TbGoodsDescMapper;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
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
    //李宁康的方法：关键词查找
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
    //李宁康的方法：关键词查找并按价格排序
    public List<TbGoodsDesc> searchKeyWordsByPrice(List<Word> keyWords) {
        List<TbGoodsDesc> result=null;
        Iterator<Word> it=keyWords.iterator();
        while(it.hasNext())
        {
            String aa=it.next().toString();
            result=tbGoodsDescMapper.searchKeyWords(aa);
        }
        return result;
    }
    //李宁康的方法：关键词查找并按销量排序
    public List<TbGoodsDesc> searchKeyWordsBysellNum(List<Word> keyWords) {
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
