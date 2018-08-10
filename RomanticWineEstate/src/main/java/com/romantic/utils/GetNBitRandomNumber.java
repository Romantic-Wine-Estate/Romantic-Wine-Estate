package com.romantic.utils;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/10
 * Time:12:16
 */
public class GetNBitRandomNumber {

    /**
     * 获取n位随机数的静态方法
     * @param n 目标随机数的位数
     * @return 目标随机数
     */
    public static String generateRandomNumber(int n){
        if(n<1){
            throw new IllegalArgumentException("随机数位数必须大于0");
        }
        long a = (long)(Math.random()*9*Math.pow(10,n-1)) + (long)Math.pow(10,n-1);
        return String.valueOf(a);
    }
}
