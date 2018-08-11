package com.romantic.dao;

import com.romantic.pojo.Product;
import com.romantic.pojo.TbCart;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:16:42
 */
public interface TbCartDao {
    //通过数据表的id来查询数据
    TbCart selectById(int id);
    //通过用户名的id来查询
    List<TbCart> selectByUserId(String userId);
    //添加商品
    void insertGoods(@Param("userId") String userId, @Param("goodsId") String goodsId, @Param("goodsNum") int goodsNum, @Param("createTime") Date creatTime);
    TbCart hasGoods(@Param("userId") String userId, @Param("goodsId") String goodsId);
    //更新商品数量
    void updateGoodsNum(@Param("userId") String userId, @Param("goodsId") String goodsId, @Param("goodsNum") int goodsNum);
    //查询商品的库存数量
    Product queryProductStock(String goodsId);
    //全选
    void choose(@Param("userId") String userId, @Param("amount") char amount);
    //选中单件商品
    void chooseSingle(@Param("userId") String userId, @Param("goodsId") String goodsId);
    //软删除购物车中选中的商品
    void deleteByUserId(@Param("userId") String userId);
    List<TbCart> selectByUserIdAndBeChose(String userId);
    //通过goodsId来查询商品的价格
    BigDecimal selectPriceByGoodsId(String goodsId);


}
