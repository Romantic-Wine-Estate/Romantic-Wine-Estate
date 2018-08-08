package com.romantic.dao;

import com.romantic.pojo.TbCart;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.TCKind;

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
    void insertGoods(@Param("userId")String userId, @Param("goodsId")String goodsId, @Param("goodsNum")int goodsNum, @Param("createTime")Date creatTime);
    TbCart hasGoods(@Param("userId") String userId, @Param("goodsId") String goodsId);
    //更新商品数量
    void updateGoodsNum(@Param("userId")String userId, @Param("goodsId")String goodsId, @Param("goodsNum")int goodsNum);


}
