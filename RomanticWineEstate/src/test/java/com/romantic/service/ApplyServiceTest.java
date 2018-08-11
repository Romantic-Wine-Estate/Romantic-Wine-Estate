package com.romantic.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Map;


/**
 * Create with IntelliJ IDEA
 * Author: liufugen
 * Date:{2018/8/11}
 * Time:{12:54}
 */
@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})

public class ApplyServiceTest {
    @Resource
    private ApplyService applyService;

    @Test
    public void pay() {
        Map<String,String> map =applyService.pay("1","5555","F:/IDEA/logs");
        System.out.println(map.get("status")+"----"+map.get("totalAmount"));
        System.out.println(map.get("subject")+"------"+map.get("body"));
    }
}