package com.romantic.dao;

import com.romantic.pojo.TbComment;
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
public class TbCommentDaoTest {
    @Resource
    TbCommentDao tbCommentDao;

    @Test
    public void testInsertGoodsComment() {
        TbComment tbComment = new TbComment();
        tbComment.setCommentId("003");
        tbComment.setUserId("002");
        tbComment.setGoodsId("001");
        tbComment.setIsCommentReply("1");
        tbComment.setParentCommentId("111");
        tbComment.setUserName("小李");
        tbComment.setGrade("5");
        tbComment.setComment("京东快递真的快");
        tbComment.setPicAddress("001.png");
        tbComment.setPrefixMatch("a-b-c-d");
        tbComment.setLikeNumber(101);
        tbComment.setCreateTime(new Date());
        tbComment.setIsAlive("1");

        System.out.println(tbComment);
        Integer a = tbCommentDao.insertGoodsComment(tbComment);
        System.out.println(a);
    }

    @Test
    public void testDeleteGoodsComment() {
        TbComment tbComment = new TbComment();
        tbComment.setCommentId("001");
        tbComment.setUserId("002");
        tbComment.setGoodsId("002");
        Integer b = tbCommentDao.deleteGoodsComment(tbComment);
        System.out.println(b);
    }

    @Test
    public void testDeleteCommentReply() {
        TbComment tbComment = new TbComment();
        tbComment.setCommentId("001");
        tbComment.setUserId("002");
        tbComment.setGoodsId("001");

        Integer b = tbCommentDao.deleteCommentReply(tbComment);
        System.out.println(b);
    }

    @Test
    public void testSelectGoodsAllComments() {

        List<TbComment> list = tbCommentDao.selectGoodsAllComments("001");
        for (TbComment a : list) {
            System.out.println(a);
        }
    }

    @Test
    public void testSelectCommentAllReply() {
        TbComment tbComment = new TbComment();
        tbComment.setParentCommentId("111");
        tbComment.setGoodsId("001");
        List<TbComment> list = tbCommentDao.selectCommentAllReply(tbComment);
        for (TbComment a : list) {
            System.out.println(a);
        }
    }

}
