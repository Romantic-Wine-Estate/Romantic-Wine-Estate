package com.romantic.service;

import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.imp.TbGoodsDescServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/8
 * Time:17:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"/spring-mybatis.xml"})
public class TestTbGoodsDesc {
    @Autowired
    private TbGoodsDescServiceImp tbGoodsDescServiceImp;
    @Test
    public void queryByPlaceOfArea() {
        List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescServiceImp.queryByPlaceOfArea("法国");
        Iterator it = tbGoodsDescs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    @Test
    public void queryByTaste() {
        List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescServiceImp.queryByTaste("平衡");
        Iterator it = tbGoodsDescs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

        @Test
        public void queryByCategory () {
            List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescServiceImp.queryByCategory("红葡萄酒");
            Iterator it = tbGoodsDescs.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }


    @Test
    public void queryGoodsPrice1() {
        List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescServiceImp.queryByGoodsPrice1("10-1000");
        Iterator it = tbGoodsDescs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    }



