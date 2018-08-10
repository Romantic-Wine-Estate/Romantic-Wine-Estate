package com.romantic.utils;

import org.junit.Test;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/10
 * Time:12:18
 */
public class Random {
    public long generateRandomNumber(int n){
        if(n<1){
            throw new IllegalArgumentException("随机数位数必须大于0");
        }
        return (long)(Math.random()*9*Math.pow(10,n-1)) + (long)Math.pow(10,n-1);
    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 5; i++) {
            System.out.println(generateRandomNumber(1));
        }
    }
}
