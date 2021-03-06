package com.romantic.service.imp;

import com.romantic.dao.TbCartDao;
import com.romantic.pojo.TbCart;
import com.romantic.service.TbCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:17:02
 */
@Service
public class TbCartServiceImp implements TbCartService {
    @Autowired
    TbCartDao tbCartDao;
    @Override
    public TbCart selectById(int id) {
        return tbCartDao.selectById(id);
    }

    @Override
    public List<TbCart> selectByUserId(String userId) {
        return tbCartDao.selectByUserId(userId);
    }

    @Override
    public void insertGoods(String userId, String goodsId, int goodsNum) {
        tbCartDao.insertGoods(userId,goodsId,goodsNum,new Date());
    }

    @Override
    public boolean hasGoods(String userId, String goodsId) {
        return tbCartDao.hasGoods(userId,goodsId)==null?false:true;
    }

    //更新商品数量，查询购物车中该商品数量，然后加上添加的数量
    @Override
    public void updateGoodsNum(String userId, String goodsId, int goodsNum) {
        TbCart tbCart=tbCartDao.hasGoods(userId,goodsId);
        goodsNum=tbCart.getGoodsNum()+goodsNum;
        tbCartDao.updateGoodsNum(userId,goodsId,goodsNum);
    }
//    @Override
//    public boolean isEnough(String goodsId, int goodsNum) {
//        Product product=tbCartDao.queryProductStock(goodsId);
//        return product.getStockNum()>=goodsNum?true:false;
//    }

    @Override
    public void choose(String userId,char amount) {
        tbCartDao.choose(userId,amount);
    }

    @Override
    public void chooseSingle(String userId, String goodsId) {

        tbCartDao.chooseSingle(userId,goodsId);
    }

    @Override
    public void delete(String userId) {
        tbCartDao.deleteByUserId(userId);
    }
    //计算购物车中选中商品的总价
    @Override
    public BigDecimal calculatePrice(String userId) {
        BigDecimal totalPrice=new BigDecimal("0");
        //通过userId查询到所有被选中的商品，返回List<TbCart>
        //System.out.println("初始值"+totalPrice.toString());
        List<TbCart> carts=tbCartDao.selectByUserIdAndBeChose(userId);
        System.out.println(carts.size());
        //遍历List，通过商品表，查询单件商品的价格，通过TbCart查询该商品件数
        Iterator it=carts.iterator();
        while(it.hasNext())
        {
            //计算该种商品的价格，并追加到之前计算的
            //System.out.println(totalPrice.toString());
            TbCart cart=(TbCart)it.next();
            //BigDecimal singlePrice=tbCartDao.selectPriceByGoodsId(cart.getGoodsId());
            //totalPrice=totalPrice.add(singlePrice.multiply(new BigDecimal(cart.getGoodsNum())));//计算某个商品的总价
            System.out.println(cart.toString());
        }
      return totalPrice;
    }
}

