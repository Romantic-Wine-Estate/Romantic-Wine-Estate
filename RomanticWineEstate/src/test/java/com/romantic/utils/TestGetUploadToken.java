package com.romantic.utils;

import org.junit.Test;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/7
 * Time:22:15
 */

public class TestGetUploadToken {

    /**
     * 测试获取上传凭证的工具类的方法
     */
    @Test
    public void testGetUploadToken() {
        String upToken01 = GetUploadToken.getUpToken();

        String filekey = "001";
        String upToken02 = GetUploadToken.getUpToken(filekey);

        System.out.println(upToken01);

        System.out.println(upToken02);
    }

}
