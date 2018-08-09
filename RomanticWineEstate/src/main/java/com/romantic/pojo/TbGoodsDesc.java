package com.romantic.pojo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/7
 * Time:22:56
 */
public class TbGoodsDesc {
    private int goodsId;
    private String smallPic;
    private String goodsTitle;private long sellNum;

    private double goodsPrice;

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public long getSellNum() {
        return sellNum;
    }

    public void setSellNum(long sellNum) {
        this.sellNum = sellNum;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "TbGoodsDesc{" +
                "goodsId=" + goodsId +
                ", smallPic='" + smallPic + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", sellNum=" + sellNum +
                ", goodsPrice=" + goodsPrice +
                '}';
    }

    public static List<TbGoodsDesc> sortByPrice(List<TbGoodsDesc> list) {
        Collections.sort(list, new Comparator<TbGoodsDesc>() {
            @Override
            public int compare(TbGoodsDesc o1, TbGoodsDesc o2) {
                if (o1.goodsPrice <= o2.goodsPrice)
                    return -1;
                else
                    return 1;
            }
        });
        return list;
    }

    public static List<TbGoodsDesc> sortBySellNum(List<TbGoodsDesc> list) {
        Collections.sort(list, new Comparator<TbGoodsDesc>() {
            @Override
            public int compare(TbGoodsDesc o1, TbGoodsDesc o2) {
                if (o1.sellNum >= o2.sellNum)
                    return -1;
                else
                    return 1;
            }
        });
        return list;
    }
}
