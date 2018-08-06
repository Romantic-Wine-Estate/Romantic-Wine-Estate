package com.romantic.service;

import com.romantic.service.imp.TbCitiesServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Authot:{Lenovo}
 * Date:{2018/8/4}{23:25}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"/spring-mybatis.xml"})
public class Test01 {
    @Autowired
    private TbCitiesServiceImp tbCitiesServiceImp;
    @Test
    public void TestService(){
//        tbCitiesServiceImp.queryByCityId("110100");
        System.out.println(tbCitiesServiceImp.queryByCityId("110100").toString());
    }
}
