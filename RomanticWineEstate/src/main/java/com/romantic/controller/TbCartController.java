package com.romantic.controller;

import com.romantic.pojo.TbCart;
import com.romantic.service.TbCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:16:42
 */
@Controller
public class TbCartController {

    @Autowired
    private TbCartService cartService;

    //通过购物车表的唯一主键进行查询
    @RequestMapping(value="/querybyid.htm/{id}",method = RequestMethod.GET)
    @ResponseBody
    public TbCart queryById(int id){
        TbCart tbCart=cartService.selectById(id);
        System.out.println(tbCart.toString());
        return tbCart;
    }

    //通过用户Id来查询用户的购物车，可列出购物车列表
    @RequestMapping(value="/querybyuserid.htm/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public List<TbCart> queryByUserId(String userId){
        return cartService.selectByUserId(userId);
    }

    //向购物车中添加商品
    @RequestMapping(value="/addGoods.htm/{userId,goodsId,goodsNum}",method = RequestMethod.GET)
    @ResponseBody
    public String addGoods(String userId,String goodsId,int goodsNum){
        //先判断该用户的购物车中是否有该商品
        if(cartService.hasGoods(userId,goodsId))
        {
            cartService.updateGoodsNum(userId, goodsId, goodsNum);
        }
        else {
            cartService.insertGoods(userId, goodsId, goodsNum);
        }
        return "hello";
    }

}

