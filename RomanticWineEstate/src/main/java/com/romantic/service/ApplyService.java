package com.romantic.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author: liufugen
 * Date:{2018/8/11}
 * Time:{12:40}
 */
@Service
public interface ApplyService {
    public Map<String,String> pay(String orderId, String userId, String path);
}
