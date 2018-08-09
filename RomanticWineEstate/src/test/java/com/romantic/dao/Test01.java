package com.romantic.dao;

import com.romantic.pojo.TbCities;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Authot:{Lenovo}
 * Date:{2018/8/4}{18:39}
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration(value = {"classpath:spring-mybatis.xml"})
public class Test01 {
    @Resource
    private TbCitiesMapper tb_provincesDao;
    @Test
    public void testqueryById() {
        String  cityId="110200";
        TbCities tbProvinces =tb_provincesDao.queryByCityId(cityId);
        System.out.println(tbProvinces.toString());
    }

    @Test
    public void test() {
        System.out.println(Math.random());
        System.out.println(Math.random()*9);
        System.out.println(Math.random()+9+1);
        System.out.println((Math.random()*9+1)*100000);
    }
}
