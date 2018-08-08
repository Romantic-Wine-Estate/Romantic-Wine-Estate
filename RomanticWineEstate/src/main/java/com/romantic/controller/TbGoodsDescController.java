package com.romantic.controller;

import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbGoodsDescService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IntelliJ IDEA
 * Author:Hu HaoRan
 * <p>
 * Data:2018-08-08
 * Time:16:27
 */
@Controller
public class TbGoodsDescController
{
    @Autowired
    private TbGoodsDescService tbGoodsDescService;

    @RequestMapping("/queryByGoodsId.htm")
    public  TbGoodsDesc queryByGoodsId()     //根据商品id查找到商品信息
    {
        return tbGoodsDescService.queryByGoodsId("1");
    }

}
