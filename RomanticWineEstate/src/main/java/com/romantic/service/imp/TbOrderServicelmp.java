package com.romantic.service.imp;

import com.romantic.dao.TbOrderMapper;
import com.romantic.pojo.TbCities;
import com.romantic.pojo.TbOrder;
import com.romantic.service.TbCitiesService;
import com.romantic.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/7
 * Time:21:02
 * To change this template use File | Settings | File Templates.
 */
@Service("TbOrderServicelmp")
public class TbOrderServicelmp implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;
    @Override
    public TbOrder selectOrder(String order_num) {
        TbOrder tbOrder=tbOrderMapper.selectByOrderNum (order_num);
        if(tbOrder!=null)
            return tbOrder;
        return null;
    }

    //4、删除订单信息(若未付款，到24小时就删除该订单)
    @Override
    public void deleteOrder(String orderNum) {

    }

}

