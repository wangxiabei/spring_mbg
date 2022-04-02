package com.aranya.mall.tiny.service.impl;

import com.aranya.mall.tiny.service.IQiniuService;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
public class QiniuServiceImpl implements IQiniuService, InitializingBean {
    @Autowired
    private UploadManager manager;
    @Autowired
    private BucketManager bucketManager;
    @Autowired
    private Auth auth;
    @Value("${qiniu.bucket}")
    private String bucket;
    @Value("${qiniu.domain}")
    private String domain;
    /**
     * 定义上传的相关策略
     */
    private StringMap putPolicy;

    @Override
    public String uploadFile(MultipartFile uploadFile) throws QiniuException, IOException {
        String uuid= UUID.randomUUID().toString().replace("-","");
        String fileName = uploadFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        fileName = uuid + suffix;
        Response response = this.manager.put(uploadFile.getBytes(),fileName,getUploadToken());
        int retry = 0;
        while (response.needRetry() && retry < 3){
            response = this.manager.put(uploadFile.getBytes(),fileName,getUploadToken());
            retry++;
        }
        if (response.statusCode == 200){
            return fileName;
        }
        return "上传失败！";
    }

    @Override
    public String uploadFile(File file, String fileName) throws QiniuException {
        Response response = this.manager.put(file,fileName,getUploadToken());
        int retry = 0;
        while (response.needRetry() && retry < 3){
            response = this.manager.put(file,fileName,getUploadToken());
            retry++;
        }
        if (response.statusCode == 200){
            return fileName;
        }
        return "上传失败！";
    }

    @Override
    public String uploadFile(InputStream inputStream, String fileName) throws QiniuException {
        Response response = this.manager.put(inputStream,fileName,getUploadToken(),null,null);
        int retry = 0;
        while (response.needRetry() && retry < 3){
            response = this.manager.put(inputStream,fileName,getUploadToken(),null,null);
            retry++;
        }
        if (response.statusCode == 200){
            return fileName;
        }
        return "上传失败！";
    }

    @Override
    public String delete(String key) throws QiniuException {
        Response response = bucketManager.delete(this.bucket,key);
        int retry = 0;
        while (response.needRetry() && retry++ < 3){
            response = bucketManager.delete(bucket,key);
        }
        return response.statusCode == 200 ? "删除成功" : "删除失败";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.putPolicy = new StringMap();
        putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"width\":$(imageInfo.width), \"height\":${imageInfo.height}}");
    }

    /**
     * 获取上传凭证
     *
     * @return
     */
    private String getUploadToken(){
        return this.auth.uploadToken(bucket,null,3600,putPolicy);
    }
}
