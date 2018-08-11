package com.romantic.dao;

import com.romantic.pojo.TbOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Create with IntelliJ IDEA
 * Author: liufugen
 * Date:{2018/8/11}
 * Time:{13:09}
 */
@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})

public class TbOrderDaoTest {

    @Resource
    private TbOrderDao tbOrderDao;

    @Test
    public void selectByOrderIdAndUserId() {
        TbOrder tbOrder=tbOrderDao.selectByOrderIdAndUserId("1","5555");
        System.out.println(tbOrder.toString());
    }
}