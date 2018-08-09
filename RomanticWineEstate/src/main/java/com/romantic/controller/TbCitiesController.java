package com.romantic.controller;

import com.romantic.pojo.TbCities;
import com.romantic.service.TbCitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Authot:{Lenovo}
 * Date:{2018/8/5}{0:35}
 */
@Controller
//@RequestMapping("/")
public class TbCitiesController {

    @Autowired
    private TbCitiesService tbCitiesService;

    @RequestMapping("/admin.htm")
    public String index(){
        return "hello";
    }

    @RequestMapping("/add.htm")
    @ResponseBody
    public TbCities queryByCityId(){
        return tbCitiesService.queryByCityId("110200");
    }


}

