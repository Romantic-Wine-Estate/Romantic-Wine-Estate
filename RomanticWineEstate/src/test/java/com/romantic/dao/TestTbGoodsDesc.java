
package com.romantic.dao;
import com.romantic.pojo.TbGoodsDesc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/8
 * Time:11:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestTbGoodsDesc {
    @Resource
    private TbGoodsDescMapper tbGoodsDescMapper;

    @Test
    public void queryByPlaceOfArea() {

       List<TbGoodsDesc> tbGoodsDesc=tbGoodsDescMapper.queryByPlaceOfArea("法国");
        Iterator it=tbGoodsDesc.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    @Test
    public void queryByTaste() {
        List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescMapper.queryByTaste("平衡");
        Iterator it = tbGoodsDescs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }


    @Test
    public void queryByCategory() {
        List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescMapper.queryByCategory("红葡萄酒");
        Iterator it = tbGoodsDescs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }


    @Test
    public void queryGoodsPrice1() {
        List<TbGoodsDesc> tbGoodsDescs = tbGoodsDescMapper.queryByGoodsPrice1(10,1000);
        Iterator it = tbGoodsDescs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}

