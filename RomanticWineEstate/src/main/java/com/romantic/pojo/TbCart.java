package com.romantic.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2018/8/7
 * Time:15:34
 */
public class TbCart {
    //对应数据库的字段
    private int id;
    private String userId;
    private String goodsId;
    private int goodsNum;
    private Date createTime;
    private Date updateTime;
    private char isAlive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public char getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(char isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "TbCart{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsNum=" + goodsNum +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isAlive=" + isAlive +
                '}';
    }
}
