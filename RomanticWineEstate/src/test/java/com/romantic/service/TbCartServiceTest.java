package com.romantic.service;

import com.romantic.pojo.TbCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:16:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"/spring-mybatis.xml"})
public class TbCartServiceTest {
    @Autowired
    private TbCartService cartService;
    @Test
    public void testqueryById(){
        int id=3;
        if(cartService.selectById(id)!=null)
        {
            System.out.println(cartService.selectById(id).toString());
        }
        else{
            System.out.println("未找到");
            System.out.println(new TbCart().toString());
        }
    }
    @Test
    public void addGoods()
    {
        String userId="000007";
        String goodsId="12346";
        int goodsNum=5;
        if(cartService.hasGoods(userId,goodsId))
        {
            cartService.updateGoodsNum(userId, goodsId, goodsNum);
        }
        else {
            cartService.insertGoods(userId, goodsId, goodsNum);
        }
    }
    @Test
    public void selectByUserId()
    {
        List<TbCart> tbCarts=cartService.selectByUserId("000002");
        Iterator it=tbCarts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().toString());
        }
    }
    //计算用户选中的商品的总价
    @Test
    public void  calculatePrice()
    {
        System.out.println(cartService.calculatePrice("000002").toString());
    }

}
