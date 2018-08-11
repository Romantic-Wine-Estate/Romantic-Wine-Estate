package com.romantic.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import java.io.*;
import java.net.URLEncoder;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/11
 * Time:1:59
 */
public class QiNiuYunFileUtils {

    private static final String ACCESS_KEY= "tRxEd4bYEgvAB9y1VK0NAzP47DOT8p6udvc0VUhb";
    private static final String SECRET_KEY= "rYI332cZQ_HGFI7VIKTChHQ8xMn69Ev645P61E0U";
    private static final String BUCKET= "romantic-wine-estate";
    private static final String domainOfBucket = "http://pd14tl2r6.bkt.clouddn.com";

    /**
     * 获取简单上传凭证，上传新文件
     * @return 上传凭证
     */
    public static String getUpToken() {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(BUCKET);
        System.out.println(upToken);
        return upToken;
    }

    /**
     * 获取覆盖上传的凭证
     * @param fileKey 想进行覆盖的文件名称
     * @return 上传凭证
     */
    public static String getUpToken(String fileKey) {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(BUCKET, fileKey);
        System.out.println(upToken);
        return upToken;
    }

    /**
     * 给定File类型的对象上传文件
     * @param file 想要上传的文件
     * @return DefaultPutRet类对象，可以获取上传文件的文件名和hash值
     */
    public static String fileUpload(File file) {
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone1());
        //...其他参数参考类注释

        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = ACCESS_KEY;
        String secretKey = SECRET_KEY;
        String bucket = BUCKET;

        //默认不指定key的情况下，以文件内容的hash值作为文件名
        //此处还可以修改
        String key = file.getName();

        DefaultPutRet putRet = null;
        try {
            // byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
            byte[] uploadBytes = null;
            try {
                InputStream input = new FileInputStream(file);
                uploadBytes = new byte[input.available()];
                input.read(uploadBytes);
            } catch (IOException e) {
                e.printStackTrace();
            }

            ByteArrayInputStream byteInputStream=new ByteArrayInputStream(uploadBytes);
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);

            try {
                Response response = uploadManager.put(byteInputStream,key,upToken,null, null);
                //解析上传成功的结果
                putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception ex) {
            //ignore
        }
        return putRet.key;
    }

    /**
     * 获取公开空间文件下载的URL
     * @param fileName 下载文件名
     * @return 下载URL
     */
    public static String getFileDownloadUrl(String fileName) {
        //String fileName = "七牛/云存储/qiniu.jpg";
        //String domainOfBucket = "http://devtools.qiniu.com";
        String encodedFileName = null;
        try {
            encodedFileName = URLEncoder.encode(fileName, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("获取文件下载URL失败::URL拼接失败");
        }
        String finalUrl = String.format("%s/%s", domainOfBucket, encodedFileName);
        System.out.println(finalUrl);

        return finalUrl;
    }


}
