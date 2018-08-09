package com.romantic.dao;

import com.romantic.pojo.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/9
 * Time:15:02
 * -------------------------------------
 * 评论表的Dao层测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestCommentDao {
    @Resource
    CommentMapper commentMapper;

    @Test
    public void testInsertGoodsComment() {
        Comment comment = new Comment();
        comment.setCommentId("003");
        comment.setUserId("002");
        comment.setGoodsId("001");
        comment.setUserName("周祎辰");
        comment.setGrade("5");
        comment.setComment("物美价廉");
        comment.setPicAddress("001.png");
        comment.setPrefixMatch("a-b-c-d");
        comment.setLikeNumber(101);
        comment.setCreateTime(new Date());
        comment.setIsAlive("1");

        System.out.println(comment);
        Integer a = commentMapper.insertGoodsComment(comment);
        System.out.println(a);
    }

    @Test
    public void testDeleteGoodsComment() {
        Comment comment = new Comment();
        comment.setCommentId("001");
        comment.setUserId("001");
        comment.setGoodsId("001");
        Integer b = commentMapper.deleteGoodsComment(comment);
        System.out.println(b);
    }

    @Test
    public void testDeleteCommentReply() {
        Comment comment = new Comment();
        comment.setCommentId("002");
        Integer b = commentMapper.deleteCommentReply(comment);
        System.out.println(b);
    }

    @Test
    public void testSelectGoodsAllComments() {

        List<Comment> list = commentMapper.selectGoodsAllComments("001");
        for (Comment a : list) {
            System.out.println(a);
        }
    }

    @Test
    public void testSelectCommentAllReply() {
        Comment comment = new Comment();
        comment.setParentCommentId("111");
        comment.setGoodsId("001");
        List<Comment> list = commentMapper.selectCommentAllReply(comment);
        for (Comment a : list) {
            System.out.println(a);
        }
    }

}
