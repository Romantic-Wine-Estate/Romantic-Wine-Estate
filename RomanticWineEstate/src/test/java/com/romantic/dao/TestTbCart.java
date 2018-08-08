package com.romantic.dao;

import com.romantic.pojo.TbCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:16:42
 */
@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestTbCart {
    @Resource
    private TbCartDao cartDao;
    @Test
    public void testqueryById() {
        TbCart tbCart =cartDao.selectById(1);
        if(tbCart !=null){
            System.out.println(tbCart.toString());
        }
        else
            System.out.println("未查到");
    }
    @Test
    public void selectByUserId()
    {
        List<TbCart> tbCarts =cartDao.selectByUserId("000006");
        System.out.println("***************************");
        Iterator<TbCart> it= tbCarts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }

    }
    @Test
    public void addGoods()
    {
        cartDao.insertGoods("000006","12345",4,new Date());
        System.out.println("***************************************");
    }

}
