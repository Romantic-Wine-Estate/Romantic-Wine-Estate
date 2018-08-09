package com.romantic.service.imp;

import com.romantic.dao.CommentMapper;
import com.romantic.pojo.Comment;
import com.romantic.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private CommentMapper commentMapper;

    /**
     * 给一个商品添加一条评论
     * @param comment
     * @return 是否操作成功
     */
    @Override
    public Integer addGoodsComment(Comment comment) {
        if (null!=comment) {
         //   comment.setCommentId(new Date());

        } else {
            System.out.println("Controller层传入Service层数据为空");

        }

        return null;
    }

    @Override
    public Integer addCommentReply(Comment comment) {
        return null;
    }

    @Override
    public Integer deleteGoodsComment(Comment comment) {
        return null;
    }

    @Override
    public Integer deleteCommentReply(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> queryGoodsAllComments(String goodsId) {
        return null;
    }

    @Override
    public List<Comment> queryCommentAllReply(Comment comment) {
        return null;
    }
}
