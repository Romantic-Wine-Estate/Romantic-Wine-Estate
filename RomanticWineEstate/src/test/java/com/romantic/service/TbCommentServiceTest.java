package com.romantic.service;

import com.romantic.pojo.TbComment;
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
public class TbCommentServiceTest {

    @Autowired
    private TbCommentService tbCommentService;

    @Test
    public void addGoodsComment() {
        TbComment tbComment = new TbComment();

        //客户端传过来的数据
        tbComment.setUserId("002");
        tbComment.setGoodsId("c");
        tbComment.setGrade("4");
        tbComment.setComment("卖家态度友好");

        //Integer a = tbCommentService.addGoodsComment(tbComment);
        //成功为1，失败为0
        //System.out.println(a);
    }

    @Test
    public void addCommentReply() {
        TbComment tbComment = new TbComment();

        //客户端传过来的数据
        tbComment.setUserId("003");
        tbComment.setGoodsId("b");
        tbComment.setGrade("4");
        tbComment.setComment("评论写的不错");

        Integer b = tbCommentService.addCommentReply(tbComment);
        //成功为1，失败为0
        System.out.println(b);

    }

    @Test
    public void deleteGoodsComment() {
        TbComment tbComment = new TbComment();

        tbComment.setUserId("001");
        tbComment.setGoodsId("a");
        tbComment.setCommentId("00182844");

        Integer c = tbCommentService.deleteGoodsComment(tbComment);
        //成功为1，失败为0
        System.out.println(c);
    }

    @Test
    public void deleteCommentReply() {

        TbComment tbComment = new TbComment();

        tbComment.setUserId("002");
        tbComment.setCommentId("003");

        Integer d = tbCommentService.deleteCommentReply(tbComment);
        //成功为1，失败为0
        System.out.println(d);
    }

    @Test
    public void queryGoodsAllComments() {

        List<TbComment> list = tbCommentService.queryGoodsAllComments("a");

        for (TbComment a : list) {
            System.out.println("CommentId:"+a.getCommentId()+"\tUserId:"+a.getUserId()+"\tUserName:"+a.getUserName()+"\tCreatetime:"+a.getCreateTime());
        }

    }

    @Test
    public void queryCommentAllReply() {

        TbComment tbComment = new TbComment();

        tbComment.setParentCommentId("111");
        tbComment.setGoodsId("001");

        List<TbComment> list = tbCommentService.queryCommentAllReply(tbComment);
        if (null!=list) {
            for (TbComment a : list) {
                System.out.println("CommentId:"+a.getCommentId()+"\tUserId:"+a.getUserId()+"\tUserName:"+a.getUserName());
            }
        } else {
            System.out.println("list为空");
        }

    }

    @Test
    public void addLikeNum() {
        Integer a = tbCommentService.addLikeNum("00283626","a");
        System.out.println(a);

    }
}