package com.romantic.service;

import com.romantic.pojo.TbComment;

import java.io.File;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:12:45
 * -------------------------------------
 * 评论模块的接口
 */
public interface TbCommentService {
    /**
     * 给一个商品添加一条评论
     * @param tbComment
     * @return 是否操作成功
     */
    Integer addGoodsComment(TbComment tbComment, List<File> fileList);

    /**
     * 给一个商品评论增加回复
     * @param tbComment
     * @return 是否操作成功
     */
    Integer addCommentReply(TbComment tbComment);

    /**
     * 用户删除自己的商品评论
     * @param tbComment
     * @return 是否操作成功
     */
    Integer deleteGoodsComment(TbComment tbComment);

    /**
     * 用户删除自己商品评论下面的一条回复
     * @param tbComment
     * @return 是否操作成功
     */
    Integer deleteCommentReply(TbComment tbComment);

    /**
     * 查询一个商品下面的所有评论（不包括评论的回复）
     * @param goodsId 商品id
     * @return 返回一个商品下的所有评论
     */
    List<TbComment> queryGoodsAllComments(String goodsId);

    /**
     * 查询一个商品评论下面的所有回复
     * @param tbComment
     * @return 返回一个评论下的所有回复
     */
    List<TbComment> queryCommentAllReply(TbComment tbComment);

    /**
     * 用户给一个商品下面的一条商品评论点赞
     * @param commentId 评论id
     * @param goodsId 商品id
     * @return 是否点赞成功
     */
    Integer addLikeNum(String commentId, String goodsId);
}

