package com.romantic.dao;

import com.romantic.pojo.TbGoodsDesc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * IntelliJ IDEA
 * Author:Hu HaoRan
 * <p>
 * Data:2018-08-08
 * Time:17:51
 */
@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class HHRTest02 {
    @Resource
    private TbGoodsDescMapper tbGoodsDescMapper;
    @Test
    public void testQueryById(){
        String id = "1";
        System.out.println(123);
        System.out.println(tbGoodsDescMapper);
//        TbGoodsDesc tbGoodsDesc = tbGoodsDescMapper.queryByGoodsId(id);
        System.out.println(tbGoodsDescMapper.queryByGoodsId(id).toString());
    }
}
