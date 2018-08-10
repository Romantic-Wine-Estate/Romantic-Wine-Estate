package com.romantic.service;

import com.romantic.pojo.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/10
 * Time:16:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class CommentServiceTest {

    @Autowired
    private CommentService commentService;

    @Test
    public void addGoodsComment() {
        Comment comment = new Comment();

        //客户端传过来的数据
        comment.setUserId("002");
        comment.setGoodsId("a");
        comment.setGrade("4");
        comment.setComment("卖家态度友好");

        Integer a = commentService.addGoodsComment(comment);
        //成功为1，失败为0
        System.out.println(a);
    }

    @Test
    public void addCommentReply() {
        Comment comment = new Comment();

        //客户端传过来的数据
        comment.setUserId("002");
        comment.setGoodsId("a");
        comment.setGrade("4");
        comment.setComment("评论写的不错");

        Integer b = commentService.addCommentReply(comment);
        //成功为1，失败为0
        System.out.println(b);

    }

    @Test
    public void deleteGoodsComment() {
        Comment comment = new Comment();

        comment.setUserId("001");
        comment.setGoodsId("a");
        comment.setCommentId("00182844");

        Integer c = commentService.deleteGoodsComment(comment);
        //成功为1，失败为0
        System.out.println(c);
    }

    @Test
    public void deleteCommentReply() {

        Comment comment = new Comment();

        comment.setUserId("002");
        comment.setCommentId("003");

        Integer d = commentService.deleteCommentReply(comment);
        //成功为1，失败为0
        System.out.println(d);
    }

    @Test
    public void queryGoodsAllComments() {

        List<Comment> list = commentService.queryGoodsAllComments("a");

        for (Comment a : list) {
            System.out.println("CommentId:"+a.getCommentId()+"\tUserId:"+a.getUserId()+"\tUserName:"+a.getUserName());
        }

    }

    @Test
    public void queryCommentAllReply() {

        Comment comment = new Comment();

        comment.setParentCommentId("111");
        comment.setGoodsId("001");

        List<Comment> list = commentService.queryCommentAllReply(comment);
        if (null!=list) {
            for (Comment a : list) {
                System.out.println("CommentId:"+a.getCommentId()+"\tUserId:"+a.getUserId()+"\tUserName:"+a.getUserName());
            }
        } else {
            System.out.println("list为空");
        }

    }

    @Test
    public void addLikeNum() {
        Integer a = commentService.addLikeNum("00283626","a");
        System.out.println(a);

    }
}