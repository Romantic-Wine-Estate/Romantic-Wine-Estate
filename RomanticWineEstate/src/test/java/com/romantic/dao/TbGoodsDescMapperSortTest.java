package com.romantic.dao;

import com.romantic.pojo.TbGoodsDesc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Create with IntelliJ IDEA
 * Author:LiNingKang
 * Data:2018/8/10
 * Time:18:37
 */

@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TbGoodsDescMapperSortTest {

    @Resource
    private TbGoodsDescMapper tbGoodsDescMapper;

    @Test
    public void searchKeyWordsByPrice() {

        String str="法国";
        List<TbGoodsDesc> result=tbGoodsDescMapper.searchKeyWordsByPrice(str);
        for (TbGoodsDesc tbGoodsDesc:result)
        {
            System.out.println(result);
        }
    }

    @Test
    public void searchKeyWordsBysellNum() {

        String str="法国";
        List<TbGoodsDesc> result=tbGoodsDescMapper.searchKeyWordsBysellNum(str);
        for (TbGoodsDesc tbGoodsDesc:result)
        {
            System.out.println(result);
        }

    }
}