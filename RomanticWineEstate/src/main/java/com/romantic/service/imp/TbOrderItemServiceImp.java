package com.romantic.service.imp;

import com.romantic.dao.TbOrderItemMapper;
import com.romantic.dao.TbOrderMapper;
import com.romantic.pojo.TbOrder;
import com.romantic.pojo.TbOrderItem;
import com.romantic.service.TbOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/8
 * Time:01:11
 * To change this template use File | Settings | File Templates.
 */
public class TbOrderItemServiceImp implements TbOrderItemService {
    @Autowired
    private TbOrderItemMapper tbOrderItemMapper;
    @Override
    public TbOrderItem selectOrderItem(String orderNum, String goodsId) {
        TbOrderItem tbOrderItem=tbOrderItemMapper.selectByOnGi (orderNum,goodsId);
            if(tbOrderItem!=null)
                return tbOrderItem;
            return null;
        }

    @Override
    public void deleteOrderItem(String orderNum) {

    }
}
