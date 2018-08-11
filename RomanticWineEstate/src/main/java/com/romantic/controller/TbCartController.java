package com.romantic.controller;

import com.romantic.dao.TbCartDao;
import com.romantic.pojo.Product;
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
    @Autowired
    TbCartDao tbCartDao;

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
        //int goodsNum=4;
        boolean lack=false;//默认库存不缺货
       // System.out.println(userId+"\t"+goodsId+"\t"+goodsNum);
        Product product=tbCartDao.queryProductStock(goodsId);//查库存
        if(product.getStockNum()<goodsNum)//库存数量小于所需数量
        {
            goodsNum=product.getStockNum();
            lack=true;//表示缺货
        }
        //先判断用户购物车中是否有该商品
        if(cartService.hasGoods(userId,goodsId)) {
            cartService.updateGoodsNum(userId, goodsId, goodsNum);
        }
        else{
            cartService.insertGoods(userId, goodsId, goodsNum);
        }
        return lack?"lack goods":"add successful";
    }

    //用户购物车中商品全选或取消选择  计算选中价格 需要用户id
    @RequestMapping(value="/select.htm/{userId,amount}")
    @ResponseBody
    public void select(String userId,char amount)
    {
        cartService.choose(userId,amount);
        //计算用户购物车中所有商品的价格
        System.out.println(cartService.calculatePrice(userId));
    }

    //用户购物车中商品单选  计算选中价格 需要用户id
    @RequestMapping(value="/selectSingle.htm/{userId,goodsId}")
    @ResponseBody
    public void selectSingle(String userId,String goodsId)
    {
        cartService.chooseSingle(userId,goodsId);
    }

    //删除用户勾选的全部商品
    @RequestMapping(value="/delete.htm/{userId}")
    @ResponseBody
    public void delete(String userId)
    {
        cartService.delete(userId);
    }
}

