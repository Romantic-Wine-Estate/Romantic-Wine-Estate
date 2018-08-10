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
    CommentDao commentDao;

    @Test
    public void testInsertGoodsComment() {
        Comment comment = new Comment();
        comment.setCommentId("003");
        comment.setUserId("002");
        comment.setGoodsId("001");
        comment.setIsCommentReply("1");
        comment.setParentCommentId("111");
        comment.setUserName("小李");
        comment.setGrade("5");
        comment.setComment("京东快递真的快");
        comment.setPicAddress("001.png");
        comment.setPrefixMatch("a-b-c-d");
        comment.setLikeNumber(101);
        comment.setCreateTime(new Date());
        comment.setIsAlive("1");

        System.out.println(comment);
        Integer a = commentDao.insertGoodsComment(comment);
        System.out.println(a);
    }

    @Test
    public void testDeleteGoodsComment() {
        Comment comment = new Comment();
        comment.setCommentId("001");
        comment.setUserId("002");
        comment.setGoodsId("002");
        Integer b = commentDao.deleteGoodsComment(comment);
        System.out.println(b);
    }

    @Test
    public void testDeleteCommentReply() {
        Comment comment = new Comment();
        comment.setCommentId("001");
        comment.setUserId("002");
        comment.setGoodsId("001");

        Integer b = commentDao.deleteCommentReply(comment);
        System.out.println(b);
    }

    @Test
    public void testSelectGoodsAllComments() {

        List<Comment> list = commentDao.selectGoodsAllComments("001");
        for (Comment a : list) {
            System.out.println(a);
        }
    }

    @Test
    public void testSelectCommentAllReply() {
        Comment comment = new Comment();
        comment.setParentCommentId("111");
        comment.setGoodsId("001");
        List<Comment> list = commentDao.selectCommentAllReply(comment);
        for (Comment a : list) {
            System.out.println(a);
        }
    }

}
