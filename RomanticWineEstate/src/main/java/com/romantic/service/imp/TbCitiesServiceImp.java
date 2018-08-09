package com.romantic.service.imp;

import com.romantic.dao.TbCitiesMapper;
import com.romantic.pojo.TbCities;
import com.romantic.service.TbCitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Authot:{Lenovo}
 * Date:{2018/8/4}{23:13}
 */
@Service
public class TbCitiesServiceImp implements TbCitiesService {
    @Autowired
    private TbCitiesMapper tbCitiesMapper;

    @Override
    public TbCities queryByCityId(String cityId) {
        return tbCitiesMapper.queryByCityId(cityId);
    }
}
