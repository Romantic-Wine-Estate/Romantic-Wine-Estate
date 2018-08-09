package com.romantic.dao;
import com.romantic.pojo.register;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration(value = {"classpath:spring-mybatis.xml"})
public class Testregist {
        @Resource
        private registerMapper people1;
        @Test
        public void textcreateregister() {
            String userid = "5689522" ;
            String registerName= "哈哈";
            String registerpassword= "hahaha";
            String registerMoblie= "15829103657";
            String registerEmail="939291105@qq.com";

            register tbProvinces =people1.createregister(
                     userid,registerName,registerpassword,registerMoblie,registerEmail
            );

            System.out.println(tbProvinces.toString());
        }
}
