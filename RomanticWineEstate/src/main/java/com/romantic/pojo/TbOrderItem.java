package com.romantic.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/7
 * Time:17:00
 * To change this template use File | Settings | File Templates.
 */
//订单中商品详细信息表
public class TbOrderItem {
    private Integer id;
    private String goodsId;
    private String orderNum;
    private Integer num;
    private BigDecimal totalFee;
    private Date createTime;
    private Timestamp updateTime;
    private String isAlive;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(String isAlive) {
        this.isAlive = isAlive;
    }
}
