package com.romantic.service.imp;

import com.romantic.dao.CommentDao;
import com.romantic.pojo.Comment;
import com.romantic.service.CommentService;
import com.romantic.utils.GetNBitRandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/8
 * Time:19:48
 * ------------------------
 * 评论模块的实现类
 */
@Service
public class CommentServiceImp implements CommentService {

    @Autowired
    private CommentDao commentDao;

    /**
     * 给一个商品添加一条评论
     * @param comment
     * @return 是否操作成功
     */
    @Override
    public Integer addGoodsComment(Comment comment) {
        Integer ifsuccess=null;
        if (null!=comment) {
            //生成评论id：用户id+5位随机数
            comment.setCommentId(comment.getUserId()+GetNBitRandomNumber.generateRandomNumber(5));
            comment.setIsCommentReply("0");
            comment.setParentCommentId(null);
            //设置用户姓名（留空待补全）
            comment.setUserName("Tom");
            comment.setPicAddress("待补全");
            comment.setLikeNumber(0);
            comment.setPrefixMatch(null);
            comment.setCreateTime(new Date());
            comment.setIsAlive("1");

            ifsuccess = commentDao.insertGoodsComment(comment);

        } else {
            System.out.println("Error::给一个商品添加一条评论::Controller层传入Service层的数据为空");
        }

        return ifsuccess;
    }

    /**
     * 给一个商品评论增加回复
     * @param comment
     * @return 是否操作成功
     */
    @Override
    public Integer addCommentReply(Comment comment) {
        Integer ifsuccess=null;
        if (null!=comment) {
            //生成评论id：用户id+5位随机数
            comment.setCommentId(comment.getUserId()+GetNBitRandomNumber.generateRandomNumber(5));

            //IsCommentReply和ParentCommentId等前端交互
            comment.setIsCommentReply("1");
            //comment.setParentCommentId("");
            //设置用户姓名（留空待补全）
            comment.setUserName("王五");
            comment.setPicAddress("待补全");
            comment.setLikeNumber(0);
            comment.setPrefixMatch(null);
            comment.setCreateTime(new Date());
            comment.setIsAlive("1");

            ifsuccess = commentDao.insertCommentReply(comment);
        } else {
            System.out.println("Error::给一个商品评论增加回复::Controller层传入Service层的数据为空");
        }
        return ifsuccess;
    }

    /**
     * 用户删除自己的商品评论
     * @param comment
     * @return 是否操作成功
     */
    @Override
    public Integer deleteGoodsComment(Comment comment) {
        Integer ifsuccess=null;
        if (null!=comment) {
            ifsuccess = commentDao.deleteGoodsComment(comment);
        } else {
            System.out.println("Error::用户删除自己的商品评论::Controller层传入Service层的数据为空");
        }

        return ifsuccess;
    }

    /**
     * 用户删除自己商品评论下面的一条回复
     * @param comment
     * @return 是否操作成功
     */
    @Override
    public Integer deleteCommentReply(Comment comment) {

        Integer ifsuccess=null;
        if (null!=comment) {
            ifsuccess = commentDao.deleteCommentReply(comment);
        } else {
            System.out.println("Error::用户删除自己商品评论下面的一条回复::Controller层传入Service层的数据为空");
        }

        return ifsuccess;
    }

    /**
     * 查询一个商品下面的所有评论（不包括评论的回复）
     * @param goodsId 商品id
     * @return 返回一个商品下的所有评论
     */
    @Override
    public List<Comment> queryGoodsAllComments(String goodsId) {

        List<Comment> list = new ArrayList<>();
        if (null!=goodsId) {
            list = commentDao.selectGoodsAllComments(goodsId);
        } else {
            System.out.println("Error::查询一个商品下面的所有评论（不包括评论的回复）::Controller层传入Service层的数据为空");
        }

        return list;
    }

    /**
     * 查询一个商品评论下面的所有回复
     * @param comment
     * @return 返回一个评论下的所有回复
     */
    @Override
    public List<Comment> queryCommentAllReply(Comment comment) {

        List<Comment> list = new ArrayList<>();
        if (null!=comment) {
            list = commentDao.selectCommentAllReply(comment);
        } else {
            System.out.println("Error::查询一个商品评论下面的所有回复::Controller层传入Service层的数据为空");
        }

        return list;
    }

    /**
     * 用户给一个商品下面的一条商品评论
     * @param commentId 评论id
     * @param goodsId 商品id
     * @return 是否点赞成功
     */
    @Override
    public Integer addLikeNum(String commentId, String goodsId) {

        Integer ifsuccess = commentDao.addCommentLikeNum(commentId,goodsId);
        return ifsuccess;
    }
}
