package com.romantic.utils;

import org.junit.Test;

import java.io.File;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/11
 * Time:2:34
 */
public class QiNiuYunFileUtilsTest {

    @Test
    public void getUpToken() {
        String upToken01 = QiNiuYunFileUtils.getUpToken();
        System.out.println(upToken01);
    }

    @Test
    public void getUpToken1() {
        String filekey = "001";
        String upToken02 = QiNiuYunFileUtils.getUpToken(filekey);
        System.out.println(upToken02);
    }

    @Test
    public void fileUpload() {
        String fileName = QiNiuYunFileUtils.fileUpload(new File("C:\\Users\\HP\\Desktop\\001.jpg"));
        System.out.println(fileName);
        //System.out.println(putRet.key);
        //System.out.println(putRet.hash);
    }

    @Test
    public void getFileDownloadUrl() {
        System.out.println(QiNiuYunFileUtils.getFileDownloadUrl("生日快乐"));
    }
}