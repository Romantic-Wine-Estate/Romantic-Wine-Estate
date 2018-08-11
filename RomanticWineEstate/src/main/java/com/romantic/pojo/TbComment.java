package com.romantic.pojo;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:10:39
 * --------------------------------------
 * 评论表的实体类
 */
@Component
public class TbComment {
    private Long id;
    private String commentId;
    private String userId;
    private String goodsId;
    private String isCommentReply;  //判断是商品评论还是评论回复：0是商品评论，1是评论回复
    private String parentCommentId; //当前商品评论的回复的父评论id
    private String userName;
    private String grade;   //用户评价的等级:1-5
    private String comment; //评价
    private String picAddress;  //评论图片地址
    private Integer likeNumber; //点赞数
    private String prefixMatch; //评论前缀匹配符
    private Date createTime;
    private Timestamp updateTime;
    private String isAlive; //软删字段 1.存在 0.不存在

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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

    public String getIsCommentReply() {
        return isCommentReply;
    }

    public void setIsCommentReply(String isCommentReply) {
        this.isCommentReply = isCommentReply;
    }

    public String getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getPrefixMatch() {
        return prefixMatch;
    }

    public void setPrefixMatch(String prefixMatch) {
        this.prefixMatch = prefixMatch;
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

    @Override
    public String toString() {
        return "Comment:[id:"+id+"\tcommentId:"+commentId+"\tuserId:"+userId+"\tgoodsId:"+goodsId+"\tuserName:"+userName+"\tgrade:"+grade+"\tcomment:"+comment+"]";
    }
}
