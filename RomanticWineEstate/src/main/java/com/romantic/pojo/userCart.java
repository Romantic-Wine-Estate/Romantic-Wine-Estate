package com.romantic.pojo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/8
 * Time:0:36
 *
 *一个用户的购物车
 */

public class userCart {
    private List<TbCart> tbCarts;
    private String userId;
    private BigDecimal allPrice;

    public List<TbCart> getTbCarts() {
        return tbCarts;
    }

    public void setTbCarts(List<TbCart> tbCarts) {
        this.tbCarts = tbCarts;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(BigDecimal allPrice) {
        this.allPrice = allPrice;
    }

    @Override
    public String toString() {
        return "userCart{" +
                "tbCarts=" + tbCarts +
                ", userId='" + userId + '\'' +
                ", allPrice=" + allPrice +
                '}';
    }
}

