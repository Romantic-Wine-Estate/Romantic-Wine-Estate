package com.romantic.pojo;
/**
 * Create with IntelliJ IDEA
 * Author:Songwenjing
 * Date:2018/8/7
 * Time:22:56
 */
public class TbGoodsDesc {
    private String smallPic;
    private String goodsTitle;
    private long sellNum;
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

    @Override
    public String toString() {
        return "TbGoodDesc{" +
                "smallPic='" + smallPic + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", sellNum=" + sellNum +
                ", goodsPrice=" + goodsPrice +
                '}';
    }
}
