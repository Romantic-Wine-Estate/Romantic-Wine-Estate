
package com.romantic.dao;

import com.romantic.pojo.TbOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;


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
public class Test02 {
    @Resource
    TbOrderMapper tbOrderMapper;

    @Test
    public void test() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderNum ("3");
        tbOrder.setSellerId ("33");
        tbOrder.setPayment (new BigDecimal (89.12312312312));
        tbOrder.setPaymentType ("1");
        tbOrder.setPostFee (new BigDecimal (10.40));
        tbOrder.setStatus ("1");
        tbOrder.setPaymentTime (new Date ());
        tbOrder.setConsignTime (null);
        tbOrder.setEndTime (new Date ());
        tbOrder.setCloseTime (new Date ());
        tbOrder.setShippingName ("中通");
        tbOrder.setShippingCode ("12334444");
        tbOrder.setUserId ("5555");
        tbOrder.setBuyerMessage ("包装好一点");
        tbOrder.setBuyerNick ("小明");
        tbOrder.setBuyerRate ("是");
        tbOrder.setReceiverAreaName ("陕西省西安市");
        tbOrder.setReceiverMobile ("1111111111111");
        tbOrder.setReceiver ("小花");
        tbOrder.setExpire (null);
        tbOrder.setCreateTime (new Date ());
        tbOrder.setIsAlive ("1");


        System.out.println(tbOrder);
        tbOrderMapper.insertOrder(tbOrder);
    }
}
