package com.romantic.service.imp;

import com.romantic.dao.TbCitiesDao;
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
    private TbCitiesDao tbCitiesDao;

    @Override
    public TbCities queryByCityId(String cityId)
    {
        return tbCitiesDao.queryByCityId(cityId);
    }
}
