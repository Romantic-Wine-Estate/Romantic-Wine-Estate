package com.romantic.utils;

import com.qiniu.storage.model.DefaultPutRet;
import org.junit.Test;

import java.io.File;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/7
 * Time:22:58
 */
public class TestFileUpload {
    /**
     * 测试上传文件工具类
     */
    @Test
    public void testFileUpload() {
        DefaultPutRet putRet = FileUpload.fileUpload(new File("C:\\Users\\HP\\Desktop\\新建文件夹\\003.png"));
        System.out.println(putRet.key);
        System.out.println(putRet.hash);
    }
}
