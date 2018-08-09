package com.romantic.service.imp;

import com.romantic.dao.TbCitiesMapper;
import com.romantic.pojo.TbGoodsDesc;
import com.romantic.service.TbCitiesService;
import com.romantic.service.TbGoodsDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IntelliJ IDEA
 * Author:Hu HaoRan
 * <p>
 * Data:2018-08-08
 * Time:12:58
 */
@Service
public class TbGoodsDescServiceImp implements TbGoodsDescService {

    @Autowired
    private TbCitiesMapper tbCitiesMapper;

    @Override
    public TbGoodsDesc queryByGoodsId(String goods_id) {
        return null;
    }
}
