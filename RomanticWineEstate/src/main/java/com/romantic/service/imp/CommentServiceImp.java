package com.romantic.service.imp;

import com.romantic.dao.CommentMapper;
import com.romantic.pojo.Comment;
import com.romantic.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
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

    @Override
    public Integer addGoodsComment(Comment comment) { return null; }

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
    public List<Comment> queryCommentAllReply(String goodsId, String commentId) {
        return null;
    }
}
