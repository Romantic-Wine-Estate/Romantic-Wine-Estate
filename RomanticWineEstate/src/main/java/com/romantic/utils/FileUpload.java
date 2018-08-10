package com.romantic.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import java.io.*;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/8/7
 * Time:22:29
 * -------------------------------------------
 * 文件上传工具类
 */
public class FileUpload {
    /**
     * 给定File类型的对象上传文件
     * @param file 想要上传的文件
     * @return DefaultPutRet类对象，可以获取上传文件的文件名和hash值
     */
    public static DefaultPutRet fileUpload(File file) {
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone1());
        //...其他参数参考类注释

        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = GetUploadToken.ACCESS_KEY;
        String secretKey = GetUploadToken.SECRET_KEY;
        String bucket = GetUploadToken.BUCKET;

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
        return putRet;
    }
}
