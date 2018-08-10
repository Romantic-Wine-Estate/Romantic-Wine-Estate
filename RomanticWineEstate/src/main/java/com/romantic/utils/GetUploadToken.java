package com.romantic.utils;

import com.qiniu.util.Auth;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/7
 * Time:16:31
 * ------------------------------------
 * 功能：获取上传凭证upToken，同时里面定义了
 * 密钥：ACCESS_KEY/SECRET_KEY和上传空间名：BUCKET
 */
public class GetUploadToken {

    public static final String ACCESS_KEY= "tRxEd4bYEgvAB9y1VK0NAzP47DOT8p6udvc0VUhb";
    public static final String SECRET_KEY= "rYI332cZQ_HGFI7VIKTChHQ8xMn69Ev645P61E0U";
    public static final String BUCKET= "romantic-wine-estate";

    /**
     * 获取简单上传凭证
     * @return 上传凭证
     */
    public static String getUpToken() {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(BUCKET);
        System.out.println(upToken);
        return upToken;
    }

    /**
     *
     * @param fileKey 想进行覆盖的文件名称
     * @return 上传凭证
     */
    public static String getUpToken(String fileKey) {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(BUCKET, fileKey);
        System.out.println(upToken);
        return upToken;
    }


}
