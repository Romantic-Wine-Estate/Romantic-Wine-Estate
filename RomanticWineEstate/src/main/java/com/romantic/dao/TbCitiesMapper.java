package com.romantic.dao;

import com.romantic.pojo.TbCities;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Authot:{Lenovo}
 * Date:{2018/8/4}{16:50}
 */

public interface TbCitiesMapper {
    TbCities queryByCityId(@Param("cityId") String cityId);
}
