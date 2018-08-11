package com.romantic.dao;

import com.romantic.pojo.TbComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:15:52
 * ---------------------------------------
 * 评论模块的dao层接口
 */
public interface TbCommentDao {

    /**
     * 插入一条商品评论
     * @param tbComment
     * @return 是否插入成功
     */
    Integer insertGoodsComment(TbComment tbComment);

    /**
     * 插入一条商品评论的回复
     * @param tbComment
     * @return 是否插入成功
     */
    Integer insertCommentReply(TbComment tbComment);

    /**
     * 删除一条商品评论（同时删除这条商品评论底下的所有回复，软删）
     * @param tbComment
     * @return 是否删除成功
     */
    Integer deleteGoodsComment(TbComment tbComment);

    /**
     * 删除一条商品评论的回复(软删)
     * @param tbComment
     * @return 是否删除成功
     */
    Integer deleteCommentReply(TbComment tbComment);

    /**
     * 查询一种商品底下的全部商品评论
     * @param goodsId 商品id
     * @return 当前商品下的全部商品评论
     */
    List<TbComment> selectGoodsAllComments(@Param("goodsId") String goodsId);

    /**
     * 查询一条商品评论底下的所有回复
     * @param tbComment
     * @return 当前商品评论下的所有回复
     */
    List<TbComment> selectCommentAllReply(@Param("comment") TbComment tbComment);

    /**
     * 用户给一个商品下面的一条商品评论点赞
     * @param commentId 评论id
     * @param goodsId 商品id
     * @return 是否点赞成功
     */
    Integer addCommentLikeNum(@Param("commentId") String commentId, @Param("goodsId") String goodsId);
}
