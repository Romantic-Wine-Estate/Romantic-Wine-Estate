package com.romantic.dao;

import com.romantic.pojo.Comment;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:15:52
 * ---------------------------------------
 * 评论模块的dao层接口
 */
public interface CommentMapper {

    /**
     * 插入一条商品评论
     * @param comment
     * @return 是否插入成功
     */
    Integer insertGoodsComment(Comment comment);

    /**
     * 插入一条商品评论的回复
     * @param comment
     * @return 是否插入成功
     */
    Integer insertCommentReply(Comment comment);

    /**
     * 删除一条商品评论（同时删除这条商品评论底下的所有回复）
     * @param comment
     * @return 是否删除成功
     */
    Integer deleteGoodsComment(Comment comment);

    /**
     * 删除一条商品评论的回复
     * @param comment
     * @return 是否删除成功
     */
    Integer deleteCommentReply(Comment comment);

    /**
     * 查询一种商品底下的全部商品评论
     * @param goodsId 商品id
     * @return 当前商品下的全部商品评论
     */
    List<Comment> selectGoodsAllComments(String goodsId);

    /**
     * 查询一条商品评论底下的所有回复
     * @param goodsId 商品id
     * @param commentId 商品评论id
     * @return 当前商品评论下的所有回复
     */
    List<Comment> selectCommentAllReply(String goodsId,String commentId);





}
