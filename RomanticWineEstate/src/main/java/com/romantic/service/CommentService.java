package com.romantic.service;

import com.romantic.pojo.Comment;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:12:45
 * -------------------------------------
 * 评论模块的接口
 */
public interface CommentService {
    /**
     * 给一个商品添加第一条评论
     * @param comment
     * @return 是否操作成功
     */
    Integer addGoodsComment(Comment comment);

    /**
     * 给一个商品评论增加回复
     * @param comment
     * @return 是否操作成功
     */
    Integer addCommentReply(Comment comment);

    /**
     * 用户删除自己的商品评论
     * @param comment
     * @return 是否操作成功
     */
    Integer deleteGoodsComment(Comment comment);

    /**
     * 用户删除自己商品评论下面的一条回复
     * @param comment
     * @return 是否操作成功
     */
    Integer deleteCommentReply(Comment comment);

    /**
     * 查询一个商品下面的所有评论（不包括评论的回复）
     * @param goodsId 商品id
     * @return 返回一个商品下的所有评论
     */
    List<Comment> queryGoodsAllComments(String goodsId);

    /**
     * 查询一个商品评论下面的所有回复
     * @param goodsId 商品id
     * @param commentId 商品评论id
     * @return 返回一个评论下的所有回复
     */
    List<Comment> queryCommentAllReply(String goodsId,String commentId);
}

